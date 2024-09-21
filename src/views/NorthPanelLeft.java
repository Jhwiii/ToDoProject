package views;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class NorthPanelLeft extends JPanel {
   public NorthPanelLeft(){
      setBackground(Color.WHITE);
      setPreferredSize(new Dimension(270, 100));
      setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
   
      initComponents();
    
   }
  
  private void initComponents(){
  
   addBorder();
  addButtonUser();
 
  }

   private void addBorder(){
      Border topBorder = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK);
      setBorder(topBorder);

   }

    private void addButtonUser() {
      JButton buttons = new JButton("Zoewi Fonseca");
      buttons.setBackground(Color.WHITE);
      buttons.setBorderPainted(false);
      buttons.setForeground( Color.BLACK);
      buttons.setFont(new Font("Tahoma", Font.PLAIN, 14));
      String projectRoot = System.getProperty("user.dir");
      String imagePath = projectRoot + "/src/assest/User.png";
      ImageIcon circle = new ImageIcon(imagePath);
      buttons.setIcon(circle);
     
      buttons.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             
          }
      });
      add(buttons);
   }
  


}


