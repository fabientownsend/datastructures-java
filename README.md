[![Build Status](https://travis-ci.org/fabientownsend/datastructures-java.svg?branch=master)](https://travis-ci.org/fabientownsend/datastructures-java) 
[![Coverage Status](https://coveralls.io/repos/github/fabientownsend/datastructures-java/badge.svg?branch=master)](https://coveralls.io/github/fabientownsend/datastructures-java?branch=master)
#Purpose
The purpose of this repository, for me, is to study sata structure and get more familiar with Java.
I plan to implemente those following data structure:

##DATA STRUCTURES

| Abstract Data Structure | Data Structure    |
| ------------------------|-------------------|
| Stack                   | Array, LinkedList |
| Queue                   | Array, LinkedList |
| Priority queue          | Heap              |
| Dictionary              | are neat          |

- [Linked List](https://github.com/fabientownsend/datastructures-java/blob/master/src/main/java/datastructures/LinkedList.java)
- Double Linked List
- Stack
  - [LinkedList Stack](https://github.com/fabientownsend/datastructures-java/blob/master/src/main/java/datastructures/StackLinkedList.java)
  - [Array Stack](https://github.com/fabientownsend/datastructures-java/blob/master/src/main/java/datastructures/ArrayStack.java)
- Queue
  - [LinkedList Queue](https://github.com/fabientownsend/datastructures-java/blob/master/src/main/java/datastructures/Queue.java)
  - Array Queue
- [Binary Search Trees](https://github.com/fabientownsend/datastructures-java/blob/master/src/main/java/datastructures/BinarySearchTrees.java)
- AVL Trees
- HashTable
- Heaps

| Stack memory                         | Heap memory              |
| -------------------------------------|--------------------------|
| Limited in size                      | No size limits           |
| Fast access                          | Slow access              |
| Local variables                      | Objects                  |
| Spaces is managed efficiently by CPU | Memory may be fragmented |
| Variables cannot be resized          | Variables can be resized |

## Time complexity Binary Search Trees
|        | Average case | Worst case |
| -------|--------------|------------|
| Space  | O(n)         | O(n)       |
| Insert | O(log n)     | O(n)       |
| Delete | O(log n)     | O(n)       |
| Search | O(log n)     | O(n)       |

## Time complexity Balanced Trees
|        | Average case | Worst case |
| -------|--------------|------------|
| Space  | O(n)         | O(n)       |
| Insert | O(log n)     | O(log n)   |
| Delete | O(log n)     | O(log n)   |
| Search | O(log n)     | O(log n)   |

## Generics convention
- T: Type
- E: Element
- K: key
- V: Value

source: [wikipedia](https://en.wikipedia.org/wiki/List_of_data_structures)
