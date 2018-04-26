package com.howtoprogram.junit5;

import com.howtoprogram.junit5.product.ServiceDemo;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ServiceDemoTest {

    @Test
    void tryServiceDemo(){
        ServiceDemo serviceDemo = new ServiceDemo();

        ServiceDemo serviceDemoTest = mock(ServiceDemo.class);

        when(serviceDemoTest.login("javier","1234")).thenReturn(true);

        Assert.assertTrue(serviceDemoTest.login("javier", "1234"));
    }

    @Test
    void tryServiceDemoTwo(){
        ServiceDemo serviceDemo = new ServiceDemo();

        ServiceDemo serviceDemoTest = mock(ServiceDemo.class);

        when(serviceDemoTest.login("javier","1234")).thenReturn(false);

        Assert.assertFalse(serviceDemoTest.login("javier", "1234"));
    }
}
