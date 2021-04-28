package presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class OrderWindow {
    public static int HEIGHT = 300;
    public static int WIDTH = 400;

    JFrame frame = new JFrame("OrderWindow");
    JLabel orderIdLabel = new JLabel("Order ID");
    JTextField orderIdText = new JTextField();

    JLabel clientLabel = new JLabel("Client ID");
    JComboBox clientComboBox = new JComboBox();

    JLabel productLabel = new JLabel("Product ID");
    JComboBox productComboBox = new JComboBox();

    JLabel nrUnitsLabel = new JLabel("Nr. of products");
    JTextField nrUnitsTextField = new JTextField();

    JButton addButton = new JButton("Add");
    JButton deleteButton = new JButton("Delete");
    JButton editButton = new JButton("Edit");
    JButton showAllButton = new JButton("Show All");
    JButton backButton = new JButton("Back");

    public OrderWindow()
    {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(WIDTH,HEIGHT));
        frame.setLocationRelativeTo(null);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(5,2));

        panel1.add(orderIdLabel);
        panel1.add(orderIdText);
        panel1.add(clientLabel);
        panel1.add(clientComboBox);
        panel1.add(productLabel);
        panel1.add(productComboBox);
        panel1.add(nrUnitsLabel);
        panel1.add(nrUnitsTextField);

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

    public void setClientValues(String[] values)
    {
        for(String i: values)
            clientComboBox.addItem(i);
        frame.setVisible(true);
    }

    public void setProductValues(String[] values)
    {
        for(String i: values)
            productComboBox.addItem(i);
        frame.setVisible(true);
    }
    public String getClientID()
    {
        return (String) clientComboBox.getSelectedItem();
    }

    public String getProductID()
    {
        return (String) productComboBox.getSelectedItem();
    }

    public String getNrProducts()
    {
        return nrUnitsTextField.getText();
    }

    public String getOrderID()
    {
        return orderIdText.getText();
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
