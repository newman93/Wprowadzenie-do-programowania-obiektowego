package lab2;
import java.util.LinkedList;
import java.util.Scanner;
import lab2.employee.Employee;

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> database = new LinkedList();
        
        int selection;
        
        while (true) {
            selection = menu();
            switch (selection) {
                case 1: 
                        addEmployee(database);
                        break;
                case 2: 
                        exit();
                        break;
                default: 
                        System.out.println("Nieporawna wartość"); 
                        break;
            }
        }
    }
    
    public static int menu() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Menu");
        System.out.println("--------------------");
        System.out.println("1. Add employee");
        System.out.println("2. Exit");
        
        return input.nextInt();
    }
    
    public static void addEmployee(LinkedList<Employee> database) {
        Scanner input = new Scanner(System.in);
        String name;
        String surname;
        Employee employee;
        
        System.out.println("Podaj imię:");
        name = input.nextLine().toLowerCase();
        System.out.println("Podaj nazwisko:");
        surname = input.nextLine().toLowerCase();
        
        employee = new Employee(name, surname, database);
        database.add(employee);
        
        System.out.println("Imię: " + employee.getName() + " Nazwisko: " + employee.getSurname() + " E-mail: " + employee.getEmail());
    }
    
    public static void exit() {
        System.exit(0);
    }
};