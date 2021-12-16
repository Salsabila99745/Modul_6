/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author FauziahKhoerunnisa
 */
public class Person {
    //setelah proses refactoring
    public String name;
    
    public String getName(){
	return name;
    }
    public void setName(String newName) {
	name = newName;
    }

    // Main Method
    public static void main (String [] args){
	Person son = new Person();
	son.setName("Bob Smith");
	System.out.println (son.getName());
    }
}
