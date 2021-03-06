/* How to get location printer in java. */

package AI;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author azzam
 */
public class LocationPrinter extends MouseAdapter { 
  public static void main(String args[]) {
    JPanel panel = new JPanel();
    panel.setPreferredSize(new Dimension(300, 200));
    panel.addMouseListener(new LocationPrinter());
    JFrame frame = new JFrame("Location Window");
    frame.getContentPane().add(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
  public void mouseClicked(MouseEvent me) {
    int screenX = me.getXOnScreen();
    int screenY = me.getYOnScreen();
    System.out.println("screen(X,Y) = " + screenX + "," + screenY);
  }
}
