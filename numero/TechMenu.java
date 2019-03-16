/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Xquisite Genius
 */
public class TechMenu  extends JFrame{
   
    JTable tab;
    JLabel titlelabel,sidelabel,bcklabel;
    JPanel toppan,endpan;
   
    
    
   private JMenu file,operation,utility,help,game;
   private JMenuBar mbar;
   private JMenuItem createt,search,close,exit,view,hangman,calc;
   private JButton btnclose;
   
   Icon icon = new ImageIcon(getClass().getResource("work.png"));
   Icon titleIcon = new ImageIcon(getClass().getResource("worker.jpg"));
   Icon backgroundIcon = new ImageIcon(getClass().getResource("Tbck.jpg"));
   String[]columnNames = {"Name ","Ticket ID ","Priority ","Product Details ","Complaint ","Status"};
   boolean DEBUG = false;
    
   TechMenu(){
   super("Numero UNO Services- Technician's Menu");
   setLayout(null);
   
   bcklabel = new JLabel();
   bcklabel.setIcon(backgroundIcon);
   setContentPane(bcklabel);
   
   addMenu();
   
   titlelabel = new JLabel("Numero's Technician");
   titlelabel.setIcon(titleIcon);
   titlelabel.setHorizontalTextPosition(SwingConstants.RIGHT);
   titlelabel.setVerticalTextPosition(SwingConstants.BOTTOM);
   titlelabel.setFont(new java.awt.Font("Pristina", 10, 24));
   titlelabel.setForeground(new Color(255,255,255));
   titlelabel.setBounds(100,5,250,80);
   add(titlelabel);
  
   sidelabel = new JLabel("Complaints Come in Every Second...View Them Here",icon,SwingConstants.LEFT);
   sidelabel.setFont(new Font("Forte",4,15));
   sidelabel.setForeground(Color.red);
   sidelabel.setBounds(720, 25, 400, 50);
   add(sidelabel);
   
   MyTableModel model = new MyTableModel();
   tab = new JTable(CustomerCare.data,columnNames);
   tab.setModel(model);
   tab.setSize(1000,400);
   tab.setColumnSelectionAllowed(false);
   tab.setRowSelectionAllowed(true);
   tab.getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
//   tab.setRowSelectionAllowed(true);
   tab.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
   //tab.setRowHeight(30);
   tab.setIntercellSpacing(new Dimension(20,20));
   tab.setBackground(Color.LIGHT_GRAY);
//  TableColumn column = null;
//for (int i = 0; i < 5; i++) {
//    column = tab.getColumnModel().getColumn(i);
//    if (i == 2) {
//        column.setPreferredWidth(200); //third column is bigger
//    } else {
//        column.setPreferredWidth(50);
//    }
//}
//   tab.setForeground(Color.BLUE);
//   tab.setGridColor(Color.red);
//   tab.setShowHorizontalLines(false);
   
   
   JScrollPane sp = new JScrollPane(tab);
   sp.setBounds(100,90,1000,400);
   sp.setToolTipText("Complaints come in every second, view them here");
   add(sp);
   

   btnclose = new JButton("Close");
   btnclose.setBounds(1015, 500, 70, 25);
   btnclose.setToolTipText("Click to go back to the Login page.");
   btnclose.addActionListener((ActionEvent e )->{
    Login login = new Login();
    
    login.setSize(700, 475);
    login.setLocationRelativeTo(null);
    login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    login.setResizable(false);
    login.setVisible(true);
    this.dispose();
   });
   add(btnclose);
  
   
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
    
    search = new JMenuItem("Search");
    operation.add(search);
    
    close = new JMenuItem("Close");
    file.add(close);
    
    exit = new JMenuItem("Exit");
    exit.setMnemonic('x');
    exit.addActionListener((ActionEvent e)->{String[]columnNames = {"Name ","Ticket ID ","Priority ","Product Details ","Complaint ","Status"};
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
    
    public class MyTableModel extends AbstractTableModel{
        
     
     Object[][] data = Arrays.copyOf(CustomerCare.data,CustomerCare.data.length);
    
        public int getColumnCount() {
            return columnNames.length;
        }

        public int getRowCount() {
            return data.length;
        }

        public String getColumnName(int col) {
            return columnNames[col];
        }

        public Object getValueAt(int row, int col) {
            return data[row][col];
        }

        /*
         * JTable uses this method to determine the default renderer/
         * editor for each cell.  If we didn't implement this method,
         * then the last column would contain text ("true"/"false"),
         * rather than a check box.
         */
//       public Class getColumnClass(int c) {
//         return getValueAt(0, c).getClass();
//      }

        public boolean isCellEditable(int row, int col) {
            //Note that the data/cell address is constant,
            //no matter where the cell appears onscreen.
            if (col < 1) {
                return false;
            } else {
                return true;
            }
        }

        public void setValueAt(Object value, int row, int col) {
            if (DEBUG) {
                System.out.println("Setting value at " + row + "," + col
                                   + " to " + value
                                   + " (an instance of "
                                   + value.getClass() + ")");
            }

            data[row][col] = value;
            fireTableCellUpdated(row, col);

            if (DEBUG) {
                System.out.println("New value of data:");
                printDebugData();
            }
        }

        private void printDebugData() {
            int numRows = getRowCount();
            int numCols = getColumnCount();

            for (int i=0; i < numRows; i++) {
                System.out.print("    row " + i + ":");
                for (int j=0; j < numCols; j++) {
                    System.out.print("  " + CustomerCare.data[i][j]);
                }
                System.out.println();
            }
            System.out.println("--------------------------");
        }
    }
     
}
