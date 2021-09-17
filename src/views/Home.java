package views;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;


@SuppressWarnings("serial")
public class Home extends JFrame{

	static Home fhome = new Home();
	public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					fhome.setUndecorated(false);
					fhome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Home() {
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setForeground(Color.LIGHT_GRAY);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dobrodo\u0161li");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel.setBounds(370, 74, 160, 61);
		getContentPane().add(lblNewLabel);
		
		JButton button_kupovina = new JButton("Kupi auto");
		button_kupovina.setBackground(Color.ORANGE);
		button_kupovina.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Stranica_za_kupovinu szk = new Stranica_za_kupovinu();
				szk.setVisible(true);
			}
		});
		button_kupovina.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		button_kupovina.setBounds(626, 305, 160, 70);
		getContentPane().add(button_kupovina);
		
		JButton button_prodaja = new JButton("Prodaj auto");
		button_prodaja.setBackground(Color.ORANGE);
		button_prodaja.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Stranica_za_prodaju szp = new Stranica_za_prodaju();
				szp.setVisible(true);
			}
		});
	
		button_prodaja.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		button_prodaja.setBounds(127, 305, 160, 70);
		getContentPane().add(button_prodaja);
	}	
}
