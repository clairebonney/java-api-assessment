//import the BakeryUser and BakeryProduct!!

public class BakeryOrder {
    public int id;
    public int bakeryUserId;  //use the id from the user class
    public int bakeryProductId;  //use the id from the product class
    public double bakeryProductprice;  //use the price from the product class
    public int quantity;
    public double totalPrice;  //multiply the product price and qty

    BakeryOrder Order = new BakeryOrder();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBakeryUserId() {
        return bakeryUserId;
    }

    public int getBakeryProductId() {
        return bakeryProductId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getBakeryProductprice() {
        return bakeryProductprice;
    }

    public double getTotalPrice() {
        double totalPrice = (getBakeryProductprice() * this.quantity);
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BakeryOrder getOrder() {
        return Order;
    }

    public void setOrder(BakeryOrder order) {
        Order = order;
    }



        
        //get the bakeryuser id, and the product id from the relevant classes
        //public int bakeryuser;//getId();

    


    

}
    





