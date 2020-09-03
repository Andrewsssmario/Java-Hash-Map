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
import java.util.ArrayList;
import java.util.HashSet;
public class HashMap {
    private int count = 0;
    //Create One LinkedList and One ArrayList(To Practice the Usage of Both Options(But I could create a seperate class for the String LinkedList)
    private ArrayList<String> keys = new ArrayList<String>();
    
    private LinkedList vals = new LinkedList();
    /*
    Some Benefits of the Parallel hashMap
    1. You can Actually Sort it, unlike the other hash map keeps no order
    Disadvantages:
    1. You have to keep the two parallel lists in order, which leads to funky bugs when you make a mistake in the code.
    */
    //Add a new Key
    public void add(String key, int val){
        count++;
        keys.add(key);
        vals.add_node(val);
        
    }
    
    
    //Change a Value By Key
    public void set(String key, int val){
        for (int i=0; i<count; i++){
            if (keys.get(i).equals(key)){
                Node node = vals.get(i);
                node.set_val(val);
                return;
            }
        }
        System.out.println(String.format("Could Not Find Key: %s or Index Out of Range", key));
        return;
    }
    
    //get a value by key
    public int get(String key){
        for (int i=0; i<count; i++){
            if (keys.get(i).equals(key)){
                return vals.get(i).get_val();
            }
        }
        System.out.println(String.format("Could Not Find %s, returning -1", key));
        return -1;
    }
   
    //Check if Map contains
    public boolean contains(String key){
        for (int i=0; i<count; i++){
            if (keys.get(i).equals(key)){
                return true;
            }
        }
        return false;
    }
    
    //Sort The HashMap(With Bubble Sort(Yes I know, O(n ^ 2), but it works well with the two parallel linkedlists/ArrayLists)
    
    public void sort(){
        int swap_counter = -1;
        while (swap_counter != 0){
            swap_counter = 0;
            for (int i=0; i<count - 1; i++){
                if (vals.get(i).get_val() < vals.get(i+1).get_val()){
                    //Swap nodes in LL
                    Node nodei = vals.get(i);
                    Node nodei1 = vals.get(i+1);
                    int tmp = nodei.get_val();
                    nodei.set_val(nodei1.get_val());
                    nodei1.set_val(tmp);
                    swap_counter++;
                    //Swap nodes in AL
                    String tmp_string = keys.get(i);
                    keys.set(i, keys.get(i+1));
                    keys.set(i+1, tmp_string);
                }
            }
        }
    }
    
    //Print All Values
    
    public void print_all(){
        for (int i=0; i<count; i++){
            System.out.println(String.format("Key %s, Value: %d", keys.get(i), vals.get(i).get_val()));
        }
    }
}
