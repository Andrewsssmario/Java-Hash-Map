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
/*
Hash Map Project Created By Andrew Shao

Demonstrates the functionality of LinkedLists to create my own implementation of HashMap

Uses a parallel LinkedList System to Map String Keys to Integer Values

Possible Usages:
Counting Words inside of a Text(Where Each word maps to a count)

Counting DNA Strands inside of a full DNA strand(Where each triple(Ex. ATG) maps to the counts)

*/
import java.util.*;
public class App {
    
    public static void main(String[] args){
        //Just Sample Usage of My HashMap(Counting Words inside of a sample Text, where we assume words are seperated by spaces)
        //Get Words
        System.out.println("Enter Text For Counts: ");
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        
        //create Counter Words Object
        CounterWords cw = new CounterWords(words);
        //Split Words and print all 
        cw.split_data();
    }
    public static void test(){
        //Lets Test The HashMap!
        HashMap hm = new HashMap();
        //Add some values, out of order to be sorted later
        hm.add("Hello", 19);
        hm.add("World", 16);
        hm.add("Test", 14);
        System.out.println(hm.get("Hello"));
        System.out.println("-------------------Initial Print------------------------");
        hm.print_all();
        hm.set("Hello", 0);
        System.out.println("-------------------After Hello Set to 0-----------------");
        hm.print_all();
        hm.sort();
        System.out.println("-------------------After Sorted--------------------------");
        hm.print_all();
        
        
        //Helps for debugging
    }
}
