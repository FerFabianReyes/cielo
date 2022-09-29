
package bluesky;
import javax.swing.*;


public class BlueSky {

    public static void main(String[] args) {
        JFrame window = new JFrame("Swing");
        MyCanvas canvas = new MyCanvas(); 
 
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(400, 300);
        window.add(canvas);
        window.pack();  // set the "size of frame to preferred sizes"
        window.setResizable(false); // Do not change the size frame whit mouse
        window.setLocationRelativeTo(null); // center of window
        window.setVisible(true);

    }
}

