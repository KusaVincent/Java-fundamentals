import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class LAS extends JFrame 
{
     int NAIROBI  = 250;
   int KISUMU = 500;
    int MOMBASA = 750;
    int KAMPALA = 1250;
    int ARUSHA = 2000;
    int NNAIROBI = 250 + 500;
   int KKISUMU = 500 + 500;
    int MMOMBASA = 750 + 500;
    int KKAMPALA = 1250 + 500;
    int AARUSHA = 2000 + 500;
    int NAIROB = 250 + 1000;
    int KISUM = 500 + 1000;
    int MOMBAS = 750 + 1000;
    int KAMPAL = 1250 + 1000;
    int ARUSH = 2000 + 1000;
    int TAX = 16/100;
     double COST ; 
     
     private final FlowLayout layout;
     private final Container container;
    private final ButtonGroup b1;
   private final ButtonGroup b2;
     private final ButtonGroup b3;
     private final JRadioButton a1;
     private final JRadioButton a2;
     private final JRadioButton a3;
      private final JRadioButton c1;
       private final JRadioButton c2;
        private final JRadioButton d1;
       private final JRadioButton d2;
       
       private final JComboBox h;
       
      private final JLabel n; 
     private final JLabel m;
      private final JLabel k;
       private final JLabel k1;
        private final JLabel k2;
         private final JLabel k3;
          private final JLabel k4;
           private final JLabel k5;
           
           private final JTextField t1;
           private final JTextField t2;
           private final JTextField t3;
           private final JTextField t4;
           
            private final JButton j;
             private final JButton V;
public LAS(){
    super("CLASS");
      
    layout=new FlowLayout(); 
     container=getContentPane();
    setLayout(layout);
   
    getContentPane().setBackground(new Color(250,0,0)); 
a1 = new  JRadioButton("EXERCUTIVE");
a2 = new  JRadioButton("CINEMAX");
a3 = new  JRadioButton("CLASSIC");
m = new JLabel("CLASS");

add(m);
  m.setForeground(Color.yellow);
      m.setFont(new Font("Niagara Solid", 100, 50));
     // layout.setAlignment(FlowLayout.RIGHT);
     // layout.layoutContainer(container);
add(a1);
 a1.setBackground(Color.yellow);
add(a2);
 a2.setBackground(Color.yellow);
add(a3);
 a3.setBackground(Color.yellow);

b1 = new ButtonGroup();
b1.add(a1);
b1.add(a2);
b1.add(a3);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

c1= new  JRadioButton("RETURN");
c2 = new  JRadioButton("ONE WAY");
n = new JLabel("TICKET TYPE");

add(n);
  n.setForeground(Color.magenta);
      n.setFont(new Font("Niagara Solid",100, 50));
add(c1);
c1.setBackground(Color.magenta);
add(c2);
 c2.setBackground(Color.magenta);
 
b2 = new ButtonGroup();
b2.add(c1);
b2.add(c2);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

d1= new  JRadioButton("ADULT");
d2 = new  JRadioButton("CHILD");
k = new JLabel("AGE");

add(k);
  k.setForeground(Color.green);
     k.setFont(new Font("Niagara Solid",100, 50));
add(d1);
d1.setBackground(Color.green);
add(d2);
 d2.setBackground(Color.green);
 
b3 = new ButtonGroup();
b3.add(d1);
b3.add(d2);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


String choices[] = { "NAIROBI", "KISUMU","SIAYA","KAMPALA","MOMBASA","ARUSHA"};
h=new JComboBox( choices ); 
//h.setEditable(true);
k1 = new JLabel("DESTINATOIN");

add(k1);
  k1.setForeground(Color.blue);
     k1.setFont(new Font("Niagara Solid",100, 50));
add(h);
h.setBackground(Color.green);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

k2 = new JLabel("AMOUNT");
k3 = new JLabel("TAX");
k4 = new JLabel("TOTAL");
k5 = new JLabel("Served by");
t1 = new JTextField(10);
t2 = new JTextField(10);
t3 = new JTextField(10);
t4 = new JTextField(10);
V = new JButton("TOTAL");
 V.setBackground(Color.yellow);
      V.setFont(new Font("Niagara Solid", 100, 50));
add(V);

add(k2);
 k2.setForeground(Color.yellow);
      k2.setFont(new Font("Niagara Solid", 100, 50));
add(t1);
add(k3);
 k3.setForeground(Color.yellow);
     k3.setFont(new Font("Niagara Solid", 100, 50));
add(t2);
add(k4);
 k4.setForeground(Color.yellow);
      k4.setFont(new Font("Niagara Solid", 100, 50));
add(t3);
add(k5);
 k5.setForeground(Color.yellow);
     k5.setFont(new Font("Niagara Solid", 100, 50));
add(t4);

j = new JButton("CONFIRM");
 j.setBackground(Color.yellow);
      j.setFont(new Font("Niagara Solid", 100, 50));
add(j);


Handlers handler = new Handlers();
j.addActionListener(handler);
} 

 private class Handler implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent event){
       
         if(event.getSource()==a1)
        {
          //  Amount = 
        }
      else    if(event.getSource()==a3)
        {
        }
         else  if(event.getSource()==a2)
        {
        }
     }  
 }
 private class Handlers implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent event){
        if(event.getSource()==j)
        {
            TICKET ticket;
            ticket = new TICKET();
            ticket.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ticket.setSize(650,500); 
            ticket.setVisible(true);
        } else {
        }
    }  
 }

}
