
package com.mycompany.exercise17_2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * Bryce Beeskow
 * Text Book Assignment 17.2
 * 
 * (Create a binary data file) Write a program to create a file named 
 * Exercise17_02.dat if it does not exist. Append new data to it if it already 
 * exists. Write 100 integers created randomly into the file using binary I/O.
 */
public class Exercise17_2 {
    public static void main(String[] args) {
        try (
      DataOutputStream file = new DataOutputStream(new FileOutputStream("Exercise17_02.dat"));) {

      for (int i = 0; i < 100; i++) {
        file.writeInt((int)(Math.random() * 1000));
      }
    } 
    catch (IOException ioe) {
      ioe.printStackTrace();
    } 
  }
}
    

