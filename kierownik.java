
package javaapplicationpracownicy;


public class kierownik extends Pracownik{
    private int premia;
    
    
    public void setPremia(int x){this.premia=x;
    }
    public int getPremia(){return this.premia;}
    
    kierownik(){
        
         this.setName("");
   this.setSurename("");
   this.setPlec("F");
   this.setSalary(0);
        
        this.premia=0;}
    
    kierownik(int premia){this.premia=premia;}
    
    kierownik(String name, String surename, int salary, String plec, int premia){
    
     this.setName(name);
        this.setSurename(surename);
        this.setSalary(salary);
        this.setPlec(plec);
        this.premia=premia;
    
    
    }
    public String toString(){
    String wynik="";
   
    wynik="Imie: "+ this.getName()+" Nazwisko: "+ this.getSurename()+" Plec: "+this.getPlec() + " Stanowisko: Kierownik   Pensja:"+ this.Salary + " Premia: "+ this.premia+ " "+ "\n";
    
    return wynik;
    
    }
}
