# DecodeJava

A comprehensive Java learning repository demonstrating modern Java features including lambda expressions, functional interfaces, streams, optionals, and method references.

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Topics Covered](#topics-covered)
- [Prerequisites](#prerequisites)
- [How to Run](#how-to-run)
- [Examples](#examples)

## 🔍 Overview

DecodeJava is an educational project that showcases various Java 8+ features with practical examples and demonstrations. This repository serves as a learning resource for developers looking to understand functional programming concepts in Java.

## ✨ Features

- **Lambda Expressions**: Multiple implementation approaches (traditional classes, anonymous classes, and lambda expressions)
- **Functional Interfaces**: Built-in Java functional interfaces (Predicate, Consumer, Function, Supplier)
- **Stream API**: Data processing with streams, filtering, mapping, and collecting
- **Optional Class**: Handling null values effectively
- **Method References**: Constructor references and method references
- **Comparators**: Custom sorting with Comparable and Comparator interfaces

## 📁 Project Structure

```
DecodeJava/
├── src/
│   ├── Main.java                           # Entry point
│   ├── compare/                           # Comparison demonstrations
│   │   ├── comparable/                    # Comparable interface examples
│   │   │   ├── ComparableDemo.java
│   │   │   └── Employee.java
│   │   └── comparator/                    # Comparator interface examples
│   │       ├── ComparatorDemo.java
│   │       ├── Employee.java
│   │       ├── IdComparator.java
│   │       └── SalaryComparator.java
│   ├── lambda.functionalInterfaces/              # Built-in functional interfaces
│   │   ├── ConsumerInterface.java         # Consumer examples
│   │   ├── FunctionInterface.java         # Function examples
│   │   ├── PredicateInterface.java        # Predicate examples
│   │   └── SupplierInterface.java         # Supplier examples
│   ├── lambda/                           # Lambda expression demonstrations
│   │   ├── FuncInter.java
│   │   ├── FuncInterImp.java
│   │   ├── LambdaDemo.java
│   │   ├── SumInter.java
│   │   └── ThreadCreationDemo.java
│   ├── optional/                         # Optional class usage
│   │   └── OptionalDemo.java
│   ├── ref/                              # Method references
│   │   ├── RefDemo.java
│   │   ├── Task.java
│   │   ├── TaskInter.java
│   │   └── constructor/                   # Constructor references
│   │       ├── ConsMain.java
│   │       ├── OptionalClass.java
│   │       ├── Streams.java
│   │       ├── Student.java
│   │       └── StudentInter.java
│   └── streams/                          # Stream API examples
│       ├── StreamMethods.java
│       └── StreamsDemo.java
└── README.md
```

## 🚀 Getting Started

### Prerequisites

- Java 8 or higher
- IDE (IntelliJ IDEA, Eclipse, or VS Code)
- Basic understanding of Java programming

### How to Run

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd DecodeJava
   ```

2. **Open in your IDE:**
   - Import the project into your preferred Java IDE
   - Ensure the JDK version is set to Java 8+

3. **Run individual examples:**
   - Navigate to any demo class (e.g., `LambdaDemo.java`)
   - Run the `main` method to see the output

## 📚 Topics Covered

### 1. Lambda Expressions (`lambda/`)
- Traditional class implementation vs anonymous classes vs lambda expressions
- Functional interface implementation
- Parameter inference in lambda expressions

### 2. Functional Interfaces (`lambda.functionalInterfaces/`)
- **Predicate**: Testing conditions with `test()`, `and()`, `negate()`
- **Consumer**: Consuming data without returning values
- **Function**: Transforming input to output
- **Supplier**: Generating/supplying values

### 3. Stream API (`streams/`)
- Filtering collections with predicates
- Data transformation and collection
- Working with arrays and collections
- Method chaining for data processing

### 4. Optional Class (`optional/`)
- Avoiding null pointer exceptions
- Safe value handling
- Optional chaining and transformations

### 5. Method References (`ref/`)
- Constructor references
- Static method references
- Instance method references

### 6. Comparisons (`compare/`)
- **Comparable**: Natural ordering implementation
- **Comparator**: Custom sorting strategies
- Multiple comparison criteria

## 💡 Examples

### Lambda Expression Example
```java
// Traditional approach
FuncInter funcInter = new FuncInterImp();
funcInter.sayHello();

// Lambda expression
FuncInter funcInter2 = () -> System.out.println("Hello from Lambda Expression");
funcInter2.sayHello();
```

### Stream API Example
```java
List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
List<Integer> evenNumbers = numbers.stream()
    .filter(num -> num % 2 == 0)
    .collect(Collectors.toList());
```

### Predicate Example
```java
Predicate<Integer> isEven = num -> num % 2 == 0;
Predicate<Integer> isPositive = n -> n > 0;
System.out.println(isEven.and(isPositive).test(2)); // true
```

## 🤝 Contributing

Feel free to fork this repository and submit pull requests to improve the examples or add new demonstrations of Java features.

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

## 📞 Contact

For questions or suggestions, please feel free to reach out or create an issue in the repository.

---

**Happy Learning! 🎓**
