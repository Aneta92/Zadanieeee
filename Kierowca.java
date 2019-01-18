
package javaapplicationpracownicy;


public class Kierowca  extends Pracownik{
    Pojazd pojazd = new Pojazd("","","");
   
    
   public Kierowca(){
   this.setName("");
   this.setSurename("");
   this.setPlec("F");
   this.setSalary(0);
   this.pojazd.setMarka("");
     this.pojazd.setModel("");
     this.pojazd.setNr("");
   
   
   }
   
  
  
      public Kierowca(String imie, String nazwisko, int pensja, String plec,String marka, String model , String NR ){
   pojazd = new Pojazd(marka,model,NR);
   
   this.setName(imie);
   this.setSurename(nazwisko);
   this.setPlec(plec);
   this.setSalary(pensja);
  
   
   }
      
    @Override
      public String toString(){
      
      String wynik="";
      wynik="Imie: "+ this.getName()+" Nazwisko: "+ this.getSurename()+" Plec: "+this.getPlec() + " Stanowisko: Kierowca Marka pojazdu: " + this.pojazd.getMarka()+ " Model pojazdu: "+ this.pojazd.getModel() + " Numer rejestracyjny: "+this.pojazd.getNR() + " Pensja: "+ this.Salary +" "+ "\n";
      return wynik;
      }
    
}
