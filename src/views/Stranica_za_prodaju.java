package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Color;

@SuppressWarnings("serial")
public class Stranica_za_prodaju extends JFrame {

	private JPanel contentPane;
	private JTextField marka_tf;
	private JTextField proizvodjac_tf;
	private JLabel gorivo_label;
	private JTextField gorivo_tf;
	private JLabel godina_label;
	private JTextField godina_tf;

	static Stranica_za_prodaju szp_frame = new Stranica_za_prodaju();
	private JTextField kilometraza_tf;
	private JTextField cena_tf;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					szp_frame.setUndecorated(true);
					szp_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public class Auto{
		private String proizvodjac;
		private String model;
		private String gorivo;
		private String godiste;
		private String kilometraza;
		private String cena;
		
		public Auto(String pro, String mod, String gor, String god, String kilometraza, String cena) {
			this.proizvodjac = pro;
			this.model = mod;
			this.gorivo = gor;
			this.godiste = god;
			this.kilometraza = kilometraza;
			this.cena = cena;
			
		}

		public String print_car() {
			return "Proizvodjac: " + this.proizvodjac
					+ "Model: " + this.model 
					+ "Gorivo: " + this.gorivo
					+ "Godiste: " + this.godiste
					+ "Kilometraza: " + this.kilometraza 
					+ "Cena: " + this.cena;
		}

		public String getProizvodjac() {
			return proizvodjac;
		}

		public void setProizvodjac(String proizvodjac) {
			this.proizvodjac = proizvodjac;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getGorivo() {
			return gorivo;
		}

		public void setGorivo(String gorivo) {
			this.gorivo = gorivo;
		}

		public String getGodiste() {
			return godiste;
		}

		public void setGodiste(String godiste) {
			this.godiste = godiste;
		}

		public String getKilometraza() {
			return kilometraza;
		}

		public void setKilometraza(String kilometraza) {
			this.kilometraza = kilometraza;
		}

		public String getCena() {
			return cena;
		}

		public void setCena(String cena) {
			this.cena = cena;
		}
		
	
		
	}
	
	public Stranica_za_prodaju() {		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 835, 525);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel marka_label = new JLabel("Proizvo\u0111a\u010D");
		marka_label.setBounds(722, 123, 71, 17);
		marka_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(marka_label);
		
		
		
		JLabel proizvodjac_label = new JLabel("Marka");
		proizvodjac_label.setBounds(738, 173, 42, 17);
		proizvodjac_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(proizvodjac_label);
		
		JLabel lblNewLabel = new JLabel("Kilometra\u017Ea");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(722, 329, 71, 14);
		contentPane.add(lblNewLabel);
		
		JLabel cena_label = new JLabel("Cena (u evrima)");
		cena_label.setVerticalAlignment(SwingConstants.TOP);
		cena_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cena_label.setBounds(712, 385, 112, 23);
		contentPane.add(cena_label);
		
		
		proizvodjac_tf = new JTextField();
		proizvodjac_tf.setBackground(Color.LIGHT_GRAY);
		proizvodjac_tf.setBounds(702, 195, 112, 23);
		proizvodjac_tf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(proizvodjac_tf);
		proizvodjac_tf.setColumns(10);
		
		marka_tf = new JTextField();
		marka_tf.setBackground(Color.LIGHT_GRAY);
		marka_tf.setBounds(702, 145, 112, 23);
		marka_tf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(marka_tf);
		marka_tf.setColumns(10);
		
		gorivo_label = new JLabel("Gorivo");
		gorivo_label.setBounds(738, 223, 40, 17);
		gorivo_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(gorivo_label);
		
		gorivo_tf = new JTextField();
		gorivo_tf.setBackground(Color.LIGHT_GRAY);
		gorivo_tf.setBounds(702, 245, 112, 23);
		gorivo_tf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(gorivo_tf);
		gorivo_tf.setColumns(10);
		
		godina_label = new JLabel("Godina");
		godina_label.setBounds(737, 273, 42, 17);
		godina_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(godina_label);
		
		godina_tf = new JTextField();
		godina_tf.setBackground(Color.LIGHT_GRAY);
		godina_tf.setBounds(702, 295, 112, 23);
		godina_tf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(godina_tf);
		godina_tf.setColumns(10);
		
		kilometraza_tf = new JTextField();
		kilometraza_tf.setBackground(Color.LIGHT_GRAY);
		kilometraza_tf.setBounds(702, 354, 112, 23);
		contentPane.add(kilometraza_tf);
		kilometraza_tf.setColumns(10);
		
		cena_tf = new JTextField();
		cena_tf.setBackground(Color.LIGHT_GRAY);
		cena_tf.setBounds(702, 413, 112, 23);
		contentPane.add(cena_tf);
		cena_tf.setColumns(10);
		
		
		
		
		
		JLabel proizvodjac_potvrda = new JLabel("Nisu uneti podaci");
		proizvodjac_potvrda.setBounds(10, 51, 102, 14);
		contentPane.add(proizvodjac_potvrda);
		
		JLabel marka_potvrda = new JLabel("Nisu uneti podaci");
		marka_potvrda.setBounds(10, 30, 112, 14);
		contentPane.add(marka_potvrda);
		
		JLabel gorivo_potvrda = new JLabel("Nisu uneti podaci");
		gorivo_potvrda.setBounds(10, 76, 125, 14);
		contentPane.add(gorivo_potvrda);
		
		JLabel godina_potvrda = new JLabel("Nisu uneti podaci");
		godina_potvrda.setBounds(10, 101, 125, 14);
		contentPane.add(godina_potvrda);
		
		JLabel kilometraza_potvrda = new JLabel("Nisu uneti podaci");
		kilometraza_potvrda.setBounds(10, 126, 125, 14);
		contentPane.add(kilometraza_potvrda);
		
		JLabel cena_potvrda = new JLabel("Nisu uneti podaci");
		cena_potvrda.setBounds(10, 151, 112, 14);
		contentPane.add(cena_potvrda);
		
		
		
		
		
		
		JButton okaci_oglas_btn = new JButton("Oka\u010Di oglas");
		okaci_oglas_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Potvrda_za_prodaju pzp = new Potvrda_za_prodaju();
				pzp.setVisible(true);
				dispose();
			}
		});

		okaci_oglas_btn.setEnabled(false);
		okaci_oglas_btn.setBounds(10, 172, 112, 23);
		contentPane.add(okaci_oglas_btn);
		
		JCheckBox potvrda_cb = new JCheckBox("Potvrdi podatke");
		potvrda_cb.setBackground(Color.ORANGE);
		potvrda_cb.addItemListener(new ItemListener() {
		
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					
					okaci_oglas_btn.setEnabled(true);
					
					proizvodjac_potvrda.setText(marka_tf.getText());
					marka_potvrda.setText(proizvodjac_tf.getText());
					gorivo_potvrda.setText(gorivo_tf.getText());
					godina_potvrda.setText(godina_tf.getText());
					kilometraza_potvrda.setText(kilometraza_tf.getText());
					cena_potvrda.setText(cena_tf.getText());
		        } else {
		        	okaci_oglas_btn.setEnabled(false);
		        	proizvodjac_potvrda.setText("Nisu uneti podaci");
		        	marka_potvrda.setText("Nisu uneti podaci");
					gorivo_potvrda.setText("Nisu uneti podaci");
					godina_potvrda.setText("Nisu uneti podaci");
					kilometraza_potvrda.setText("Nisu uneti podaci");
		        };
				
			}
		});
		potvrda_cb.setBounds(695, 456, 118, 23);
		contentPane.add(potvrda_cb);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(-80, 0, 230, 565);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		JButton SASVIM_UNIKATAN_BATN = new JButton("<<<");
		SASVIM_UNIKATAN_BATN.setForeground(Color.BLACK);
		SASVIM_UNIKATAN_BATN.setBackground(new Color(255, 255, 0));
		SASVIM_UNIKATAN_BATN.setBounds(88, 436, 113, 41);
		panel.add(SASVIM_UNIKATAN_BATN);
		SASVIM_UNIKATAN_BATN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				dispose();
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(674, 0, 195, 553);
		contentPane.add(panel_1);
		
		
		
		
		
		
//		if ((proizvodjac_potvrda.getText().isEmpty()) || (marka_potvrda.getText().isEmpty()) || 
//		(gorivo_potvrda.getText().isEmpty()) || (godina_potvrda.getText().isEmpty()) || 
//		(kilometraza_potvrda.getText().isEmpty())) {
//	okaci_oglas_btn.setEnabled(false);
//}
//else {
//	okaci_oglas_btn.setEnabled(true);
//}
//		System.out.println("AUTO: " + drugi_auto.getProizvodjac() + " " + drugi_auto.getModel() + " " + drugi_auto.getGorivo() + " " + drugi_auto.getGodiste());
	}
}
