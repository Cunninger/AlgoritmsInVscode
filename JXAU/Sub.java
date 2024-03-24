package JXAU;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
public class Sub {
    public static void main(String[] args) {
        //新建窗口
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        //新建组件并加入窗口容器
        JButton btn = new JButton("OK");
        JLabel label = new JLabel("");
        frame.add(btn);
        frame.add(label);
        btn.setBounds(70,100,60,60);
        //添加点击事件监听器
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //处理事件
                label.setText("Java考试开始");
                label.setBounds(50,50,100,50);
            }
        });
    }
}
