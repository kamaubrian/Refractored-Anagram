/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author root
 */
public class GameStart{
    
    
    static{
                        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
}
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(GameStart.class.getName()).log(Level.SEVERE, null, ex);
}
                
    }
    
    static mainView mainV =  new mainView();
     
    public static void main(String [] args){
         showMain();
        
    }
    public static JFrame showMain(){
        mainV.setVisible(true);
        mainV.setLocationRelativeTo(null);
        mainV.setResizable(false);
        return mainV;
    }
    
    
}
