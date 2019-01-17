# Zadanieeee
public class Pojazd {
    private String marka;
    private String model;
    private String NuRejestr;
    
     public void setMarka(String x){
  marka=x;}
      public void setModel(String x){
  model=x;}
       public void setNr(String x){
  NuRejestr=x;}
    
       
       
        public String getMarka(){
   return marka;
   
   }
        
        public String getModel(){
   return model;
   }      
        
        public String getNR(){
   return NuRejestr;
   }      
   Pojazd(String x, String y,String z){
   marka=x;
   model=y;
   NuRejestr=z;
   }
   
 
}
