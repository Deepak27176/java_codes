package windowbuilders;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bubblesort extends JFrame {

	private JPanel bubblesort;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bubblesort frame = new bubblesort();
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
	public bubblesort() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		bubblesort = new JPanel();
		bubblesort.setBackground(new Color(135, 206, 250));
		bubblesort.setForeground(Color.MAGENTA);
		bubblesort.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(bubblesort);
		bubblesort.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bubblesort");
		lblNewLabel.setFont(new Font("Javanese Text", Font.BOLD, 22));
		lblNewLabel.setBounds(150, 0, 114, 51);
		bubblesort.add(lblNewLabel);
		
		JLabel label1 = new JLabel("Enter elements here");
		label1.setFont(new Font("Javanese Text", Font.BOLD, 22));
		label1.setBounds(12, 55, 213, 51);
		bubblesort.add(label1);
		
		JTextArea tf1 = new JTextArea();
		tf1.setBounds(237, 67, 183, 22);
		bubblesort.add(tf1);
		
		JLabel lblSortedElementsAre = new JLabel("sorted elements are");
		lblSortedElementsAre.setFont(new Font("Javanese Text", Font.BOLD, 22));
		lblSortedElementsAre.setBounds(12, 103, 205, 51);
		bubblesort.add(lblSortedElementsAre);
		
		JTextArea tf2 = new JTextArea();
		tf2.setBounds(237, 115, 183, 22);
		bubblesort.add(tf2);
		
		JButton sort = new JButton("BubbleSort         ");
		sort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sentence = tf1.getText();
				String arr[]= sentence.split(" ");
				for(int i=0;i<arr.length-1;i++)
				{
					for(int j=0;j<arr.length-1-i;j++)
					{
						if(Integer.valueOf(arr[j])>Integer.valueOf(arr[j+1]))
						{
							String temp = arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=temp;
						}
					}
				}
				String sen ="";
				for(int i=0;i<arr.length;i++)
				{
					sen = sen+arr[i]+" ";
				}
				tf2.setText(sen);
			}
		});
		sort.setFont(new Font("Tahoma", Font.BOLD, 18));
		sort.setBounds(134, 175, 177, 31);
		bubblesort.add(sort);
	}
}
