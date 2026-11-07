import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class CandyCourier {
        private final Scanner S = new Scanner(System.in);
        private final Random R = new Random();
        private final World W = new World();
        private final PlayerHome HOME = new PlayerHome();
        private final CandyCatalogue CC;
        private Player player;
        private int day = 1;
        private boolean won = false;
        private boolean quit = false;
    public void start() {
        System.out.println("Welcome to Candy Courier!\nWhat is your name? ");
        String name = S.nextLine();
        player = new Player(name);
        System.out.println("Hello " + name + "!\n Starting new World...\n");
    }
    public void gameLoop() {
        while(!won || quit) {
            System.out.println("---- MENU ----\n 1. Travel\n 2. Search Candies\n 3. View Orders\n4. View Inventory\n5. Player Info\n 0. Exit\n Input: ");
            String choose = S.nextLine();
                if(choose.isEmpty()) {
                    System.out.println("No input! Try again.");
                    continue;
                }
                switch(choose) {
                    case "1":
                        W.move();
                        break;
                    case "2":
                        c.search();
                        break;
                    case "3":
                        W.getOrders();
                        break;
                    case "4":
                        player.getInventory();
                        break;
                    case "5":
                        showInfo();
                        break;
                    case "0":
                        quit = true;
                        break;
                    default:
                        System.out.println("Invalid input! Try again:")
                }
        }
    }
    public void endDay() {
        day++;
    }

    public void showInfo() {
        System.out.println("Name:" + player.getPlayerName() + "\nTotalXP: " + player.getTotalXP() + " XP\nXP to next rank:" + player.calculateXP() + " XP\nStar rank: " + player.getRank() + "\n Steps: " + player.getSteps() + "\nDay" + day);
    }
    public static void main(String[] args) {
            CandyCourier game = new CandyCourier();
            game.start();
            game.gameLoop();

    }
}