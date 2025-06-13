package com.mycompany.eatsandwich;

import java.util.Scanner;

/*
Bryce Beeskow
Discussion 6 recursive 
*/


//This is an example of rucursive by eating a sandwich.
public class EatSandwich {
    public static void eatSandwich(int currentBite, int totalBites){
        
        //if currentBite is greater than print the sandwich is gone
        if(currentBite > totalBites){
            System.out.println("The sandwich is gone");
        }
        
        //else say what number of bite and add a bite to the currentBite
        else{
            System.out.println("Bite number " + currentBite);
             eatSandwich(currentBite + 1, totalBites);
        }
    }
    
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String bread;
        
        while(true){
            //asking the user if they want a sub or sliced bread
            System.out.println("Would you like a sub or sliced bread?");
            bread = s.nextLine();
            
            //if they choose sliced (ignorecase) the totalBites is 13
            if(bread.equalsIgnoreCase("sliced")){
                int totalBites = 13;
                System.out.println("It will take " + totalBites + " Bites to finish the sandwich");
                eatSandwich(1, totalBites);
                break;
            }

            //else if they choose sub (ignorecase) totalBites is 20
            else if(bread.equalsIgnoreCase("sub")){
                int totalBites = 20;
                System.out.println("It will take " + totalBites + " Bites to finish the sandwich");
                eatSandwich(1, totalBites);
                break;
            }

            //else asking the user to enter sub or sliced only
            else{
                System.out.println("Enter Sub or Sliced\n");
            } 
        }
        System.out.println("Please come back again and order another sandwich");
        s.close();//close scanner
    }
}
