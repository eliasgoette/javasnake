import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.*;
import java.awt.*;

public class Window {
    public JFrame windowInstance = create("JSnake", "./ImageIcon.png");

    public JFrame create(String title, String iconPath){
        JFrame jFrame = new JFrame(title);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(1000, 800);
        ImageIcon icon = new ImageIcon(iconPath);
        jFrame.setIconImage(icon.getImage());
        jFrame.getContentPane().setLayout(new BorderLayout());
        jFrame.setVisible(true);

        return(jFrame);
    }

    public void editWindow(JFrame window){
        window.setTitle("title");
        return;
    }
}