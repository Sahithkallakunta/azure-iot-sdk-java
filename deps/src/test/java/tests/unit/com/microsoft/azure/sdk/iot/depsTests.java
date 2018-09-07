/*
 *  Copyright (c) Microsoft. All rights reserved.
 *  Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package tests.unit.com.microsoft.azure.sdk.iot;

import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

public class depsTests
{
    @Test
    public void someTest()
    {
        System.out.println("I'm a test!");
        assertTrue(true);
    }

    @Test
    public void evenMoreTests()
    {
        System.out.println("The merge over PR worked!");
        assertTrue(true);
    }

    @Test
    @Ignore
    public void supposedToFail()
    {
        fail("This test is supposed to fail");
    }

    @Test
    public void flakeyTest()
    {
        double a = Math.floor(Math.random()*4);
        if (a >= 3)
        {
            fail("Bad luck, fella");
        }
    }
}
