package thangtranit.com.dxtmoney.util;


import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashCodeGenerator {
    public static final String ALGORITHM = "SHA-256";
    public static final int RADIX = 16;
    public static final int OUTPUT_LENGTH = 64;
    public static String hash(String input){
        try{
            MessageDigest messageDigest = MessageDigest.getInstance(ALGORITHM);
            byte[] bytes = messageDigest.digest(input.getBytes(StandardCharsets.UTF_8));
            BigInteger bigInteger = new BigInteger(1, bytes);
            StringBuilder stringBuilder = new StringBuilder(bigInteger.toString(RADIX));
            while (stringBuilder.length() < OUTPUT_LENGTH){
                stringBuilder.insert(0, '0');
            }
            return stringBuilder.toString();
        }catch (NoSuchAlgorithmException e){
            throw new RuntimeException(e);
        }
    }
}
