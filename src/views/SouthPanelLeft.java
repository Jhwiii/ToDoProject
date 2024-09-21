package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;

public class SouthPanelLeft extends JPanel{
  
    public SouthPanelLeft(){
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(270, 300));
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        initComponents();
    

}
private void initComponents(){
  
   addBorder();
   this.add(Box.createRigidArea(new Dimension(0, 30)));
   addButtonSettings();
   addButtonExit();
  

   }
   
    private void addBorder(){
       Border topBorder = BorderFactory.createMatteBorder(2, 0, 0, 0, Color.BLACK);
       setBorder(topBorder);
 
    }

private void addButtonSettings() {
  JButton button = new JButton("Configuración");
  button.setBackground(Color.WHITE);
  button.setBorderPainted(false);
  button.setForeground( Color.GRAY);
  button.setFont(new Font("Tahoma", Font.PLAIN, 14));
  String projectRoot = System.getProperty("user.dir");
  String imagePath = projectRoot + "/src/assest/settings.png";
  ImageIcon circle = new ImageIcon(imagePath);
  button.setIcon(circle);
 
  button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
         
      }
  });
  add(button);
  this.add(Box.createRigidArea(new Dimension(0, 10)));
}
private void addButtonExit() {
   JButton button = new JButton("Salir");
   button.setBackground(Color.WHITE);
   button.setBorderPainted(false);
   button.setForeground( Color.GRAY);
   button.setFont(new Font("Tahoma", Font.PLAIN, 14));
   String projectRoot = System.getProperty("user.dir");
   String imagePath = projectRoot + "/src/assest/exit.png";
   ImageIcon circle = new ImageIcon(imagePath);
   button.setIcon(circle);
  
   button.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
          
       }
   });
   add(button);
   this.add(Box.createRigidArea(new Dimension(0, 10)));
 }

}
