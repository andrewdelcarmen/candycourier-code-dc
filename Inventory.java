import java.util.ArrayList;

public class Inventory {
    private Candy candy;
    private Star star;
    private ArrayList<Candy> bag;
    public int getBagUsed() {
        int candyAmt = bag.size();
        return candyAmt;
    }
    public void addItem(Candy candy) {
        if (getBagUsed()>star.getBagSize()) {
            System.out.println("Candy Bag full! (");
        } else {
            System.out.println(candy + "added to your bag! (");
            bag.add(candy);
        }
        System.out.print(getBagUsed() + "/" + star.getBagSize() + ")");
    }
    public void count() {

    }
    public void viewCandies() {
        for(Candy candy : bag) {
            String printer = "";
            if(!candy.getFlavor().equals("Plain")) {
                printer += candy.getFlavor();
            }
            printer += candy.getProduct();
            System.out.println(printer);
        }
    }
    //public void viewCandies2() {
    //    for(Candy candy : bag) {
    //        if(candyList.contains(candy)) {
    //        } else {
    //            candyList.add(candy);
    //        }
    //    }
    //}
}