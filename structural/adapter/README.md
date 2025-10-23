# 🔌 Adapter Design Pattern in Object-Oriented Programming

The **Adapter Pattern** is a **structural design pattern** that allows **incompatible interfaces** to work together.  
It acts as a **bridge** between two classes that couldn’t otherwise communicate directly.

In simple terms: the adapter **“translates”** one interface into another that the client expects.

---

## 📘 Overview

Sometimes, you need to integrate a class or component into your system, but its interface doesn’t match what your code expects.  
Instead of modifying existing code (which may not be possible), you can use an **Adapter** to make them compatible.

The **Adapter Pattern** helps achieve **code reusability**, **flexibility**, and **decoupling** between components with different interfaces.

---

## 🧠 Advantages

**Reusability** – Reuse existing classes even if their interfaces don’t match.  
**Flexibility** – Makes it easy to integrate third-party or legacy code.  
**Loose Coupling** – The client doesn’t depend directly on incompatible implementations.  
**Single Responsibility** – The adapter focuses only on conversion logic.  
**Improves Maintainability** – You can adapt new systems without changing existing code.  
**Extensibility** – Easily add new adapters for new interfaces.  
