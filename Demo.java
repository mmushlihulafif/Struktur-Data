/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strukdat2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Demo {
    
      public static void main(String[] args) {
      System.out.println("Masukkan Kata: ");
      Scanner scan = new Scanner(System.in);
      String input = scan.nextLine();
      int stackSize = input.length();
      Stack theStack = new Stack(stackSize);
      
      for (int j = 0; j < input.length(); j++) {
         char ch = input.charAt(j);
         theStack.push(ch);
      } 
      while (!theStack.isEmpty()) {
         char ch = theStack.pop();
         System.out.println(ch);
      } 
   }
   
}
    

