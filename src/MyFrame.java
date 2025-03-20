import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class MyFrame extends JFrame {
    
    //declare
    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    String time;
    String day;
    
    //construct
    MyFrame() {    
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Clock Program");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setResizable(false);
        
        timeFormat = new SimpleDateFormat("HH:mm:ss");
        dayFormat = new SimpleDateFormat("EEEE");
        
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);
        
        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));
                
        this.add(timeLabel);
        this.add(dayLabel);
        this.setVisible(true);
        
        setTime();
    }
    
    //method
    public void setTime() {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
            
            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
