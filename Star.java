public class Star {

    private int rank;
    private int XPNeeded;
    private int worldGrid;
    private int prodGrid;
    private int bagSize;

    private static final int[] AXP = {100, 500, 1400, 3000, 5500};
    private static final int[] AWORLD= {3, 4, 5, 6, 7};
    private static final int[] APROD = {6, 7, 8, 9, 10};
    private static final int[] ABAG = {20, 40, 60, 80, 100};

    public Star() {
        this.rank = 0;
        this.XPNeeded = AXP[rank];
        this.worldGrid = AWORLD[rank];
        this.prodGrid = APROD[rank];
        this.bagSize = ABAG[rank];
    }

    public int getStar() {
        return rank;
    }

    public int getXPNeeded() {
        return XPNeeded;
    }

    public int getWorldGrid() {
        return worldGrid;
    }

    public int getProdGrid() {
        return prodGrid;
    }

    public int getBagSize() {
        return bagSize;
    }

    private void rankMessage() {
        if(rank == 5) {
            System.out.println("You are now a 5-Star Courier! You win!!");
        } else {
            int realgrid = worldGrid*2 + 1;
            String grid1 = (realgrid + "x" + realgrid);
            String grid2 = (prodGrid + "x" + prodGrid);
            System.out.println("You ranked up to " + rank + "-Star!\n" + "Rewards:\n- " + grid1 + " World Grid\n- " + grid2 + " Production Grid\n- " + bagSize + " Candy Bag space");
            if(rank == 3) {
            System.out.println("- You can also move diagonally now!");
        }
        }
    }

    public void rankUp() {
        rank += 1;
        this.XPNeeded = AXP[rank];
        this.worldGrid = AWORLD[rank];
        this.prodGrid = APROD[rank];
        this.bagSize = ABAG[rank];
        rankMessage();
    }
}
    