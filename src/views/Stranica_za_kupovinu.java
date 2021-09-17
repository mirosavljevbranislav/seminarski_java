package views;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Stranica_za_kupovinu extends JFrame {
	
	static Stranica_za_kupovinu szk_frame = new Stranica_za_kupovinu();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					szk_frame.setUndecorated(false);
					szk_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
		
	public Stranica_za_kupovinu() {
		getContentPane().setBackground(Color.BLACK);
		setBounds(100, 100, 835, 525);
		getContentPane().setLayout(null);
		
		

		
	
		JLabel first_car_lb = new JLabel("Audi A3 Benzin 2003 190000 2300");
		first_car_lb.setFont(new Font("Tahoma", Font.BOLD, 20));
		first_car_lb.setForeground(Color.RED);
		first_car_lb.setBounds(36, 196, 470, 22);
		getContentPane().add(first_car_lb);
		
		JLabel first_car_na_stanju = new JLabel("Na stanju");
		first_car_na_stanju.setForeground(Color.LIGHT_GRAY);
		first_car_na_stanju.setFont(new Font("Tahoma", Font.BOLD, 15));
		first_car_na_stanju.setBounds(542, 204, 86, 14);
		getContentPane().add(first_car_na_stanju);
		
		JRadioButton first_car_rb = new JRadioButton("");
		first_car_rb.setBackground(Color.BLACK);
		first_car_rb.setBounds(640, 200, 109, 23);
		getContentPane().add(first_car_rb);
		
		
		
		
		JLabel second_car_lb = new JLabel("BMW M3 Benzin 2021 4000 33000");
		second_car_lb.setFont(new Font("Tahoma", Font.BOLD, 20));
		second_car_lb.setForeground(Color.RED);
		second_car_lb.setBounds(36, 229, 470, 22);
		getContentPane().add(second_car_lb);
		
		JLabel second_car_lb_na_stanju = new JLabel("Na stanju");
		second_car_lb_na_stanju.setForeground(Color.LIGHT_GRAY);
		second_car_lb_na_stanju.setFont(new Font("Tahoma", Font.BOLD, 15));
		second_car_lb_na_stanju.setBounds(542, 237, 86, 14);
		getContentPane().add(second_car_lb_na_stanju);
		
		JRadioButton second_car_rb = new JRadioButton("");
		second_car_rb.setBackground(Color.BLACK);
		second_car_rb.setBounds(640, 233, 109, 23);
		getContentPane().add(second_car_rb);
		
		
		
		 	
		JLabel third_car_lb = new JLabel("Mercedes E220 Dizel 2007 210000 5600");
		third_car_lb.setFont(new Font("Tahoma", Font.BOLD, 20));
		third_car_lb.setForeground(Color.RED);
		third_car_lb.setBounds(36, 262, 470, 22);
		getContentPane().add(third_car_lb);
		
		JLabel third_car_na_stanju = new JLabel("Na stanju");
		third_car_na_stanju.setForeground(Color.LIGHT_GRAY);
		third_car_na_stanju.setFont(new Font("Tahoma", Font.BOLD, 15));
		third_car_na_stanju.setBounds(542, 270, 86, 14);
		getContentPane().add(third_car_na_stanju);
		
		JRadioButton third_car_rb = new JRadioButton("");
		third_car_rb.setBackground(Color.BLACK);
		third_car_rb.setBounds(640, 266, 109, 23);
		getContentPane().add(third_car_rb);
		
		
		
		
		JLabel fourth_car_lb = new JLabel("Citroen C3 Plin 2004 160000 2500");
		fourth_car_lb.setFont(new Font("Tahoma", Font.BOLD, 20));
		fourth_car_lb.setForeground(Color.RED);
		fourth_car_lb.setBounds(36, 295, 470, 22);
		getContentPane().add(fourth_car_lb);
		
		JLabel fourth_car_lb_na_stanju = new JLabel("Na stanju");
		fourth_car_lb_na_stanju.setForeground(Color.LIGHT_GRAY);
		fourth_car_lb_na_stanju.setFont(new Font("Tahoma", Font.BOLD, 15));
		fourth_car_lb_na_stanju.setBounds(542, 303, 86, 14);
		getContentPane().add(fourth_car_lb_na_stanju);
		
		JRadioButton fourth_car_rb = new JRadioButton("");
		fourth_car_rb.setBackground(Color.BLACK);
		fourth_car_rb.setBounds(640, 299, 109, 23);
		getContentPane().add(fourth_car_rb);
		
		
		
		
		JLabel fifth_car_lb = new JLabel("Skoda Octavia Dizel 2017 180000 12000");
		fifth_car_lb.setFont(new Font("Tahoma", Font.BOLD, 20));
		fifth_car_lb.setForeground(Color.RED);
		fifth_car_lb.setBounds(36, 328, 470, 22);
		getContentPane().add(fifth_car_lb);
		
		JLabel fifth_car_lb_na_stanju = new JLabel("Na stanju");
		fifth_car_lb_na_stanju.setForeground(Color.LIGHT_GRAY);
		fifth_car_lb_na_stanju.setFont(new Font("Tahoma", Font.BOLD, 15));
		fifth_car_lb_na_stanju.setBounds(542, 336, 86, 14);
		getContentPane().add(fifth_car_lb_na_stanju);
		
		JRadioButton fifth_car_rb = new JRadioButton("");
		fifth_car_rb.setBackground(Color.BLACK);
		fifth_car_rb.setBounds(640, 332, 109, 23);
		getContentPane().add(fifth_car_rb);
		
		
		
		
		JLabel sixth_car_lb = new JLabel("Volvo V50 Dizel 2007 195000 3500");
		sixth_car_lb.setFont(new Font("Tahoma", Font.BOLD, 20));
		sixth_car_lb.setForeground(Color.RED);
		sixth_car_lb.setBounds(36, 361, 470, 22);
		getContentPane().add(sixth_car_lb);
		

		JLabel sixth_car_lb_na_stanju = new JLabel("Na stanju");
		sixth_car_lb_na_stanju.setForeground(Color.LIGHT_GRAY);
		sixth_car_lb_na_stanju.setFont(new Font("Tahoma", Font.BOLD, 15));
		sixth_car_lb_na_stanju.setBounds(542, 369, 86, 14);
		getContentPane().add(sixth_car_lb_na_stanju);
		

		JRadioButton sixth_car_rb = new JRadioButton("");
		sixth_car_rb.setBackground(Color.BLACK);
		sixth_car_rb.setBounds(640, 365, 109, 23);
		getContentPane().add(sixth_car_rb);
		
		
		
		
		JButton kupi_auto_button = new JButton("Kupi");
		kupi_auto_button.setForeground(Color.WHITE);
		kupi_auto_button.setBackground(Color.BLACK);
		kupi_auto_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(first_car_rb.isSelected()){
						first_car_na_stanju.setText("Prodat");
						Potvrda_za_kupovinu pzk = new Potvrda_za_kupovinu();
						pzk.setVisible(true);
					}else if(second_car_rb.isSelected()){
						second_car_lb_na_stanju.setText("Prodat");
						Potvrda_za_kupovinu pzk = new Potvrda_za_kupovinu();
						pzk.setVisible(true);
					}else if(third_car_rb.isSelected()){
						third_car_na_stanju.setText("Prodat");
						Potvrda_za_kupovinu pzk = new Potvrda_za_kupovinu();
						pzk.setVisible(true);
					}else if(fourth_car_rb.isSelected()){
						fourth_car_lb_na_stanju.setText("Prodat");
						Potvrda_za_kupovinu pzk = new Potvrda_za_kupovinu();
						pzk.setVisible(true);
					}else if(fifth_car_rb.isSelected()){
						fifth_car_lb_na_stanju.setText("Prodat");
						Potvrda_za_kupovinu pzk = new Potvrda_za_kupovinu();
						pzk.setVisible(true);
					}else if(sixth_car_rb.isSelected()){
						sixth_car_lb_na_stanju.setText("Prodat");
						Potvrda_za_kupovinu pzk = new Potvrda_za_kupovinu();
						pzk.setVisible(true);
					}
			}
		});
		kupi_auto_button.setBounds(700, 11, 109, 108);
		getContentPane().add(kupi_auto_button);
		
		JButton nazad_button = new JButton("<<<");
		nazad_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		nazad_button.setForeground(Color.WHITE);
		nazad_button.setBackground(Color.BLACK);
		nazad_button.setBounds(10, 11, 109, 108);
		getContentPane().add(nazad_button);
		
		ButtonGroup grupa = new ButtonGroup();
		
		grupa.add(first_car_rb);
		grupa.add(second_car_rb);
		grupa.add(third_car_rb);
		grupa.add(fourth_car_rb);
		grupa.add(fifth_car_rb);
		grupa.add(sixth_car_rb);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 915, 170);
		getContentPane().add(panel);
	}
}
