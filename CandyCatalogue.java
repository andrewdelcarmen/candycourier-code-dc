import java.utils.Scanner;
public class CandyCatalogue {
    private Star star;
    private final Scanner S = new Scanner(System.in);
    private boolean exit;
    private int whatStar;
    private String number1, number2;
    // List of Candies
    public void list() {
        exit = false;
        while(!exit) {
            stringForList();
            number1 = S.nextLine();
            if(number1.isEmpty()) {
                    System.out.println("No input! Try again.");
                    continue;
                }
            switch(number1) {
                case "1":
                    
            }
        }
    }
    public void stringForList() {
        whatStar = star.getStar();
        String stringToPrint = "Search your candy by typing the corresponding number:\n1. Candy Corn\n2. Lollipop\n3. Gummy\n4. Marshmallow\n";
        if(whatStar>=1){
        stringToPrint += "5. Pastillas\n6. Yema\n 7. Polvoron\n";
        }
        if(whatStar>=4){
        stringToPrint += "8. Candy Corn";
        }
        System.out.println(stringToPrint);
    }
}