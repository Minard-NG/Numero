/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero;

import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.*;

/**
 *
 * @author Xquisite Genius
 */
public class CustomerCare extends JFrame {
    
    private JLabel bcklabel,lab1,lab2,lab3,lab4,lab5,lab6,lab7,lab8,lab9,lab10;
    private JTextField txt1,txt2,txt3,txt4,txt5,txt6;
    private JTextArea area1,area2;
    private JComboBox<String> cmb;
    private JMenu file,operation,utility,help,game;
    private JMenuBar mbar;
    private JMenuItem createt,search,close,exit,view,hangman,calc;
    private JButton btn,btn1;
    int ticketcounter = 0;
    static Object[][] data = new String[40][6];
    String [] datum  = new String[6];
    String[] priority = {"High","Medium","Low"};
    
    Icon icon = new ImageIcon(getClass().getResource("ccbck.jpg"));
    Icon icons = new ImageIcon(getClass().getResource("a.jpeg"));
    
    private static AtomicInteger idCounter = new AtomicInteger();
    
    public CustomerCare(){
    super("Numero - CustomerCare ");
    setLayout(null);
    
    bcklabel = new JLabel();
    bcklabel.setIcon(icon);
    setContentPane(bcklabel);
    
    addMenu();
    
    addComponents();
    }
    
     void addMenu(){
    mbar = new JMenuBar();
    setJMenuBar(mbar);
    
    file = new JMenu("File");
    mbar.add(file);
    
    operation = new JMenu("Operation");
    mbar.add(operation);
    
    utility = new JMenu("Utilities");
    mbar.add(utility);
    
    game = new JMenu("Game");
    utility.add(game);
    
    help = new JMenu("Help");
    mbar.add(help);
    
    createt = new JMenuItem("CreateTicket");
    operation.add(createt);
    createt.addActionListener((ActionEvent e)->{
    txt1.setText("201-364-"+createID());
    txt2.setText("");
    txt3.setText("");
    txt4.setText("");
    txt5.setText("");
    txt6.setText("");
    area1.setText("");
    area2.setText("");
    });
    
    search = new JMenuItem("Search");
    operation.add(search);
    search.addActionListener((ActionEvent e )->{
        TechMenu login = new TechMenu();//wil change sumtin here soon
        
    login.setSize(1200, 600);
    login.setLocationRelativeTo(null);
    login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    login.setResizable(false);
    login.setVisible(true);
    });
    
    close = new JMenuItem("Close");
    file.add(close);
    
    exit = new JMenuItem("Exit");
    exit.setMnemonic('x');
    exit.addActionListener((ActionEvent e)->{
    System.exit(0);
    });
    file.add(exit);
    
    hangman = new JMenuItem("Hangman");
    game.add(hangman);
    
    calc = new JMenuItem("Calculator");
    utility.add(calc);
    
    view = new JMenuItem("View");
    operation.add(view);
   }
     
     public static String createID(){
     return String.valueOf(idCounter.getAndIncrement());
     }
     void addComponents(){
         
    lab1 = new JLabel("CustomerCare");
    lab1.setFont(new java.awt.Font("Bradley Hand ITC", 10, 24));
    lab1.setForeground(new Color(255,255,255));
    lab1.setIcon(icons);
    lab1.setVerticalTextPosition(SwingConstants.BOTTOM);
    lab1.setHorizontalTextPosition(SwingConstants.CENTER);
    lab1.setBounds(480,18,200,90);
    add(lab1);
    
    lab2 = new JLabel("Ticket ID:");
    lab2.setFont(new Font("Century SchoolBook",Font.BOLD,12));
    lab2.setForeground(new Color(255,255,255));
    lab2.setBounds(100,110,120,20);
    add(lab2);
    
    lab3 = new JLabel("Customer Name: ");
    lab3.setFont(new Font("Century SchoolBook",Font.BOLD,12));
    lab3.setForeground(new Color(255,255,255));
    lab3.setBounds(100,160,120,20);
    add(lab3);
    
    lab4 = new JLabel("Customer Address: ");
    lab4.setFont(new Font("Century SchoolBook",Font.BOLD,12));
    lab4.setForeground(new Color(255,255,255));
    lab4.setBounds(100,310,120,20);
    add(lab4);
    
    lab5 = new JLabel("Product Detail: ");
    lab5.setFont(new Font("Century SchoolBook",Font.BOLD,12));
    lab5.setForeground(new Color(255,255,255));
    lab5.setBounds(100,210,120,20);
    add(lab5);
    
    lab6 = new JLabel("Urgency: ");
    lab6.setFont(new Font("Century SchoolBook",Font.BOLD,12));
    lab6.setForeground(new Color(255,255,255));
    lab6.setBounds(100,410,120,20);
    add(lab6);
    
    lab7 = new JLabel("Date: ");
    lab7.setFont(new Font("Century SchoolBook",Font.BOLD,12));
    lab7.setForeground(new Color(255,255,255));
    lab7.setBounds(630,110,120,20);
    add(lab7);
    
    lab8 = new JLabel("Phone Number: ");
    lab8.setFont(new Font("Century SchoolBook",Font.BOLD,12));
    lab8.setForeground(new Color(255,255,255));
    lab8.setBounds(630,160,120,20);
    add(lab8);
    
    lab9 = new JLabel("Customer's Email: ");
    lab9.setFont(new Font("Century SchoolBook",Font.BOLD,12));
    lab9.setForeground(new Color(255,255,255));
    lab9.setBounds(630,210,120,20);
    add(lab9);
    
    lab10 = new JLabel("Complaint: ");
    lab10.setFont(new Font("Century SchoolBook",Font.BOLD,11));
    lab10.setForeground(new Color(255,255,255));
    lab10.setBounds(630,310,120,20);
    add(lab10);
    
    
    txt1 = new JTextField();
    txt1.setText("201-364-"+createID());
    txt1.setBounds(220,110,100,20);
    add(txt1);
    
    txt2 = new JTextField();;
    txt2.setBounds(220,160,250,22);
    add(txt2);
    
    txt3 = new JTextField();
    txt3.setBounds(220,210,250,22);
    add(txt3);
    
    txt4 = new JTextField();
    txt4.setBounds(750,110,100,20);
    add(txt4);
    
    txt5 = new JTextField();
    txt5.setBounds(750,160,250,20);
    add(txt5);
    
    txt6 = new JTextField();
    txt6.setBounds(750,210,250,22);
    add(txt6);
    
    
    area1 = new JTextArea();
    area1.setBounds(220,260,250,120);
    add(area1);
    
    area2 = new JTextArea();
    area2.setBounds(750,260,250,120);
    add(area2);
    
    
    
    cmb = new JComboBox<>(priority);
    cmb.setBounds(220,410,250,22);
    add(cmb);
    
     for(int i = 0; i<data.length;i++){
   for(int j = 0; j<data[i].length; j++){
//       if(j == data[i].length-1){
//           data[i][j] = false;
//       
//       }else
   data[i][j] = "Null";
   }
   }
    
    btn = new JButton("Save");
    btn.setToolTipText("Make sure everything gets to the database...Click Save!");
    btn.setBounds(300,470,70,30);
    add(btn);
    btn.addActionListener(new ActionListener(){
         
         public void actionPerformed(ActionEvent e){
             if(ticketcounter == 40){
             JOptionPane.showMessageDialog(CustomerCare.this,"DataBase is Full...Complaint will be saved Later!","Error",JOptionPane.ERROR_MESSAGE);
             }else{
        datum[0] = txt2.getText();
        datum[1] = txt1.getText();
        datum[2] = cmb.getSelectedItem().toString();
        datum[3] = txt3.getText();
        datum[4] = area2.getText();
        
        
        
         for(int r = ticketcounter; r==ticketcounter; r++){
         for(int j = 0; j<6; j++){
             data[r][j] =datum[j]; 
          }
         }
         ticketcounter++;
    JOptionPane.showMessageDialog(CustomerCare.this, "Complaint Saved Successfully", "Numero-CustomerCare", JOptionPane.INFORMATION_MESSAGE);
    }}});
    
    btn1 = new JButton("Close");
    btn1.setToolTipText("Click close to go to the Login Page.");
    btn1.setBounds(800,470,70,30);
    add(btn1);
    btn1.addActionListener((ActionEvent e)->{
    this.dispose();
    Login login = new Login();
    
    login.setSize(700, 475);
    login.setLocationRelativeTo(null);
    login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    login.setResizable(false);
    login.setVisible(true);
    });
    
    
   //adding action listeenr to the hangman menu item
   hangman.addActionListener((ActionEvent)->{
        Menu obj = new Menu();
        obj.addComponent();
   });

    
}
}
