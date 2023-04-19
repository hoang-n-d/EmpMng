package Employees;

import java.util.Scanner;

public class ManageProgram {
    public static void main(String[] args) {
        String filename = "employees.txt";
        Scanner sc = new Scanner(System.in);       
        String [] options = {"Add new Employee.","Remove an Employee.",
        "Promoting the Employee's salary.","Print the list. ","Save list.","Quit."};
      // Menu menu=new Menu();
    /*    menu.add("Add new Employee");
        menu.add("Remove an Employee");
        menu.add("Promoting the Employee's salary");
        menu.add("Print the list");
        menu.add("Save to files");
        menu.add("Quit");*/
        int choice;               
        boolean changed = false;
        EmpList list = new EmpList();
        list.AddFromFile(filename);
        do {
            System.out.println("\nEMPLOYEE MANAGER");
            choice = Menu.getUserChoice(options);
            switch(choice){
                case 1:
                    list.addNewEmp();
                    changed= true;
                    break;
                case 2:
                    list.removeEmp();
                    changed= true;
                    break;
                case 3:
                    list.promote();
                    changed= true;
                    break;
                case 4:
                    list.print();
                    break;
                case 5:
                    list.saveToFile(filename);
                    changed= false;
                default : if(changed){
                    System.out.println("Save change Y/N ?");
                    String response= sc.nextLine().toUpperCase();
                    if (response.startsWith("Y"))
                        list.saveToFile(filename);
                }
            }
        }
        while(choice >0 && choice<6);
    }
}
