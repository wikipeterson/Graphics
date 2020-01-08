import java.awt.*;  
import javax.swing.JFrame;  

public class DisplayGraphics extends Canvas{  
      
    public void paint(Graphics g) 
    {  
        setBackground(Color.WHITE); 
        g.setColor(Color.BLUE); 

        float x = 800;
        float y = 600;

        for (int i = 0; i < 100000; i++)
        {
          int rand = (int)(Math.random()*3);
          if (rand == 0)
          {
            x = (x + 400)/ 2;
            y = y / 2;
            g.setColor(Color.BLUE);
          }
          if (rand == 1)
          {
            x = (x + 800)/2;
            y = (y + 600)/2;
            g.setColor(Color.RED);
          }
          if (rand == 2)
          {
            x = x / 2;
            y = (y + 600)/2;
            g.setColor(Color.GREEN);
          }
          if (i > 2000)
          {
            g.fillRect((int)x, (int)y, 1, 1);  // x, y, width, height
          }
        }
    }      
} 