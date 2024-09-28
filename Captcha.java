package ps3;
import java.util.Random;
import java.util.Scanner;

public class Captcha {
    private static final String captchastuff = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";

    private String generateCaptcha(int length) {
        StringBuilder captcha = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            captcha.append(captchastuff.charAt(random.nextInt(72)));
        }

        return captcha.toString();
    }

    public boolean verifyCaptcha() {
        Scanner sc = new Scanner(System.in);
        int attempt = 1;
        boolean human = false;

        while (attempt <= 3 && !human) {
            String captcha = generateCaptcha((attempt * 2) + 4);
            System.out.println("\nEnter the Captcha: " + captcha);
            String userInput = sc.next();
            if (userInput.equals(captcha)) {
                System.out.println("\nCaptcha verified successfully!");
                human = true;
            } else {
                System.out.println("\nInvalid Captcha. Try again.");
                attempt++;
            }
        }

        if (!human) {
            System.out.println("\nMaximum attempts reached. Captcha verification failed. Try again in 24 hours.");
            System.out.println("Press any key to exit");
            sc.next();
            
        }

        return human;
    }


}
