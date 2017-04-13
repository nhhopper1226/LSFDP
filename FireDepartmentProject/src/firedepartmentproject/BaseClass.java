/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseclass;

/**
 *
 * @author tqyang0831
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BaseClass extends JFrame{
   
    private final JTextField textField;
    private final JTextArea textArea;
   public BaseClass()
   {
               super("Fire Inspection Report System");
               setLayout(new FlowLayout());
               setLayout(new BorderLayout());
                JTabbedPane tabbedPane = new JTabbedPane();
           
               JPanel panel1 = new JPanel();
          
               JLabel label1 = new JLabel ("<html><center>Introduction<br>This program is for the Lee’s Summit Fire Department when wanting to edit, create, delete, or renew reports.<br>" +
"The Search tab is used to search through existing reports, where you can view, edit or delete them.<br>" +
"The Create tab is used to create new reports.<br>" +
"The Alerts tab is used to make you aware of reports that are overdue for updating, with the number indicating how many reports are overdue.</html>", SwingConstants.RIGHT);
            tabbedPane.addTab("Home", null, panel1, "Panel one");
           
            panel1.add(label1);
           
            JTabbedPane tabbedPane2 = new JTabbedPane();
            JLabel label2 = new JLabel("Sort By... (Choose one)", SwingConstants.RIGHT);
            JPanel panel2 = new JPanel();
            JRadioButton option1 = new JRadioButton("Business Name");
            JRadioButton option2 = new JRadioButton("Date");
            JRadioButton option3 = new JRadioButton("Address");
            textField = new JTextField("Search Here", 50);
            String results = "Results will appear here.";
            textArea = new JTextArea(results, 10, 40);
            panel2.add(textField);
            panel2.add(label2);
            panel2.add(option1);
            panel2.add(option2);
            panel2.add(option3);
            panel2.add(new JScrollPane(textArea));
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
            
            add(tabbedPane, BorderLayout.CENTER);
            
            TextFieldHandler handler = new TextFieldHandler();
            textField.addActionListener(handler);
            
        }  
            

   private class TextFieldHandler implements ActionListener{
           
       @Override
       public void actionPerformed(ActionEvent event){
           String string = "";
           
           if (event.getSource() == textField)
               string = String.format("textField: %s", event.getActionCommand());
       }
   }
    
}
