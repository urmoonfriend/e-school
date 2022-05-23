package kz.aidos.school.config;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyPasswordEncoderTest {
    @Test
    public void testEncode() {
        MyPasswordEncoder encoder  =new MyPasswordEncoder();
        Assert.assertEquals("secret: 'admin'", encoder.encode("admin"));
    }
}