import java.util.Scanner;

public class PlayerHome extends Building {
    private final Scanner S = new Scanner(System.in);
    private Player player;
    private final String name;
    private boolean answer;
    private String decision;
    private CandyCourier cc;
    public PlayerHome() {
        name = player.getPlayerName() + "'s Home";
        x = 0;
        y = 0;
    }

    public void arrive() {
        answer = true;
        while(answer) {
            System.out.println("Would you like to call it a day? Y/N");
            decision = S.nextLine().toUpperCase();

            if(decision.isEmpty()) {
                continue;
            }
            switch(decision) {
                case "Y":
                    System.out.println("Good night!");
                    cc.endDay();
                    answer = false;
                    break;
                case "N":
                    answer = false;
                    break;
                default:
                    System.out.println("Invalid input, try again!");
                    break;
            }
        }
    }
}