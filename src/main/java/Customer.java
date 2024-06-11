import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "Customers")

public class Customer {
    //attributes
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    
private int id;
private String username;
public String email;
//public String firstName; -does a customer really need a first and last name?? No?
//public String lastName;

Customer customer = new Customer();
//constructor
public Customer (String username, String email) {
        //this.id = id; -no longer needed as a parameter b'cos it is auto generated
        this.username = username;
        this.email = email;
        //this.firstName = firstName;
        //this.lastName = lastName;  
    }

    public Customer (){
        this("custxx", "email@.com");
    }

public int getId() {
    return id;
}
// public void setId(int id) {
//     this.id = id;
// }
public String getUsername() {
    return username;
}
public void setUsername(String username) {
    this.username = username;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
/*public String getFirstName() {
    return firstName;
}
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
public String getLastName() {
    return lastName;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}
no longer needed*/

}
