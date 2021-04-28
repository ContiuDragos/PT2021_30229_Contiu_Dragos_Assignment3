package presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductWindow {
    public static int HEIGHT = 300;
    public static int WIDTH = 400;

    JFrame frame = new JFrame("ProductWindow");
    JLabel nameLabel = new JLabel("Name");
    JTextField nameTextField = new JTextField();

    JLabel codeLabel = new JLabel("Code");
    JTextField codeTextField = new JTextField();

    JLabel priceLabel = new JLabel("Price");
    JTextField priceTextField = new JTextField();

    JLabel unitsLabel = new JLabel("Nr. of units");
    JTextField unitsTextField = new JTextField();

    JButton addButton = new JButton("Add");
    JButton deleteButton = new JButton("Delete");
    JButton editButton = new JButton("Edit");
    JButton showAllButton = new JButton("Show All");
    JButton backButton = new JButton("Back");

    public ProductWindow() {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(WIDTH,HEIGHT));
        frame.setLocationRelativeTo(null);


        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(5,2));

        panel1.add(codeLabel);
        panel1.add(codeTextField);
        panel1.add(nameLabel);
        panel1.add(nameTextField);
        panel1.add(priceLabel);
        panel1.add(priceTextField);
        panel1.add(unitsLabel);
        panel1.add(unitsTextField);

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

    public String getCode()
    {
        return codeTextField.getText();
    }

    public String getName()
    {
        return nameTextField.getText();
    }

    public String getPrice()
    {
        return priceTextField.getText();
    }

    public String getQuantity()
    {
        return unitsTextField.getText();
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
