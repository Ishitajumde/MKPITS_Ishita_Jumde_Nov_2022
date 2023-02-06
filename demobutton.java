import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

class frm {
     JFrame f1;
     Container c;
     JButton b1,b2,b3,b4,b5,b6;
     frm()
     {
        f1=new JFrame();
        Container c=f1.getContentPane();
        c.setLayout(new FlowLayout());
        b1=new JButton("button 1");
        b1.setBackground(Color.red);
        c.add(b1);
        ////////////////
        ImageIcon ic1=new ImageIcon("b1.gif");
        b2=new JButton(ic1);
        c.add(b2);
        //////////////
        ImageIcon ic2=new ImageIcon("b1.gif");
	    b3=new JButton("butterfly",ic2);
        c.add(b3);
        ///////////////
        ImageIcon ic3=new ImageIcon("b1.gif");
	    b4=new JButton("butterfly",ic3);
	    b4.setHorizontalTextPosition(SwingConstants.CENTER);
	    b4.setBorder(BorderFactory.createLineBorder(Color.red,5,true));
        c.add(b4);
        //////////////
        b5=new JButton("<html><font size=10 color=red>Button</font></html>");
        c.add(b5);
        /////////////
        b6=new JButton("<html><font size=10 color=red>But</font><font size=10 color=blue>ton</font></html>");
        c.add(b6);
        f1.setVisible(true);
        f1.setSize(200,200);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
}
class demobutton{
public static void main(String[]args)
{
   new frm();
}
}