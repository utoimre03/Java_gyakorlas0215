
package gyakorlas0215;

import java.util.Scanner;

public class Bekak {
    static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        String beka = "🐸";
        String level = "🍀";
        String[] jatekter = {beka, beka, beka, level};
        
        /* Megjelenítés: */
        // játékelemek:
        for (int i = 0; i < jatekter.length; i++){
            System.out.printf("%2s", jatekter[i]);
        }
        System.out.println("");
        for (int i = 0; i < jatekter.length; i++){
        System.out.printf("%2s", i+1);
        }
        System.out.println("");
        
        /* Bekérés: */
        // nincs ellenőrizve a bevitel!
        System.out.print("Melyikkel lépsz (1..4): ");
        int hely = sc.nextInt();
        
        if(hely == 1 || hely == 4) {
            System.out.println("Ezzel nem léphetsz!");
        } else if (hely == 2){
            jatekter[0] = beka;
            jatekter[1] = level;
            jatekter[2] = beka;
            jatekter[3] = beka;
        } else if (hely == 3){
            jatekter[0] = beka;
            jatekter[1] = beka;
            jatekter[2] = level;
            jatekter[3] = beka;        
        }
    }
}
