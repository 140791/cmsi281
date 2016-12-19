/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package trie;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Trie {
    ArrayList<String> s = new ArrayList<>();
    TrieNode root;
    public Trie(){
        root = new TrieNode('S');
        
    }
    public void addWords(ArrayList<String> input){
        char c;
        int index;
        TrieNode curr = root;
        for(int i=0; i<input.size();i++){
            if(input.get(i).equals(" ")){
                curr.endOfWord = true;
                curr.wordCount++;
                curr = root;
            }
            else{
                c = input.get(i).charAt(0);
                index = (int) c - 65;
                if(curr.children[index]==null){
                    curr.children[index] = new TrieNode(c);
                    curr.children[index].word = curr.word + c;
                }
                curr = curr.children[index];
                
            }
            
            //if()
            
        }
    }
    public void Iterate(){
        depth(root);
    }
    public void depth(TrieNode n){
        for(int i=0; i<26; i++){
            if(n.children[i]!=null){
                //System.out.print(n.children[i].value);
                if(n.children[i].endOfWord){
                    System.out.print(n.children[i].word.substring(4)+ " " + n.children[i].wordCount);
                    System.out.println();
                }
                depth(n.children[i]);
                
            }
        }
    }
}
