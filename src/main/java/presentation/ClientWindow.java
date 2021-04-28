package presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ClientWindow {

    public static int HEIGHT = 300;
    public static int WIDTH = 400;

    JFrame frame = new JFrame("ClientWindow");
    JLabel idLabel = new JLabel("ID");
    JTextField idTextField = new JTextField();

    JLabel firstNameLabel = new JLabel("First name");
    JTextField firstNameTextField = new JTextField();

    JLabel lastNameLabel = new JLabel("Last name");
    JTextField lastNameTextField= new JTextField();

    JLabel emailLabel = new JLabel("Email");
    JTextField emailTextField = new JTextField();

    JLabel phoneLabel = new JLabel("Phone");
    JTextField phoneTextField = new JTextField();

    JLabel ageLabel = new JLabel("Age");
    JTextField ageTextField = new JTextField();

    JButton addButton = new JButton("Add");
    JButton deleteButton = new JButton("Delete");
    JButton editButton = new JButton("Edit");
    JButton showAllButton = new JButton("Show All");
    JButton backButton = new JButton("Back");

    public ClientWindow()
    {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(WIDTH,HEIGHT));
        frame.setLocationRelativeTo(null);


        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(8,2));

        panel1.add(idLabel);
        panel1.add(idTextField);
        panel1.add(firstNameLabel);
        panel1.add(firstNameTextField);
        panel1.add(lastNameLabel);
        panel1.add(lastNameTextField);
        panel1.add(emailLabel);
        panel1.add(emailTextField);
        panel1.add(phoneLabel);
        panel1.add(phoneTextField);
        panel1.add(ageLabel);
        panel1.add(ageTextField);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.add(addButton);
        buttonsPanel.add(deleteButton);
        buttonsPanel.add(editButton);
        buttonsPanel.add(showAllButton);
        buttonsPanel.add(backButton);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,1));
        panel.add(panel1);
        panel.add(buttonsPanel);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public String getID()
    {
        return idTextField.getText();
    }
    public String getFirstName()
    {
        return firstNameTextField.getText();
    }
    public String getLastName()
    {
        return lastNameTextField.getText();
    }
    public String getEmail()
    {
        return emailTextField.getText();
    }
    public String getPhone()
    {
        return phoneTextField.getText();
    }
    public String getAge()
    {
        return ageTextField.getText();
    }
    void addInsertListener(ActionListener action)
    {
        addButton.addActionListener(action);
    }

    void addEditListener(ActionListener action)
    {
        editButton.addActionListener(action);
    }

    void addDeleteListener(ActionListener action)
    {
        deleteButton.addActionListener(action);
    }

    void addShowListener(ActionListener action)
    {
        showAllButton.addActionListener(action);
    }

    void addBackListener(ActionListener action)
    {
        backButton.addActionListener(action);
    }
}
