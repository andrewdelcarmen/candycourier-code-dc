public class CandyList {
    private Candy candy;
    private int quantity;
    public CandyList(Candy candy) {
        this.candy = candy;
    }
    public int addCount(int count) {
        quantity = quantity + count;
        return quantity;
    }
    public int subCount(int count) {
        if(quantity>=count) {
            quantity = quantity - count;
        }
        else {
            System.out.println("Not enough " + candy.getProduct + "! (Need " + (count-quantity) + "more)");
        }
    }

}