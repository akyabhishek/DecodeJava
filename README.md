# DecodeJava

A comprehensive Java learning repository demonstrating modern Java features including lambda expressions, functional interfaces, streams, optionals, method references, exception handling, and multithreading.

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

DecodeJava is an educational project that showcases various Java 8+ features with practical examples and demonstrations. This repository serves as a comprehensive learning resource for developers looking to understand functional programming concepts, exception handling mechanisms, and multithreading patterns in Java.

## ✨ Features

- **Lambda Expressions**: Multiple implementation approaches (traditional classes, anonymous classes, and lambda expressions)
- **Functional Interfaces**: Built-in Java functional interfaces (Predicate, Consumer, Function, Supplier)
- **Stream API**: Data processing with streams, filtering, mapping, and collecting
- **Optional Class**: Handling null values effectively
- **Method References**: Constructor references and method references
- **Comparators**: Custom sorting with Comparable and Comparator interfaces
- **Exception Handling**: Try-catch, custom exceptions, try-with-resources, and exception hierarchy
- **Multithreading**: Thread creation, synchronization, executors, locks, and producer-consumer patterns

## 📁 Project Structure

```
DecodeJava/
├── src/
│   ├── Main.java                           # Entry point
│   ├── compare/                            # Comparison demonstrations
│   │   ├── comparable/                     # Comparable interface examples
│   │   │   ├── ComparableDemo.java
│   │   │   └── Employee.java
│   │   └── comparator/                     # Comparator interface examples
│   │       ├── ComparatorDemo.java
│   │       ├── Employee.java
│   │       ├── IdComparator.java
│   │       └── SalaryComparator.java
│   ├── exceptionHandling/                  # Exception handling examples
│   │   ├── TryCatch.java                   # Basic try-catch blocks
│   │   ├── TryCatchFinally.java            # Finally block usage
│   │   ├── TryWithResource.java            # Try-with-resources
│   │   ├── MultipleCatch.java              # Multiple exception handling
│   │   ├── ThrowAndThrows.java             # Throw and throws keywords
│   │   ├── CustomException.java            # Creating custom exceptions
│   │   ├── MyCustomException.java          # Custom exception class
│   │   └── hierarchy.md                    # Exception hierarchy diagram
│   ├── lambda/                             # Lambda expression demonstrations
│   │   ├── FuncInter.java
│   │   ├── FuncInterImp.java
│   │   ├── LambdaDemo.java
│   │   ├── SumInter.java
│   │   ├── ThreadCreationLambdaDemo.java
│   │   └── functionalInterfaces/           # Built-in functional interfaces
│   │       ├── ConsumerInterface.java      # Consumer examples
│   │       ├── FunctionInterface.java      # Function examples
│   │       ├── PredicateInterface.java     # Predicate examples
│   │       └── SupplierInterface.java      # Supplier examples
│   ├── multithreading/                     # Multithreading demonstrations
│   │   ├── MyThreadByClass.java            # Thread creation by extending Thread
│   │   ├── MyThreadByInterface.java        # Thread creation using Runnable
│   │   ├── MyThreadDemo.java               # Thread usage examples
│   │   ├── ThreadByLambda.java             # Creating threads with lambda
│   │   ├── LifeCycleOfThread.java          # Thread lifecycle states
│   │   ├── ThreadPriorityMethod.java       # Thread priority management
│   │   ├── JoinBetweenThreads.java         # Thread joining
│   │   ├── DaemonThread.java               # Daemon thread examples
│   │   ├── ThreadCommunication.java        # Inter-thread communication
│   │   ├── VolatileDemo.java               # Volatile keyword usage
│   │   ├── AtomicDemo.java                 # Atomic variables
│   │   ├── executors/                      # Executor framework
│   │   │   ├── ThreadPoolDemo.java         # Thread pool basics
│   │   │   ├── FixedCachedThreadPool.java  # Fixed and cached pools
│   │   │   ├── RunnableNCallable.java      # Runnable vs Callable
│   │   │   ├── FutureDemo.java             # Future interface
│   │   │   ├── CallableWithInvokeAll.java  # InvokeAll method
│   │   │   ├── ScheduledExecutorServiceDemo.java
│   │   │   └── ScheduledExecutorServiceDemoFixed.java
│   │   ├── locks/                          # Locking mechanisms
│   │   │   ├── LockDemo.java               # Basic lock usage
│   │   │   ├── ReentrantLockDemo.java      # ReentrantLock examples
│   │   │   ├── ReadWriteCounter.java       # ReadWriteLock
│   │   │   └── BankAccount.java            # Thread-safe bank account
│   │   └── producerConsumer/               # Producer-Consumer pattern
│   │       ├── Demo.java                   # Main demo
│   │       ├── Company.java                # Shared resource
│   │       ├── Producer.java               # Producer thread
│   │       └── Consumer.java               # Consumer thread
│   ├── optional/                           # Optional class usage
│   │   └── OptionalDemo.java
│   ├── ref/                                # Method references
│   │   ├── RefDemo.java
│   │   ├── Task.java
│   │   ├── TaskInter.java
│   │   └── constructor/                    # Constructor references
│   │       ├── ConsMain.java
│   │       ├── OptionalClass.java
│   │       ├── Streams.java
│   │       ├── Student.java
│   │       └── StudentInter.java
│   └── streams/                            # Stream API examples
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
- Thread creation using lambda expressions

### 2. Functional Interfaces (`lambda/functionalInterfaces/`)
- **Predicate**: Testing conditions with `test()`, `and()`, `negate()`
- **Consumer**: Consuming data without returning values
- **Function**: Transforming input to output
- **Supplier**: Generating/supplying values

### 3. Stream API (`streams/`)
- Filtering collections with predicates
- Data transformation and collection
- Working with arrays and collections
- Method chaining for data processing
- Common stream operations (map, filter, reduce, collect)

### 4. Optional Class (`optional/`)
- Avoiding null pointer exceptions
- Safe value handling
- Optional chaining and transformations

### 5. Method References (`ref/`)
- Constructor references
- Static method references
- Instance method references
- Integration with streams and functional interfaces

### 6. Comparisons (`compare/`)
- **Comparable**: Natural ordering implementation
- **Comparator**: Custom sorting strategies
- Multiple comparison criteria

### 7. Exception Handling (`exceptionHandling/`)
- **Try-Catch Blocks**: Basic exception handling
- **Try-Catch-Finally**: Resource cleanup with finally
- **Try-With-Resources**: Automatic resource management
- **Multiple Catch**: Handling multiple exception types
- **Throw and Throws**: Exception propagation
- **Custom Exceptions**: Creating and using custom exception classes
- **Exception Hierarchy**: Complete Java exception hierarchy diagram

### 8. Multithreading (`multithreading/`)

#### Basic Threading
- Thread creation by extending Thread class
- Thread creation using Runnable interface
- Thread creation with lambda expressions
- Thread lifecycle and states
- Thread priority management
- Thread joining (wait for thread completion)
- Daemon threads

#### Thread Communication & Synchronization
- Inter-thread communication (wait, notify, notifyAll)
- Volatile keyword for visibility
- Atomic variables for lock-free operations
- Producer-Consumer pattern implementation

#### Executor Framework (`multithreading/executors/`)
- Thread pools (fixed, cached, scheduled)
- Runnable vs Callable
- Future interface for asynchronous results
- InvokeAll for batch task execution
- ScheduledExecutorService for scheduled tasks

#### Locks (`multithreading/locks/`)
- Basic Lock interface
- ReentrantLock for advanced locking
- ReadWriteLock for concurrent reads
- Thread-safe implementations (e.g., BankAccount)

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

### Exception Handling Example
```java
// Try-with-resources
try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
    String line = br.readLine();
} catch (IOException e) {
    e.printStackTrace();
}

// Custom exception
throw new MyCustomException("Custom error message");
```

### Multithreading Example
```java
// Creating thread with lambda
Thread t = new Thread(() -> {
    System.out.println("Thread running: " + Thread.currentThread().getName());
});
t.start();

// Using ExecutorService
ExecutorService executor = Executors.newFixedThreadPool(5);
executor.submit(() -> System.out.println("Task executed"));
executor.shutdown();

// Using ReentrantLock
ReentrantLock lock = new ReentrantLock();
lock.lock();
try {
    // Critical section
} finally {
    lock.unlock();
}
```

## 🤝 Contributing

Feel free to fork this repository and submit pull requests to improve the examples or add new demonstrations of Java features.

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

## 📞 Contact

For questions or suggestions, please feel free to reach out or create an issue in the repository.

---

**Happy Learning! 🎓**
