/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.andrewshaohashmap;

/**
 *
 * @author andrewsssmario
 */
public class CounterWords {
    private String words;
    private HashMap wordCount = new HashMap();
    public CounterWords(String words){
        this.words = words;
    }
    public void split_data(){
        //Split words based on spacing
        String[] w = this.words.split(" ");
        
        
        //Iterate Over Words and Add to Hash Map counter\
        for (String word: w){
            //Filter Word so more words fall into category
            word = word.toLowerCase().stripLeading().stripTrailing();
            //Create StringBuilder
            StringBuilder sans_punctuation = new StringBuilder();
            for (int i = 0; i<word.length(); i++){
                char c = word.charAt(i);
                if (Character.isLetter(c)){
                    sans_punctuation.append(c);
                }
            }
            //Revert Back to Regular String
            String filtered = sans_punctuation.toString();
            
            if (wordCount.contains(filtered)){
                //Increment Count
                wordCount.set(filtered, wordCount.get(filtered)+1);
            }
            else{
                wordCount.add(filtered, 1);
            }
        }
       
        //Now that words have been tallied, sort them for final print
        wordCount.sort();
        wordCount.print_all();
    }
}
