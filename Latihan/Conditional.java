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
public class Conditional {
    //sebelum proses refactoring
    public void accept(){
	System.out.println("Congratulations, you are accepted!");
    }
    public void reject(){
	System.out.println("Sorry, you're out of luck!");
    }
    
    //main method
    public static void main(String [] args){
	Conditional test = new Conditional();
	int score = 900;
	int income = 200000;
	boolean authorized = true;

	if (score > 700)
            test.accept();
	else if(((income >= 40000) && (income <= 100000)) && authorized && (score > 500))
            test.accept();
	else if(income > 100000)
            test.accept();
	else 
            test.reject();
    }
}
