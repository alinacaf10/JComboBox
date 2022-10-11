package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        String arr[]={"C++","C#","Java","Phyton"};
        JComboBox comboBox=new JComboBox(arr);
        comboBox.setBounds(10,10,100,20);

        JButton btn=new JButton("Submit");
        btn.setBounds(10,50,80,40);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Secilen dil: "+comboBox.getSelectedItem());
            }
        });

        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(comboBox);
        frame.add(btn);
    }
}
