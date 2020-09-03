/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.andrewshaohashmap;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author andrewsssmario
 */
public class LinkedList {
    private Node head;
    
    //Add Node to LinkedList
    public void add_node(int value){
        Node new_node = new Node();
        new_node.set_val(value);
        if (head == null){
            head = new_node;
            return;
        }
        /*
        new_node.set_next(head);
        head = new_node;
        Although this method would be faster, it is annoying for the user to have to consider the fact that the values are added to the beginning
        */
        //Instead, I will wait until the end
        Node cur_node = head;
        while (cur_node.get_node() != null){
            cur_node = cur_node.get_node();
        }
        cur_node.set_next(new_node);
        return;
        
    }
    
    //Print All Values inside of a LinkedList
    public void print_all(){
        Node cur_node = head;
        while (cur_node != null){
            System.out.println(cur_node.get_val());
            cur_node = cur_node.get_node();
        }
    }
    
    //Get a Node from a linkedList By Index
    public Node get(int index){
        Node cur_node = head;
        if (index < 0){
            return null;
        }
        while (index > 0 && cur_node != null){
            index--;
            cur_node = cur_node.get_node();
        }
        if (cur_node == null){
            return null;
        }
        return cur_node;
    }
    
    //Set a value inside of a linkedList by index
    public void set(int index, int val){
        Node found = get(index);
        if (found == null){
            System.out.println(String.format("Was Not Able to Find Value at Index: %d", index));
            return; 
        }
        found.set_val(val);
    }
}
