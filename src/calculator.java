import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.*;
import javax.*;
import javax.swing.JLabel;

public class calculator extends JFrame {
	
	public double a1;
	public double a2;
	public double rest;
	public String res;
	public String oper;
	

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculator() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 375, 410);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(101, 40, 231, 57);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String entem = textField.getText() + btnNewButton.getText();
				textField.setText(entem);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(31, 108, 58, 49);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("8");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String entem = textField.getText() + button.getText();
				textField.setText(entem);
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button.setBounds(99, 108, 58, 49);
		contentPane.add(button);
		
		JButton button_1 = new JButton("9");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String entem = textField.getText() + button_1.getText();
				textField.setText(entem);
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_1.setBounds(167, 108, 58, 49);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String entem = textField.getText() + button_2.getText();
				textField.setText(entem);
			}
		});
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_2.setBounds(31, 168, 58, 49);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String entem = textField.getText() + button_3.getText();
				textField.setText(entem);
			}
		});
		button_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_3.setBounds(99, 168, 58, 49);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String entem = textField.getText() + button_4.getText();
				textField.setText(entem);
			}
			
		});
		button_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_4.setBounds(167, 168, 58, 49);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("1");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String entem = textField.getText() + button_5.getText();
				textField.setText(entem);
			}
		});
		button_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_5.setBounds(31, 228, 58, 49);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("2");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String entem = textField.getText() + button_6.getText();
				textField.setText(entem);
			}
		});
		button_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_6.setBounds(99, 228, 58, 49);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("3");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String entem = textField.getText() + button_7.getText();
				textField.setText(entem);
				
			}
		});
		button_7.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_7.setBounds(167, 228, 58, 49);
		contentPane.add(button_7);
		
		JButton btnNewButton_1 = new JButton("0");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String entem = textField.getText() + btnNewButton_1.getText();
				textField.setText(entem);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(31, 288, 58, 57);
		contentPane.add(btnNewButton_1);
		
		JButton button_8 = new JButton("+");
		button_8.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 18));
		
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	
		    a1= Double.parseDouble(textField.getText());
			textField.setText("");
			oper="+";
			
			}
		});
		button_8.setBounds(246, 108, 86, 49);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("*");
		button_9.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 26));
		
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a1= Double.parseDouble(textField.getText());
				textField.setText("");
				oper="*";
			}
		});
		button_9.setBounds(246, 228, 86, 49);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("-");
		button_10.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 26));
	
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a1= Double.parseDouble(textField.getText());
				textField.setText("");
				oper="-";
			
			}
		});
		button_10.setBounds(246, 168, 86, 49);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("/");
		button_11.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 26));
	
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a1= Double.parseDouble(textField.getText());
				textField.setText("");
				oper="/";
			}
		});
		button_11.setBounds(246, 290, 86, 49);
		contentPane.add(button_11);
		
		JButton btnNewButton_2 = new JButton("");
		Image i2dd=new ImageIcon(this.getClass().getResource("/rww.png")).getImage();
		btnNewButton_2.setIcon(new ImageIcon(i2dd));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				
				a2=Double.parseDouble(textField.getText());
				
				if(oper == "+")
				{
					rest= a1 + a2;
					answer=String.format("%.2f",rest);
					textField.setText(answer);
					
					
				}
				
				
				if(oper == "-")
				{
					rest= a1 - a2;
					answer=String.format("%.2f",rest);
					textField.setText(answer);
					
					
				}
				
				
				if(oper == "*")
				{
					rest= a1 * a2;
					answer=String.format("%.2f",rest);
					textField.setText(answer);
					
					
				}
				
				
				if(oper == "/")
				{
					rest= a1 / a2;
					answer=String.format("%.2f",rest);
					textField.setText(answer);
					
					
				}
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton_2.setBounds(166, 288, 58, 57);
		contentPane.add(btnNewButton_2);
		
		JLabel lblCalculator = new JLabel("CALCULATOR");
		lblCalculator.setBounds(262, 11, 97, 14);
		contentPane.add(lblCalculator);
		
		JButton button_12 = new JButton(".");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String entem = textField.getText() + button_12.getText();
				textField.setText(entem);
			}
		});
		button_12.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_12.setBounds(99, 288, 58, 57);
		contentPane.add(button_12);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
				
				
				
				
			}
		});
		btnC.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnC.setBounds(31, 40, 60, 57);
		contentPane.add(btnC);
	}
}
