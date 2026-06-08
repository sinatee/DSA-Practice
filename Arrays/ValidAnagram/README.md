# Valid Anagram

## Problem Description
Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

## Constraints & Insights
* Inputs consist of lowercase English letters.
* **String Length Limits:** $1 \le \text{length} \le 50,000$ (The input strings will contain at least 1 character and maximum 50,000 characters).
* **Insight:** Because length is under 65,535, we can use a 16-bit `char[]` array instead of a 32-bit `int[]` array to halve our memory usage.

## Complexity
* **Time Complexity:** $O(n)$ — Single pass loop through the strings.
* **Space Complexity:** $O(1)$ — Fixed-size 26-slot array bucket counter.
