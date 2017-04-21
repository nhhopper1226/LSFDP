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
            
            private final JTextField textField1;
    private final JTextField textField2;
    private final JTextField textField3;
    private final JTextField textField5;
    private final JTextField textField6;
    private final JTextField textField7;
    private final JTextField textField8;
    private final JTextField textField9;
    private final JTextField textField10;
    private final JTextField textField11;
    private final JTextField textField12;
    private final JTextField textField13;
    private final JTextField textField16;
    private final JTextField textField18;
    private final JTextField textField19;
    private final JTextField textField20;
    private final JTextField textField21;
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;
    private final JLabel label4;
    private final JLabel label5;
    private final JLabel label6;
    private final JLabel label7;
    private final JLabel label8;
    private final JLabel label9;
    private final JLabel label10;
    private final JLabel label11;
    private final JLabel label12;
    private final JLabel label13;
    private final JLabel label14;
    private final JLabel label15;
    private final JLabel label16;
    private final JLabel label17;
    private final JLabel label18;
    private final JLabel label19;
    private final JLabel label20;
    private final JLabel label21;
    private final JLabel label22;
    private final JLabel label23;
    private final JLabel label24;
    private final JLabel label25;
    private final JLabel label26;
    private final JLabel label27;
    private final JLabel label28;
    private final JLabel label29;
    private final JLabel label30;
    private final JLabel label31;
    private final JLabel label32;
    private final JLabel label33;
    private final JLabel label34;
    private final JLabel label35;
    private final JLabel label36;
    private final JLabel label37;
    private final JLabel label38;
    private final JLabel label39;
    private final JLabel label40;
    private final JCheckBox checkBox1;
    private final JCheckBox checkBox2;
    private final JCheckBox checkBox3;
    private final JCheckBox checkBox4;
    private final JCheckBox checkBox5;
    private final JCheckBox checkBox6;
    private final JCheckBox checkBox7;
    private final JCheckBox checkBox8;
    private final JCheckBox checkBox9;
    private final JCheckBox checkBox10;
    private final JCheckBox checkBox11;
    private final JCheckBox checkBox12;
    private final JCheckBox checkBox13;
    private final JCheckBox checkBox14;
    private final JCheckBox checkBox15;
    private final JCheckBox checkBox16;
    private final JCheckBox checkBox17;
    private final JCheckBox checkBox18;
    private final JCheckBox checkBox19;
    private final JCheckBox checkBox20;
    private final JCheckBox checkBox21;
    private final JCheckBox checkBox22;
    private final JCheckBox checkBox23;
    private final JCheckBox checkBox24;
    private final JCheckBox checkBox25;
    private final JCheckBox checkBox26;
    private final JCheckBox checkBox27;
    private final JCheckBox checkBox28;
    private final JCheckBox checkBox29;
    private final JCheckBox checkBox30;
    private final JCheckBox checkBox31;
    private final JCheckBox checkBox32;
    private final JCheckBox checkBox33;
    private final JCheckBox checkBox34;
    private final JCheckBox checkBox35;
    private final JCheckBox checkBox36;
    private final JCheckBox checkBox37;
    private final JCheckBox checkBox38;
    private final JCheckBox checkBox39;
    private final JCheckBox checkBox40;
    private final JCheckBox checkBox41;
    private final JCheckBox checkBox42;
    private final JCheckBox checkBox43;
    private final JCheckBox checkBox44;
    private final JCheckBox checkBox45;
    private final JCheckBox checkBox46;
    private final JCheckBox checkBox47;
    private final JCheckBox checkBox48;
    private final JCheckBox checkBox49;
    private final JCheckBox checkBox50;
    private final JCheckBox checkBox51;
    private final JCheckBox checkBox52;
    private final JCheckBox checkBox53;
    private final JCheckBox checkBox54;
    private final JCheckBox checkBox55;
    private final JCheckBox checkBox56;
    private final JCheckBox checkBox57;
    private final JCheckBox checkBox58;
    private final JCheckBox checkBox59;
    private final JCheckBox checkBox60;
    private final JCheckBox checkBox61;
    private final JCheckBox checkBox62;
    private final JCheckBox checkBox63;
    private final JCheckBox checkBox64;
    private final JCheckBox checkBox65;
    private final JCheckBox checkBox66;
    private final JCheckBox checkBox67;
    private final JCheckBox checkBox68;
    private final JCheckBox checkBox69;
    private final JCheckBox checkBox70;
    private final JCheckBox checkBox71;
    private final JCheckBox checkBox72;
    private final JCheckBox checkBox73;
    private final JCheckBox checkBox74;
    private final JCheckBox checkBox75;
    private final JCheckBox checkBox76;
    private final JCheckBox checkBox77;
    private final JCheckBox checkBox78;
    private final JCheckBox checkBox79;
    private final JCheckBox checkBox80;
    private final JCheckBox checkBox81;
    private final JCheckBox checkBox82;
    private final JCheckBox checkBox83;
    private final JCheckBox checkBox84;
    private final JCheckBox checkBox85;
    private final JCheckBox checkBox86;
    private final JCheckBox checkBox87;
    private final JCheckBox checkBox88;
    private final JCheckBox checkBox89;
    private final JCheckBox checkBox90;
    private final JCheckBox checkBox91;
    private final JCheckBox checkBox92;
    private final JCheckBox checkBox93;
    private final JCheckBox checkBox94;
    private final JCheckBox checkBox95;
    private final JCheckBox checkBox96;
    private final JCheckBox checkBox97;
    private final JCheckBox checkBox98;
    private final JCheckBox checkBox99;
    private final JCheckBox checkBox100;
    private final JCheckBox checkBox101;
    private final JCheckBox checkBox102;
    private final JCheckBox checkBox103;
    private final JCheckBox checkBox104;
    private final JCheckBox checkBox105;
    private final JCheckBox checkBox106;
    private final JCheckBox checkBox107;
    private final JCheckBox checkBox108;
    private final JCheckBox checkBox109;
    private final JCheckBox checkBox110;
    private final JCheckBox checkBox111;
    private final JCheckBox checkBox112;
    private final JCheckBox checkBox113;
    private final JCheckBox checkBox114;
    private final JCheckBox checkBox115;
    private final JCheckBox checkBox116;
    private final JCheckBox checkBox117;
    private final JCheckBox checkBox118;
    private final JCheckBox checkBox119;
    private final JCheckBox checkBox120;
    private final JCheckBox checkBox121;
    private final JCheckBox checkBox122;
    private final JCheckBox checkBox123;
    private final JCheckBox checkBox124;
    private final JCheckBox checkBox125;
    private final JCheckBox checkBox126;
    private final JCheckBox checkBox127;
    private final JCheckBox checkBox128;
    private final JCheckBox checkBox129;
    private final JCheckBox checkBox130;
    private final JCheckBox checkBox131;
    private final JCheckBox checkBox132;
    private final JCheckBox checkBox133;
    private final JCheckBox checkBox134;
    private final JCheckBox checkBox135;
    private final JCheckBox checkBox136;
    private final JCheckBox checkBox137;
    private final JCheckBox checkBox138;
    private final JCheckBox checkBox139;
    private final JCheckBox checkBox140;
    private final JCheckBox checkBox141;
    private final JCheckBox checkBox142;
    private final JCheckBox checkBox143;
    private final JCheckBox checkBox144;
    private final JCheckBox checkBox145;
    private final JCheckBox checkBox146;
    private final JCheckBox checkBox147;
    private final JCheckBox checkBox148;
    private final JCheckBox checkBox149;
    private final JCheckBox checkBox150;
    private final JCheckBox checkBox151;
    private final JCheckBox checkBox152;
    
    
    public CreateTab()
    {
        super("Create");
        setLayout(new FlowLayout());
       /* layout = new GridBagLayout();
        setLayout(layout);
        constraints = new GridBagConstraints();*/
        
        label1 = new JLabel();
        label1.setText("Business Name:");
        add(label1);
       
        textField1 = new JTextField(44);
        add(textField1);
        
        
        label2 = new JLabel("Phone:");
        add(label2);
        
        textField2 = new JTextField(74);
        add(textField2);
        
        label3 = new JLabel("Address:");
        add(label3);
        
        textField3 = new JTextField(30);
        add(textField3);
        
        label4 = new JLabel("Emergency Contact Information");
        add(label4);
        
        label5 = new JLabel("Name:");
        add(label5);
        
        textField5 = new JTextField(35);
        add(textField5);
        
        label6 = new JLabel("Contact Type:");
        add(label6);
        
        textField6 = new JTextField(35);
        add(textField6);
        
        label7 = new JLabel("Number:");
        add(label7);
        
        textField7 = new JTextField(35);
        add(textField7);
        
        label8 = new JLabel("Type of Phone:");
        add(label8);
        
        textField8 = new JTextField(15);
        add(textField8);
        
        label9 = new JLabel("Occupancy Class:");
        add(label9);
        
        textField9 = new JTextField(15);
        add(textField9);
        
        label10 = new JLabel("Hazard Classification:");
        add(label10);
        
        textField10 = new JTextField(15);
        add(textField10);
        
        label11 = new JLabel("District:");
        add(label11);
        
        textField11 = new JTextField(15);
        add(textField11);
        
        label12 = new JLabel("PFA#:");
        add(label12);
        
        textField12 = new JTextField(15);
        add(textField12);
        
        label13 = new JLabel("Fire Alarm Panel:");
        add(label13);
        
        textField13 = new JTextField(15);
        add(textField13);
        
        label14 = new JLabel("Active:");
        add(label14);
        
        checkBox1 = new JCheckBox("P");
        checkBox2 = new JCheckBox("F");
        checkBox3 = new JCheckBox("NA");
        add(checkBox1);
        add(checkBox2);
        add(checkBox3);
        
        label15 = new JLabel("Sys Normal:");
        add(label15);
        
        checkBox4 = new JCheckBox("P");
        checkBox5 = new JCheckBox("F");
        checkBox6 = new JCheckBox("NA");
        add(checkBox4);
        add(checkBox5);
        add(checkBox6);
        
        label16 = new JLabel("Panel/Pad Location:");
        add(label16);
        
        textField16 = new JTextField(15);
        add(textField16);
        
        checkBox7 = new JCheckBox("No Violations Noted");
        add(checkBox7);
        
        label17 = new JLabel("Inspection Narrative");
        add(label17);
        
        checkBox8 = new JCheckBox("All Violations Noted");
        add(checkBox8);
        
        label18 = new JLabel("1st Inspection:");
        add(label18);
        
        textField18 = new JTextField(15);
        add(textField18);
        
        label19 = new JLabel("2nd Inspection:");
        add(label19);
        
        textField19 = new JTextField(15);
        add(textField19);
        
        label20 = new JLabel("3rd Inspection:");
        add(label20);
        
        textField20 = new JTextField(15);
        add(textField20);
        
        label21 = new JLabel("4th Inpection:");
        add(label21);
        
        textField21 = new JTextField(15);
        add(textField21);
        
        label22 = new JLabel("Exit Door/Exit Ways");
        add(label22);
        checkBox9 = new JCheckBox("P");
        checkBox10 = new JCheckBox("P");
        checkBox11 = new JCheckBox("Obstruction");
        add(checkBox9);
        add(checkBox10);
        add(checkBox11);
        
        label23 = new JLabel("Exit sign/Emer. Lights");
        add(label23);
        
        label24 = new JLabel("Fire Doors");
        add(label24);
        
        label25 = new JLabel("Fire Extinguishers");
        add(label25);
        
        label26 = new JLabel("Electrical");
        add(label26);
        
        label27 = new JLabel("Storage");
        add(label27);
        
        label28 = new JLabel("Flammable/Comb.");
        add(label28);
        
        label29 = new JLabel("Compressed Gases");
        add(label29);
        
        label30 = new JLabel("Spray Finishing Oper.");
        add(label30);
        
        label31 = new JLabel("Sprinkler/Standpipe");
        add(label31);
        
        label32 = new JLabel("Hood Ext. System");
        add(label32);
        
        label33 = new JLabel("Occupant Load");
        add(label33);
        
        label34 = new JLabel("Address");
        add(label34);
        
        label35 = new JLabel("Fire Dpt. Access");
        add(label35);
        
        label36 = new JLabel("Fire Dept. Connection");
        add(label36);
        
        label37 = new JLabel("Elevator");
        add(label37);
        
        label38 = new JLabel("Propane");
        add(label38);
        
        label39 = new JLabel("Other");
        add(label39);
        
        label40 = new JLabel("Additional Violations/Comments:");
        add(label40);
        
        
        checkBox12 = new JCheckBox();
        checkBox13 = new JCheckBox();
        checkBox14 = new JCheckBox("Locks/Panic");
        checkBox15 = new JCheckBox();
        checkBox16 = new JCheckBox();
        checkBox17 = new JCheckBox("Locks/Panic Hardware");
        checkBox18 = new JCheckBox();
        checkBox19 = new JCheckBox();
        checkBox20 = new JCheckBox("Exit Signs Illuminated");
        checkBox21 = new JCheckBox();
        checkBox22 = new JCheckBox();
        checkBox23 = new JCheckBox("Emer. Lights Working");
        checkBox24 = new JCheckBox();
        checkBox25 = new JCheckBox();
        checkBox26 = new JCheckBox("Maintained/Close Fully");
        checkBox27 = new JCheckBox();
        checkBox28 = new JCheckBox();
        checkBox29 = new JCheckBox("Unapproved Open Devices");
        checkBox30 = new JCheckBox();
        checkBox31 = new JCheckBox();
        checkBox32 = new JCheckBox("Clear of Obstructions");
        checkBox33 = new JCheckBox();
        checkBox34 = new JCheckBox();
        checkBox35 = new JCheckBox("Minimum 2A10BC");
        checkBox36 = new JCheckBox();
        checkBox37 = new JCheckBox();
        checkBox38 = new JCheckBox("Max of 75 travel dist.");
        checkBox39 = new JCheckBox();
        checkBox40 = new JCheckBox();
    checkBox41 = new JCheckBox("Annual Inspection");
    checkBox42 = new JCheckBox();
    checkBox43 = new JCheckBox();
    checkBox44 = new JCheckBox("Access");
    checkBox45 = new JCheckBox();
    checkBox46 = new JCheckBox();
    checkBox47 = new JCheckBox("Extension Cords");
    checkBox48 = new JCheckBox();
    checkBox49 = new JCheckBox();
    checkBox50 = new JCheckBox("Multi Plug Adapters");
    checkBox51 = new JCheckBox();
    checkBox52 = new JCheckBox();
    checkBox53 = new JCheckBox("Open Boxes, Switches");
    checkBox54 = new JCheckBox();
    checkBox55 = new JCheckBox();
    checkBox56 = new JCheckBox("Opening in Electircal Panel");
    checkBox57 = new JCheckBox();
    checkBox58 = new JCheckBox();
    checkBox59 = new JCheckBox("36in. clearance from storage");
    checkBox60 = new JCheckBox();
    checkBox61 = new JCheckBox();
    checkBox62 = new JCheckBox("Housekeeping");
    checkBox63 = new JCheckBox();
    checkBox64 = new JCheckBox();
    checkBox65 = new JCheckBox("24in. below ceiling");
    checkBox66 = new JCheckBox();
    checkBox67 = new JCheckBox();
    checkBox68 = new JCheckBox("18in. below sprinklers");
    checkBox69 = new JCheckBox();
    checkBox70 = new JCheckBox();
    checkBox71 = new JCheckBox("under Stairs");
    checkBox72 = new JCheckBox();
    checkBox73 = new JCheckBox();
    checkBox74 = new JCheckBox("Close to ignition source");
    checkBox75 = new JCheckBox();
    checkBox76 = new JCheckBox();
    checkBox77 = new JCheckBox("704 Placard");
    checkBox78 = new JCheckBox();
    checkBox79 = new JCheckBox();
    checkBox80 = new JCheckBox("MSDS on premises");
    checkBox81 = new JCheckBox();
    checkBox82 = new JCheckBox();
    checkBox83 = new JCheckBox("Non-smoking signs");
    checkBox84 = new JCheckBox();
    checkBox85 = new JCheckBox();
    checkBox86 = new JCheckBox("Secured");
    checkBox87 = new JCheckBox("P");
    checkBox88 = new JCheckBox("P");
    checkBox89 = new JCheckBox("P");
    checkBox90 = new JCheckBox("P");
    checkBox91 = new JCheckBox("P");
    checkBox92 = new JCheckBox("P");
    checkBox93 = new JCheckBox("P");
    checkBox94 = new JCheckBox("P");
    checkBox95 = new JCheckBox("P");
    checkBox96 = new JCheckBox("P");
    checkBox97 = new JCheckBox("P");
    checkBox98 = new JCheckBox("P");
    checkBox99 = new JCheckBox("P");
    checkBox100 = new JCheckBox("P");
    checkBox101 = new JCheckBox("P");
    checkBox102 = new JCheckBox("P");
    checkBox103 = new JCheckBox("P");
    checkBox104 = new JCheckBox("P");
    checkBox105 = new JCheckBox("P");
    checkBox106 = new JCheckBox("P");
    checkBox107 = new JCheckBox("P");
    checkBox108 = new JCheckBox("P");
    checkBox109 = new JCheckBox("P");
    checkBox110 = new JCheckBox("P");
    checkBox111 = new JCheckBox("P");
    checkBox112 = new JCheckBox("P");
    checkBox113 = new JCheckBox("P");
    checkBox114 = new JCheckBox("P");
    checkBox115 = new JCheckBox("P");
    checkBox116 = new JCheckBox("P");
    checkBox117 = new JCheckBox("P");
    checkBox118 = new JCheckBox("P");
    checkBox119 = new JCheckBox("P");
    checkBox120 = new JCheckBox("P");
    checkBox121 = new JCheckBox("P");
    checkBox122 = new JCheckBox("P");
    checkBox123 = new JCheckBox("P");
    checkBox124 = new JCheckBox("FDC caps in place");
    checkBox125 = new JCheckBox("P");
    checkBox126 = new JCheckBox("P");
    checkBox127 = new JCheckBox("FDC Identified");
    checkBox128 = new JCheckBox("P");
    checkBox129 = new JCheckBox("P");
    checkBox130 = new JCheckBox("FDC access is unobstructed");
    checkBox131 = new JCheckBox("P");
    checkBox132 = new JCheckBox("P");
    checkBox133 = new JCheckBox("Override Keys On-Site");
    checkBox134 = new JCheckBox("P");
    checkBox135 = new JCheckBox("P");
    checkBox136 = new JCheckBox("704 Placards");
    checkBox137 = new JCheckBox("P");
    checkBox138 = new JCheckBox("P");
    checkBox139 = new JCheckBox("Permit On-Site");
    checkBox140 = new JCheckBox("P");
    checkBox141 = new JCheckBox("P");
    checkBox142 = new JCheckBox("Impact bollards");
    checkBox143 = new JCheckBox("P");
    checkBox144 = new JCheckBox("P");
    checkBox145 = new JCheckBox("Other Violations Noted- Use box below to describe");
    checkBox146 = new JCheckBox("P");
    checkBox147 = new JCheckBox("P");
    checkBox148 = new JCheckBox("P");
    checkBox149 = new JCheckBox("P");
    checkBox150 = new JCheckBox("P");
    checkBox151 = new JCheckBox("P");
    checkBox152 = new JCheckBox("P");
        
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
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
