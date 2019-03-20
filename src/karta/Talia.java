
package karta;

public class Talia {
   
        Karta[] Talia= new Karta[24];
        
      int[] Figury={9,10,11,12,13,14};      //wartosc ktora znajduje sie w karcie
      String[] Kolory={"trefl","karo","kier","pik"};    //figura ktora znajduje sie w karcie
      
      public Talia(){
          int figura=0;
          int kolor=0;
      for(int i=0;i<Talia.length;i++){      //jesli wymienione zostana 4 kolory to wartosc idzie +1 np. 9-10,10-11(walet)
          if(kolor==Kolory.length){figura++;kolor=0;}    
          Talia[i]=new Karta(Figury[figura],Kolory[kolor]);
          kolor++;
          }
      }
      public void wyswietlanietalia(){
          for(int i=0;i<Talia.length;i++){
          if(Talia[i]!=null){       //jesli w komorce tabeli jest wartosc to wypisuje np 1:  9trefl i przesuwa do nast liniki
              System.out.print(i+1+":  ");
              System.out.print(Talia[i].Wartosciwtabeli()+"\n");
          }
        }   
    }
}