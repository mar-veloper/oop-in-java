# Object Oriented Programming 

> Learning Object-Oriented Programming in Java

## Benefits of OOP

1. Reduced Complexity
2. Easier Maintenance
3. Code Reuse
4. Faster Development

## Problem Solving 

Process of defining a problem, identifying and comparing different solutions, 
and picking the one that best solves that problem with respect to the context and constraints.

### Programming Paradigms 

1. Procedural
2. Functional
3. Object-oriented
4. Event-driven
5. Logic
6. Aspect-oriented

### Class

A class is a blueprint or template for creating an object.

### Object 

An object is an instance of a class.

### Instantiating

Instantiating means creating an instance of a class.

### Stack Memory

Stack memory is used for storing primitive types and variables that store reference to objects in heap.

### Garbage Collector

Variables stored in the stack are immediately cleared when they go out of scope (e.g. when a method finishes execution). Objects stored in the heap get removed later on when they’re no longer references. 
This is done by Java’s garbage collector.

### Procedural Programming 

A programming paradigm that uses a linear or top-down approach.

### Hash 

Numeric value that is calculated based on the address of the object in memory.

### Problem with _procedural programming_?
Big classes with several unrelated methods focusing on different concerns and responsibilities. 
These methods often have several parameters. You often see the same group of parameters repeated across these methods. All you see is procedures calling each other passing arguments around.

By applying object-oriented programming techniques, we extract these repetitive parameters and declare them as fields in our classes. 
Our classes will then encapsulate both the data and the operations on the data (methods). 
As a result, our methods will have fewer parameters and our code will be cleaner and more reusable.


### 2 types of Class members

1. Instance members
   - Fields and method that belongs to an object (instance of a class)

2. Static members
   - Fields and method that belongs to a class. We use **Static Members** to represent a concept in a single place.

## 4 Pillars of Object-oriented Programming

### 1. Encapsulation

First principle of OOP, and suggests to bundle the data and methods that operate on the data inside a single unit(class).


### 2. Abstraction

Reduce complexity by hiding unnecessary details

#### Coupling

The level of dependency between classes

> :warning: Always reduce **coupling**

#### Constructor 

Constructors are called when we instantiate our class. We use them to initialize our objects.


#### Method Overloading

A method that is implemented multiple times. Method overloading means declaring a method with the same name but with different signatures. Example of usage is setting a default value:

```
public int calculateWage(int extraHours) {
    return getBaseSalary() + (getHourlyRate() * extraHours);
}

// Here we are calling the calculateWage method to pass a default argument 
public int calculateWage() {
    return calculateWage(0);
}
```

#### Constructor Overloading

There are two ways to overload a constructor:

```
// First: By calling the getters
public Employee(int baseSalary) {
    setBaseSalary(baseSalary);
    setHourlyRate(0);
}

// By reusing the logic from original constructor 
public Employee(int baseSalary) {
   this(baseSalary, 0);
}

// Here is the original constructor
public Employee(int baseSalary, int hourlyRate) {
    this.setBaseSalary(baseSalary);
    this.setHourlyRate(hourlyRate);
}
```


### 3. Inheritance

A mechanism that allows clas to inherit properties and behaviour from another class.

#### Method Overriding 

Modifying inherited method from a base class

#### Annotation

A label attached to a class member, to give extra information to a compiler.


#### Upcasting

Casting an object to one of its **super** types

#### Downcasting

Casting an object one of its **sub** types

```
public class Main {
    public static void main(String[] args) {

      // TextBox inherits from UIControl
      var control = new UIControl(true);
      var textBox = new TextBox();

      // Upcasting -> TextBox automatically cast as UIControl
      show(textBox);
    }

    public static void show(UIControl control) {
        // At runtime, you only have access to UIControl: control object (Properties and methods)
        // At compile time you don't have access to TextBox object

        if (control instanceof TextBox) {
            // We need to implement Downcasting to access properties and methods of TextBox in complile time
            // Downcasting -> Explicitly cast object to different type
            // In this case casting control object type from UIControl to TextBox

            var textBox = (TextBox)control;
            textBox.setText("Downcasting");
        }
        
        System.out.println(control);
    }
}
```

### 4. Polymorphism 

A mechanism that allows an object to take many forms and behave differently. This will help us build extensible applications.


#### Abstract Classes and method

Prevent instantiating of a class or method

```
public abstract class UIControl {
    public abstract void render();
}
```






