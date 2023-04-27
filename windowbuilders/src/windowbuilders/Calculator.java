package windowbuilders;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private JPanel calculator;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tfr;
	private JButton REM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		calculator = new JPanel();
		calculator.setForeground(Color.WHITE);
		calculator.setBackground(Color.RED);
		calculator.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(calculator);
		calculator.setLayout(null);
		
		JLabel calci = new JLabel("New label");
		calci.setBackground(Color.WHITE);
		calci.setBounds(45, 53, 186, -24);
		calculator.add(calci);
		
		JLabel Calculator = new JLabel("calculator");
		Calculator.setFont(new Font("Yu Gothic Medium", Font.BOLD, 25));
		Calculator.setBounds(148, 23, 125, 41);
		calculator.add(Calculator);
		
		JLabel Tfa = new JLabel("A");
		Tfa.setFont(new Font("Yu Gothic Medium", Font.BOLD, 20));
		Tfa.setBounds(45, 77, 28, 33);
		calculator.add(Tfa);
		
		tf1 = new JTextField();
		tf1.setBounds(75, 77, 116, 22);
		calculator.add(tf1);
		tf1.setColumns(10);
		
		JLabel tfb = new JLabel("B");
		tfb.setFont(new Font("Yu Gothic Medium", Font.BOLD, 20));
		tfb.setBounds(45, 123, 28, 33);
		calculator.add(tfb);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(75, 130, 116, 22);
		calculator.add(tf2);
		
		JLabel Result = new JLabel("RESULT");
		Result.setFont(new Font("Yu Gothic Medium", Font.BOLD, 20));
		Result.setBounds(217, 99, 84, 33);
		calculator.add(Result);
		
		tfr = new JTextField();
		tfr.setColumns(10);
		tfr.setBounds(304, 106, 116, 22);
		calculator.add(tfr);
		
		JButton ADD = new JButton("ADD     ");
		ADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String data1 = tf1.getText();
				String data2 = tf2.getText();
				int v1 = Integer.valueOf(data1);
				int v2 = Integer.valueOf(data2);
				int res = v1+v2;
				String result = String.valueOf(res);
				tfr.setText(result);
			}
		});
		ADD.setFont(new Font("Tahoma", Font.BOLD, 16));
		ADD.setBounds(0, 182, 93, 29);
		calculator.add(ADD);
		
		JButton SUB = new JButton(" SUB      ");
		SUB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String data1 = tf1.getText();
				String data2 = tf2.getText();
				int v1 = Integer.valueOf(data1);
				int v2 = Integer.valueOf(data2);
				int res = v1-v2;
				String result = String.valueOf(res);
				tfr.setText(result);
			}
		});
		SUB.setFont(new Font("Tahoma", Font.BOLD, 16));
		SUB.setBounds(106, 182, 101, 29);
		calculator.add(SUB);
		
		JButton MUL = new JButton("MUL      ");
		MUL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String data1 = tf1.getText();
				String data2 = tf2.getText();
				int v1 = Integer.valueOf(data1);
				int v2 = Integer.valueOf(data2);
				int res = v1*v2;
				String result = String.valueOf(res);
				tfr.setText(result);
			}
		});
		MUL.setFont(new Font("Tahoma", Font.BOLD, 16));
		MUL.setBounds(217, 182, 97, 29);
		calculator.add(MUL);
		
		JButton DIV = new JButton("DIV          ");
		DIV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String data1 = tf1.getText();
				String data2 = tf2.getText();
				float v1 = Float.valueOf(data1);
				float v2 = Float.valueOf(data2);
				float res = v1/v2;
				String result = String.valueOf(res);
				tfr.setText(result);
			}
		});
		DIV.setFont(new Font("Tahoma", Font.BOLD, 16));
		DIV.setBounds(319, 182, 113, 29);
		calculator.add(DIV);
		
		REM = new JButton("REM     ");
		REM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String data1 = tf1.getText();
				String data2 = tf2.getText();
				int v1 = Integer.valueOf(data1);
				int v2 = Integer.valueOf(data2);
				int res = v1%v2;
				String result = String.valueOf(res);
				tfr.setText(result);
			}
		});
		REM.setFont(new Font("Tahoma", Font.BOLD, 16));
		REM.setBounds(184, 224, 93, 29);
		calculator.add(REM);
		
		
	}
	
	public JButton getREM() {
		return REM;
	}
}
