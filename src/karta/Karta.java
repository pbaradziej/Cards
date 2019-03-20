
package karta;

public class Karta {
    String figura;
    int wartosc;
    String ZMwartoscinaznak;
    
        public Karta(int wartosc,String figura){
        this.wartosc=wartosc;
       this.figura=figura;
    }
        public String Wartosciwtabeli(){   //zamiana 11-14 na karty jak w wojnie
        switch(this.wartosc){
            case 11: 
                this.ZMwartoscinaznak = "walet";
                break;
            case 12:
                this.ZMwartoscinaznak="dama";
                break;
            case 13:
                this.ZMwartoscinaznak="krol";
                break;
            case 14:
                this.ZMwartoscinaznak="as";
                break;
            default:
                this.ZMwartoscinaznak=Integer.toString(this.wartosc);       //pozostale wartosci 9,10 przepisanie na string
                break;
        }
    return (this.ZMwartoscinaznak+this.figura);     //z tej klasy powracaja sring i figura ktora znajduje sie w talii
    }
      
}