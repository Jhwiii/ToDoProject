package views;
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class PrincipalFrame extends JFrame{

    private static PrincipalFrame instance;
    PanelMyDay panelMyDay;
    CentralPanelImage panelImage;

    public PrincipalFrame(){
      
            setTitle("To Do List");
            setExtendedState(MAXIMIZED_BOTH);
            setLayout(new BorderLayout());
           panelMyDay = new PanelMyDay();
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            initComponents();
            setVisible(true);
        
        
    }
    
    public static PrincipalFrame getInstance(){
   
        if (instance == null){
            instance = new PrincipalFrame();
        }
        return instance;
    }
    private void initComponents(){

        addPanelImage();
        addPanelPrincipalLeft();
        addDiferrentPanel(2);
    
   
    
    }
    private void addPanelImage(){
    
    CentralPanelImage panelImage = new CentralPanelImage();
    this.add(panelImage, BorderLayout.CENTER);
  
    }
    private void addPanelPrincipalLeft(){
       LeftPanelPrincipal principalPanelActivies = new LeftPanelPrincipal();
        this.add(principalPanelActivies, BorderLayout.WEST);
    }

    public void addDiferrentPanel(int number){
        CentralPanelImage panelImage = new CentralPanelImage();
        this.add(panelImage, BorderLayout.CENTER);
        
        panelMyDay.setVisible(false);
      
        switch (number) {
           case 1:{
                    
          break; }
            case 2:{
                panelMyDay.setVisible(true);
            panelImage.add(panelMyDay);

          
                break;}
        
            default:
            
                break;
        }

    }

}
