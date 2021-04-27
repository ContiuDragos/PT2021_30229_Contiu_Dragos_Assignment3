package presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderWindow {
    public static int HEIGHT = 300;
    public static int WIDTH = 400;

    JFrame frame = new JFrame("OrderWindow");
    JLabel clientLabel = new JLabel("Client name");
    JTextField clientTextField = new JTextField();

    JLabel productLabel = new JLabel("Product Name");
    JTextField productTextField = new JTextField();

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
        panel1.setLayout(new GridLayout(4,2));

        panel1.add(clientLabel);
        panel1.add(clientTextField);
        panel1.add(productLabel);
        panel1.add(productTextField);
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

        addListeners();

        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    private void addListeners()
    {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.dispose();
                InitialWindow initialWindow = new InitialWindow();
            }
        });
    }
}
