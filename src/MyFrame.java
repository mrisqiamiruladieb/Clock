import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
    
    //construct
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Clock Program");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setResizable(false);
        this.setVisible(true);
    }
    
}
