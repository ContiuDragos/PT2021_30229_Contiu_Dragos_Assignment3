package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private InitialWindow initialWindow;
    public Controller(InitialWindow initialWindow)
    {
        this.initialWindow = initialWindow;
        initialWindow.addClientButtonListener(new ClientListener());
        initialWindow.addProductButtonListener(new ProductListener());
        initialWindow.addOrderButtonListener(new OrderListener());
    }
    public void addInitialListeners()
    {
        initialWindow.addClientButtonListener(new ClientListener());
        initialWindow.addProductButtonListener(new ProductListener());
        initialWindow.addOrderButtonListener(new OrderListener());
    }

    public void setInitialWindow(InitialWindow initialWindow) {
        this.initialWindow = initialWindow;
    }

    class ClientListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            initialWindow.frame.dispose();
            ClientWindow clientWindow = new ClientWindow();

        }
    }

    class ProductListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            initialWindow.frame.dispose();
            ProductWindow productWindow = new ProductWindow();
        }
    }

    class OrderListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            initialWindow.frame.dispose();
            OrderWindow orderWindow = new OrderWindow();
        }
    }

    class AddClientListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

        }
    }

    class EditClientListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

        }
    }

    class DeleteClientListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

        }
    }
}
