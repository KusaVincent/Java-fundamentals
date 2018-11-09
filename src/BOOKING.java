import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


class Bookin extends JFrame{
 private final JButton s1;
 private final JButton s2;
 private final JButton s3;        
 private final JButton s4;
 private final JButton s5;
 private final JButton s6;
 private final JButton s7;                       
 private final JLabel q1; 
 private final FlowLayout layout;
 private final Container container;
 
  
    public Bookin(){//constructor
    
  super("    BUS BOOKING    "); //container's title
   // getContentPane().setBackground(new java.awt.Color(0,0,250));  
   //  getContentPane().setBackground(Color.BLUE);
   //initUI();
    layout=new FlowLayout(); 
    container=getContentPane();
    setLayout(layout);
    
      getContentPane().setBackground(new Color(0,0,250)); 
    //setLayout(new FlowLayout());      
     q1=new JLabel("WELCOME TO BUS BOOKING SYSTEM"); 
     q1.setForeground(Color.green);
      q1.setFont(new Font("Niagara Solid", 130, 75));
      // q1.setText("WELCOME TO BUS BOOKING SYSTEM");
        q1.contains(20, 215);
     add(q1);
     s1=new JButton(" A1 ");
      s1.setBackground(Color.green);
     add(s1);
     s2=new JButton (" A2 ");
      s2.setBackground(Color.green);
     add(s2);
     s3=new JButton(" A3 ");
      s3.setBackground(Color.green);
     add(s3);
     s4=new JButton(" C ");
      s4.setBackground(Color.green);
     add(s4);
     s5=new JButton(" B1 ");
      s5.setBackground(Color.green);
     add(s5);
     s6=new JButton(" B2 ");
      s6.setBackground(Color.green);
     add(s6);
     s7=new JButton(" B3 ");
      s7.setBackground(Color.green);
     add(s7);
   // s7.setText(" B3 ");  Can be used also for naming
     
     
      thehandler handler = new thehandler();
 s1.addActionListener(handler);
 s2.addActionListener(handler);
 s3.addActionListener(handler);
 s4.addActionListener(handler);
 s5.addActionListener(handler);
 s6.addActionListener(handler);
 s7.addActionListener(handler);
 
 
    }

    class thehandler implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent event){
    if(event.getSource()==s1)
    {
        s1.setEnabled(false);
        s1.setBackground(Color.pink);
         s1.setToolTipText("booked");
         Las las; 
        las = new Las();
      las.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      las.setSize(650,500);
      las.setVisible(true); 
    }
    else if(event.getSource()==s2)
    {
        s2.setEnabled(false);
         s2.setToolTipText("booked");
        s2.setBackground(Color.pink);
        Las las; 
        las = new Las();
      las.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      las.setSize(650,500);
      las.setVisible(true); 
    }          
     else if(event.getSource()==s3)
    {
        s3.setEnabled(false);
         s3.setToolTipText("booked");
        s3.setBackground(Color.pink);
        Las las; 
        las = new Las();
      las.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      las.setSize(650,500);
      las.setVisible(true); 
    }          
     else if(event.getSource()==s4)
    {
        s4.setEnabled(false);
         s4.setToolTipText("booked");
        s4.setBackground(Color.pink);
        Las las; 
        las = new Las();
      las.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      las.setSize(650,500);
      las.setVisible(true); 
    }          
     else if(event.getSource()==s5)
    {
        s5.setEnabled(false);
        s5.setBackground(Color.pink);
         s5.setToolTipText("booked");
         Las las; 
        las = new Las();
      las.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      las.setSize(650,500);
      las.setVisible(true); 
    }          
     else if(event.getSource()==s6)
    {
        s6.setEnabled(false);
         s6.setToolTipText("booked");
        s6.setBackground(Color.pink);
        Las las; 
        las = new Las();
      las.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      las.setSize(650,500);
      las.setVisible(true); 
    }          
     else if(event.getSource()==s7)
     {
         s7.setEnabled(false);
         s7.setToolTipText("booked");
         s7.setBackground(Color.pink);
         
          Las las; 
        las = new Las();
      las.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      las.setSize(650,500);
      las.setVisible(true); 
      
     }
     else {}  
      }    
                     
   }

 }          
            

                          

