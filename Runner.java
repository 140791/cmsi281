/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package trie;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> phraseList = new ArrayList<>();
        ArrayList<String> wordList = new ArrayList<>();

        //I decided to make sure that all characters are in uppercase
        //String s = in.nextLine().toUpperCase();
		//phraseList.add(s);
		String s;
        while(in.hasNextLine()){
            s = in.nextLine().toUpperCase();
			phraseList.add(s);
			
            
        }
        System.out.println("--------------------------");
        String addChar;
        for(int i=0; i<phraseList.size(); i++){
            for(int j=0; j<phraseList.get(i).length();j++){
                addChar = phraseList.get(i).substring(j,j+1);
                if(!(addChar.equals("\"")||addChar.equals("?")||addChar.equals(";")||addChar.equals(".")||addChar.equals(",")||addChar.equals(";"))){
                wordList.add(phraseList.get(i).substring(j,j+1));
                }
            }
            wordList.add(" ");
        }
        Trie t = new Trie();
        t.addWords(wordList);
        t.Iterate();
        
    }
    
}
