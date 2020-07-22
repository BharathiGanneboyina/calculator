package calculator_help;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class calci {

	private JFrame frame;
	private JTextField value2;
	private JTextField value1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
					window.frame.setVisible(true);
					//UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 255));
		frame.setBounds(500, 500, 1200, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 218, 300);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("0");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+ 0);
			}
		});
		btnNewButton.setBounds(0, 227, 92, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("3");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+ 3);
			}
		});
		btnNewButton_1.setBounds(102, 125, 41, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("6");
		btnNewButton_1_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+ 6);
			}
		});
		btnNewButton_1_1.setBounds(102, 159, 41, 23);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("9");
		btnNewButton_1_2.setBackground(new Color(255, 255, 255));
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+ 9);
			}
		});
		btnNewButton_1_2.setBounds(102, 193, 41, 23);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3_2 = new JButton("4");
		btnNewButton_1_3_2.setBackground(new Color(255, 255, 255));
		btnNewButton_1_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+ 4);
			}
		});
		btnNewButton_1_3_2.setBounds(0, 159, 41, 23);
		frame.getContentPane().add(btnNewButton_1_3_2);
		
		JButton btnNewButton_1_3_3 = new JButton("7");
		btnNewButton_1_3_3.setBackground(new Color(255, 255, 255));
		btnNewButton_1_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+ 7);
			}
		});
		btnNewButton_1_3_3.setBounds(0, 193, 41, 23);
		frame.getContentPane().add(btnNewButton_1_3_3);
		
		JButton btnNewButton_1_3_4 = new JButton("=");
		btnNewButton_1_3_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_3_4.setBackground(new Color(255, 255, 255));
		btnNewButton_1_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int one=Integer.parseInt(value1.getText());
				int two=Integer.parseInt(value2.getText());
				
				
				if(actionreceived.getText().equals("sub"))
				{
					int sub=one-two;
					value2.setText(String.valueOf(sub));
				}

				if(actionreceived.getText().equals("add"))
				{
					int add=one+two;
					value2.setText(String.valueOf(add));
				}

				if(actionreceived.getText().equals("Multi"))
				{
					int Multi=one*two;
					value2.setText(String.valueOf(Multi));
				}

				if(actionreceived.getText().equals("Div"))
				{
					int Div=one/two;
					value2.setText(String.valueOf(Div));
				}
				
			}
		});
		btnNewButton_1_3_4.setBounds(151, 125, 41, 23);
		frame.getContentPane().add(btnNewButton_1_3_4);
		
		JButton btnNewButton_1_3_6 = new JButton("2");
		btnNewButton_1_3_6.setBackground(new Color(255, 255, 255));
		btnNewButton_1_3_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+ 2);
			}
		});
		btnNewButton_1_3_6.setBounds(51, 125, 41, 23);
		frame.getContentPane().add(btnNewButton_1_3_6);
		
		JButton btnNewButton_1_3_7 = new JButton("5");
		btnNewButton_1_3_7.setBackground(new Color(255, 255, 255));
		btnNewButton_1_3_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+ 5);
			}
		});
		btnNewButton_1_3_7.setBounds(51, 159, 41, 23);
		frame.getContentPane().add(btnNewButton_1_3_7);
		
		JButton btnNewButton_1_3_8 = new JButton("8");
		btnNewButton_1_3_8.setBackground(new Color(255, 255, 255));
		btnNewButton_1_3_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+ 8);
			}
		});
		btnNewButton_1_3_8.setBounds(51, 193, 41, 23);
		frame.getContentPane().add(btnNewButton_1_3_8);
		
		JButton btnNewButton_1_3_11 = new JButton("+");
		btnNewButton_1_3_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_3_11.setBackground(new Color(255, 255, 255));
		btnNewButton_1_3_11.setForeground(new Color(0, 0, 0));
		btnNewButton_1_3_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionreceived.setText("add");
				value2.setText(null);
				
			}
		});
		btnNewButton_1_3_11.setBounds(0, 91, 41, 23);
		frame.getContentPane().add(btnNewButton_1_3_11);
		
		JButton btnNewButton_1_3_12 = new JButton("-");
		btnNewButton_1_3_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_3_12.setBackground(new Color(255, 255, 255));
		btnNewButton_1_3_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionreceived.setText("sub");
				value2.setText(null);
			}
		});
		btnNewButton_1_3_12.setBounds(51, 91, 41, 23);
		frame.getContentPane().add(btnNewButton_1_3_12);
		
		JButton btnNewButton_1_3_13 = new JButton("*");
		btnNewButton_1_3_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_3_13.setBackground(new Color(255, 255, 255));
		btnNewButton_1_3_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionreceived.setText("Multi");
				value2.setText(null);
			}
		});
		btnNewButton_1_3_13.setBounds(102, 91, 41, 23);
		frame.getContentPane().add(btnNewButton_1_3_13);
		
		JButton btnNewButton_1_3_14 = new JButton("/");
		btnNewButton_1_3_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_3_14.setBackground(new Color(255, 255, 255));
		btnNewButton_1_3_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionreceived.setText("Div");
				value2.setText(null);
			}
		});
		btnNewButton_1_3_14.setBounds(151, 91, 41, 23);
		frame.getContentPane().add(btnNewButton_1_3_14);
		
		JButton btnNewButton_1_3_15 = new JButton("c");
		btnNewButton_1_3_15.setBackground(new Color(255, 255, 255));
		btnNewButton_1_3_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_3_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(null);
				value2.setText(null);
				actionreceived.setText(null);
				
			}
		});
		btnNewButton_1_3_15.setBounds(153, 159, 39, 23);
		frame.getContentPane().add(btnNewButton_1_3_15);
		
		value2 = new JTextField();
		value2.setBackground(new Color(255, 255, 255));
		value2.setHorizontalAlignment(SwingConstants.RIGHT);
		value2.setBorder(null);
		value2.setFont(new Font("Tahoma", Font.BOLD, 14));
		value2.setBounds(10, 55, 182, 26);
		frame.getContentPane().add(value2);
		value2.setColumns(10);
		
		value1 = new JTextField();
		value1.setBackground(new Color(255, 255, 255));
		value1.setHorizontalAlignment(SwingConstants.RIGHT);
		value1.setBorder(null);
		value1.setFont(new Font("Tahoma", Font.BOLD, 14));
		value1.setBounds(10, 26, 182, 29);
		frame.getContentPane().add(value1);
		value1.setColumns(10);
		
		JButton btnNewButton_1_3_2_1 = new JButton("1");
		btnNewButton_1_3_2_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1_3_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+ 1);
			}
		});
		btnNewButton_1_3_2_1.setBounds(0, 125, 41, 23);
		frame.getContentPane().add(btnNewButton_1_3_2_1);
		
		 actionreceived = new JLabel("");
		 actionreceived.setForeground(SystemColor.control);
		 actionreceived.setBackground(SystemColor.control);
		actionreceived.setBounds(10, 202, 53, 29);
		frame.getContentPane().add(actionreceived);
		
		JLabel lblNewLabel = new JLabel("Bharathi Calculator");
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setBackground(Color.green);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(31, 1, 128, 23);
		frame.getContentPane().add(lblNewLabel);
	}
	private JLabel actionreceived;
}
