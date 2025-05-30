/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc322discussion1;

/**
 *
 * @author bryce
 */
public class CSC322Discussion1 {

    public static void main(String[] args) {
        System.out.println("Overriding example");
        Animal a1 = new Dog();
        a1.sound();
        System.out.println("");
        System.out.println("Overloading example");
        Adding a = new Adding();
        System.out.println(a.add(4, 6));
        System.out.println(a.add(4.3, 6.4));
       
    }
}
/*Overriding example*/
class Animal {
    void sound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
        @Override
        void sound(){
            System.out.println("Woof Woof");            
    }
}

/*Overload example*/
class Adding{
    int add(int num1, int num2){
        return num1+num2;
    }
    double add(double num1, double num2){
        return num1+num2;
    }
}
