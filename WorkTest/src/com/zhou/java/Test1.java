package com.zhou.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test1 {
	
	public static void main(String[] args) {
		
		//创建JFrame，主程序的框架
		JFrame frame=new JFrame("计算器");
		
		frame.setSize(308,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar bar=new JMenuBar();
		JMenu fileMenu1=new JMenu("查看(V)");
		JMenuItem c1=new JMenuItem("标准型(T)");
		fileMenu1.add(c1);
		JMenuItem c2=new JMenuItem("科学型(S)");
		fileMenu1.add(c2);
		JMenuItem c3=new JMenuItem("程序员(P)");
		fileMenu1.add(c3);
		bar.add(fileMenu1);
		
		JMenu fileMenu2=new JMenu("编辑(E)");
		JMenuItem b1=new JMenuItem("复制(C)");
		fileMenu2.add(b1);
		JMenuItem b2=new JMenuItem("粘贴(P)");
		fileMenu2.add(b2);
		JMenuItem b3=new JMenuItem("历史记录(H)");
		fileMenu2.add(b3);
		bar.add(fileMenu2);
		
		JMenu fileMenu3=new JMenu("帮助(H)");
		JMenuItem h1=new JMenuItem("查看帮助(V)");
		fileMenu3.add(h1);
		JMenuItem h2=new JMenuItem("关于计算器(A)");
		fileMenu3.add(h2);

		bar.add(fileMenu3);
		
		frame.setJMenuBar(bar);
		
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
/*		//创建JLabel
		JLabel win=new JLabel("查看(V)  编辑(E)  帮助(H)");
		win.setBounds(10, 10, 230, 25);
		panel.add(win);*/
		
/*        //创建按钮
        JButton bt1 = new JButton("查看(V)");
        bt1.setBounds(10, 10, 76, 25);
        panel.add(bt1);
        
        JButton bt2 = new JButton("编辑(E)");
        bt2.setBounds(107, 10, 76, 25);
        panel.add(bt2);
        
        JButton bt3 = new JButton("帮助(H)");
        bt3.setBounds(204, 10, 76, 25);
        panel.add(bt3);*/
		

		
		//创建文本域用于用户输入
		JTextField w=new JTextField(20);
		w.setBounds(10, 20, 272, 50);
		panel.add(w);
		
        //创建按钮
        JButton button11 = new JButton("MC");
        button11.setBounds(10, 100, 52, 25);
        panel.add(button11);
        
        JButton button12 = new JButton("MR");
        button12.setBounds(65, 100, 52, 25);
        panel.add(button12);
        
        JButton button13 = new JButton("MS");
        button13.setBounds(120, 100, 52, 25);
        panel.add(button13);
        
        JButton button14 = new JButton("M+");
        button14.setBounds(175, 100, 52, 25);
        panel.add(button14);
        
        JButton button15 = new JButton("M-");
        button15.setBounds(230, 100, 52, 25);
        panel.add(button15);
        
        JButton button21 = new JButton("<--");
        button21.setBounds(10, 130, 52, 25);
        panel.add(button21);
        
        JButton button22 = new JButton("CE");
        button22.setBounds(65, 130, 52, 25);
        panel.add(button22);
        
        JButton button23 = new JButton("C");
        button23.setBounds(120, 130, 52, 25);
        panel.add(button23);
        
        JButton button24 = new JButton("±");
        button24.setBounds(175, 130, 52, 25);
        panel.add(button24);
        
        JButton button25 = new JButton("√");
        button25.setBounds(230, 130, 52, 25);
        panel.add(button25);
        
        JButton button31 = new JButton("7");
        button31.setBounds(10, 160, 52, 25);
        panel.add(button31);
        
        JButton button32 = new JButton("8");
        button32.setBounds(65, 160, 52, 25);
        panel.add(button32);
        
        JButton button33 = new JButton("9");
        button33.setBounds(120, 160, 52, 25);
        panel.add(button33);
        
        JButton button34 = new JButton("/");
        button34.setBounds(175, 160, 52, 25);
        panel.add(button34);
        
        JButton button35 = new JButton("%");
        button35.setBounds(230, 160, 52, 25);
        panel.add(button35);
        
        JButton button41 = new JButton("4");
        button41.setBounds(10, 190, 52, 25);
        panel.add(button41);
        
        JButton button42 = new JButton("5");
        button42.setBounds(65, 190, 52, 25);
        panel.add(button42);
        
        JButton button43 = new JButton("6");
        button43.setBounds(120, 190, 52, 25);
        panel.add(button43);
        
        JButton button44 = new JButton("*");
        button44.setBounds(175, 190, 52, 25);
        panel.add(button44);
        
        JButton button45 = new JButton("1/x");
        button45.setBounds(230, 190, 52, 25);
        panel.add(button45);
        
        JButton button51 = new JButton("1");
        button51.setBounds(10, 220, 52, 25);
        panel.add(button51);
        
        JButton button52 = new JButton("2");
        button52.setBounds(65, 220, 52, 25);
        panel.add(button52);
        
        JButton button53 = new JButton("3");
        button53.setBounds(120, 220, 52, 25);
        panel.add(button53);
        
        JButton button54 = new JButton("-");
        button54.setBounds(175, 220, 52, 25);
        panel.add(button54);
        
        JButton button55 = new JButton("=");
        button55.setBounds(230, 220, 52, 55);
        panel.add(button55);
        
        JButton button61 = new JButton("0");
        button61.setBounds(10, 250, 107, 25);
        panel.add(button61);
        
        JButton button62 = new JButton(".");
        button62.setBounds(120, 250, 52, 25);
        panel.add(button62);
        
        JButton button63 = new JButton("+");
        button63.setBounds(175, 250, 52, 25);
        panel.add(button63);
        
	
		
	}

}
