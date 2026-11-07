public class Candy {
    private String product;
    private int req;
    private String flavor;

    public Candy(String product, int req) {
        this.product = product;
        this.req = req;
        this.flavor = "Plain";
    }
    public Candy(String product, int req, String flavor) {
        this.product = product;
        this.req = req;
        this.flavor = flavor;
    }
    public String getProduct() {
        return product;
    }
    public int getReq() {
        return req;
    }
    public String getFlavor() {
        return flavor;
    }
}