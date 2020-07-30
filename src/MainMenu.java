import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu {

	private JFrame frame;
    public calculator cal;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 470, 555);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/Java-icon.png")).getImage();
		label.setIcon(new ImageIcon(img));
		
		label.setBounds(88, -14, 98, 85);
		frame.getContentPane().add(label);
		
		JLabel lblJavaAppKit = new JLabel(" JAVA APP KIT");
		lblJavaAppKit.setFont(new Font("MS Gothic", Font.BOLD, 27));
		lblJavaAppKit.setBounds(137, 11, 307, 42);
		frame.getContentPane().add(lblJavaAppKit);
		
		JButton B1 = new JButton("");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Image img1=new ImageIcon(this.getClass().getResource("/games-icon.png")).getImage();
		B1.setIcon(new ImageIcon(img1));
		B1.setBounds(35, 82, 106, 115);
		frame.getContentPane().add(B1);
		
		JButton btnNewButton_1 = new JButton("");
		Image img2=new ImageIcon(this.getClass().getResource("/calc.png")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(img2));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal =new calculator();
				cal.setVisible(true);
				
				
			}
		});
		btnNewButton_1.setBounds(176, 82, 106, 115);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sentence sec=new Sentence();
				sec.setVisible(true);
				
			}
		});
		btnNewButton_2.setBounds(322, 82, 106, 115);
		Image img3=new ImageIcon(this.getClass().getResource("/paragraph-folded-icon.png")).getImage();
		btnNewButton_2.setIcon(new ImageIcon(img3));
		frame.getContentPane().add(btnNewButton_2);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TicTacToe x=new TicTacToe();
				x.setVisible(true);
			}
		});
		button.setBounds(35, 229, 106, 115);
		Image img311=new ImageIcon(this.getClass().getResource("/tic.png")).getImage();
		button.setIcon(new ImageIcon(img311));
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(176, 229, 106, 115);
		Image img24=new ImageIcon(this.getClass().getResource("/address-book-icon.png")).getImage();
		button_1.setIcon(new ImageIcon(img24));
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(322, 229, 106, 115);
		Image img44=new ImageIcon(this.getClass().getResource("/Student-3-icon.png")).getImage();
		button_2.setIcon(new ImageIcon(img44));
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(100, 378, 106, 115);
		Image img14=new ImageIcon(this.getClass().getResource("/Numbers-icon.png")).getImage();
		button_3.setIcon(new ImageIcon(img14));
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_4.setBounds(249, 378, 106, 115);
		Image img04=new ImageIcon(this.getClass().getResource("/cam1.png")).getImage();
		button_4.setIcon(new ImageIcon(img04));
		frame.getContentPane().add(button_4);
		
		JLabel lblPuzzle = new JLabel("Puzzle ");
		lblPuzzle.setBounds(72, 64, 69, 14);
		frame.getContentPane().add(lblPuzzle);
		
		JLabel lblCalculator = new JLabel("Calculator");
		lblCalculator.setBounds(206, 64, 76, 14);
		frame.getContentPane().add(lblCalculator);
		
		JLabel lblSentencewordCounter = new JLabel("Sen-Word ++");
		lblSentencewordCounter.setBounds(346, 64, 122, 14);
		frame.getContentPane().add(lblSentencewordCounter);
		
		JLabel lblTicTacToe = new JLabel("IP Finder");
		lblTicTacToe.setBounds(206, 208, 78, 14);
		frame.getContentPane().add(lblTicTacToe);
		
		JLabel lblExamSystem = new JLabel("Exam System");
		lblExamSystem.setBounds(345, 208, 83, 14);
		frame.getContentPane().add(lblExamSystem);
		
		JLabel lblTictactoe = new JLabel("Tic-Tac-Toe");
		lblTictactoe.setBounds(62, 208, 79, 14);
		frame.getContentPane().add(lblTictactoe);
		
		JLabel lblNumberGame = new JLabel("Number Game");
		lblNumberGame.setBounds(119, 355, 106, 14);
		frame.getContentPane().add(lblNumberGame);
		
		JLabel lblImgDetect = new JLabel("Img Detect");
		lblImgDetect.setBounds(275, 355, 80, 14);
		frame.getContentPane().add(lblImgDetect);
	}
}
