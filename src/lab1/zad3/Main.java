package lab1.zad3;


public class Main {
    public static void main(String[] args) {
        int[]  tablica = {1,2,1,3}; 
        
        if (szukaj(tablica) == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    
    private static boolean szukaj(int[] tablica) {
        int znalezionaLiczba = 0;
        for(int i = 0; i < tablica.length; ++i ) {
            if (znalezionaLiczba == 0 && tablica[i] == 1) {
                znalezionaLiczba += 1;
            } else if (znalezionaLiczba == 1 && tablica[i] == 2) {
                znalezionaLiczba += 1;
            } else if (znalezionaLiczba == 2 && tablica[i] == 3) {
                znalezionaLiczba += 1;
            } else {
                znalezionaLiczba = 0;
            }
            
            if (znalezionaLiczba == 3) {
                return true;
            }
        }
        
        return false;
    }
    
}
