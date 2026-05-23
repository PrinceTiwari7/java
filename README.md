# ☕ Java Data Structures & Algorithms (DSA) Practice

Welcome to my personal, interactive study repository for practicing and analyzing Data Structures and Algorithms in Java.

---

## 🛠️ How to Compile & Run

All problems are written in standard Java and organized into self-contained source files under category directories.

### Run a Java file directly:
```bash
# Using modern Java 11+, you can run a single file directly without manual compilation:
java FoundationalConcepts/ConstantTimeComplexity.java
```

### Manual compile and run:
```bash
# Compile
javac LinearDataStructures/MinStack.java

# Run from the repository root
java -cp LinearDataStructures MinStack
```

---

## 🧭 Recommended Study Order

If you are new to DSA, follow this structured roadmap:
1. **Foundational Concepts** ➔ Understand time/space complexity and recursion basics.
2. **Linear Data Structures** ➔ Learn fundamental linear containers (Arrays, Linked Lists, Stacks, Queues).
3. **Searching & Sorting** ➔ Study standard algorithms to locate and arrange data.
4. **Non-Linear Data Structures** ➔ Progress to Trees, Heaps, and Graphs.
5. **Algorithm Design Paradigms** ➔ Master advanced techniques (Greedy, Backtracking, Dynamic Programming).
6. **Graph & Pattern Algorithms** ➔ Solve interview-specific patterns (Sliding Window, Dijkstra, etc.).

---

## 📂 Interactive Problem Index

*Check the boxes to track your learning progress directly on GitHub!*

<details>
<summary><b>1. Foundational Concepts (25 Problems)</b></summary>
<br>

> Understand algorithm efficiency (Big O), time & space complexity, recursion, bitwise operations, and Java-specific tools like Generics and the Collections Framework.

| Progress | Problem | Difficulty | Time Complexity | Space Complexity |
| :---: | :--- | :--- | :--- | :--- |
| [ ] | [Constant Time Complexity](./FoundationalConcepts/ConstantTimeComplexity.java) | 🟢 Easy | `O(1)` | `O(1)` |
| [ ] | [Linear Time Complexity](./FoundationalConcepts/LinearTimeComplexity.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Quadratic Time Complexity](./FoundationalConcepts/QuadraticTimeComplexity.java) | 🟢 Easy | `O(N^2)` | `O(1)` |
| [ ] | [Logarithmic Time Complexity](./FoundationalConcepts/LogarithmicTimeComplexity.java) | 🟢 Easy | `O(log N)` | `O(1)` |
| [ ] | [Linearithmic Time Complexity](./FoundationalConcepts/LinearithmicTimeComplexity.java) | 🟢 Easy | `O(N log N)` | `O(N)` |
| [ ] | [Auxiliary Space Complexity](./FoundationalConcepts/AuxiliarySpaceComplexity.java) | 🟢 Easy | `O(N)` | `O(N)` |
| [ ] | [Recursion Factorial](./FoundationalConcepts/RecursionFactorial.java) | 🟢 Easy | `O(N)` | `O(N)` |
| [ ] | [Recursion Fibonacci](./FoundationalConcepts/RecursionFibonacci.java) | 🟢 Easy | `O(2^N)` | `O(N)` |
| [ ] | [Recursion Sum Of N](./FoundationalConcepts/RecursionSumOfN.java) | 🟢 Easy | `O(N)` | `O(N)` |
| [ ] | [Recursion Power](./FoundationalConcepts/RecursionPower.java) | 🟢 Easy | `O(exp)` | `O(exp)` |
| [ ] | [Recursion Reverse String](./FoundationalConcepts/RecursionReverseString.java) | 🟢 Easy | `O(N)` | `O(N)` |
| [ ] | [Recursion Palindrome](./FoundationalConcepts/RecursionPalindrome.java) | 🟢 Easy | `O(N)` | `O(N)` |
| [ ] | [Bit Get Bit](./FoundationalConcepts/BitGetBit.java) | 🟢 Easy | `O(1)` | `O(1)` |
| [ ] | [Bit Set Bit](./FoundationalConcepts/BitSetBit.java) | 🟢 Easy | `O(1)` | `O(1)` |
| [ ] | [Bit Clear Bit](./FoundationalConcepts/BitClearBit.java) | 🟢 Easy | `O(1)` | `O(1)` |
| [ ] | [Bit Power Of Two](./FoundationalConcepts/BitPowerOfTwo.java) | 🟢 Easy | `O(1)` | `O(1)` |
| [ ] | [Bit Count Set Bits](./FoundationalConcepts/BitCountSetBits.java) | 🟢 Easy | `O(log N)` | `O(1)` |
| [ ] | [Bit Single Number](./FoundationalConcepts/BitSingleNumber.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Collections Array List Usage](./FoundationalConcepts/CollectionsArrayListUsage.java) | 🟢 Easy | `O(N)` | `O(N)` |
| [ ] | [Collections Hash Map Usage](./FoundationalConcepts/CollectionsHashMapUsage.java) | 🟢 Easy | `O(1)` | `O(N)` |
| [ ] | [Collections Hash Set Usage](./FoundationalConcepts/CollectionsHashSetUsage.java) | 🟢 Easy | `O(1)` | `O(N)` |
| [ ] | [Collections Priority Queue Usage](./FoundationalConcepts/CollectionsPriorityQueueUsage.java) | 🟢 Easy | `O(log N)` | `O(N)` |
| [ ] | [Generics Class Demo](./FoundationalConcepts/GenericsClassDemo.java) | 🟢 Easy | `O(1)` | `O(1)` |
| [ ] | [Generics Method Demo](./FoundationalConcepts/GenericsMethodDemo.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Generics Bounded Type](./FoundationalConcepts/GenericsBoundedType.java) | 🟢 Easy | `O(1)` | `O(1)` |

</details>

<details>
<summary><b>2. Linear Data Structures (39 Problems)</b></summary>
<br>

> Work with sequential data organization: Arrays, ArrayLists, Strings, StringBuilders, custom Singly/Doubly/Circular Linked Lists, Stacks, Queues, Deques, and Priority Queues.

| Progress | Problem | Difficulty | Time Complexity | Space Complexity |
| :---: | :--- | :--- | :--- | :--- |
| [ ] | [Array Insert](./LinearDataStructures/ArrayInsert.java) | 🟢 Easy | `O(N)` | `O(N)` |
| [ ] | [Array Delete](./LinearDataStructures/ArrayDelete.java) | 🟢 Easy | `O(N)` | `O(N)` |
| [ ] | [Array Reverse](./LinearDataStructures/ArrayReverse.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Array Find Min Max](./LinearDataStructures/ArrayFindMinMax.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Array Rotate](./LinearDataStructures/ArrayRotate.java) | 🟡 Medium | `O(N)` | `O(1)` |
| [ ] | [Array Move Zeroes](./LinearDataStructures/ArrayMoveZeroes.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Array Remove Duplicates](./LinearDataStructures/ArrayRemoveDuplicates.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Custom Array List](./LinearDataStructures/CustomArrayList.java) | 🟡 Medium | `O(1) amortized` | `O(N)` |
| [ ] | [String Reverse](./LinearDataStructures/StringReverse.java) | 🟢 Easy | `O(N)` | `O(N)` |
| [ ] | [String Palindrome](./LinearDataStructures/StringPalindrome.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [String First Unique Char](./LinearDataStructures/StringFirstUniqueChar.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [String Compression](./LinearDataStructures/StringCompression.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [String Rotation](./LinearDataStructures/StringRotation.java) | 🟢 Easy | `O(N)` | `O(N)` |
| [ ] | [String Anagram](./LinearDataStructures/StringAnagram.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [String Vowels Consonants](./LinearDataStructures/StringVowelsConsonants.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Custom String Builder](./LinearDataStructures/CustomStringBuilder.java) | 🟡 Medium | `O(1) amortized` | `O(N)` |
| [ ] | [Singly Linked List Insert](./LinearDataStructures/SinglyLinkedListInsert.java) | 🟢 Easy | `O(N)` | `O(N)` |
| [ ] | [Singly Linked List Delete](./LinearDataStructures/SinglyLinkedListDelete.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Singly Linked List Reverse](./LinearDataStructures/SinglyLinkedListReverse.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Singly Linked List Cycle](./LinearDataStructures/SinglyLinkedListCycle.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Singly Linked List Middle](./LinearDataStructures/SinglyLinkedListMiddle.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Singly Linked List Merge Sorted](./LinearDataStructures/SinglyLinkedListMergeSorted.java) | 🟢 Easy | `O(N + M)` | `O(N + M)` |
| [ ] | [Singly Linked List Remove Nth](./LinearDataStructures/SinglyLinkedListRemoveNth.java) | 🟡 Medium | `O(N)` | `O(1)` |
| [ ] | [Doubly Linked List Demo](./LinearDataStructures/DoublyLinkedListDemo.java) | 🟡 Medium | `O(1)` | `O(N)` |
| [ ] | [Circular Linked List Demo](./LinearDataStructures/CircularLinkedListDemo.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Stack Array](./LinearDataStructures/StackArray.java) | 🟢 Easy | `O(1)` | `O(N)` |
| [ ] | [Stack Linked List](./LinearDataStructures/StackLinkedList.java) | 🟢 Easy | `O(1)` | `O(N)` |
| [ ] | [Stack Balanced Parentheses](./LinearDataStructures/StackBalancedParentheses.java) | 🟢 Easy | `O(N)` | `O(N)` |
| [ ] | [Min Stack](./LinearDataStructures/MinStack.java) | 🟡 Medium | `O(1)` | `O(N)` |
| [ ] | [Queue Array](./LinearDataStructures/QueueArray.java) | 🟢 Easy | `O(1)` | `O(N)` |
| [ ] | [Queue Linked List](./LinearDataStructures/QueueLinkedList.java) | 🟢 Easy | `O(1)` | `O(N)` |
| [ ] | [Queue Using Stacks](./LinearDataStructures/QueueUsingStacks.java) | 🟡 Medium | `Push: O(1), Pop: O(1) amortized` | `O(N)` |
| [ ] | [Circular Queue](./LinearDataStructures/CircularQueue.java) | 🟡 Medium | `O(1)` | `O(N)` |
| [ ] | [Custom Deque](./LinearDataStructures/CustomDeque.java) | 🟡 Medium | `O(1)` | `O(N)` |
| [ ] | [Priority Queue Merge K Sorted](./LinearDataStructures/PriorityQueueMergeKSorted.java) | 🔴 Hard | `O(N log K)` | `O(K)` |
| [ ] | [Array Intersection](./LinearDataStructures/ArrayIntersection.java) | 🟢 Easy | `O(N+M)` | `O(Min(N,M))` |
| [ ] | [Queue Reversal](./LinearDataStructures/QueueReversal.java) | 🟢 Easy | `O(N)` | `O(N)` |
| [ ] | [String Generate Parentheses](./LinearDataStructures/StringGenerateParentheses.java) | 🟡 Medium | `O(4^N / sqrt(N))` | `O(N)` |
| [ ] | [Linked List Remove Duplicates](./LinearDataStructures/LinkedListRemoveDuplicates.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Stack Postfix Evaluation](./LinearDataStructures/StackPostfixEvaluation.java) | 🟡 Medium | `O(N)` | `O(N)` |

</details>

<details>
<summary><b>3. Non-Linear Data Structures (41 Problems)</b></summary>
<br>

> Master hierarchical and non-sequential structures: Binary Trees, Binary Search Trees (BST), AVL Trees, custom HashSets/HashMaps, Tries, Graphs, Segment Trees, and Fenwick Trees.

| Progress | Problem | Difficulty | Time Complexity | Space Complexity |
| :---: | :--- | :--- | :--- | :--- |
| [ ] | [Binary Tree Preorder](./NonLinearDataStructures/BinaryTreePreorder.java) | 🟢 Easy | `O(N)` | `O(N)` |
| [ ] | [Binary Tree Inorder](./NonLinearDataStructures/BinaryTreeInorder.java) | 🟢 Easy | `O(N)` | `O(N)` |
| [ ] | [Binary Tree Postorder](./NonLinearDataStructures/BinaryTreePostorder.java) | 🟢 Easy | `O(N)` | `O(N)` |
| [ ] | [Binary Tree Level Order](./NonLinearDataStructures/BinaryTreeLevelOrder.java) | 🟢 Easy | `O(N)` | `O(N)` |
| [ ] | [Binary Tree Height](./NonLinearDataStructures/BinaryTreeHeight.java) | 🟢 Easy | `O(N)` | `O(H)` |
| [ ] | [Binary Tree Diameter](./NonLinearDataStructures/BinaryTreeDiameter.java) | 🟡 Medium | `O(N)` | `O(H)` |
| [ ] | [Binary Tree Symmetric](./NonLinearDataStructures/BinaryTreeSymmetric.java) | 🟢 Easy | `O(N)` | `O(H)` |
| [ ] | [Binary Tree Invert](./NonLinearDataStructures/BinaryTreeInvert.java) | 🟢 Easy | `O(N)` | `O(H)` |
| [ ] | [B S T Insert](./NonLinearDataStructures/BSTInsert.java) | 🟢 Easy | `O(H)` | `O(H)` |
| [ ] | [B S T Search](./NonLinearDataStructures/BSTSearch.java) | 🟢 Easy | `O(H)` | `O(H)` |
| [ ] | [B S T Delete](./NonLinearDataStructures/BSTDelete.java) | 🟡 Medium | `O(H)` | `O(H)` |
| [ ] | [B S T Validate](./NonLinearDataStructures/BSTValidate.java) | 🟡 Medium | `O(N)` | `O(H)` |
| [ ] | [B S T L C A](./NonLinearDataStructures/BSTLCA.java) | 🟢 Easy | `O(H)` | `O(H)` |
| [ ] | [A V L Tree Demo](./NonLinearDataStructures/AVLTreeDemo.java) | 🔴 Hard | `O(log N)` | `O(N)` |
| [ ] | [Min Heap Demo](./NonLinearDataStructures/MinHeapDemo.java) | 🟡 Medium | `O(log N)` | `O(N)` |
| [ ] | [Max Heap Demo](./NonLinearDataStructures/MaxHeapDemo.java) | 🟡 Medium | `O(log N)` | `O(N)` |
| [ ] | [Custom Hash Set](./NonLinearDataStructures/CustomHashSet.java) | 🟡 Medium | `O(1) average` | `O(N)` |
| [ ] | [Custom Hash Map](./NonLinearDataStructures/CustomHashMap.java) | 🟡 Medium | `O(1) average` | `O(N)` |
| [ ] | [Trie Demo](./NonLinearDataStructures/TrieDemo.java) | 🟡 Medium | `O(L) where L is length of word` | `O(N * L)` |
| [ ] | [Graph Adjacency List](./NonLinearDataStructures/GraphAdjacencyList.java) | 🟡 Medium | `O(V + E)` | `O(V + E)` |
| [ ] | [Graph Adjacency Matrix](./NonLinearDataStructures/GraphAdjacencyMatrix.java) | 🟢 Easy | `O(1) to check connection` | `O(V^2)` |
| [ ] | [Segment Tree Demo](./NonLinearDataStructures/SegmentTreeDemo.java) | 🔴 Hard | `Build: O(N), Query/Update: O(log N)` | `O(N)` |
| [ ] | [Fenwick Tree Demo](./NonLinearDataStructures/FenwickTreeDemo.java) | 🔴 Hard | `Query/Update: O(log N)` | `O(N)` |
| [ ] | [Non Linear Sub Tree89](./NonLinearDataStructures/NonLinearSubTree89.java) | 🟢 Easy | `O(N)` | `O(H)` |
| [ ] | [Non Linear Sub Tree90](./NonLinearDataStructures/NonLinearSubTree90.java) | 🟡 Medium | `O(N)` | `O(H)` |
| [ ] | [Non Linear Sub Tree91](./NonLinearDataStructures/NonLinearSubTree91.java) | 🟢 Easy | `O(N)` | `O(H)` |
| [ ] | [Non Linear Sub Tree92](./NonLinearDataStructures/NonLinearSubTree92.java) | 🟡 Medium | `O(N)` | `O(H)` |
| [ ] | [Non Linear Sub Tree93](./NonLinearDataStructures/NonLinearSubTree93.java) | 🟢 Easy | `O(N)` | `O(H)` |
| [ ] | [Non Linear Sub Tree94](./NonLinearDataStructures/NonLinearSubTree94.java) | 🟡 Medium | `O(N)` | `O(H)` |
| [ ] | [Non Linear Sub Tree95](./NonLinearDataStructures/NonLinearSubTree95.java) | 🟢 Easy | `O(N)` | `O(H)` |
| [ ] | [Non Linear Sub Tree96](./NonLinearDataStructures/NonLinearSubTree96.java) | 🟡 Medium | `O(N)` | `O(H)` |
| [ ] | [Non Linear Sub Tree97](./NonLinearDataStructures/NonLinearSubTree97.java) | 🟢 Easy | `O(N)` | `O(H)` |
| [ ] | [Non Linear Sub Tree98](./NonLinearDataStructures/NonLinearSubTree98.java) | 🟡 Medium | `O(N)` | `O(H)` |
| [ ] | [Non Linear Sub Tree99](./NonLinearDataStructures/NonLinearSubTree99.java) | 🟢 Easy | `O(N)` | `O(H)` |
| [ ] | [Non Linear Sub Tree100](./NonLinearDataStructures/NonLinearSubTree100.java) | 🟡 Medium | `O(N)` | `O(H)` |
| [ ] | [Non Linear Sub Tree101](./NonLinearDataStructures/NonLinearSubTree101.java) | 🟢 Easy | `O(N)` | `O(H)` |
| [ ] | [Non Linear Sub Tree102](./NonLinearDataStructures/NonLinearSubTree102.java) | 🟡 Medium | `O(N)` | `O(H)` |
| [ ] | [Non Linear Sub Tree103](./NonLinearDataStructures/NonLinearSubTree103.java) | 🟢 Easy | `O(N)` | `O(H)` |
| [ ] | [Non Linear Sub Tree104](./NonLinearDataStructures/NonLinearSubTree104.java) | 🟡 Medium | `O(N)` | `O(H)` |
| [ ] | [Non Linear Sub Tree105](./NonLinearDataStructures/NonLinearSubTree105.java) | 🟢 Easy | `O(N)` | `O(H)` |

</details>

<details>
<summary><b>4. Sorting Algorithms (25 Problems)</b></summary>
<br>

> Compare and implement sorting strategies: Bubble, Selection, Insertion, Merge, Quick, Heap, Counting, and Radix Sort.

| Progress | Problem | Difficulty | Time Complexity | Space Complexity |
| :---: | :--- | :--- | :--- | :--- |
| [ ] | [Bubble Sort Iterative](./SortingAlgorithms/BubbleSortIterative.java) | 🟢 Easy | `O(N^2)` | `O(1)` |
| [ ] | [Selection Sort Iterative](./SortingAlgorithms/SelectionSortIterative.java) | 🟢 Easy | `O(N^2)` | `O(1)` |
| [ ] | [Insertion Sort Iterative](./SortingAlgorithms/InsertionSortIterative.java) | 🟢 Easy | `O(N^2)` | `O(1)` |
| [ ] | [Merge Sort Top Down](./SortingAlgorithms/MergeSortTopDown.java) | 🟡 Medium | `O(N log N)` | `O(N)` |
| [ ] | [Quick Sort Lomuto](./SortingAlgorithms/QuickSortLomuto.java) | 🟡 Medium | `O(N log N) average` | `O(log N)` |
| [ ] | [Heap Sort Demo](./SortingAlgorithms/HeapSortDemo.java) | 🟡 Medium | `O(N log N)` | `O(1)` |
| [ ] | [Counting Sort Demo](./SortingAlgorithms/CountingSortDemo.java) | 🟡 Medium | `O(N + K)` | `O(N + K)` |
| [ ] | [Radix Sort Demo](./SortingAlgorithms/RadixSortDemo.java) | 🔴 Hard | `O(D * (N + B))` | `O(N + B)` |
| [ ] | [Sorting Algo Variant114](./SortingAlgorithms/SortingAlgoVariant114.java) | 🟢 Easy | `O(N^2)` | `O(1)` |
| [ ] | [Sorting Algo Variant115](./SortingAlgorithms/SortingAlgoVariant115.java) | 🟡 Medium | `O(N^2)` | `O(1)` |
| [ ] | [Sorting Algo Variant116](./SortingAlgorithms/SortingAlgoVariant116.java) | 🟢 Easy | `O(N^2)` | `O(1)` |
| [ ] | [Sorting Algo Variant117](./SortingAlgorithms/SortingAlgoVariant117.java) | 🟡 Medium | `O(N^2)` | `O(1)` |
| [ ] | [Sorting Algo Variant118](./SortingAlgorithms/SortingAlgoVariant118.java) | 🟢 Easy | `O(N^2)` | `O(1)` |
| [ ] | [Sorting Algo Variant119](./SortingAlgorithms/SortingAlgoVariant119.java) | 🟡 Medium | `O(N^2)` | `O(1)` |
| [ ] | [Sorting Algo Variant120](./SortingAlgorithms/SortingAlgoVariant120.java) | 🟢 Easy | `O(N^2)` | `O(1)` |
| [ ] | [Sorting Algo Variant121](./SortingAlgorithms/SortingAlgoVariant121.java) | 🟡 Medium | `O(N^2)` | `O(1)` |
| [ ] | [Sorting Algo Variant122](./SortingAlgorithms/SortingAlgoVariant122.java) | 🟢 Easy | `O(N^2)` | `O(1)` |
| [ ] | [Sorting Algo Variant123](./SortingAlgorithms/SortingAlgoVariant123.java) | 🟡 Medium | `O(N^2)` | `O(1)` |
| [ ] | [Sorting Algo Variant124](./SortingAlgorithms/SortingAlgoVariant124.java) | 🟢 Easy | `O(N^2)` | `O(1)` |
| [ ] | [Sorting Algo Variant125](./SortingAlgorithms/SortingAlgoVariant125.java) | 🟡 Medium | `O(N^2)` | `O(1)` |
| [ ] | [Sorting Algo Variant126](./SortingAlgorithms/SortingAlgoVariant126.java) | 🟢 Easy | `O(N^2)` | `O(1)` |
| [ ] | [Sorting Algo Variant127](./SortingAlgorithms/SortingAlgoVariant127.java) | 🟡 Medium | `O(N^2)` | `O(1)` |
| [ ] | [Sorting Algo Variant128](./SortingAlgorithms/SortingAlgoVariant128.java) | 🟢 Easy | `O(N^2)` | `O(1)` |
| [ ] | [Sorting Algo Variant129](./SortingAlgorithms/SortingAlgoVariant129.java) | 🟡 Medium | `O(N^2)` | `O(1)` |
| [ ] | [Sorting Algo Variant130](./SortingAlgorithms/SortingAlgoVariant130.java) | 🟢 Easy | `O(N^2)` | `O(1)` |

</details>

<details>
<summary><b>5. Searching Algorithms (15 Problems)</b></summary>
<br>

> Find elements efficiently using Linear Search, Binary Search, and Ternary Search variations.

| Progress | Problem | Difficulty | Time Complexity | Space Complexity |
| :---: | :--- | :--- | :--- | :--- |
| [ ] | [Linear Search Iterative](./SearchingAlgorithms/LinearSearchIterative.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Binary Search Iterative](./SearchingAlgorithms/BinarySearchIterative.java) | 🟢 Easy | `O(log N)` | `O(1)` |
| [ ] | [Binary Search Recursive](./SearchingAlgorithms/BinarySearchRecursive.java) | 🟢 Easy | `O(log N)` | `O(log N)` |
| [ ] | [Ternary Search Recursive](./SearchingAlgorithms/TernarySearchRecursive.java) | 🟡 Medium | `O(log3 N)` | `O(log N)` |
| [ ] | [Searching Algo Variant135](./SearchingAlgorithms/SearchingAlgoVariant135.java) | 🟡 Medium | `O(log N)` | `O(1)` |
| [ ] | [Searching Algo Variant136](./SearchingAlgorithms/SearchingAlgoVariant136.java) | 🟢 Easy | `O(log N)` | `O(1)` |
| [ ] | [Searching Algo Variant137](./SearchingAlgorithms/SearchingAlgoVariant137.java) | 🟡 Medium | `O(log N)` | `O(1)` |
| [ ] | [Searching Algo Variant138](./SearchingAlgorithms/SearchingAlgoVariant138.java) | 🟢 Easy | `O(log N)` | `O(1)` |
| [ ] | [Searching Algo Variant139](./SearchingAlgorithms/SearchingAlgoVariant139.java) | 🟡 Medium | `O(log N)` | `O(1)` |
| [ ] | [Searching Algo Variant140](./SearchingAlgorithms/SearchingAlgoVariant140.java) | 🟢 Easy | `O(log N)` | `O(1)` |
| [ ] | [Searching Algo Variant141](./SearchingAlgorithms/SearchingAlgoVariant141.java) | 🟡 Medium | `O(log N)` | `O(1)` |
| [ ] | [Searching Algo Variant142](./SearchingAlgorithms/SearchingAlgoVariant142.java) | 🟢 Easy | `O(log N)` | `O(1)` |
| [ ] | [Searching Algo Variant143](./SearchingAlgorithms/SearchingAlgoVariant143.java) | 🟡 Medium | `O(log N)` | `O(1)` |
| [ ] | [Searching Algo Variant144](./SearchingAlgorithms/SearchingAlgoVariant144.java) | 🟢 Easy | `O(log N)` | `O(1)` |
| [ ] | [Searching Algo Variant145](./SearchingAlgorithms/SearchingAlgoVariant145.java) | 🟡 Medium | `O(log N)` | `O(1)` |

</details>

<details>
<summary><b>6. Algorithm Design Paradigms (35 Problems)</b></summary>
<br>

> Solve complex problems using systematic approaches: Divide & Conquer, Greedy Algorithms, Backtracking, and Dynamic Programming.

| Progress | Problem | Difficulty | Time Complexity | Space Complexity |
| :---: | :--- | :--- | :--- | :--- |
| [ ] | [D P Climbing Stairs](./AlgorithmDesignParadigms/DPClimbingStairs.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [D P Fibonacci](./AlgorithmDesignParadigms/DPFibonacci.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [D P Coin Change](./AlgorithmDesignParadigms/DPCoinChange.java) | 🟡 Medium | `O(N * M)` | `O(N)` |
| [ ] | [D P Longest Increasing Subsequence](./AlgorithmDesignParadigms/DPLongestIncreasingSubsequence.java) | 🟡 Medium | `O(N^2)` | `O(N)` |
| [ ] | [D P Longest Common Subsequence](./AlgorithmDesignParadigms/DPLongestCommonSubsequence.java) | 🟡 Medium | `O(N * M)` | `O(N * M)` |
| [ ] | [Backtracking N Queens](./AlgorithmDesignParadigms/BacktrackingNQueens.java) | 🔴 Hard | `O(N!)` | `O(N^2)` |
| [ ] | [Greedy Fractional Knapsack](./AlgorithmDesignParadigms/GreedyFractionalKnapsack.java) | 🟡 Medium | `O(N log N)` | `O(1)` |
| [ ] | [Paradigm Algo Variant153](./AlgorithmDesignParadigms/ParadigmAlgoVariant153.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant154](./AlgorithmDesignParadigms/ParadigmAlgoVariant154.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant155](./AlgorithmDesignParadigms/ParadigmAlgoVariant155.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant156](./AlgorithmDesignParadigms/ParadigmAlgoVariant156.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant157](./AlgorithmDesignParadigms/ParadigmAlgoVariant157.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant158](./AlgorithmDesignParadigms/ParadigmAlgoVariant158.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant159](./AlgorithmDesignParadigms/ParadigmAlgoVariant159.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant160](./AlgorithmDesignParadigms/ParadigmAlgoVariant160.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant161](./AlgorithmDesignParadigms/ParadigmAlgoVariant161.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant162](./AlgorithmDesignParadigms/ParadigmAlgoVariant162.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant163](./AlgorithmDesignParadigms/ParadigmAlgoVariant163.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant164](./AlgorithmDesignParadigms/ParadigmAlgoVariant164.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant165](./AlgorithmDesignParadigms/ParadigmAlgoVariant165.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant166](./AlgorithmDesignParadigms/ParadigmAlgoVariant166.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant167](./AlgorithmDesignParadigms/ParadigmAlgoVariant167.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant168](./AlgorithmDesignParadigms/ParadigmAlgoVariant168.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant169](./AlgorithmDesignParadigms/ParadigmAlgoVariant169.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant170](./AlgorithmDesignParadigms/ParadigmAlgoVariant170.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant171](./AlgorithmDesignParadigms/ParadigmAlgoVariant171.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant172](./AlgorithmDesignParadigms/ParadigmAlgoVariant172.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant173](./AlgorithmDesignParadigms/ParadigmAlgoVariant173.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant174](./AlgorithmDesignParadigms/ParadigmAlgoVariant174.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant175](./AlgorithmDesignParadigms/ParadigmAlgoVariant175.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant176](./AlgorithmDesignParadigms/ParadigmAlgoVariant176.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant177](./AlgorithmDesignParadigms/ParadigmAlgoVariant177.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant178](./AlgorithmDesignParadigms/ParadigmAlgoVariant178.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant179](./AlgorithmDesignParadigms/ParadigmAlgoVariant179.java) | 🟡 Medium | `O(N)` | `O(N)` |
| [ ] | [Paradigm Algo Variant180](./AlgorithmDesignParadigms/ParadigmAlgoVariant180.java) | 🟡 Medium | `O(N)` | `O(N)` |

</details>

<details>
<summary><b>7. Graph Algorithms (35 Problems)</b></summary>
<br>

> Traverse and find paths in network structures: BFS, DFS, Dijkstra, Bellman-Ford, and Topological Sort.

| Progress | Problem | Difficulty | Time Complexity | Space Complexity |
| :---: | :--- | :--- | :--- | :--- |
| [ ] | [Graph B F S](./GraphAlgorithms/GraphBFS.java) | 🟢 Easy | `O(V + E)` | `O(V)` |
| [ ] | [Graph D F S](./GraphAlgorithms/GraphDFS.java) | 🟢 Easy | `O(V + E)` | `O(V)` |
| [ ] | [Dijkstra Algorithm](./GraphAlgorithms/DijkstraAlgorithm.java) | 🟡 Medium | `O((V + E) log V)` | `O(V)` |
| [ ] | [Bellman Ford Algorithm](./GraphAlgorithms/BellmanFordAlgorithm.java) | 🟡 Medium | `O(V * E)` | `O(V)` |
| [ ] | [Topological Sort Kahn](./GraphAlgorithms/TopologicalSortKahn.java) | 🟡 Medium | `O(V + E)` | `O(V)` |
| [ ] | [Graph Algo Variant186](./GraphAlgorithms/GraphAlgoVariant186.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant187](./GraphAlgorithms/GraphAlgoVariant187.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant188](./GraphAlgorithms/GraphAlgoVariant188.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant189](./GraphAlgorithms/GraphAlgoVariant189.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant190](./GraphAlgorithms/GraphAlgoVariant190.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant191](./GraphAlgorithms/GraphAlgoVariant191.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant192](./GraphAlgorithms/GraphAlgoVariant192.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant193](./GraphAlgorithms/GraphAlgoVariant193.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant194](./GraphAlgorithms/GraphAlgoVariant194.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant195](./GraphAlgorithms/GraphAlgoVariant195.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant196](./GraphAlgorithms/GraphAlgoVariant196.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant197](./GraphAlgorithms/GraphAlgoVariant197.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant198](./GraphAlgorithms/GraphAlgoVariant198.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant199](./GraphAlgorithms/GraphAlgoVariant199.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant200](./GraphAlgorithms/GraphAlgoVariant200.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant201](./GraphAlgorithms/GraphAlgoVariant201.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant202](./GraphAlgorithms/GraphAlgoVariant202.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant203](./GraphAlgorithms/GraphAlgoVariant203.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant204](./GraphAlgorithms/GraphAlgoVariant204.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant205](./GraphAlgorithms/GraphAlgoVariant205.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant206](./GraphAlgorithms/GraphAlgoVariant206.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant207](./GraphAlgorithms/GraphAlgoVariant207.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant208](./GraphAlgorithms/GraphAlgoVariant208.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant209](./GraphAlgorithms/GraphAlgoVariant209.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant210](./GraphAlgorithms/GraphAlgoVariant210.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant211](./GraphAlgorithms/GraphAlgoVariant211.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant212](./GraphAlgorithms/GraphAlgoVariant212.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant213](./GraphAlgorithms/GraphAlgoVariant213.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant214](./GraphAlgorithms/GraphAlgoVariant214.java) | 🟡 Medium | `O(V+E)` | `O(V)` |
| [ ] | [Graph Algo Variant215](./GraphAlgorithms/GraphAlgoVariant215.java) | 🟡 Medium | `O(V+E)` | `O(V)` |

</details>

<details>
<summary><b>8. Common Coding Patterns (35 Problems)</b></summary>
<br>

> Apply general patterns seen in coding interviews: Two Pointers, Sliding Windows, Fast & Slow Pointers, Merge Intervals, and Top K Elements.

| Progress | Problem | Difficulty | Time Complexity | Space Complexity |
| :---: | :--- | :--- | :--- | :--- |
| [ ] | [Two Pointer Pair With Sum](./CommonCodingPatterns/TwoPointerPairWithSum.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Sliding Window Max Sum](./CommonCodingPatterns/SlidingWindowMaxSum.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Fast Slow Middle Node](./CommonCodingPatterns/FastSlowMiddleNode.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Merge Intervals Demo](./CommonCodingPatterns/MergeIntervalsDemo.java) | 🟡 Medium | `O(N log N)` | `O(N)` |
| [ ] | [Top K Element Demo](./CommonCodingPatterns/TopKElementDemo.java) | 🟡 Medium | `O(N log K)` | `O(K)` |
| [ ] | [Pattern Algo Variant221](./CommonCodingPatterns/PatternAlgoVariant221.java) | 🟡 Medium | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant222](./CommonCodingPatterns/PatternAlgoVariant222.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant223](./CommonCodingPatterns/PatternAlgoVariant223.java) | 🟡 Medium | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant224](./CommonCodingPatterns/PatternAlgoVariant224.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant225](./CommonCodingPatterns/PatternAlgoVariant225.java) | 🟡 Medium | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant226](./CommonCodingPatterns/PatternAlgoVariant226.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant227](./CommonCodingPatterns/PatternAlgoVariant227.java) | 🟡 Medium | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant228](./CommonCodingPatterns/PatternAlgoVariant228.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant229](./CommonCodingPatterns/PatternAlgoVariant229.java) | 🟡 Medium | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant230](./CommonCodingPatterns/PatternAlgoVariant230.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant231](./CommonCodingPatterns/PatternAlgoVariant231.java) | 🟡 Medium | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant232](./CommonCodingPatterns/PatternAlgoVariant232.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant233](./CommonCodingPatterns/PatternAlgoVariant233.java) | 🟡 Medium | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant234](./CommonCodingPatterns/PatternAlgoVariant234.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant235](./CommonCodingPatterns/PatternAlgoVariant235.java) | 🟡 Medium | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant236](./CommonCodingPatterns/PatternAlgoVariant236.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant237](./CommonCodingPatterns/PatternAlgoVariant237.java) | 🟡 Medium | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant238](./CommonCodingPatterns/PatternAlgoVariant238.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant239](./CommonCodingPatterns/PatternAlgoVariant239.java) | 🟡 Medium | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant240](./CommonCodingPatterns/PatternAlgoVariant240.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant241](./CommonCodingPatterns/PatternAlgoVariant241.java) | 🟡 Medium | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant242](./CommonCodingPatterns/PatternAlgoVariant242.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant243](./CommonCodingPatterns/PatternAlgoVariant243.java) | 🟡 Medium | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant244](./CommonCodingPatterns/PatternAlgoVariant244.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant245](./CommonCodingPatterns/PatternAlgoVariant245.java) | 🟡 Medium | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant246](./CommonCodingPatterns/PatternAlgoVariant246.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant247](./CommonCodingPatterns/PatternAlgoVariant247.java) | 🟡 Medium | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant248](./CommonCodingPatterns/PatternAlgoVariant248.java) | 🟢 Easy | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant249](./CommonCodingPatterns/PatternAlgoVariant249.java) | 🟡 Medium | `O(N)` | `O(1)` |
| [ ] | [Pattern Algo Variant250](./CommonCodingPatterns/PatternAlgoVariant250.java) | 🟢 Easy | `O(N)` | `O(1)` |

</details>

