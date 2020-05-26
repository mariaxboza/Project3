import javax.swing.*;

public class Window { // Window class to use JOption Pane
    
    
    public void msg(String msg) { // Method to print the message in a window
        JOptionPane.showMessageDialog(null, msg);
    }

    public int option(String[] options, String msg) { // Method to print the array list as options with the String as well
        return JOptionPane.showOptionDialog(null, msg,// my message
                "Click a button", // dialog box title
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options, // possible options
                options[0]); // default option
    }

    public void println(String msg) { // Print the string
        System.out.println(msg);
    }

    public String input(String msg) { // Get an input on the window
        return JOptionPane.showInputDialog(msg);
    }


}
