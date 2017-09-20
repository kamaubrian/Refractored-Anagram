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
import Model.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author Brian-Kamau
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
    
    static StaticWords wordmodel = new StaticWords();
    static mainView mainV =  new mainView();
    static nextWordHandler words = new nextWordHandler();
    static checkWordHandler checkword = new checkWordHandler();
    static int wordindex=0;    
     
    public static void main(String [] args){
         showMain();
         
    }
    public static JFrame showMain(){
        mainV.setVisible(true);
        mainV.setSize(new Dimension(470,305));
        mainV.setLocationRelativeTo(null);
        mainV.setResizable(false);
        mainV.getScrambledWord().setEditable(false);
        String initialvalue=wordmodel.getScrambledword(0).toLowerCase();
        mainV.getScrambledWord().setText(initialvalue);
        mainV.getAnswer().addActionListener(checkword);
        mainV.getnextWord().addActionListener(words);
        return mainV;
    }
    
    static class nextWordHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
             wordindex= (wordindex+1); //% wordmodel.getSize();
             mainV.getScrambledWord().setText(wordmodel.getScrambledword(wordindex));
            
           
            }catch(Exception ex){
                System.out.println("Getting Next Word Exception"+ex.getMessage());
            }
        }
        
    }
    
    static class checkWordHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                if(!mainV.getUserWord().getText().isEmpty()){
                if(wordmodel.Correct(wordindex, mainV.getUserWord().getText())==true){
                    mainV.giveAnswer().setText("Correct Answer, Click Next for Next Word");
                    mainV.getUserWord().setText("");
                }else{
                   mainV.giveAnswer().setText("InCorrect Answer,Try Again");
                   mainV.getUserWord().setText("");

                }
                }else{
                    JOptionPane.showMessageDialog(mainV,"Please Enter Word");
                }
                           
        }catch(Exception ex){
            System.out.println("Checking Word Handler"+ex.getMessage());
    }       
        }
    }
    
}
