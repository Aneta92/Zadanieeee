
package javaapplicationpracownicy;


public class Kierowca  extends Pracownik{
    private Pojazd pojazd;
    
   public Kierowca(String x, String y, String z){
   pojazd = new Pojazd(x,y,z);
   
   
   }
      public Kierowca(String imie, String nazwisko, int pensja, String plec,String marka, String model , String NR ){
   pojazd = new Pojazd(marka,model,NR);
   
   this.setName(imie);
   this.setSurename(nazwisko);
   this.setPlec(plec);
   this.setSalary(pensja);
  
   
   }
    
}
