public class BakeryProduct {
    public int id;
    private String name;
    private String description;
    private Double price;

    BakeryProduct Product = new BakeryProduct();



    /*public Product (String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price; 
    }
    */

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    


}
