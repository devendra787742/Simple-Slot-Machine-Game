import java.util.*;

public class SlotMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] symbols = {"🍒", "🍋", "🔔", "⭐", "7"};

        String choice = "y";

        System.out.println("🎰 Slot Machine Game");

        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Press ENTER to spin...");
            sc.nextLine();

            String s1 = symbols[rand.nextInt(symbols.length)];
            String s2 = symbols[rand.nextInt(symbols.length)];
            String s3 = symbols[rand.nextInt(symbols.length)];

            System.out.println("Result: " + s1 + " | " + s2 + " | " + s3);

            if (s1.equals(s2) && s2.equals(s3)) {
                System.out.println("🎉 JACKPOT! You win!");
            } else {
                System.out.println("❌ Try again!");
            }

            System.out.print("Play again? (y/n): ");
            choice = sc.nextLine();
        }

        System.out.println("Thanks for playing!");
    }
}