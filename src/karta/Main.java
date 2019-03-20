
package karta;

import java.util.Scanner;

public class Main {
    
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PVE talia =new PVE("");
        PVE ty = new PVE("Ty");
        PVE komputer = new PVE("Komputer");
    System.out.println("Gra WOJNA");
    System.out.println("Wykonuje jedna runde sprawdzania kart czyli 12kart");
        while(true){
            System.out.println("\n1 Start");
            System.out.println("2 Wyświetl moją reke");
            System.out.println("3 Wyświetl reke komputera");
            System.out.println("4 Wyświetl wszystkie karty w talii");
            System.out.println("5 Losowanie calej talii do ponownej rozgrywki");
            System.out.print("\nWpisz numer opcji wyboru: "); int wybor = s.nextInt();
            switch(wybor){
                case 1:
                    ty.grawojna(komputer);
                    break;
                case 2:
                    ty.wyswietlTalieGracza();
                    break;
                case 3:
                    komputer.wyswietlTalieGracza();
                    break;
                case 4:
                    talia.Taliakart.wyswietlanietalia();
                    break;                
                case 5:
                    ty.losujKarty();
                    komputer.losujKarty();
                    break;            
                default:
                    break;
            }
        }
    }
}
