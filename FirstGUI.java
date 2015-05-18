//My first GUI: A button on the frame.
import javax.swing.*;
import java.awt.event.*;
public class FirstGUI implements ActionListener
{
    JButton button;
    public static void main(String[] args)
    {
        FirstGUI gui=new FirstGUI();
        gui.go();
    }
        public void go()
        {
            JFrame frame=new JFrame();
            button=new JButton("Click Me!!");
            button.addActionListener(this);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(button);
            frame.setSize(300,300);
            frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event)
    {
        button.setText("I've been clicked!!");
    }
}
        
        