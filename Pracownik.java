
package javaapplicationpracownicy;



public class Pracownik {
    private String Name;
    private String Surename;
    public enum Plec{M, F};
    int Salary;
    private Plec Gender;
    
  public void setName(String x){
  Name=x;}
    public void setSurename(String x){
  Surename=x;}
      public void setPlec(String x){
 Plec Gender = Plec.valueOf(x);}
        public void setSalary(int x){
  Salary=x;}
      
   public String getName(){
   return Name;
   }     
      public String getSurename(){
   return Surename;
   }   
         public int getSalary(){
   return Salary;
   }   
            public String getPlec(){
   return Gender.toString();
   }   
  public Pracownik(){
		Name= "";
		Surename= "";
		Salary = 0;
           Plec Gender = Plec.F;
            	}

	public Pracownik(String i, String n, int w, String c){
		Name = i;
		Surename = n;
		Salary = w;
                 Plec Gender = Plec.valueOf(c);
	}
    
}
