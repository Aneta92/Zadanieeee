/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationpracownicy;

public class Sprzedawca extends Pracownik{
    private int NumerKasy;
 
    public void setNk(int x){
NumerKasy=x;}
    
    
        public int getNk(){
return NumerKasy;}
    
    
    
    
    
    
    
    Sprzedawca(int x){NumerKasy=x;};
    
    Sprzedawca(String name, String surename, int salary, String plec, int nk){
        this.setName(name);
        this.setSurename(surename);
        this.setSalary(salary);
        this.setPlec(plec);
        
        NumerKasy=nk;
    };
}
