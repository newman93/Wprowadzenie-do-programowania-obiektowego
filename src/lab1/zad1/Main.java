package lab1.zad1;

public class Main {
     public static void main(String[] args) {
        int liczba1 = 13;
        int liczba2 = 12;
        
        if (sprawdz(liczba1, liczba2) == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
    }
    
    private static boolean sprawdz(int liczba1, int liczba2) {
        if ((liczba1 >= 13 && liczba1 <= 19) && (!(liczba2 >= 13 && liczba2 <= 19)) || (liczba2 >= 13 && liczba2 <= 19) && (!(liczba1 >= 13 && liczba1 <= 19))) {
            return true;
        } else {
            return false;
        }
    } 
}
