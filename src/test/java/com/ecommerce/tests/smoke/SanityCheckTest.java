package com.ecommerce.tests.smoke;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SanityCheckTest {

    @Test
    public void buildsAndRuns() {
        Assert.assertTrue(true, "Sanity test should pass");
    }
}
