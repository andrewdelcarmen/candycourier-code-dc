public class World {
    private Star star;
    
    public void Star0World() {
        PlayerHome home = new PlayerHome();
        Factory F1 = new Factory("Factory 1", 3, 3);
        Factory F2 = new Factory("Factory 2", -3, -3);
        House HA = new House("House A", -2, 2);
        House HB = new House("House B", -1, -2);
        House HC = new House("House C", 0, 3);
        setGrid(3);
    }
    public void Star1World() {
        Factory F3 = new Factory("Factory 3", -4, 4);
        House HD = new House("House D", 2, -4);
        setGrid(4);
    }
    public void Star2World() {
        Factory F4 = new Factory("Factory 4", -4, 4);
        House HE = new House("House E", 1, 5);
        House HF = new House("House F" , -4, -5);
        House HG = new House("House G" , -5, 1);
        House HH = new House("House H" , 5, -1);
        setGrid(5);
    }
    public void Star3World() {
        Factory F5 = new Factory("Factory 5", 4, 6);
        Factory F6 = new Factory("Factory 6", 0, -6);
        Factory F7 = new Factory("Factory 7", 6, 1);
        Factory F8 = new Factory("Factory 8", -6, 0);
        House HI = new House("House I" , -3, 6);
        House HJ = new House("House J" , -6, -3);
        House HK = new House("House K" , -6, -3);
        House HL = new House("House L" , -1, -6);
        House HM = new House("House M" , 6, -6);
        setGrid(6);
    }
    public void Star4World() {
        Factory F9 = new Factory("Factory 9", -7, 7);
        Factory FX = new Factory("Factory X", -5, -7);
        House HN = new House("House N" , 7, 4);
        House HO = new House("House O" , -7, -7);
        House HP = new House("House P" , -7, 3);
        setGrid(7);
    }
    public void setGrid(int limit) {

    }
    public void getOrders() {

    }
}