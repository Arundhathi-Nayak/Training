package org.example.basics;

public class ForLoop {
    public static void main(String args[]) {
        for(int i=0; i<=10; i++)  // for condition
        {
            System.out.println(i);
            for(int j=11; j<=15; j++)  // for condition
            {
                System.out.println(j);
                break;
            }
        }
    }
}
