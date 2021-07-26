package utils;

import java.util.Random;
import java.util.UUID;

public class Extensions {

    public static String generateUUID() {
        return UUID.randomUUID().toString();
    }

    public static String generateRandomNumber() {
        String formatUUID = generateUUID()
                .replaceAll("[^0-9.]", "")
                .replaceFirst("^0", "");
        return formatUUID
                .substring(0, Math.min(formatUUID.length(), 9));
    }

    public static String generateRandomACharater(){
        Random r = new Random();
        return String.valueOf((char)(r.nextInt(26)+'a'));

    }
}
