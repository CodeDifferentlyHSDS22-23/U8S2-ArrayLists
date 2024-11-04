# U8S2 ArrayLists

* Part A - Foundations 8.2
* Part B - Foundations Practice
* Part C - Algorithm Challenge

## Part A


### Exercise 01

#### Step 01

In the package `partA` look at the file `ArrayList`.

#### Step 02

* Perform the following:
  * Create an ArrayList with a list of numbers
  * Display the contents of the ArrayList by using Iterator
  * Remove all even numbers
  * Display the contents of the ArrayList

Your program is working correctly, if when run, the following is the output:
```
scores 66
scores 79
scores 95
scores 84
scores [79, 95]
```

## Part B

### Exercise 01

#### Step 01

In the package `partB.ex01` look at the file `ArrayListDemoExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `partB.ex01` complete the `ArrayList1` per the following:

        Create a program with an arraylist that contains the following: Steve, Tim, Lucy, Pat, Angela, Tom
        Print this out to the console
        Remove Steve and Angela
        Print out the updated arraylist to the console
        Remove the third element by index
        Print out the updated arraylist to the console

Your program is working correctly, if when run, the following is the output:
```
[Steve, Tim, Lucy, Pat, Angela, Tom]
[Tim, Lucy, Pat, Tom]
[Tim, Lucy, Tom]
```

> Use ArrayListDemoExample for reference.


### Exercise 02

#### Step 01

In the package `partB.ex02` look at the file `ArrayListOperationsExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `partB.ex02` complete the `ArrayList2` per the following:

        Create a program with an arraylist of Strings
        Using the add method, add four unique values to it
        Sort the list
        Print out the contents using a loop
        Create a second list of numbers
        Using the add method, add four unique values to it
        Sort the list
        Print out the contents using a loop

Your program is working correctly, if when run, the following is the output:
```
Apple
Banana
Grapes
Mango
Sorting numbers...
1
11
21
51
```

> Use ArrayListOperationsExample for reference.


### Exercise 03

#### Step 01

In the package `partB.ex03` look at the file `ArrayListTraversingExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `partB.ex03` complete the `Traversing` per the following:

        Create a program with an arraylist that contains five unique string elements
        Iterate through the arraylist and print out the contents to the console

Your program is working correctly, if when run, the following is the output:
```
Gregor Clegane
Khal Drogo
Cersei Lannister
Sandor Clegane
Tyrion Lannister
```

> Use ArrayListTraversingExample for reference.

## Part c

### Problem 1
With the provided string, we need you to provide a new scrambled string.
Take the first two characters of the string or take whatever characters are present there.

Return the new string with the first 2 characters added at both the front and back of the original string.

Example:
```java
double22("kitten") --> "kikittenki"
double22("Ha") --> "HaHaHa"
double22("abc") --> "ababcab"
```
### Problem 2
We need to check if the given numbers are within the range 10...20 inclusive.
You are given 2 int values, return true if either number is in the range of 10...20.

Example:
```java
range1020(12, 99) --> true
range1020(21, 12) --> true
range1020(8, 99) --> false
```
