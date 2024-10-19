# FirstUniqueCharacter

QUESTION:

Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0

Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1

Constraints:
1 <= s.length <= 10^5
s consists of only lowercase English letters.

EXPLANATION:

In this i have used a linkedhashmap but we cna also use hashmap to solve this so initially i have entered the elemnets in the 
given strihg into the linkedhashmap while checking if the character is already present or not in the linkedhashmap and if it is 
present we increase the value associated with the key else we just put 1 as the value associated with the key.

In the next for loop we check each charater in the string with the linkedhashmap and if the value is 1 then the index of the 
particular character in the string is given as output
