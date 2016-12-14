package frame;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Created by szielinski on 14.12.16.
 */
public class frame {

   public static void main(String[] args){
      JFrame testFrame = new JFrame("TestFrame");
      testFrame.setSize(800, 600);
      testFrame.add(new JLabel("Testtesttest"));

      testFrame.setVisible(true);
   }

}
