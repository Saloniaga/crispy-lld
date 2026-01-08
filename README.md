# Low Level Design (LLD) – Java

This repository contains **Java-based Low Level Design (LLD) examples** focused on **SOLID principles** and **commonly asked design patterns**, written with **interview clarity** in mind.

The goal of this repo is not just to show working code, but to demonstrate:

* *Why* a design exists
* *What problem* it solves
* *How* SOLID principles improve extensibility and maintainability

---

## 📁 Repository Structure (Interview-Friendly)

```
src/main/java/org/example/
│
├── solid/
│   ├── single_responsibility/
│   ├── open_closed/
│   ├── liskov_substitution/
│   ├── interface_segregation/
│   └── dependency_inversion/
│
├── patterns/
│   ├── strategy/
│   ├── observer/
│   └── decorator/
│
├── case_studies/
│   └── parking_lot/
│
└── Main.java
```

This separation mirrors how interviewers **mentally categorize problems**:

* SOLID principles
* Design patterns
* Real-world LLD case studies

---

## 🧱 SOLID Principles

### 1️⃣ Single Responsibility Principle (SRP)

> A class should have only one reason to change.

**What is shown:**

* Separation of responsibilities
* Avoiding "god classes"

**Interview angle:**

* Improves maintainability
* Easier testing

---

### 2️⃣ Open/Closed Principle (OCP)

> Open for extension, closed for modification.

**What is shown:**

* Old approach that breaks OCP
* SOLID-compliant approach using abstractions

**Interview angle:**

* Adding new features without touching existing code

---

### 3️⃣ Liskov Substitution Principle (LSP)

> Subtypes must be substitutable for their base types.

**What is shown:**

* Classic Rectangle–Square problem
* Correct abstraction-based solution

**Interview angle:**

* Prevents runtime surprises
* Ensures behavioral correctness

---

### 4️⃣ Interface Segregation Principle (ISP)

> Clients should not be forced to depend on interfaces they don’t use.

**What is shown:**

* Fat interface vs role-based interfaces
* Cleaner contracts

**Interview angle:**

* Avoids unnecessary implementations

---

### 5️⃣ Dependency Inversion Principle (DIP)

> Depend on abstractions, not concretions.

**What is shown:**

* High-level modules decoupled from low-level implementations

**Interview angle:**

* Enables dependency injection
* Improves testability

---

## 🧩 Design Patterns

### Strategy Pattern

**Problem solved:**

* Selecting behavior at runtime

**Example:**

* Payment methods (UPI, Card, Cheque)

**Why interviewers like it:**

* Demonstrates OCP + polymorphism

---

### Observer Pattern

**Problem solved:**

* One-to-many notification

**Example:**

* Weather station notifying TV and Mobile users

**Why interviewers like it:**

* Event-driven systems
* Decoupled notification flow

---

### Decorator Pattern

**Problem solved:**

* Adding behavior dynamically without inheritance

**Example:**

* Coffee with milk and sugar decorators

**Why interviewers like it:**

* Avoids class explosion

---

## 🚗 Case Study: Parking Lot LLD

This is a **real-world LLD problem** commonly asked in interviews.

### Features covered:

* Vehicle entry and exit
* Ticket generation
* Parking spot allocation
* Pricing based on vehicle & time

### Key entities:

* Vehicle
* Ticket
* ParkingSpot
* Payment
* Gate (Entry & Exit)

**Design focus:**

* Separation of concerns
* Extensibility (new vehicle types, pricing rules)

---

## 🧠 How to Use This Repo for Interviews

* Start by explaining **the problem statement**
* Walk through **design decisions**
* Justify using **SOLID principles**
* Mention **trade-offs** where applicable

This repo is intentionally written to support **verbal explanation**, not just execution.

---

## ✅ Next Improvements (Planned)

* Add UML-style diagrams
* Add unit tests
* Convert Parking Lot into a full end-to-end design
* Add README per package

---

⭐ If you find this useful, feel free to fork and adapt it for your own interview prep.
