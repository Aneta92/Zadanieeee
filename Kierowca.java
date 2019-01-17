
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
    
    
    
       public String toString(){
      
      String wynik="";
      wynik="Imie: "+ this.getName()+" Nazwisko: "+ this.getSurename()+" Plec: "+this.getPlec() + " Stanowisko: Kierowca Marka pojazdu: " + this.pojazd.getMarka()+ " Model pojazdu: "+ this.pojazd.getModel() + " Numer rejestracyjny: "+this.pojazd.getNR() + " Pensja: "+ this.Salary +" "+ "\n";
      return wynik;
      }
    
}
