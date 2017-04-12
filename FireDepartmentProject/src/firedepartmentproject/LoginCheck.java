import javax.swing.JOptionPane;

public class LoginCheck 
{
    private final boolean logVal = false;
    public boolean (boolean logVal)
    {
        int loop = 0;
        while (loop != 1)
        {
            String username = JOptionPane.showInputDialog("Please input the username.");
            if (username.equals("FireChief"))
            {
                while (loop != 1)
                {
                String password = JOptionPane.showInputDialog("Please input the password that goes with \"FireChief\".");
                if (!password.equals("smokejumper"))
                    JOptionPane.showMessageDialog(null, "Password associated with \"FireChief\" is incorrect.", "ERROR", JOptionPane.ERROR_MESSAGE);
                else
                    logVal = true;
                    loop = 1;
                }
            }
            else if (username.equals("Firefighter"))
            {
                while (loop != 1)
                {
                    String password = JOptionPane.showInputDialog("Please input the password that goes with \"Firefighter\".");
                    if (!password.equals("laddermen"))
                        JOptionPane.showMessageDialog(null, "Password associated with \"Firefighter\" is incorrect.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    else
                        loop = 1;
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Not a valid username.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        return logVal;
    }
}
