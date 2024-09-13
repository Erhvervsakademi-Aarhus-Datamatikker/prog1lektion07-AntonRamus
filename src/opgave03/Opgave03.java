package opgave03;

import java.util.Scanner;

public class Opgave03 {
    public static void main(String[] args) {
//        promt brugeren til at indtaste ugedagen
        System.out.println("Indtast ugedagen.");
        System.out.println("Søndag er 0, mandag er 1, tirsdag er 2, onsdag er 3,");
        System.out.println("torsdag er 4, fredag er 5, lørdag er 6");
        System.out.println(" ");
        System.out.print("Ugedagen: ");

//        scan brugerens input
        Scanner scanner = new Scanner(System.in);
        int ugedag = scanner.nextInt();

//        tjek om ugedagen er gyldig
        if(ugedag < 0 || ugedag > 6) {
            System.out.println("Ugyldig ugedag.");
        }

        else {
//           promt brugeren til at indtaste antallet af dage ud i fremtiden
            System.out.print("Indtaste antallet af dage i fremtiden, du vil finde ugedagen: ");
            int dagIFremtiden = scanner.nextInt();

//           udregn ny ugedag
            int nyUgedag = (ugedag + dagIFremtiden) % 7;

            System.out.println("Den indtastede dag er " + ugedag(ugedag) + ".");

            System.out.println("Den nye dag er " + ugedag(nyUgedag) + ".");


        }
    }

    private static String ugedag (int ugedagnr){
        String[] ugedage = {"søndag", "mandag", "tirsdag","onsdag","torsdag","fredag","lørdag"};
        String ugedag = ugedage[ugedagnr];
        return ugedag;
    }
}
