# Java Programming — Full Course

A hands-on Java 21 course. Every lesson is a small, runnable program that demonstrates one topic, and the code is organized into packages that match its folder.

## Requirements

- JDK 21 or newer (`javac -version`)
- macOS, Linux, or WSL (the helper scripts are Bash)
- Optional: VS Code with the Extension Pack for Java

## Quick start

```bash
./scripts/build.sh                              # compile everything into bin/
./scripts/run.sh fundamentals.HelloWorld        # run one lesson
./scripts/run.sh projects.library.LibraryApp "Clean Code" "Effective Java"
```

Compile with plain `javac` if you prefer:

```bash
find src -name '*.java' -print0 | xargs -0 javac -d bin
java -cp bin fundamentals.HelloWorld
```

The project is also configured for VS Code: `src` is the source root and `bin` is the output folder.

## Learning path

| Module | Topic | Folder | Start with |
|---|---|---|---|
| 01 | Java basics, variables, types, operators, input | [`src/fundamentals`](src/fundamentals) | `fundamentals.HelloWorld` |
| 02 | Conditions, loops, switch expressions | [`src/controlflow`](src/controlflow) | `controlflow.SwitchExpressionDemo` |
| 03 | Methods, overloading, varargs, recursion | [`src/methods`](src/methods) | `methods.MethodBasics` |
| 04 | Arrays and two-dimensional arrays | [`src/arrays`](src/arrays) | `arrays.ArrayMain` |
| 05 | Strings and StringBuilder | [`src/strings`](src/strings) | `strings.StringDemo` |
| 06 | OOP: classes, encapsulation, inheritance, abstraction, interfaces, polymorphism | [`src/oop`](src/oop), [`src/abstraction`](src/abstraction), [`src/interfaces`](src/interfaces), [`src/polymorphism`](src/polymorphism) | `oop.OopBasicsDemo` |
| 06 | Interfaces in practice: a payment system | [`src/payment`](src/payment) | `payment.PaymentApp` |
| 07 | Exceptions and custom exceptions | [`src/exceptions`](src/exceptions) | `exceptions.ExceptionDemo` |
| 08 | Collections: List, Set, Map | [`src/collections`](src/collections) | `collections.ListDemo` |
| 09 | Generics and bounded wildcards | [`src/generics`](src/generics) | `generics.GenericBoxDemo` |
| 10 | Streams and lambdas | [`src/streams`](src/streams) | `streams.StreamDemo` |
| 11 | File I/O with `java.nio.file` | [`src/fileio`](src/fileio) | `fileio.FileIODemo` |
| 12 | Threads and executors | [`src/concurrency`](src/concurrency) | `concurrency.ThreadDemo` |
| 13 | Records, enums, sealed types, pattern matching | [`src/modernjava`](src/modernjava) | `modernjava.RecordDemo` |
| 14 | Small project using classes, collections, and arguments | [`src/projects`](src/projects) | `projects.library.LibraryApp` |

## Lessons by module

### 01 — Fundamentals

| Class | What it teaches |
|---|---|
| `HelloWorld` | Structure of a Java program and `main` |
| `Variables` | Declaring and printing variables |
| `DataTypes` | The eight primitive types and reference types |
| `Operators` | Arithmetic, comparison, logical, and assignment operators |
| `TypeCasting` | Widening, narrowing, and parsing text |
| `UserInput` | Reading values with `Scanner` and try-with-resources |

### 02 — Control flow

| Class | What it teaches |
|---|---|
| `ControlStatement` | `if`/`else` and `for` loops |
| `LoopPatterns` | `while`, `break`, and `continue` |
| `DoWhileLoop` | Menu loop with `do`/`while` |
| `SwitchExpressionDemo` | Arrow `switch` and switch expressions |

### 03 — Methods

`MethodBasics` covers parameters, return values, overloading, and varargs. `RecursionDemo` covers base cases, factorial, Fibonacci, and digit sums.

### 04 — Arrays

`ArrayMain` sums, averages, finds min/max, and reverses an array in place. `Array2DDemo` prints, sums, and transposes a grid.

### 05 — Strings

`StringDemo` shows immutability, common string methods, and `equals` vs `==`. `StringBuilderDemo` shows mutable text and palindrome checking.

### 06 — Object-oriented programming

| Folder | Focus |
|---|---|
| `oop` | Classes, objects, constructors, encapsulation, `static`, inheritance, `toString` |
| `abstraction` | Abstract classes and abstract methods |
| `interfaces` | Multiple interfaces, interface references, `instanceof` |
| `polymorphism` | Overloading, overriding, dynamic dispatch, banking example |
| `payment` | Interface-driven payment system |

Start with `oop.OopBasicsDemo`, then `oop.OopDemo`, `abstraction.AbstractionDemo`, `interfaces.InterfaceMain`, `polymorphism.PolymorphismDemo`, and `payment.PaymentApp`.

### 07 — Exceptions

`ExceptionDemo` handles `ArithmeticException` and `NumberFormatException`. `CustomExceptionDemo` defines a checked `InsufficientFundsException`.

### 08 — Collections

`ListDemo` (ordered lists), `SetDemo` (unique values), and `MapDemo` (key-value pairs and word counting).

### 09 — Generics

`GenericBoxDemo` uses generic classes, a generic `record`, and an upper-bounded wildcard.

### 10 — Streams

`StreamDemo` filters, maps, sums, groups, and builds a range with the Stream API.

### 11 — File I/O

`FileIODemo` writes, reads, appends to, and deletes a temporary text file using `Path` and `Files`.

### 12 — Concurrency

`ThreadDemo` starts and joins a thread. `ExecutorDemo` submits `Callable` tasks to a fixed thread pool and reads `Future` results.

### 13 — Modern Java

`RecordDemo` (records and compact constructors), `EnumDemo` (enums with fields and methods), `SealedShapeDemo` (sealed interfaces with pattern-matching `switch`), and `DateTimeDemo` (`java.time`).

### 14 — Project

`projects.library.LibraryApp` combines classes, collections, sorting, streams, and command-line arguments.

## Project layout

```
java-language/
├── README.md
├── scripts/
│   ├── build.sh          # compile all sources into bin/
│   └── run.sh            # run a fully qualified class name
├── src/                  # all Java sources, grouped by topic
│   ├── fundamentals/
│   ├── controlflow/
│   ├── methods/
│   ├── arrays/
│   ├── strings/
│   ├── oop/
│   ├── abstraction/
│   ├── interfaces/
│   ├── polymorphism/
│   ├── payment/
│   ├── exceptions/
│   ├── collections/
│   ├── generics/
│   ├── streams/
│   ├── fileio/
│   ├── concurrency/
│   ├── modernjava/
│   └── projects/
├── bin/                  # generated classes (ignored by Git)
└── lib/                  # third-party JAR files, if needed
```

## Conventions used in this course

- Package names are lowercase and match folder names.
- One public class per file, and the file name matches the class name.
- Fields are `private` unless a subclass needs them; access goes through methods.
- Input is validated before state changes.
- Resources such as `Scanner`, `ExecutorService`, and files use try-with-resources or `finally`.
- Each runnable lesson has a `main` method and a header comment with its run command.

## Suggested practice

1. Add a `while` loop to `LoopPatterns` that validates input.
2. Add a `Triangle` class to `oop` that reuses the `Rectangle` style.
3. Add a `SavingsAccount` subclass in `exceptions` that throws on an over-withdrawal.
4. Add `remove` and `find` operations to the library project.
5. Add a lesson on `LocalDate`/`LocalDateTime` and one on JUnit 5 tests.
