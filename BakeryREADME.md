
# **Introduction -Bakery API**
The Bakery API is an api that enables users to create a the various elements of a bakery -a **_customer_**, the **_products_** sold in the bakery and **_orders_** that are created when the customer purchases product(s) from the bakery

Currently, only the **_customer_** function is available

# **Functionality**
Authorised users of the Bakery can Create, Read, Update and Delete bakery customers and Products

# **Setup and Installation**
1. Clone the repository: `git clone https://github.com/clairebonney/java-api-assessment.git`
2. Navigate to the project directory: `cd Bakery`

# **How to use Bakery API**
Open Postman, and begin to send messages to perform CRUD funcitons -Create (Post), Read (Get), Update (Put) and Delete (Delete)

# **Postman endpoints:**

1. ### To **_Create_** a new customer

**POST**: http://localhost:8080/api/customers

{

    "username": "JohnDoe23",
    "email": "JohnDoe23@gmail.com",
    "firstName": "John",
    "lastName": "Doe"
}

2. ### To **_Read_** a list of all customers

**GET**: http://localhost:8080/api/customers 

Empty Message

3. ### To **_Read_** a list of a customers by id

**GET**: http://localhost:8080/api/customers/{id} 

Empty Message

4. ### To **_Update_** a customer by id

**PUT**: http://localhost:8080/api/customers/{id}

{

    "id": 1,
    "username": "JohnnieDoe",
    "email": "JohnnieDoe12@gmail.com",
    "firstName": "John",
    "lastName": "Doe"
}

5. ###  To **_Delete_** a customer by id

**DELETE**: http://localhost:8080/api/customers/{id}

Empty Message

# **Technology**
Java, Springboot, Visual Studio Code, GitHub, SQL, Postman

