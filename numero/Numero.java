/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero;
import javax.swing.UIManager;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author Xquisite Genius
 */
public class Numero {
    
    
    public static void main(String[]args){
        
        try{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(UnsupportedLookAndFeelException e){
        //handle
        }catch(ClassNotFoundException e){
        //handle
        }catch(InstantiationException e){
        //handle
        }catch(IllegalAccessException e){
        //handle
        }        
   Login login = new Login();
   
   //login.setSize(1200,600);//customercare
    login.setSize(700, 475);
    login.setLocationRelativeTo(null);
    login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    login.setResizable(false);
    login.setVisible(true);
    

 
//  TechMenu Tmenu = new TechMenu();
//        
//    Tmenu.setSize(1200, 600);
//    Tmenu.setLocationRelativeTo(null);
//    Tmenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    Tmenu.setResizable(false);
//    Tmenu.setVisible(true);
    }
}
