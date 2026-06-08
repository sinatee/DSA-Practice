# Two Sum

## Problem Description
Given an array of integers `nums` and an integer `target`, return the *indices* of the two numbers such that they add up to `target`.

* You may not use the same element twice.
* You should return the answer with the lower index first.

## Constraints & Insights
* **The Core Trade-off:** We are choosing between execution speed and memory footprints. 
* **Optimized Approach:** Instead of using nested loops to look forward for a matching pair, we can use a `HashMap` to look backward at elements we have already processed. For every element, we calculate its `complement = target - nums[i]` and check if it already exists in our map memory in $O(1)$ time.

### 1. HashMap Approach
* **Time Complexity:** $O(n)$ — We iterate through the array of size $n$ exactly once. Each lookup and insertion into the `HashMap` takes constant time on average.
* **Space Complexity:** $O(n)$ — In the worst-case scenario, we may need to store up to $n$ elements in the `HashMap` heap memory before finding a matching pair.

### 2. Brute Force Approach
* **Time Complexity:** $O(n^2)$ — Requires nested loops checking every combination, resulting in a quadratic growth curve.
* **Space Complexity:** $O(1)$ — Constant space. Aside from a couple of primitive loop pointers inside the stack frame, it allocates no extra memory structures relative to $n$.
