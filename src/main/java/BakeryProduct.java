import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

    //attributes
@Entity // This tells Hibernate to make a table out of this class
@Table(name = "Products")

public class BakeryProduct {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    private String name;
    private String description; 
    private Double price;


    public BakeryProduct (String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price; 
    }

    
    public int getId() {
        return id;
    }
    /*public void setId(int id) {
        this.id = id;
    }
    No longer needed -auto generated through annotation*/

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
