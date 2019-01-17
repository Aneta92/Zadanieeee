
package javaapplicationpracownicy;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import javax.swing.ButtonGroup;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class JavaApplicationPracownicy extends JFrame {

    private JLabel label1 = new JLabel("Input name :");
private JButton button = new JButton("comit");
private JButton buttonnext = new JButton("continue");
    private JTextField input1 = new JTextField("", 10);
    
    private JLabel label3 = new JLabel("Input salary :");
    private JTextField input3 = new JTextField("", 10);
    
    
    
    private JLabel label2 = new JLabel("Input surename :");
    private JTextField input2 = new JTextField("", 10);
    
   JRadioButton male = new JRadioButton("male");
     JRadioButton female = new JRadioButton("Female");
   
  
    
    
    
      private JLabel labelt = new JLabel("Chose workplace :");
        JRadioButton Kierownik = new JRadioButton("Kierownik");
     JRadioButton Kierowca = new JRadioButton("Kierowca");
      JRadioButton Sprzedawca = new JRadioButton("Sprzedawca");
     
      private JLabel label4 = new JLabel("Input bonus(only for chef):");
    private JTextField input4 = new JTextField("", 10);
     
      private JLabel label5 = new JLabel("Input bo number(only for seller):");
    private JTextField input5 = new JTextField("", 10);
    
        private JLabel label6 = new JLabel("Input car mark (only for driver):");
    private JTextField input6 = new JTextField("", 10);

        private JLabel label7 = new JLabel("Input car model(only for driver) :");
    private JTextField input7 = new JTextField("", 10);
        private JLabel label8 = new JLabel("Input plate number (only for driver):");
    private JTextField input8 = new JTextField("", 10);
    
    String wynikogolny="";
    
    public JavaApplicationPracownicy(){
        
        
        super("Aplikacja");
     
          ButtonGroup group1 = new ButtonGroup();
	    group1.add(male);
	    group1.add(female);
            ButtonGroup group2 = new ButtonGroup();
            group2.add(Kierownik);
              group2.add(Kierowca);
              group2.add(Sprzedawca);
              
              
         this.setBounds(400,400,450,400);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              Container container = this.getContentPane();
	    container.setLayout(new GridLayout(13,2));
	    container.add(label1);
	    container.add(input1);
            container.add(label2);
	    container.add(input2);
             container.add(label3);
	    container.add(input3);
            male.setSelected(true);
            container.add(male);
             
	    container.add(female);
               container.add(labelt);
               Kierownik.setSelected(true);
                container.add(Kierownik);
            container.add(Kierowca);
            container.add(Sprzedawca);
            
               container.add(label4);

               container.add(input4);
  
            
            
            container.add(label5);
	    container.add(input5);
            
        
               container.add(label6);
	    container.add(input6);
    
               container.add(label7);
	    container.add(input7);
  
               container.add(label8);
	    container.add(input8);
          
             container.add(button);
              container.add(buttonnext);
            
            
              
      
          		buttonnext.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
					
                            
                             String pl = "";
                            if(male.isSelected()){pl="M";}else{pl="F";}
                            if(Kierowca.isSelected()){
                                Kierowca pr1=new Kierowca(input1.getText(), input2.getText(), Integer.parseInt(input3.getText()), pl, input6.getText(),input7.getText(),input8.getText()  );
                                wynikogolny+=pr1.toString()+"\n";
                            }
                              if(Kierownik.isSelected()){
                                kierownik pr2 = new kierownik(input1.getText(), input2.getText(), Integer.parseInt(input3.getText()), pl ,Integer.parseInt(input4.getText()));
                                wynikogolny+=pr2.toString()+ "\n";
                            }
                              
                                if(Sprzedawca.isSelected()){
                               Sprzedawca pr3 = new Sprzedawca(input1.getText(), input2.getText(), Integer.parseInt(input3.getText()), pl ,Integer.parseInt(input5.getText()));
                                wynikogolny+=pr3.toString()+ "\n";
                            }
                              
                            input1.setText("");
                                        input2.setText("");
                                        input3.setText("");
                                        input4.setText("");
                                        input5.setText("");
                                        input6.setText("");
                                        input7.setText("");
                                        input8.setText("");
                                        
			}          
	      });    
              
                        
                        
          		button.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
					
                            try{
                            File plik = new File("wyniki.txt");
                            }catch (Exception ex) {
                                Logger.getLogger(JavaApplicationPracownicy.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            
                           
                            
                            try {
                                PrintWriter zapis = new PrintWriter("wyniki.txt");
                                
                                
                                
                                  zapis.println(wynikogolny);
                                    zapis.close();
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(JavaApplicationPracownicy.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            
                            input1.setText("");
                                        input2.setText("");
                                        input3.setText("");
                                        input4.setText("");
                                        input5.setText("");
                                        input6.setText("");
                                        input7.setText("");
                                        input8.setText("");
                                        
			}          
	      });    
              
              
    }
    public static void main(String[] args) {
   JavaApplicationPracownicy app= new JavaApplicationPracownicy();
   app.setVisible(true);
   
     
       
        
    }
    
}
