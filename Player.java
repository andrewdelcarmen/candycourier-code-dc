
public class Player {
    private final String name;
    private int totalXP;
    private String rank;
    private int steps;
    private Inventory inventory;
    private Star star;
    private boolean allowDiagonal;
    public Player(String name) {
        this.name = name;
        totalXP = 0;
        steps = 0;
        this.inventory = new Inventory();
        star = new Star();
        rank = star.getStar() + "-Star Courier";
        allowDiagonal = false;
    }
    public String getPlayerName() {
        return name;
    }
    public int getTotalXP() {
        return totalXP;
    }
    public void addTotalXP(int xp) {
        totalXP += xp;
        calculateXP();
    }
    public int calculateXP() {
        int calculatedXP = star.getXPNeeded() - totalXP;
        if(calculatedXP<=0) {
            star.rankUp();
            calculatedXP = star.getXPNeeded() + calculatedXP;
        }
        System.out.println(calculatedXP + " XP more to rank up to " + (star.getStar()+1) + "-Star Courier");
        return calculatedXP;
    }
    public String getRank() {
        return rank;
    }
    public int getSteps() {
        return steps;
    }
    public void step() {
        steps++;
    }
    public void getInventory() {
        inventory.viewCandies();
    }
    public boolean getAllowDiagonal() {
        return allowDiagonal;
    }
    public void allowDiagonal() {
        this.allowDiagonal = true;
    }
}