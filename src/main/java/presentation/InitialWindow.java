package presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InitialWindow {
    public static int HEIGHT = 200;
    public static int WIDTH = 400;

    JFrame frame = new JFrame("InitialWindow");
    JPanel panel = new JPanel();

    JButton clientButton = new JButton("Client Window");
    JButton productButton = new JButton("Product Window");
    JButton orderButton = new JButton("Order Window");

    JLabel label = new JLabel("Choose one");

    public InitialWindow()
    {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(WIDTH,HEIGHT));
        frame.setLocationRelativeTo(null);

        panel.add(label);

        JPanel panelButton1 = new JPanel();
        JPanel panelButton2 = new JPanel();
        JPanel panelButton3 = new JPanel();
        JPanel panelButtons = new JPanel();

        panelButton1.add(clientButton);
        panelButton2.add(productButton);
        panelButton3.add(orderButton);

        panelButtons.add(panelButton1);
        panelButtons.add(panelButton2);
        panelButtons.add(panelButton3);

        panel.add(panelButtons);

        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public void addClientButtonListener(ActionListener action)
    {
        clientButton.addActionListener(action);
    }

    public void addProductButtonListener(ActionListener action)
    {
        productButton.addActionListener(action);
    }

    public void addOrderButtonListener(ActionListener action)
    {
        orderButton.addActionListener(action);
    }

}
