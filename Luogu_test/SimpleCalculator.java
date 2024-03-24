import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("登录界面");//和frame 的区别    frame是一个窗口 jframe是一个带有标题栏的窗口
        frame.setBounds(200,200,400,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);//设置布局管理器为null,什么意思？？？
        //  
        JButton btn = new JButton("OK");
        JLabel label = new JLabel();
        frame.add(btn);
        frame.add(label);
        btn.setBounds(70,100,120,60);
        btn.addActionListener(e->{
            label.setText("Java考试开始");
            label.setBounds(70,60,120,60);
        });

    }
}