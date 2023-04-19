
package Employees;

import java.util.ArrayList;

import java.util.Scanner;


public class Menu {
    public Menu(){
        super();
    }     
    public static int getUserChoice(ArrayList options){
        for (int i = 0; i < options.size(); i++) {
            System.out.print((i+1)+"-"+options.get(i));
        }
        System.out.print("Choose 1.."+options.size());
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());       
    }      
    public static int getUserChoice(Object[] options){
        for (int i = 0; i < options.length; i++) {
            System.out.println((i+1)+"-"+ options[i]);
        }
        System.out.println("-------------------------");
        System.out.print("Choose 1.."+options.length+": ");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }
}
    
    

