package com.cbfacademy.apiassessment.Bakery.Order;
//import the BakeryUser and BakeryProduct??

import com.cbfacademy.apiassessment.Bakery.Customer.Customer;
import com.cbfacademy.apiassessment.Bakery.Product.Product;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "Orders")

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    //public int UserId;  //use the id from the user class
    //public int ProductId;  //use the id from the product class
    //public double bakeryProductprice;  //use the price from the product class
    private int quantity;
    private double totalPrice;  //multiply the product price and qty

    @ManyToOne(cascade = CascadeType.ALL) //ManytoOne refers to the relationship between the customer and orders.  Many orders can placed by one customer
    @JoinColumn(name = "customerId")
    private Customer customer;
    @ManyToOne(cascade = CascadeType.ALL) /*Many orders can be placed on one product.  The ManyToOne relationship defines how many products the cust can order.  If I make the relationship ManyToMany, a cust can order more than 1 product.  If I have many products in my bakery, and the relationship is ManyToOne, a customer can still only order 1 product.  If I make it ManyToMany, a customer can order as many products as they want.
    OneToOne or ManyToMany defines how many product a customer can order*/
    @JoinColumn(name = "productId")

    private Product product;







    /*How do I pull in data from 2 classes?? extends only works for 1 class

    */
   // Order order = new order();

    public Order (int quantity, int totalPrice){
        //super(bakeryProductId, bakeryUserId);

        //this.orderId = orderId; -auto generated
        //this.order = order;
        this.quantity = quantity;
        this.totalPrice = totalPrice;

    
    }

    /*public int getOrderId() {
        return orderId;
    }

    public void setId(int OrderId) {
        this.orderId = OrderId;
    }*/

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

    /*public Order getOrder() {
        order= (quantity, totalPrice);

    }

    public void setOrder(Order order) {
        this.order = order;
    }*/



        
        //get the bakeryuser id, and the product id from the relevant classes
        //public int bakeryuser;//getId();

    


    

}
    





