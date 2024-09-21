package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class CenterPanelLeft extends JPanel {

  public CenterPanelLeft(){
    setBackground(Color.WHITE);
    setPreferredSize(new Dimension(270, 200));
    setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
    initComponents();
  }

  

private void initComponents(){
    this.add(Box.createRigidArea(new Dimension(0, 30)));
    addButtonMyDay();
    addButtonImportants();
    addButtonFinalize();
    addButtonPlanner();

}

  


   public void addButtonMyDay() {
    JButton button = new JButton("Mi día");
    button.setBackground(Color.WHITE);
    button.setBorderPainted(false);
    button.setForeground( Color.GRAY);
    button.setFont(new Font("Tahoma", Font.PLAIN, 14));
    String projectRoot = System.getProperty("user.dir");
    String imagePath = projectRoot + "/src/assest/sun.png";
    ImageIcon circle = new ImageIcon(imagePath);
    button.setIcon(circle);
   
    button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          PrincipalFrame.getInstance().addDiferrentPanel(2);
           
        }
    });
    add(button);
    this.add(Box.createRigidArea(new Dimension(0, 10)));
 }

 private void addButtonImportants() {
  JButton button = new JButton("Importantes");
  button.setBackground(Color.WHITE);
  button.setBorderPainted(false);
  button.setForeground( Color.GRAY);
  button.setFont(new Font("Tahoma", Font.PLAIN, 14));
  String projectRoot = System.getProperty("user.dir");
  String imagePath = projectRoot + "/src/assest/star.png";
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
private void addButtonFinalize() {
  JButton button = new JButton("Importantes");
  button.setBackground(Color.WHITE);
  button.setBorderPainted(false);
  button.setForeground( Color.GRAY);
  button.setFont(new Font("Tahoma", Font.PLAIN, 14));
  String projectRoot = System.getProperty("user.dir");
  String imagePath = projectRoot + "/src/assest/todo.png";
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

private void addButtonPlanner() {
  JButton button = new JButton("Importantes");
  button.setBackground(Color.WHITE);
  button.setBorderPainted(false);
  button.setForeground( Color.GRAY);
  button.setFont(new Font("Tahoma", Font.PLAIN, 14));
  String projectRoot = System.getProperty("user.dir");
  String imagePath = projectRoot + "/src/assest/planner.png";
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
