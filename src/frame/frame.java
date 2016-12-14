package frame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by szielinski on 14.12.16.
 */
public class frame {

   public static void main(String[] args){
      JFrame testFrame = new JFrame("TestFrame");
      JButton startgame;   //starts the game
      JPanel firstPanel;
      JPanel mainPanel;

      testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


      int width = 800;
      int height = 600;

      mainPanel = new JPanel();
      mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

      firstPanel = new JPanel();
      mainPanel.setLayout(new GridLayout(4,4));

      startgame = new JButton("start game");
      startgame.setPreferredSize(new Dimension(100, 60));
      firstPanel.add(startgame);


      mainPanel.add(firstPanel);
      testFrame.add(mainPanel);

      testFrame.setSize(width, height);

      testFrame.setVisible(true);
   }

}
