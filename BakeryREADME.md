
## **Introduction -Bakery API**
The Bakery API is an api that enables users to create a the various elements of a bakery -a **_customer_**, the **_products_** sold in the bakery and **_orders_** that are created when the customer purchases product(s) from the bakery

Currently, only the **_customer_** function is available

## **Functionality**
Authorised users of the Bakery can Create, Read, Update and Delete bakery customers and Products

## **Setup and Installation**
1. Clone the repository: `git clone https://github.com/clairebonney/java-api-assessment.git`
2. Navigate to the project directory: `cd Bakery`

## **How to use Bakery API**
Open Postman, and begin to send messages to perform CRUD funcitons -Create (Post), Read (Get), Update (Put) and Delete (Delete)

Postman endpoints:

**POST**: http://localhost:8080/api/customers To Create a new customer
JSON POST Message:
{
    "username": "JohnDoe23",
    "email": "JohnDoe23@gmail.com",
    "firstName": "John",
    "lastName": "Doe"
}

**GET**: http://localhost:8080/api/customers To Read a list of all customers
Empty JSON Message


**PUT**: http://localhost:8080/api/customers/1 To Update a customer by id
{
    "id": 1,
    "username": "JohnnieDoe",
    "email": "JohnnieDoe12@gmail.com",
    "firstName": "John",
    "lastName": "Doe"
}

**DELETE**: http://localhost:8080/api/customers/1 To Delete a customer by id
Empty JSON Message

## **Technology**
Java, Springboot, Visual Studio Code, GitHub, SQL, Postman

