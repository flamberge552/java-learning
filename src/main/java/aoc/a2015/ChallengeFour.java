package aoc.a2015;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ChallengeFour {
    String getMD5HashValue(String key) {
        String hashText = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(key.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            hashText = no.toString(16);
            while (hashText.length() < 32) {
                hashText = "0" + hashText;
            }
            return hashText;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return hashText;
    }

    String convertStringToHex(String input) {
        StringBuffer hex = new StringBuffer();

        for (char el : input.toCharArray()) {
            hex.append((int) el);
        }
        return hex.toString();
    }

    boolean isValidHash(String hashValue) {
        return convertStringToHex(hashValue).startsWith("00000");
    }

    public static void main(String... args) {
        String myKey = "abcdef609043";
        ChallengeFour chall = new ChallengeFour();
        System.out.println(chall.convertStringToHex(chall.getMD5HashValue(myKey)));

    }
}
