package com.zhou.java;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Test {
	
	public static void main(String[] args) {
		
		//创建JFrame
		JFrame frame=new JFrame("Login Example");
		
		frame.setSize(350,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        /* 创建面板，这个类似于 HTML 的 div 标签
         * 我们可以创建多个面板并在 JFrame 中指定位置
         * 面板中我们可以添加文本字段，按钮及其他组件。
         */
		
		JPanel panel=new JPanel();
		
		//添加面板
		frame.add(panel);
		
		//调用用户定义的方法并添加组件到面板
		 placeComponents(panel);
		 //设置界面可见
		 frame.setVisible(true);
		
	}
	
	private static void placeComponents(JPanel panel){
		//设置布局为null
		panel.setLayout(null);
		
		//创建JLabel
		JLabel userLabel=new JLabel("User:");
		
        /* 这个方法定义了组件的位置。
         * setBounds(x, y, width, height)
         * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
         */
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		//创建文本域用于用户输入
		JTextField userText=new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		//创建文本域用于输入密码
		JLabel passWord =new JLabel("PassWord:");
		passWord.setBounds(10,50,80,25);
		panel.add(passWord);
		
        /* 
         *这个类似用于输入的文本域
         * 但是输入的信息会以点号代替，用于包含密码的安全性
         */
		JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);
        
        //创建登录按钮
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);
		
		
	}

}
