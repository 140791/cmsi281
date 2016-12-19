/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package trie;

/**
 *
 * @author user
 */
public class TrieNode {
    char value;
    boolean endOfWord;
    int wordCount;
    TrieNode[] children;
    String word;
    TrieNode parent;
    public TrieNode(char value){
        this.value = value;
        children = new TrieNode[26];
        wordCount = 0;
    }
}
