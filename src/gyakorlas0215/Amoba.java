
package gyakorlas0215;

import java.util.Scanner;

public class Amoba {
    static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("az első jel (x/o): ");
        String elso = sc.nextLine();
        
        /* játéktér feltöltése */
        final int MERET = 3;
        String[] amoba = new String[MERET*MERET];
        amoba[0] = elso;
        
        /* generálás: */
        for (int i = 1; i < MERET*MERET; i++) {
            amoba[i] = Math.random()>.5 ? "x" : "o";
        }
        
        /* megjelenítés */
        for (int i = 0; i < MERET*MERET; i++) {
            if(i != 0 && MERET == 0){
                System.out.println("");
            }
            System.out.print(amoba[i]);
        }
        System.out.println("");
    }
}
