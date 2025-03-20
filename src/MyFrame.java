import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;

public class MyFrame extends JFrame {
    
    //declare
    Calendar calendar;
    SimpleDateFormat timeFormat;
    JLabel timeLabel;
    String time;
    
    //construct
    MyFrame() {    
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Clock Program");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setResizable(false);
        
        timeFormat = new SimpleDateFormat("HH:mm:ss");
        
        timeLabel = new JLabel();
        
        time = timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);
        
        this.add(timeLabel);
        this.setVisible(true);
    }
    
}
