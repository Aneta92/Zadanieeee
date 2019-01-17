
package javaapplicationpracownicy;


public class kierownik extends Pracownik{
    private int premia;
    
    
    public void setPremia(int x){this.premia=x;
    }
    public int getPremia(){return this.premia;}
    
    
    
    kierownik(int premia){this.premia=premia;}
    
    kierownik(String name, String surename, int salary, String plec, int premia){
    
     this.setName(name);
        this.setSurename(surename);
        this.setSalary(salary);
        this.setPlec(plec);
        this.premia=premia;
    
    
    }
}
