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

    boolean isValidHash(String hashValue) {
        return hashValue.startsWith("00000");
    }

    public static void main(String... args) {
        ChallengeFour chall = new ChallengeFour();
    }
}
