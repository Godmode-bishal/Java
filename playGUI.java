import java.awt.*;
import javax.swing.*;
public class playGUI extends JPanel
{
    public void paintComponent(Graphics g)
    {   
        g.setColor(Color.orange);
        g.fillRect(20,50,100,100);
    }
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        
        frame.repaint();
    }
}