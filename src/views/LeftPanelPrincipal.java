package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class LeftPanelPrincipal extends JPanel {
   
    public LeftPanelPrincipal(){
     setBackground(Color.PINK);
    setPreferredSize(new Dimension(270, 20));
    setLayout(new BorderLayout());
    initComponents();

}

private void initComponents(){
    addNorthPanelLeft();  
    addCentralPanelLeft(); 
    addSouthPanelLeft();
}


private void addNorthPanelLeft(){
   
    NorthPanelLeft northPanel = new NorthPanelLeft();
    this.add(northPanel, BorderLayout.NORTH);
}
private void addCentralPanelLeft(){
   
    CenterPanelLeft centralPanel = new CenterPanelLeft();
    this.add(centralPanel, BorderLayout.CENTER);

}
private void addSouthPanelLeft(){
   
    SouthPanelLeft southPanel = new SouthPanelLeft();
    this.add(southPanel, BorderLayout.SOUTH);

}





}
