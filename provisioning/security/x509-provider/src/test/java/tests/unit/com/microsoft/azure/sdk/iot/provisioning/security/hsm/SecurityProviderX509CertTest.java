 /*
 *  Copyright (c) Microsoft. All rights reserved.
 *  Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */



package tests.unit.com.microsoft.azure.sdk.iot.provisioning.security.hsm;

 import com.microsoft.azure.sdk.iot.provisioning.security.hsm.SecurityProviderX509Cert;
 import mockit.Deencapsulation;
 import mockit.Mocked;
 import mockit.NonStrictExpectations;
 import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
 import org.bouncycastle.openssl.PEMKeyPair;
 import org.bouncycastle.openssl.PEMParser;
 import org.bouncycastle.util.io.pem.PemObject;
 import org.bouncycastle.util.io.pem.PemReader;
 import org.junit.Test;

 import java.io.ByteArrayInputStream;
 import java.io.IOException;
 import java.io.StringReader;
 import java.security.KeyPair;
 import java.security.PrivateKey;
 import java.security.cert.CertificateException;
 import java.security.cert.CertificateFactory;
 import java.security.cert.X509Certificate;

 import static junit.framework.TestCase.assertTrue;
 import static junit.framework.TestCase.fail;
 import static org.junit.Assert.assertEquals;

public class SecurityProviderX509CertTest
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
    public void supposedToFail()
    {
        fail("This test is supposed to fail");
    }

    @Test
    public void flakeyTest()
    {
        double a = Math.floor(Math.random()*2);
        if (a >= 1)
        {
            fail("Bad luck, fella");
        }
    }
}
