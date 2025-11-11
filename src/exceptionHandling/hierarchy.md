# ⚙️ Java Exception and Error Class Hierarchy

## 📘 Overview
In Java, all exceptions and errors are part of the `Throwable` class.  
This hierarchy helps developers understand which problems can be handled (exceptions) and which are serious system-level failures (errors).

---

## 🧩 Throwable Hierarchy (Simplified)

java.lang.Object
└── java.lang.Throwable
├── java.lang.Error
│ ├── AssertionError
│ ├── AWTError
│ ├── LinkageError
│ │ ├── BootstrapMethodError
│ │ ├── ClassCircularityError
│ │ ├── ClassFormatError
│ │ ├── ExceptionInInitializerError
│ │ ├── IncompatibleClassChangeError
│ │ │ ├── AbstractMethodError
│ │ │ ├── IllegalAccessError
│ │ │ ├── InstantiationError
│ │ │ └── NoSuchFieldError
│ │ ├── NoClassDefFoundError
│ │ └── UnsatisfiedLinkError
│ ├── ThreadDeath
│ ├── VirtualMachineError
│ │ ├── InternalError
│ │ ├── OutOfMemoryError
│ │ ├── StackOverflowError
│ │ ├── UnknownError
│ │ └── OutOfMemoryError
│ └── IOError
│
└── java.lang.Exception
├── IOException
│ ├── FileNotFoundException
│ ├── EOFException
│ ├── InterruptedIOException
│ └── SocketException
│ ├── BindException
│ ├── ConnectException
│ ├── NoRouteToHostException
│ └── PortUnreachableException
├── SQLException
├── ClassNotFoundException
├── CloneNotSupportedException
├── InterruptedException
├── InvocationTargetException
├── NoSuchMethodException
├── TimeoutException
├── RuntimeException
│ ├── ArithmeticException
│ ├── ArrayStoreException
│ ├── ClassCastException
│ ├── EnumConstantNotPresentException
│ ├── IllegalArgumentException
│ │ ├── NumberFormatException
│ │ └── NullPointerException
│ ├── IllegalStateException
│ ├── IndexOutOfBoundsException
│ │ ├── ArrayIndexOutOfBoundsException
│ │ └── StringIndexOutOfBoundsException
│ ├── NegativeArraySizeException
│ ├── SecurityException
│ ├── UnsupportedOperationException
│ ├── MissingResourceException
│ ├── TypeNotPresentException
│ ├── NullPointerException
│ └── ConcurrentModificationException


---

## ⚙️ Explanation

### 🔹 `Throwable`
- The superclass of all `Error` and `Exception` classes.

### 🔹 `Error`
- Represents **serious problems** that a reasonable application should not try to catch.
- Examples:
    - `OutOfMemoryError`
    - `StackOverflowError`
    - `LinkageError`
    - `AssertionError`

### 🔹 `Exception`
- Represents **conditions that applications might want to catch and handle**.
- Two major types:
    - **Checked Exceptions** → Must be declared or handled.  
      Examples: `IOException`, `SQLException`
    - **Unchecked Exceptions (RuntimeException)** → Programming logic errors.  
      Examples: `NullPointerException`, `ArithmeticException`

---

## 🧠 Quick Summary

| Type | Checked | Common Examples | Description |
|------|----------|----------------|--------------|
| **Error** | ❌ No | `OutOfMemoryError`, `StackOverflowError`, `LinkageError` | Serious system failures |
| **Checked Exception** | ✅ Yes | `IOException`, `SQLException`, `ClassNotFoundException` | Must be caught or declared |
| **Unchecked Exception** | ❌ No | `NullPointerException`, `ArithmeticException`, `IllegalArgumentException` | Runtime programming errors |

---

**Author:** Abhishek Kumar Yadav  
**Purpose:** Complete Java Exception & Error Class Hierarchy (for reference and learning)  
**License:** MIT
