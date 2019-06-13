package com.zhou.java;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class TestCalculator extends JFrame {
	private JTextField textField;
	private double operand1;
	private double operand2;
	private String operator;
	private String express;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestCalculator frame = new TestCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestCalculator() {
		
		 operand1=0;
		 operand2=0;
		 operator=new String("#");
		 express=new String();
		
		setTitle("计算器");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 308, 350);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 26));
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setBounds(10, 10, 272, 54);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("MC");
		btnNewButton.setBounds(10, 74, 52, 25);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MS");
		btnNewButton_1.setBounds(120, 74, 52, 25);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("M+");
		btnNewButton_2.setBounds(175, 74, 52, 25);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("M-");
		btnNewButton_3.setBounds(230, 74, 52, 25);
		getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("MR");
		btnNewButton_4.setBounds(65, 74, 52, 25);
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("←");
		btnNewButton_5.setBounds(10, 109, 52, 25);
		getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("CE");
		btnNewButton_6.setBounds(65, 109, 52, 25);
		getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("C");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResetAll();
				textField.setText("");
			}
		});
		btnNewButton_7.setBounds(120, 109, 52, 25);
		getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("±");
		btnNewButton_8.setBounds(175, 109, 52, 25);
		getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("√");
		btnNewButton_9.setBounds(230, 109, 52, 25);
		getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("7");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				express+="7";
				InputOperand(express);
			}
		});
		btnNewButton_10.setBounds(10, 144, 52, 25);
		getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("8");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				express+="8";
				InputOperand(express);
			}
		});
		btnNewButton_11.setBounds(65, 144, 52, 25);
		getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("9");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				express+="9";
				InputOperand(express);
			}
		});
		btnNewButton_12.setBounds(120, 144, 52, 25);
		getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("/");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator="/";
				express="";
				textField.setText("/");
			}
		});
		btnNewButton_13.setBounds(175, 144, 52, 25);
		getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("%");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator="%";
				express="";
				textField.setText("%");
			}
		});
		btnNewButton_14.setBounds(230, 144, 52, 25);
		getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("4");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				express+="4";
				InputOperand(express);
			}
		});
		btnNewButton_15.setBounds(10, 179, 52, 25);
		getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("5");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				express+="5";
				InputOperand(express);
			}
		});
		btnNewButton_16.setBounds(65, 179, 52, 25);
		getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("6");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				express+="6";
				InputOperand(express);
			}
		});
		btnNewButton_17.setBounds(120, 179, 52, 25);
		getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("*");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator="*";
				express="";
				textField.setText("*");
			}
		});
		btnNewButton_18.setBounds(175, 179, 52, 25);
		getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("1/x");
		btnNewButton_19.setBounds(230, 179, 52, 25);
		getContentPane().add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("1");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				express+="1";
				InputOperand(express);
			}
		});
		btnNewButton_20.setBounds(10, 215, 52, 25);
		getContentPane().add(btnNewButton_20);
		
		JButton button = new JButton("2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				express+="2";
				InputOperand(express);
			}
		});
		button.setBounds(65, 215, 52, 25);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				express+="3";
				InputOperand(express);
			}
		});
		button_1.setBounds(120, 215, 52, 25);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("-");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator="-";
				express="";
				textField.setText("-");
			}
		});
		button_2.setBounds(175, 215, 52, 25);
		getContentPane().add(button_2);
		
		JButton button_3 = new JButton("=");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double result=0;
				
				if(operator.equals("#")){
					textField.setText("");
				}else{
					if(operator.equals("+"))
						result = operand1 + operand2;
					if(operator.equals("-"))
						result = operand1 - operand2;
					if(operator.equals("*"))
						result = operand1 * operand2;
					if(operator.equals("/"))
						result = operand1 / operand2;
					if(operator.equals("%"))
						result =(int) operand1 / (int)operand2;
					
					textField.setText(operand1+operator+operand2+"="+String.valueOf(result));
					
				}
				
				ResetAll();
			}
		});
		button_3.setBounds(230, 215, 52, 60);
		getContentPane().add(button_3);
		
		JButton button_4 = new JButton("0");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				express+="0";
				InputOperand(express);
			}
		});


		button_4.setBounds(10, 250, 107, 25);
		getContentPane().add(button_4);
		
		JButton button_5 = new JButton(".");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//判断数字中是否有小数点
				if(!express.equals(".")) {
					express+=".";			
				}
			}
		});
		button_5.setBounds(120, 250, 52, 25);
		getContentPane().add(button_5);
		
		JButton button_6 = new JButton("+");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator="+";
				express="";
				textField.setText("+");
			}
		});
		button_6.setBounds(175, 250, 52, 25);
		getContentPane().add(button_6);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("查看(V)");
		mnNewMenu.setFont(new Font("宋体", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("标准型(T)");
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_MASK));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"不好意思，没有");
			}
		});
		mntmNewMenuItem.setFont(new Font("宋体", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("科学型(S)");
		mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"不好意思，还是没有");
			}
		});
		mntmNewMenuItem_1.setFont(new Font("宋体", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("程序员(P)");
		mntmNewMenuItem_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"都是程序员了，自己写一个好不好");
			}
		});
		mntmNewMenuItem_2.setFont(new Font("宋体", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("编辑(E)");
		mnNewMenu_1.setFont(new Font("宋体", Font.PLAIN, 14));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("复制(C)");
		mntmNewMenuItem_3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"自己按ctrl+c");
			}
		});
		mntmNewMenuItem_3.setFont(new Font("宋体", Font.PLAIN, 14));
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("粘贴(P)");
		mntmNewMenuItem_4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"ctrl+c都会了，ctrl+v 还不会吗？“社会人啊”");
			}
		});
		mntmNewMenuItem_4.setFont(new Font("宋体", Font.PLAIN, 14));
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("历史记录(H)");
		mntmNewMenuItem_5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK));
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"那都是过去的事了，拿来干嘛");
			}
		});
		mntmNewMenuItem_5.setFont(new Font("宋体", Font.PLAIN, 14));
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_2 = new JMenu("帮助(H)");
		mnNewMenu_2.setFont(new Font("宋体", Font.PLAIN, 14));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("查看帮助(V)");
		mntmNewMenuItem_6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Sorry!我也很无赖,自己帮助自己吧！");
			}
		});
		mntmNewMenuItem_6.setFont(new Font("宋体", Font.PLAIN, 14));
		mnNewMenu_2.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("关于计算器(A)");		
		mntmNewMenuItem_7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"版权所有，仿版必究！！！");
			}
		});
		mntmNewMenuItem_7.setFont(new Font("宋体", Font.PLAIN, 14));
		mnNewMenu_2.add(mntmNewMenuItem_7);
		
		//setResizeable(false)使得界面无法调整大小
		setResizable(false);
		
	}
	//鼠标输入
	public void InputOperand(String datastr) {
		
		double m=0;
		
		m=Double.parseDouble(datastr);
		
		if(operator.equals("#")) {
			operand1=m;		
		}else {
			operand2=m;
		}
		
		textField.setText(String.valueOf(m));
		
	}
	
	//完成计算后清空操作
	public void ResetAll() {
		 operand1=0;
		 operand2=0;
		 operator="#";
		 express="";
	}
}
