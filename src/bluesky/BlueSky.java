
package bluesky;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class BlueSky {


    
    public static void main(String[] args) {
       JFrame window = new JFrame("Swing");
       MyCanvas canvas = new MyCanvas();
 
       window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       window.setSize(400, 300);
       window.add(canvas);
       window.pack();
       window.setResizable(false);
       window.setLocationRelativeTo(null);
       window.setVisible(true);

    }
    
    public class MyCanvas extends JPanel {
    public MyCanvas () {
        setPreferredSize(new Dimension(400,300));
        setBackground(Color.GRAY);
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(new Color (127,233,245));
        g.fillRect(0,0, 400, 100);

        g.setColor(Color.YELLOW);
        g.fillOval(40, 40, 20, 20);
    }
}
}

