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
    private final JTextArea textArea, textArea1;
    private JButton SubB;
   public BaseClass()
   {
            super("Fire Inspection Report System");
            JTabbedPane tabbedPane = new JTabbedPane();
           
            JPanel panel1 = new JPanel();
          
            JLabel label1 = new JLabel ("<html><center><font size = +4>LSFD Inspection Report System</center></font><br></html>");
            JLabel label6 = new JLabel ("<html>This program is for the Lee’s Summit Fire Department when wanting to edit, create, delete, or renew reports.<br>" +
            "The Search tab is used to search through existing reports, where you can view, edit or delete them.<br>" +
            "The Create tab is used to create new reports.<br>" +
            "The Alerts tab is used to make you aware of reports that are overdue for updating, with the number indicating how many reports are overdue.</html>");
            tabbedPane.addTab("Home", null, panel1, "Panel one");
            panel1.add(label1);
            panel1.add(label6);
            
            JPanel panel2 = new JPanel();
            JLabel label2 = new JLabel ("Search for the business name:");
            textField = new JTextField(80);
            textArea = new JTextArea(10, 80);
            SubB = new JButton("Search");
            JLabel label5 = new JLabel ("Search Results (Click Result to View Reports)");
            panel2.add(label2);
            panel2.add(textField);
            panel2.add(SubB);
            panel2.add(label5);
            panel2.add(new JScrollPane(textArea));
            tabbedPane.addTab("Search", null, panel2);
            

            JLabel label3 = new JLabel("New Log");
            JPanel panel3 = new JPanel();
            panel3.add(label3);
            tabbedPane.addTab("Create", null, panel3, "Panel three");

            JLabel label4 = new JLabel("Overdue: (Sorted by least recent)", SwingConstants.LEFT);
            JPanel panel4 = new JPanel();
            textArea1 = new JTextArea(20, 80);
            panel4.add(label4);
            panel4.add(new JScrollPane(textArea1));
            tabbedPane.addTab("Alerts(1)", null , panel4, "Panel four");
            
            add(tabbedPane);
            
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
        protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = BaseClass.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
   
   
}
