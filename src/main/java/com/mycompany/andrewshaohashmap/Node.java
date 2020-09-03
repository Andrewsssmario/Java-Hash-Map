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
public class Node {
    private Node next;
    private int val;
    public Node(){
        
    }
    //Setter Methods
    public void set_next(Node next){
        this.next = next;
    }
    
    public void set_val(int val){
        this.val = val;
    }
    
    //Getter Methods
    public int get_val(){
        return this.val;
    }
    
    public Node get_node(){
        return this.next;
    }
}
