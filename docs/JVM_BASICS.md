# JVM Basics - LearnTrack System

### 1. JDK, JRE, and JVM
- **JDK (Java Development Kit):** It is a software development environment used to develop Java applications. It contains JRE + Development tools (like javac, debugger).
- **JRE (Java Runtime Environment):** It provides the minimum requirements for executing a Java application. It contains JVM + Library files.
- **JVM (Java Virtual Machine):** It is the engine that drives the Java code. It converts Java bytecode into machine-level language.

### 2. What is Bytecode?
Bytecode is the intermediate representation of Java source code. When we compile a `.java` file using `javac`, it creates a `.class` file. This file contains bytecode which is platform-independent.

### 3. "Write Once, Run Anywhere" (WORA)
This means that a developer can develop Java code on one system (e.g., Windows) and can expect it to run on any other Java-enabled system (e.g., Mac or Linux) without any changes. This is possible because the JVM handles the platform-specific execution of the bytecode.
