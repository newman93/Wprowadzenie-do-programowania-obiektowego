package lab2.employee;

import java.util.ListIterator;
import java.util.LinkedList;

public class Employee {
    private String name;
    private String surname;
    private String email;
    
    public Employee(String name, String surname, LinkedList<Employee> database) {
        String cName = name.substring(0,1).toUpperCase() + name.substring(1);
        String cSurname =  surname.substring(0,1).toUpperCase() + surname.substring(1);       
        this.name = cName;
        this.surname = cSurname;
   
        if (database != null && database.isEmpty()) {
            this.email = generateEmail(name, surname);
        } else {
            ListIterator<Employee> iterator = database.listIterator();
            int counter = 0;
            
            while (iterator.hasNext()) {
                if (iterator.next().checkDuplicate(cName,cSurname)) {
                    ++counter;
                }
            }
            
            if (counter == 0) {
                this.email = generateEmail(name,surname);
            } else {
                this.email = generateEmail(name, surname, String.valueOf(counter));
            }
        }
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    
    private static String generateEmail(String name, String surname) {
        return surname + "." + name + "@mex.com";
    }
    
    private static String generateEmail(String name, String surname, String counter) {
        return surname + "." + name + "." + counter + "@mex.com";
    }
    
    private boolean checkDuplicate(String cName, String cSurname) {
        return name.equals(cName) && surname.equals(cSurname);
    }
    
}
