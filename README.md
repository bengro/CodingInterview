# CodingInterview

**My Java solutions to Cracking the Coding Interview.**

## Chapter 1: Arrays and Strings
1. Strings are converted to arrays using toCharrArray() method provided by the String class.
2. When the number of unique elements is small, sorting can be in O(n) (à la bucket sort).
3. Always ask what data the array contains to find out about possible optimizations.
4. StringBuffer brings down String concatenation to amortized O(n) - instead of O(n^2).
5. Definition "String rotation": string of same size and identical letter sequence but with arbitrary offset.

## Chapter 2: Linked Lists
1. Runner technique: using two pointers to iterate a linked list. Can for example be used to find the kth element to last, remove duplicates.
2. Link Lists shift cheap (contrary to Arrays).
3. Recursion always takes at least O(n) but can enhance singly-linked list into pseudo doubly-linked list.

## Chapter 3:
1. Stack API: void push(T val), void pop(), T peek(). All methods have O(1). 
2. The underlying data structure for stacks can be an Array or Linked List.
3. Interesting question: How to sort a stack with just one additional stack. The additional stack always contains sorted element. The input stack is unsorted and is used as buffer.

## Chapter 4:
1. Balancing Binary Search Tree: When inserting a ordered list into a BST, we will end up having a list. Balancing means reshuffling the tree such that tree is entirely or almost complete.
2. Red-Black-Tree is an implementation of a balanced BST
3. Trie is a variant of an n-ary tree in which characters are stored at each node. Each path down the tree may represent a word.
4. Binary Tree: Tree with maximally two nodes originating from a node. 

## Chapter 11: Sorting
1. Large array, small interval of values: Bucket Sort / Radix Sort. O(n).
2. Bubble sort: pairwise swap two consecutive elements if left > right. Do it until array is sorted. O(n^2).
3. Selection sort: linear scan finding smallest element. Move it to front. O(n^2).
4. Mege sort: We create an auxiliary array and recursively partition it. We start merging it when the size of the array becomes 1.
 

## Chapter 12: Testing
1. One can test 1) real-world object, 2) piece of software, 3) a function or 4) an existing issue.
2. Testing a real-world object: 1) Who are our users? 2) What are the use-cases? 3) What are the bounds of use? 4) What are the stress / failure conditions? 5) How to test / speed up the test?
3. Testing Software: 1) White / Blackbox testing? 2) Who will use it? 3) What are the use cases? 4) What are the bounds? 5) Stress / Failure conditions? 6) How to perform the testing (manual, automated)?
4. Testing a function: validating input and output. 1) Define the test cases, 2) Define the expected result 3) Write the test.


# Encountered Interview Questions

## Java, OOP questions
1. Comparisons with == operator or isEqual: == checks whether two variable point to the same reference. isEqual compares the objects values.
2. What is inheritance? Classes can inherit methods and variables from a mother class.
3. What is the difference between interfaces, abstract classes? Interfaces are only templates, abstract can additionally contain implementations.
4. What are reflections?
5. What is type erasure?
6. What is encapsulation?
7. What is new in Java 7, 8?
8. What are annotations? What types can you pass into one? Is the compiler executing annotations?
9. What is a Java servlet?

## Misc questions
1. Hibernate: Given an abstract class and two implementations. Are there 1,2,3 tables? Different ways how hibernate deals with abstract classes.
2. Hibernate: What is eager / lazy loading? What might be the problem of lazy loading?
3. When is a XML document mal-formed, when invalid?
4. What is an XML schema?
5. Single page application vs Ajax application. What are the differences? How does AJAX work?

## Technical Questions
1. **How does the Java compiler roughly work?** Source code is transformed into a parse tree. A parse tree contains syntactic elements and represents a 1:1 copy of the source code. The parse tree is then transformed into a Abstract Syntax Tree (AST) which omits syntactic details such as semicolons and parentheses. On top of the AST one can run graph traversal algorithms. We can execute the AST by running Depth First Search (DFS) on the expressions and Breadth First Search (BFS) on blocks.
2. **One advantage of functional programming with recursive functions**: States of a recursion are being automatically cached, which means that recursion becomes a lot more efficient.
3. **How does the a database compiler roughly work?**: A query serves as input telling the compiler what data is affected. The compiler creates execution plans in form of a trees (query execution tree). Different heuristics are used to elaborate on the most efficient plan, such as WHERE before JOIN. (Join is O(n^2) assuming the data is not sorted, wherease Where is just O(n)).
4. **Write a program which outputs the first 20 Fibbonacci numbers.** 
5. **Write a program which translates roman numbers to an integer.**

## Personal Questions
1. Why do I want to work for company xxx?
2. Where do I see myself in a few years time?
3. What makes me tick?