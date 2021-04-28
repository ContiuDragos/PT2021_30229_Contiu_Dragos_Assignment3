package start;

import presentation.InitialController;
import presentation.InitialWindow;

public class Start {

    public static void main(String[] args)
    {
        InitialWindow initialWindow = new InitialWindow();
        InitialController controller = new InitialController(initialWindow);
    }
}
