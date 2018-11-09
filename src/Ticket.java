import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Ticket extends JFrame{
    private final JTextField t1;
     private final JTextField t2;
      private final JTextField t3;
       private final JTextField t4;
        private final JTextField t5;
         private final JTextField t6;
         private final JTextField t7;
          private final JTextField t8;
           private final JTextField t9;
            private final JTextField t10;
               private final FlowLayout layout;
                 private final Container container;
            
    private final JLabel c1;
    private final JLabel c2;
    private final JLabel c3;
    private final JLabel c4;
    private final JLabel c5;
    private final JLabel c6;
    private final JLabel c7;
    private final JLabel c8;
    private final JLabel c9;
    private final JLabel c10;
    private final JLabel c11;
   
    private final JButton j;
    
    public  Ticket(){
    super("TRAIN TICKETING");
    layout=new FlowLayout(); 
    container=getContentPane();
    setLayout(layout);
     getContentPane().setBackground(new Color(0,250,250)); 
   // setLayout(new FlowLayout());
    
    t1= new JTextField(12);
     t2= new JTextField(12);
      t3= new JTextField(12);
       t4= new JTextField(12);
        t5= new JTextField(12);
         t6= new JTextField(12);
          t7= new JTextField(12);
           t8= new JTextField(12);
            t9= new JTextField(12);
             t10= new JTextField(12);
             
    c1 = new JLabel("TRAIN       TICKET");   
      c2 = new JLabel("CLASS");
      c3 = new JLabel("TICKET");
        c4 = new JLabel("ADULT/CHILD");
          c5 = new JLabel("FROM");
            c6 = new JLabel("TO");
              c7 = new JLabel("PRICE");
                c8 = new JLabel("TICKET NO.");
                  c9 = new JLabel("TIME");
                    c10 = new JLabel("DATE");
                      c11 = new JLabel("ROUTE");
      
      
      add(c1);  
      add(c2); 
      add(t2); 
      add(c3); 
      add(t3); 
      add(c4); 
      add(t4); 
      add(c5); 
      add(t5); 
      add(c6); 
      add(t6); 
      add(c7); 
      add(t7); 
      add(c8); 
      add(t8); 
      add(c9); 
      add(t9); 
      add(c10); 
      add(t10); 
      add(c11);
      add(t1);
      
      j = new  JButton("Exit");
          j.setBackground(Color.green);
         add(j);
andler handler = new andler();
j.addActionListener(handler);
} 

 private class andler implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent event){
    if(event.getSource()==j)
    {
        String str1 = JOptionPane.showInputDialog(null, "ENTER 1 TO EXIT");
             double user =    Double.parseDouble(str1);
           if ( user == 1){
              
        JOptionPane.showMessageDialog(null," ARE YOU SURE ?  " );
              System.exit(1);
      
           }
        }
      }
   }
}
