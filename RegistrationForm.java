import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

interface RegistrationListener {
    void onSubmit(String name, String gender, String password); //fatherName, image
}

public class RegistrationForm extends JFrame implements RegistrationListener{
    
    private JTextField nameField;
    private JComboBox<String> genderComboBox;
    private JPasswordField passwordField;
    //fatherName

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(1500, 800);

        // Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // // Set the JFrame size to the screen size
        // setSize(screenSize.width, screenSize.height);
        // // Optional: Set the JFrame to fullscreen mode
        // setExtendedState(JFrame.MAXIMIZED_BOTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 10, 10));
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));


        nameField = new JTextField();
        // fatherName

        String[] genders = {"Male", "Female", "Other"};
        genderComboBox = new JComboBox<>(genders);

        passwordField = new JPasswordField();

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String gender = (String) genderComboBox.getSelectedItem();
                String password = new String(passwordField.getPassword());
                //fatherName
                onSubmit(name, gender, password);
            }
        });

        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        //fatherName
        panel.add(new JLabel("Gender:"));
        panel.add(genderComboBox);

        panel.add(new JLabel("Password:"));
        panel.add(passwordField);

        panel.add(new JLabel());
            buttonPanel.add(new JLabel());
            buttonPanel.add(submitButton);
        panel.add(buttonPanel);

        add(panel);
        setVisible(true);
    }

    public void onSubmit(String name, String gender, String password) {
        JOptionPane.showMessageDialog(this,
                "Name: " + name + "\n" +
                "Gender: " + gender + "\n" +
                "Password: " + password,
                //fatherName
                "Registration Successful", JOptionPane.INFORMATION_MESSAGE);
    }
}
