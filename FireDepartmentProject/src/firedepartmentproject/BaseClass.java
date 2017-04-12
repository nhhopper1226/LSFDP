//package firedepartmentproject;
import javax.swing.JFrame;

public class BaseClass
{
   {
            
            super("Fire Log Helper ");
            
            ImageIcon icon = new ImageIcon(BaseClass.class.getResource("lsfd logo.png"));
            
            
            JTabbedPane tabbedPane = new JTabbedPane();
           
            JPanel panel1 = new JPanel();
          
              JLabel label1 = new JLabel ("<html><center>Introduction<br>This program is for the Lee’s Summit Fire Department when wanting to edit, create, delete, or renew reports.<br>" +
"The Search tab is used to search through existing reports, where you can view, edit or delete them.<br>" +
"The Create tab is used to create new reports.<br>" +
"The Alerts tab is used to make you aware of reports that are overdue for updating, with the number indicating how many reports are overdue.</html>", SwingConstants.RIGHT);
           tabbedPane.addTab("Home", null, panel1, "Panel one");
           
           panel1.add(label1);
           
            JTabbedPane tabbedPane2 = new JTabbedPane();
            JLabel label2 = new JLabel("Search", SwingConstants.CENTER);
            JPanel panel2 = new JPanel();
            panel2.add(label2);
            tabbedPane.addTab("Search", null, panel2, "Panel two");
            
            JTabbedPane tabbedPane3 = new JTabbedPane();
            JLabel label3 = new JLabel("New Log", SwingConstants.CENTER);
            JPanel panel3 = new JPanel();
            panel3.add(label3);
            tabbedPane.addTab("Create", null, panel3, "Panel three");
            
            JTabbedPane tabbedPane4 = new JTabbedPane();
            JLabel label4 = new JLabel("Overdue", SwingConstants.CENTER);
            JPanel panel4 = new JPanel();
            panel4.add(label4);
            tabbedPane.addTab("Alerts", null, panel4, "Panel four");
            
            
            
            
            
            add(tabbedPane);
            
            
            }

    
}
