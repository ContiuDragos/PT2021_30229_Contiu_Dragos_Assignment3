package presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InitialController {

    private InitialWindow initialWindow;
    public InitialController(InitialWindow initialWindow)
    {
        this.initialWindow = initialWindow;
        initialWindow.addClientButtonListener(new ClientListener());
        initialWindow.addProductButtonListener(new ProductListener());
        initialWindow.addOrderButtonListener(new OrderListener());
    }

    class ClientListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            initialWindow.frame.dispose();
            ClientWindow clientWindow = new ClientWindow();
            ClientController clientController = new ClientController(clientWindow);
        }
    }

    class ProductListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            initialWindow.frame.dispose();
            ProductWindow productWindow = new ProductWindow();
            ProductController productController = new ProductController(productWindow);
        }
    }

    class OrderListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            initialWindow.frame.dispose();
            OrderWindow orderWindow = new OrderWindow();
            OrderController orderController = new OrderController(orderWindow);
        }
    }

}
