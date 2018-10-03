package lab1.zad2;

public class Main {
    public static void main(String[] args) {
        int a = 12;
        int b = 13;
        int c = 10;
        
        System.out.println("Suma: "+sumuj(a,b,c));
    } 
    
    private static int sumuj(int a, int b, int c) {
        int suma = 0;
        if (a != 13) {
            suma += a;
        } else {
            return suma;
        }
        if (b != 13) {
            suma += b;
        } else {
            return suma;
        }
        if (c != 13) {
            suma += c;
        } else {
            return suma;
        }
        
        return suma;
    }
}
