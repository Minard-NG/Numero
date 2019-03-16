/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
/**
 *
 * @author Xquisite Genius
 */
public class Login extends JFrame{
    
    private final JLabel bglabel,titlelabel,logo;
    private final JLabel label1,label2,label3;
//    private final JPanel bgpanel;
    private final JTextField text;
    private final JPasswordField text1;
    private final JComboBox<String> cmb;
    private final JButton btnlogin;
    
    String[] logintype = {"CustomerCare","Technician"};
    
    public Login(){
    super("Numero UNO Services");
    setLayout(null);
    
    Icon icons = new ImageIcon(getClass().getResource("bck.jpg"));
    Icon icon = new ImageIcon(getClass().getResource("numero.png"));
    
    bglabel = new JLabel();
    bglabel.setIcon(icons);
    
    setContentPane(bglabel);
    
    logo = new JLabel();
    logo.setIcon(icon);
    logo.setBounds(305,20,50,50);
    add(logo);
    
    titlelabel = new JLabel();

    titlelabel.setFont(new Font("Algerian", 1, 25)); // NOI18N

    titlelabel.setForeground(new Color(255, 255, 255));

    titlelabel.setText("Numero UNO Services");
    titlelabel.setBounds(200,65,300,40);
    add(titlelabel);
    
    label1 = new JLabel("Username: ");
    label1.setFont(new Font("Century SchoolBook",Font.BOLD,16));
    label1.setForeground(new Color(255,255,255));
    label1.setBounds(100,150,100,20);
    add(label1);
    
    text = new JTextField();
    text.setBounds(250,150,250,25);
    add(text);
    
    label2 = new JLabel("Password: ");
    label2.setFont(new Font("Century SchoolBook",Font.BOLD,16));
    label2.setForeground(new Color(255,255,255));
    label2.setBounds(100,200,200,20);
    add(label2);
    
    text1 = new JPasswordField();
    text1.setBounds(250,200,250,25);
    add(text1);
    
    label3 = new JLabel("Login Type: ");
    label3.setFont(new Font("Century SchoolBook",Font.BOLD,16));
    label3.setForeground(new Color(255,255,255));
    label3.setBounds(100,250,200,20);
    add(label3);
    
    cmb = new JComboBox<>(logintype);
    cmb.setBounds(250,250,250,25);
    add(cmb);
    
    btnlogin = new JButton("Login");
    btnlogin.setMnemonic('o');
    btnlogin.setBounds(430,305,70,30);
    add(btnlogin);
    btnlogin.addActionListener((ActionEvent e)->{
        String username = text.getText();
        String password = text1.getText();
        
    if(username.trim().equals("Adolf Hitler") &&password.trim().equals("sysadmin")&&cmb.getSelectedIndex() == 0){    
    CustomerCare care = new CustomerCare();
    
    care.setBounds(100,50,1200,600);
    care.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    care.setResizable(false);
    care.setVisible(true);
    this.dispose();}
        else if(username.trim().equals("Adolf Hitler") && password.trim().equals("sysadmin") && cmb.getSelectedIndex() == 1){
    
    TechMenu Tmenu = new TechMenu();
        
    Tmenu.setSize(1200, 600);
    Tmenu.setLocationRelativeTo(null);
    Tmenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Tmenu.setResizable(false);
    Tmenu.setVisible(true);
    this.dispose();
    }else{
        JOptionPane.showMessageDialog(Login.this,"Invalid Username or Password\nHint: Check if the caps lock is On and try Again!","Error",JOptionPane.ERROR_MESSAGE);
        }
    });
    }
    
}
