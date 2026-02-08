# Spring Boot Items API

This is a simple Java Spring Boot backend application that provides RESTful APIs to manage a collection of items.
The application uses in-memory storage (ArrayList) and demonstrates basic CRUD operations.

## 🚀 Tech Stack
- Java
- Spring Boot
- REST API
- Maven
- In-Memory Storage (ArrayList)

## 📦 Features
- Add a new item
- Get item by ID
- Input validation for required fields

## 📌 API Endpoints


### To Get Item
**GET** `/items/getitems/{id}`
-Example - /items/getitems/1

### Add Item
**POST** `/items/additems`
-Example - /items/additems

Request Body:
```json
{
  "name": "Laptop",
  "description": "Dell Inspiron"
}
