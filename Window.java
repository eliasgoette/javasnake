import javax.swing.*;
import java.awt.*;

public class Window {
//    public JFrame jFrameInstance = create("JSnake", "./ImageIcon.png");
    public JFrame jFrameInstance = create("Java Snake");

    public JFrame create(String title, String iconPath){
        JFrame jFrame = create(title);
        ImageIcon icon = new ImageIcon(iconPath);
        jFrame.setIconImage(icon.getImage());

        return(jFrame);
    }

    public JFrame create(String title){
        JFrame jFrame = new JFrame(title);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(1000, 800);
        jFrame.getContentPane().setLayout(new BorderLayout());
        jFrame.setVisible(true);

        return(jFrame);
    }

    public void editWindow(JFrame window){
        window.setTitle("JSnake");
    }
}