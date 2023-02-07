# Abstraction

## Introduction

Abstraction is a general concept of hiding implementation details in favor of simple, human-readable actions - or abstractions, in layman's terms.

In Java, Interfaces are a good, consistent way to achieve abstraction. Interfaces
contain method definitions that lack implementations. Other classes that implement
these methods have to provide the implementation. You've probably already interacted
with interfaces and abstraction before with this line of code:

```java 
List<SomeType> list1 = new ArrayList<SomeType>();
```

where List is an interface, and ArrayList is an implementation of List. That means that List defines behaviors like add, get, remove, etc, that ArrayList provides the implementations for. This also allows for wildly different implementations of the same interface, such as

```java 
List<SomeType> list2 = new LinkedList<SomeType>();
```
While LinkedList exhibits the exact same behavior as ArrayList because they correctly implement the same interface, looking deeper into these two classes shows us that two classes can be implemented *very* differently. When writing our own code, we could eg use a DAO interface to define behaviors for different methods of persisting data, such as read/writing to files, or using JDBC to persist to a SQL database.

How is this Abstraction? By using interfaces, we define simple behaviors that a developer can understand without having to dive into complex implementations. Interfaces can provide a conceptual map of the different actions that Objects can perform.

## Part 1

Let's start off with an unserious example. Let's say we have a concept of a 'vehicle' that allows users to travel from point A to point B. We don't necessarily care about how this is done, so long as it accomplishes this task. Let's say that the behaviors 'stop()' and 'go()' are exhibited by all vehicles. You will find an interface named 'Vehicle' with these two behaviors defined. Your task is going to be to create several implementing classes for this interface inside the Part1 package, eg car, plane, boat, etc. The stop() and go() methods should use System.out.println() to print a description of what the specific vehicle has done (eg, 'The ship has moored at port', 'The plane is taking off', etc.). The start of a class like this would like this:

```java
package Part1;

public class Bike implements Vehicle{
//    stop() and go() implementations go here
}
```

This basic snippet does not compile. You'll need to implement the stop() and go() methods yourself, and this will most likely be a recommendation from your IDE.

### Testing

After you're done with your vehicle implementations, you can
try creating several Vehicle objects using your new classes in the Application class's main methods,
and seeing how they behave by calling the stop() and go()
methods.

### Conclusion

You can note that the Vehicle interface provides Abstraction for the different implementations of Vehicle. Rather than requiring the developer to understand how every different Vehicle functions, the developer only needs to know that a class implements the Vehicle interface in order to know that they may use the stop() and go() methods to perform some task.

## Part 2

Let's move onto a more serious example. Let's say that our development team needs to provide classes that are capable of keeping track of numbers for the purpose of finding duplicate numbers. The development team has decided that they would like to leverage an interface called DuplicateFinder and write several implementing classes in the Part2 package. The DuplicateFinder interface defines the behaviors addItem(int) and isDuplicate(int).

### Class 1

The first class implementing DuplicateFinder should store values inside an ArrayList, which is instantiated in the Class's constructor. In order to add items, it should use the add method of ArrayList, and in order to check for duplicates, it should use a for loop to iterate over the ArrayList and check if the value is already contained within the ArrayList.

### Class 2

The second class implementing DuplicateFinder should store values inside a HashSet, which is instantiated in the Class's constructor. In order to add items, it should use the add method of HashSet, and in order to check for duplicates, it should use the contains method of HashSet.

### Testing

After you're done with the two class implementations, you can
try creating several DuplicateFinder objects using your new classes in the Application class's main methods,
and seeing how they behave by calling the addItem() and isDuplicate(int) methods. They should behave correctly and identically.

### Conclusion

Despite having different implementations of DuplicateFinder, they should work exactly the same. The DuplicateFinder interface is able to provide useful abstractions for developers to find duplicate values without worrying about how an individual implementation of DuplicateFinder works.