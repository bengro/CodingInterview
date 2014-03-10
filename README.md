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

## Java notes
1. Comparisons with == operator or isEqual: == checks whether two variable point to the same reference. isEqual compares the objects values.
