import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JTextArea;

public class Sentence extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sentence frame = new Sentence();
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
	public Sentence() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 408);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("CheckBox.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWordsentenceCounter = new JLabel("WORD+SENTENCE COUNTER");
		lblWordsentenceCounter.setFont(new Font("Trebuchet MS", Font.BOLD, 26));
		lblWordsentenceCounter.setBounds(10, 11, 397, 39);
		contentPane.add(lblWordsentenceCounter);
		
		JLabel lblEnterTheText = new JLabel("ENTER THE TEXT HERE:");
		lblEnterTheText.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblEnterTheText.setBounds(10, 61, 177, 14);
		contentPane.add(lblEnterTheText);
		
		JLabel lblNewLabel = new JLabel("Number of WORDS:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setBounds(47, 276, 177, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Number of SENTENCES:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 309, 209, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(228, 275, 177, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(228, 308, 177, 20);
		contentPane.add(textField_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 86, 429, 154);
		contentPane.add(textArea);
		Image img=new ImageIcon(this.getClass().getResource("/counter.png")).getImage();
	}
}
