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

### Garbage Collector

Automatically removes unused object on the heap

### Procedural Programming 

A programming paradigm that uses a linear or top-down approach.

## 4 Pillars of Object-oriented Programming

### 1. Encapsulation

Bundle the data and methods that operate on the data in a single unit.


### 2. Abstraction

Reduce complexity by hiding unnecessary details

#### Coupling

The level of dependency between classes

> :warning: Always reduce **coupling**

#### Constructor 

A constructor is a special method that is called when creating a new object. We us constructor to initialize an object.


#### Method Overloading

A method that is implemented multiple times. Example of usage is setting a default value:

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




