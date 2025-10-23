# 🏭 Factory Method Design Pattern 

The **Factory Method Pattern** is a **creational design pattern** that provides an interface for creating objects in a superclass,  
but allows subclasses to alter the type of objects that will be created.

It promotes **loose coupling** by removing the need for code to know the exact class that needs to be instantiated.

---

## 📘 Overview

In many applications, we often need to create objects without knowing their concrete class in advance.  
If we hardcode object creation using `new`, our code becomes tightly coupled to specific classes —  
making it harder to maintain, extend, or modify.

The **Factory Method Pattern** solves this by **defining an interface or abstract class** for creating an object,  
but letting subclasses decide which class to instantiate.

---

## 🧠 Advantages

**Loose Coupling** – The client code depends on abstractions, not concrete classes.  
**Extensibility** – New product types can be added without modifying existing code.  
**Single Responsibility** – Creation logic is centralized within factory classes.  
**Improved Maintainability** – Easier to manage and scale object creation logic.  
**Encapsulation** – The object creation process is hidden from the client.  
