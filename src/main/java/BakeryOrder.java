//import the BakeryUser and BakeryProduct??

public class BakeryOrder {
    public int orderId;
    //public int bakeryUserId;  //use the id from the user class
    //public int bakeryProductId;  //use the id from the product class
    //public double bakeryProductprice;  //use the price from the product class
    public int quantity;
    public double totalPrice;  //multiply the product price and qty

    /*How do I pull in data from 2 classes?? extends only works for 1 class

    */

    //BakeryOrder order = new BakeryOrder();

    public Order (int orderId, int quantity, int totalPrice){
        super(bakeryProductId, bakeryUserId);

        this.order = order;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setId(int OrderId) {
        this.orderId = OrderId;
    }

    /*public int getBakeryUserId() {
        return bakeryUserId;
    }

    public int getBakeryProductId() {
        return bakeryProductId;
    }*/

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /*public double getbakeryProductprice() {
        return bakeryProductprice;
    }

    public double getTotalPrice() {
        double totalPrice = (getbakeryProductprice() * this.quantity);
        return totalPrice;
    }*/

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BakeryOrder getOrder() {
        return order;
    }

    public void setOrder(BakeryOrder order) {
        this.order = order;
    }



        
        //get the bakeryuser id, and the product id from the relevant classes
        //public int bakeryuser;//getId();

    


    

}
    





