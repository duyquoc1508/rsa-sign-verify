/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// package src.App;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

/**
 *
 * @author ubuntu
 */
public class ProtectedData {

    static String privateKey = "-----BEGIN PRIVATE KEY-----MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDfiR44QijQVv9U9ocUrL55NnUX7nxXa8AYhZAwfn1skdkiwjWh7Tgt3MILThKsOCjVFS/Ac060mZnqt7lpitI7jG+dtNwHiXhGklwKuhP245tcTTQHtXxP2bHCuK94HCbTd34Or9VOFyC+1FuLmZAWhkk/5kgNRQqo6txveE64dmPec/vdcdpp6Z5NjwiTLJDb6QhPEpzrIxmLORLguKAZnec5mg11E4OOfguCXmUL0BwcI/D2YbU7KStlUmDLlGTVQ2pDuHNPqamwFiykZ6wFAuWlrViavly3I/qegbj/M0sKXuEsFKgfUOPsvniecJuHGZPj+MJHHRU0/hhmCuFFAgMBAAECggEAPmxerYxANIoO7K2ZpFrnKBdelKvLOmiDMPXfgcNZCEAkeHHuo0UJGrma0KhhS4m1UWgEuUQaFxIL6wGafBBBzFJX+xz+Eva/SUnm/THgkGIYSSrgHEUArZXX784+ZhbKeuRUJgrRUOjhgpjv5aihFcEzZG5M8bO1md1YaKKarSUQ96vp9Y2sT1sz97UB3oFVNLN++wV1wWzA1SmouVD+D1WkJPrKZhqqSG4vB9bLa4j7mMIuhOwVWHY+74nrfX8Vf26tvX5PV40hHikMxq0YzcTUO/NUftQDsxSG0gy+NkemcXhcO4j17yKSAdI7aaWLQWawRp8GIDyBDtvOMo9sEwKBgQDzHDUK1hjYluqvGUFAUTMxYQdSFVZC089N+8l0oy4BJNVLqim1o5d8nHXELoVzW7WLcPvIACFpb7fb4BIeVwyHPGBNQCpbNK7Bh7UXg9NlcfHv/XRvtmnL0nbw+sQLuPAdQqEvuNHkRaurvdTXnSXx4LNYX7b2nnHLHanj9vFuVwKBgQDrYzh2mY/FkiBsh8bx0M8ZN9sQpKrSOJVfuoMOUaj7wvEcKBcIJsvCh3c+0Mh0qMLvmCEgj4sbU26T0c8XAocxu/6P7eTgpvbz8gw7kBtQvRO+Pz31yyblIJGtvOW2sCHHj9HsgjtvkImVltGNbHQoxBp+DYfCeqk3D/6By8uzwwKBgQDMp1g3sRflbNZPZNE7VZ/k16uT/AZL54bCPU3P9HaL2/f65FqMYBTsf8HbztXk0LU5l3k9Wm7GFZgPbseR5vHS/o6LOZLuiKD8pkNack0JPyzOPO1CBat2O8yI/HEA9USdPTP3unxm0Ae+YeXFRLNmtSQFJz4cyjE9LdGQ6JdBrQKBgQCfLtpgWjkAQ3Hp82h2398uDrf26WUcBWf+9QLsDA1bNNoZUINC3/mr9DCQKmFlgztRDHBatLg+Io4FKT4DMZJ778aXTyoZQtB+6JGdNjdCwps3bU1Zi6kiCoR6GeS/Rx2Q95Hff7LyH6zrnLLaER3886F23W+R9aG5uvdCj6+SQQKBgQDZbR/Xf3ePu3MG/L7siAvJ/bgz1TmXi04MNx2kVA5foTAbu2k9JzHskP/0uBVCc93uXTERfrsRVpyEQ8qvPPpqFssr2A0XnUXxUBUstuWK+5iyB9tx/m9WS38aot4IMXIKA5mSa9WtG+7Dn43TaIgx6op8dqiQnRHdSDLGia8kig==-----END PRIVATE KEY-----";

    static String publicKey = "-----BEGIN PUBLIC KEY-----MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA34keOEIo0Fb/VPaHFKy+eTZ1F+58V2vAGIWQMH59bJHZIsI1oe04LdzCC04SrDgo1RUvwHNOtJmZ6re5aYrSO4xvnbTcB4l4RpJcCroT9uObXE00B7V8T9mxwriveBwm03d+Dq/VThcgvtRbi5mQFoZJP+ZIDUUKqOrcb3hOuHZj3nP73XHaaemeTY8IkyyQ2+kITxKc6yMZizkS4LigGZ3nOZoNdRODjn4Lgl5lC9AcHCPw9mG1OykrZVJgy5Rk1UNqQ7hzT6mpsBYspGesBQLlpa1Ymr5ctyP6noG4/zNLCl7hLBSoH1Dj7L54nnCbhxmT4/jCRx0VNP4YZgrhRQIDAQAB-----END PUBLIC KEY-----";
    
    public static void main(String[] args) throws Exception {
        String text = "40b0ebd8-3783-4d68-b817-4cfb68e362ec2022-11-08-09-19-31-0050";
        String signature = buildSignature(text);
        System.out.println(signature);
        // String signature = "nPF1Roh1pwSdL5YS13+0IB/SUOGgruxdUBIEeKAcz3V0uIzmGcRhqkTEX3iKuIk57xXpslPCYRFK6JOVo2yuIJY7TF3zOJS6XEPHFWrSrTMZnFNz2AJ6Apqcinpuwnl33zib57WinAcZpOn4Ny4EZKrKSU41G9i5uQ7C5xPXYrV9r/xFvbXvhZmNpoSVf33bNSsSQiI6FUR7oKmT0eKCzh5+vr8613T8h1mVHT1cenh1Au+mkLqjzBbLL/UQx3jaEavMMInFLFsYA9KaTfG2H363F/pTxycOyYowjpsGLfRnqqyp9PjnLr+OiwRfUF6ZhT8NAcWtye9uUdJd83ePEiCTSpWv6ZZDCGzQxq0Avi+Vmc20L+sapN6vvjvc7vablJaNcguhRDYp/c10+lxNnLRGWRVHEwcc3spuozyFChDi4lUvrEETFmEf0zy0SpkVlzoxdc3CYuIXhIKZQzZaomPyvISNKkz9MdEUEY5hDAX9TkhukouHch6CMpJiWSsu";
        System.out.println(verifySignature(text, signature));

    }

    private static String buildSignature(String text) throws Exception {
        PrivateKey pk = getPrivateKey();
        try {
            Signature rsa = Signature.getInstance("SHA1withRSA");
            rsa.initSign(pk);
            rsa.update(text.getBytes());
            byte[] signature = rsa.sign();
            return Base64.getEncoder().encodeToString(signature);
        } catch (Exception e) {
            throw new Exception("Lõi");

        }
    }

    public static PrivateKey getPrivateKey() throws Exception {
        try {
            String key = privateKey;
            String publicKeyPEM = key.replace("-----BEGIN RSA PRIVATE KEY-----", "")
                    .replace("-----BEGIN PRIVATE KEY-----", "")
                    .replaceAll("\n", "")
                    .replace("-----END RSA PRIVATE KEY-----", "")
                    .replace("-----END PRIVATE KEY-----", "");

            byte[] encoded = Base64.getDecoder().decode(publicKeyPEM);

            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(encoded);
            return keyFactory.generatePrivate(keySpec);
        } catch (Exception e) {
            throw new Exception("loix");
        }
    }

    public static PublicKey getPublicKey() throws Exception {
        String key = publicKey;
        String publicKeyPEM = key.replace("-----BEGIN RSA PUBLIC KEY-----", "")
                .replace("-----BEGIN PUBLIC KEY-----", "")
                .replaceAll("\n", "")
                .replace("-----END RSA PUBLIC KEY-----", "")
                .replace("-----END PUBLIC KEY-----", "");

        byte[] encoded = Base64.getDecoder().decode(publicKeyPEM);

        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(encoded);
        return keyFactory.generatePublic(keySpec);
    }

    public static boolean verifySignature(String text, String signature) throws Exception {
        PublicKey pk = getPublicKey();
        Signature rsa = Signature.getInstance("SHA1withRSA");
        rsa.initVerify(pk);
        rsa.update(text.getBytes());
        return rsa.verify(Base64.getDecoder().decode(signature));
    }

}
