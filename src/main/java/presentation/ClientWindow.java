package presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientWindow {

    public static int HEIGHT = 300;
    public static int WIDTH = 400;

    JFrame frame = new JFrame("ClientWindow");
    JLabel firstNameLabel = new JLabel("First name");
    JTextField nameTextField = new JTextField();

    JLabel lastNameLabel = new JLabel("Last name");
    JTextField surnameTextField = new JTextField();

    JLabel emailLabel = new JLabel("Email");
    JTextField emailTextField = new JTextField();

    JLabel phoneLabel = new JLabel("Phone");
    JTextField phoneTextField = new JTextField();

    JLabel birthdayLabel = new JLabel("Age");
    JTextField birthdayTextField = new JTextField();

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
        panel1.setLayout(new GridLayout(7,2));


        panel1.add(firstNameLabel);
        panel1.add(nameTextField);
        panel1.add(lastNameLabel);
        panel1.add(surnameTextField);
        panel1.add(emailLabel);
        panel1.add(emailTextField);
        panel1.add(phoneLabel);
        panel1.add(phoneTextField);
        panel1.add(birthdayLabel);
        panel1.add(birthdayTextField);

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

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.dispose();
                InitialWindow initialWindow = new InitialWindow();
            }
        });
        frame.setContentPane(panel);
        frame.setVisible(true);
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
}
