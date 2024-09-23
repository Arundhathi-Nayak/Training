package com.cg.backend.security;

import com.cg.backend.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.firewall.HttpFirewall;
import org.springframework.security.web.firewall.StrictHttpFirewall;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public HttpFirewall allowDoubleSlashHttpFirewall() {
        StrictHttpFirewall firewall = new StrictHttpFirewall();
        firewall.setAllowUrlEncodedDoubleSlash(true);  // Enable URL encoded double slashes
        return firewall;
    }

    public void configure(WebSecurity web) throws Exception {
        web.httpFirewall(allowDoubleSlashHttpFirewall());  // Apply the custom firewall
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOriginPatterns(Arrays.asList("http://127.0.0.1:8081"));

        configuration.addAllowedMethod("*");
        configuration.addAllowedHeader("*");
        configuration.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
    @Autowired
    UserInfoService userInfoService;

    AuthenticationManager authenticationManager;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize.requestMatchers("/myconsole").authenticated()
                        .anyRequest().permitAll()
                )
//                .httpBasic(Customizer.withDefaults())
                .formLogin((formLogin)->formLogin.loginPage("/").loginProcessingUrl("/stocklogin").defaultSuccessUrl("http://localhost:8081/stocks/dashboard", true)
                        .failureUrl("http://localhost:8081?error=true").failureUrl("http://localhost:8081?error=true"))
                .csrf(AbstractHttpConfigurer::disable)
                .headers((header)-> {
                    header.frameOptions(HeadersConfigurer.FrameOptionsConfig::disable);
                });

        AuthenticationManagerBuilder builder = http.
                getSharedObject(AuthenticationManagerBuilder.class);
        builder.userDetailsService( userInfoService);
        authenticationManager = builder.build();
        http.authenticationManager(authenticationManager);
        return http.build();
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}




