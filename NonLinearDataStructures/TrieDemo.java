/**
 * Problem ID: 84
 * Topic: NonLinearDataStructures
 * Problem Name: TrieDemo
 * Difficulty: Medium
 * Description: Implements a Prefix Tree (Trie) supporting insert, search, and startsWith.
 *
 * Time Complexity: O(L) where L is length of word
 * Space Complexity: O(N * L)
 */
public class TrieDemo {
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord = false;
    }
    private TrieNode root = new TrieNode();
    public void insert(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (curr.children[idx] == null) curr.children[idx] = new TrieNode();
            curr = curr.children[idx];
        }
        curr.isEndOfWord = true;
    }
    public boolean search(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (curr.children[idx] == null) return false;
            curr = curr.children[idx];
        }
        return curr.isEndOfWord;
    }
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for (char c : prefix.toCharArray()) {
            int idx = c - 'a';
            if (curr.children[idx] == null) return false;
            curr = curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        TrieDemo trie = new TrieDemo();
        trie.insert("apple");
        System.out.println("Search apple: " + trie.search("apple")); // true
        System.out.println("Search app: " + trie.search("app"));     // false
        System.out.println("StartsWith app: " + trie.startsWith("app")); // true
    }
}
