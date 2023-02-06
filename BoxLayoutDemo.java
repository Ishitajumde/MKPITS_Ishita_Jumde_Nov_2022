import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class BoxLayoutDemo extends JFrame
{

    public BoxLayoutDemo()
    {
      Container contentPane = getContentPane();
      contentPane.setLayout(new FlowLayout());

      Box horbox = Box.createHorizontalBox();
      Box verbox = Box.createVerticalBox();

      horbox.add(new JButton("button 1"));
      horbox.add(new JButton("button 1"));
      horbox.add(new JButton("button 1"));

      verbox.add(new JButton(new ImageIcon("b1.gif")));
      verbox.add(new JButton(new ImageIcon("b1.gif")));
      verbox.add(new JButton(new ImageIcon("b1.gif")));

      contentPane.add(horbox);
       contentPane.add(verbox);

       pack();
       setVisible(true);
    }

public static void main(String [] args)
{
   new BoxLayoutDemo();
}
}