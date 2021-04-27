package start;

import presentation.Controller;
import presentation.InitialWindow;

public class Start {

    public static void main(String[] args)
    {
        InitialWindow initialWindow = new InitialWindow();
        Controller controller = new Controller(initialWindow);
    }
}
