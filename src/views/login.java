package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Button;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class login extends JFrame {
	
	static login frame = new login();
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField username_txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login.frame.setUndecorated(false);
					login.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 435);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		ImageIcon img = new ImageIcon("C:\\Users\\miros\\eclipse-workspace\\ProdavnicaAutomobila\\src\\resources\\background.jpg");
		JLabel lblNewLabel = new JLabel("New label", img, JLabel.CENTER);
		lblNewLabel.setBounds(0, -90, 385, 570);
		getContentPane().add(lblNewLabel);
		
		JLabel username_lbl = new JLabel("Username");
		username_lbl.setForeground(Color.WHITE);
		username_lbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		username_lbl.setBounds(390, 60, 87, 23);
		contentPane.add(username_lbl);
		
		username_txt = new JTextField();
		username_txt.setBackground(Color.ORANGE);
		Font bigFont = username_txt.getFont().deriveFont(Font.PLAIN, 15f);
		username_txt.setFont(bigFont);
		username_txt.setBounds(391, 85, 327, 45);
		contentPane.add(username_txt);
		username_txt.setColumns(10);
		
		JLabel password_lbl = new JLabel("Password");
		password_lbl.setForeground(Color.WHITE);
		password_lbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		password_lbl.setBounds(390, 141, 87, 23);
		contentPane.add(password_lbl);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.ORANGE);
		passwordField.setBounds(390, 164, 328, 46);
		contentPane.add(passwordField);

		Button button_login = new Button("Login");
		button_login.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				String password = passwordField.getText();
				String username = username_txt.getText();
				
				String username_confirmation = "Bane";
				String password_confirmaton = "Bane123";
				
				if (password.equals("") && username.equals("")) {
					JOptionPane.showMessageDialog(null, "Polja ne smeju biti prazna!");
				}else if ( (username.equals(username_confirmation)) && (password.equals(password_confirmaton)) ) {
					Home home = new Home();
					home.setVisible(true);
					login.frame.setVisible(false);
					
					}
				else {
				JOptionPane.showMessageDialog(null, "Neispravno korisnicko ime ili lozinka...");
				}
			}
		});
		button_login.setBackground(Color.ORANGE);
		button_login.setBounds(390, 341, 328, 46);
		contentPane.add(button_login);
		
	
	}
}
