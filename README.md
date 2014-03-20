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
... 

# Questions

## Java / OOP questions
1. Comparisons with == operator or isEqual: == checks whether two variable point to the same reference. isEqual compares the objects values.
2. What is inheritance? Classes can inherit methods and variables from a mother class.
3. What is the difference between interfaces, abstract classes? Interfaces are only templates, abstract can additionally contain implementations.

## Technical Questions
1. **How does the Java compiler roughly work?** Source code is transformed into a parse tree. A parse tree contains syntactic elements and represents a 1:1 copy of the source code. The parse tree is then transformed into a Abstract Syntax Tree (AST) which omits syntactic details such as semicolons and parentheses. On top of the AST one can run graph traversal algorithms. We can execute the AST by running Depth First Search (DFS) on the expressions and Breadth First Search (BFS) on blocks.
2. **One advantage of functional programming with recursive functions**: States of a recursion are being automatically cached, which means that recursion becomes a lot more efficient.
3. **How does the a database compiler roughly work?**: A query serves as input telling the compiler what data is affected. The compiler creates execution plans in form of a trees (query execution tree). Different heuristics are used to elaborate on the most efficient plan, such as WHERE before JOIN. (Join is O(n^2) assuming the data is not sorted, wherease Where is just O(n)).
4. **Write a program which outputs the first 20 Fibbonacci numbers.** 

## Personal Questions
1. Why do I want to work for company xxx?
2. Where do I see myself in a few years time?
3. What makes me tick?