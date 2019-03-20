
package karta;

import java.util.Random;
 
public class PVE {
    Karta[] Rekagracza = new Karta[12];     //tablica z ktorej korzysta komp i ty
    Talia Taliakart = new Talia();      //talia 24kart 
    Random r = new Random();        //random dla reki komp i ty
    String ktowygral;
    int punktacja = 0;          //punkty jakie moga zdobyc w ciagu 1rundy gracze
    public PVE(String ktowygral){       //konstruktor
        this.ktowygral = ktowygral;
        this.losujKarty();
    }
    public void losujKarty(){   //funkcja w ktorej ty i komputer losujecie reke
        for(int i = 0; i < Rekagracza.length; i++){
            int randomkarty = r.nextInt(24);
            Rekagracza[i] = Taliakart.Talia[randomkarty];
        }
    }
 
    public void wyswietlTalieGracza(){          //wyswietlanie twojej lub komputera talii
        for(int i = 0; i < Rekagracza.length; i++)
            System.out.print(Rekagracza[i].Wartosciwtabeli()+",");                  
    }
 
    private void nowagra(){         //zeruje punktacje dzieki czemu gra moze trwac bez rest programu
        this.punktacja = 0;
    }
 
    public void grawojna(PVE komputer){         //mechanizm gry
        for(int i = 0; i < Rekagracza.length; i++){     //loop ktory sprawdza kolejne 12 rozdan
            if(komputer.Rekagracza[i].wartosc > this.Rekagracza[i].wartosc){        //jesli wygrywa komputer to dostaje punkt i wypisuje ze wygral rozdanie
                komputer.punktacja++;
                System.out.print((i+1) + "  " + this.Rekagracza[i].Wartosciwtabeli() + " < " + komputer.Rekagracza[i].Wartosciwtabeli());
                System.out.print("  Punkt dla " + komputer.ktowygral + "\n");}
            else{
                if(komputer.Rekagracza[i].wartosc < this.Rekagracza[i].wartosc){       
                    this.punktacja++; System.out.print((i+1) + "  " + this.Rekagracza[i].Wartosciwtabeli() + " > " + komputer.Rekagracza[i].Wartosciwtabeli());
                System.out.print("  Punkt dla " + this.ktowygral + "\n");}
                else{ System.out.print((i+1) + "  " + this.Rekagracza[i].Wartosciwtabeli() + " = " + komputer.Rekagracza[i].Wartosciwtabeli());
                    System.out.print("  Remis\n");}
            }
        }    
        System.out.println("\nWyniki:");
        System.out.println(this.ktowygral + ": " + this.punktacja);
        System.out.println(komputer.ktowygral + ": " + komputer.punktacja);
        if(this.punktacja > komputer.punktacja) { System.out.println("Gratulacje Wygrales");}
        else if(this.punktacja == komputer.punktacja){ System.out.println("Remis Sprobuj ponownie");}
        else{ System.out.println("Niestety Przegrales");}
        this.nowagra();
        komputer.nowagra();
    }
 
}
