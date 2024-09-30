package com.cg.backend;

import com.cg.backend.entity.IPOApplication;
import com.cg.backend.entity.Stock;

import com.cg.backend.repository.IPORemote;
import com.cg.backend.repository.UserRemote;
import com.cg.backend.service.IPOService;

import org.junit.jupiter.api.Test;

import org.mockito.InjectMocks;

import org.mockito.Mock;

import static org.mockito.BDDMockito.given;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.lang.reflect.InvocationTargetException;

import java.lang.reflect.Method;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@SpringBootTest

@DataJpaTest

//@ExtendWith(MockitoExtension.class)

@AutoConfigureTestDatabase(replace = Replace.NONE)
class BackendApplicationTests {

    @InjectMocks

    IPOService ipoService;

    @Mock
    IPORemote ipoRemote;

    @Test
    void statusTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        IPOApplication ipoApplication = new IPOApplication();
        ipoApplication.setStockId(1L);
        ipoApplication.setStatus("Pending");
        ipoApplication.setId(100L);
        ipoApplication.setAccountId(12345L);
        ipoApplication.setBidAmount(249.5);
        ipoApplication.setNumberOfShares(10);

        IPOApplication ipoApplication1 = new IPOApplication();

        ipoApplication1.setStockId(2L);
        ipoApplication1.setStatus("Approved");
        ipoApplication1.setId(101L);
        ipoApplication1.setAccountId(22345L);
        ipoApplication1.setBidAmount(251.5);
        ipoApplication1.setNumberOfShares(11);

        ipoRemote.updateStatusByPrice(250.5);

		Method method = IPOService.class.getDeclaredMethod("status", Long.class);
		method.setAccessible(true);
        Optional<IPOApplication> ipoApplication2 = (Optional<IPOApplication>) method.invoke(ipoService,100L);
        ipoApplication2.ifPresent(application -> assertEquals("Approved", application.getStatus()));
    }
}

