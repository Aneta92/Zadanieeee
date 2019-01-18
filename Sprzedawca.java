
package javaapplicationpracownicy;

public class Sprzedawca extends Pracownik{
    private int NumerKasy;
 
    public void setNk(int x){
NumerKasy=x;}
    
    
        public int getNk(){
return NumerKasy;}
    
    
    
    
     
    Sprzedawca(){
       this.setName("");
   this.setSurename("");
   this.setPlec("F");
   this.setSalary(0);
   this.NumerKasy=0;
   
    
    
    
    };
    
    
    Sprzedawca(int x){NumerKasy=x;};
    
    Sprzedawca(String name, String surename, int salary, String plec, int nk){
        this.setName(name);
        this.setSurename(surename);
        this.setSalary(salary);
        this.setPlec(plec);
        
        NumerKasy=nk;
    };
    
    public String toString(){
    String wynik="";
    
    wynik="Imie: "+ this.getName()+" Nazwisko: "+ this.getSurename()+" Plec: "+this.getPlec() + " Stanowisko: Sprzedawca "+ " Pensja: "+ this.Salary + " Numer stanowiska: "+ this.getNk()+" "+ "\n";
    return wynik;
    
    
    }
}
