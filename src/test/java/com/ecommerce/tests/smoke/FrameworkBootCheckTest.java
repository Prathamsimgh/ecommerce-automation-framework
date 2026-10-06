package com.ecommerce.tests.smoke;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameworkBootCheckTest {

    @Test
    public void javaVersionIsSupported() {
        int major = Runtime.version().feature();
        Assert.assertTrue(major >= 17, "Framework requires Java 17+, found " + major);
    }

    @Test
    public void testResourcesAreOnClasspath() {
        Assert.assertNotNull(
            getClass().getClassLoader().getResource("test_suites/regression_tests.xml"),
            "regression_tests.xml should be on the test classpath");
    }
}
