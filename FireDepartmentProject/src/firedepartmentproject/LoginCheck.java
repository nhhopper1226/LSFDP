import javax.swing.JOptionPane;

public class LoginCheck 
{
    public boolean logVal()
    {
        boolean isVal = false;
        int loop = 0;
        String unA = "FireChief", unB = "Firefighter", pwA = "smokejumper", pwB = "laddermen";
        
        while (loop != 1)
        {   
            JOptionPane.showMessageDialog(null, "Usernames and passwords are shown in the following dialog for prototype purposes.", "Alert", JOptionPane.WARNING_MESSAGE);
            String username = JOptionPane.showInputDialog("Username for Chief: FireChief\nUsername for Other firefighters: Firefighter\nPlease input the username that goes who you are.");
            if (username.equals(unA))
            {
                while (loop != 1)
                {
                    String password = JOptionPane.showInputDialog("Password = smokejumper\nPlease input the password that goes with \"FireChief\".");
                    if (!password.equals(pwA))
                        JOptionPane.showMessageDialog(null, "Password associated with \"FireChief\" is incorrect.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    else
                    {
                        isVal = true;
                        loop = 1;
                        JOptionPane.showMessageDialog(null, "You have been authenticated as a \"FireChief\"!", "Success!", JOptionPane.PLAIN_MESSAGE);
                    }
                }
            }
            else if (username.equals(unB))
            {
                while (loop != 1)
                {
                    String password = JOptionPane.showInputDialog("Password = laddermen\nPlease input the password that goes with \"Firefighter\".");
                    if (!password.equals(pwB))
                        JOptionPane.showMessageDialog(null, "Password associated with \"Firefighter\" is incorrect.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    else
                    {
                        loop = 1;
                        JOptionPane.showMessageDialog(null, "You have been authenticated as a \"Firefighter\"!", "Success!", JOptionPane.PLAIN_MESSAGE);  
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Not a valid username.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        return isVal;
    }
}
