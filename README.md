1. 🔄 Bubble Sort – Time & Space Complexity

Bubble Sort is a simple comparison-based sorting algorithm where adjacent elements are repeatedly compared and swapped if they are in the wrong order.

⏱️ Time Complexity
Case	Complexity	Explanation
Best Case	O(n)	When the array is already sorted (with optimization using a swap flag)
Average Case	O(n²)	Nested loops compare elements repeatedly
Worst Case	O(n²)	When the array is sorted in reverse order

💾 Space Complexity

O(1) → In-place sorting algorithm

Uses only a constant amount of extra memory
2. 🔄 Selection Sort – Time & Space Complexity

Selection Sort is a simple comparison-based sorting algorithm where the smallest element is repeatedly selected from the unsorted portion of the array and placed at its correct position.

⏱️ Time Complexity
Case	Complexity	Explanation
Best Case	O(n²)	Even if the array is already sorted, Selection Sort still scans the remaining elements to find the minimum
Average Case	O(n²)	Comparisons are done using nested loops regardless of input order
Worst Case	O(n²)	When the array is sorted in reverse order, comparisons remain the same

👉 Important: Selection Sort does not have an optimized best case like Bubble Sort.

💾 Space Complexity

O(1) → In-place sorting algorithm

✔ Uses only a constant amount of extra memory
✔ No additional data structures required
