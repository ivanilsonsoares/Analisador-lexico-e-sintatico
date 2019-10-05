package lip.analex;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import lip.anasin.AnasinSimples;

import javax.swing.UIManager;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import java.awt.ScrollPane;
import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.List;
import java.awt.Font;

public class TelaInicial extends JFrame {

	private JPanel contentPane;
	private String exp1,exp2,exp3,exp4;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setTitle("Analisador l\u00E9xico e sint\u00E1tico");
		setOpacity(1.0f);
		setResizable(false);
		setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.GRAY);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//valriaveis
		exp1 = "y = 5 *(mult1 + mult2) ** 2.33";
		exp2 = "y = 6 *(mult1 + mult2) ** 2.5";
		exp3 = "x = 5.5 *(mult1 + mult2) ** 2";
		exp4 = "x = (soma + 3.4) ** (fator / 2)";
		
		JButton btnAnaliseSintatica = new JButton("An\u00E1lise Sint\u00E1tica");
		btnAnaliseSintatica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AnasinSimples anasin = new AnasinSimples(exp1);
				
				if(anasin != null) {
					anasin.anasint();
					JOptionPane.showMessageDialog(null,"\n"+ anasin);	
				}
				

			}
		});
		btnAnaliseSintatica.setBounds(20, 61, 148, 23);
		contentPane.add(btnAnaliseSintatica);
		
		JButton btnAnliseLexica = new JButton("An\u00E1lise Lexica");
		btnAnliseLexica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnalexSimples analexSimples = new AnalexSimples(exp1);
				analexSimples.analex();
				JOptionPane.showMessageDialog(null,analexSimples);
			}
		});
		btnAnliseLexica.setBounds(20, 87, 148, 23);
		contentPane.add(btnAnliseLexica);
		
		JLabel lblNewLabel = new JLabel("y = 6 *(mult1 + mult2) ** 2.5");
		lblNewLabel.setBounds(20, 155, 172, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("y = 5 *(mult1 + mult2) ** 2.33");
		lblNewLabel_1.setBounds(20, 36, 172, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("x = 5.5 *(mult1 + mult2) ** 2");
		lblNewLabel_2.setBounds(257, 36, 166, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblExpressesCadastradas = new JLabel("Express\u00F5es Analizadas");
		lblExpressesCadastradas.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 11));
		lblExpressesCadastradas.setBounds(153, 11, 148, 14);
		contentPane.add(lblExpressesCadastradas);
		
		JButton button = new JButton("An\u00E1lise Sint\u00E1tica");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AnasinSimples anasin = new AnasinSimples(exp2);
				
				if(anasin != null) {
					anasin.anasint();
					JOptionPane.showMessageDialog(null,"\n"+ anasin);	
				}
			}
		});
		button.setBounds(20, 180, 148, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("An\u00E1lise Lexica");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnalexSimples analexSimples = new AnalexSimples(exp2);
				analexSimples.analex();
				JOptionPane.showMessageDialog(null,analexSimples);
			}
		});
		button_1.setBounds(20, 205, 148, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("An\u00E1lise Sint\u00E1tica");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AnasinSimples anasin = new AnasinSimples(exp3);
				
				if(anasin != null) {
					anasin.anasint();
					JOptionPane.showMessageDialog(null,"\n"+ anasin);	
				}
				
			}
		});
		button_2.setBounds(275, 61, 148, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("An\u00E1lise Lexica");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnalexSimples analexSimples = new AnalexSimples(exp3);
				analexSimples.analex();
				JOptionPane.showMessageDialog(null,analexSimples);
			}
		});
		button_3.setBounds(275, 87, 148, 23);
		contentPane.add(button_3);
		
		JLabel lblNewLabel_3 = new JLabel("x = (soma + 3.4) ** (fator / 2)");
		lblNewLabel_3.setBounds(257, 155, 177, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton button_4 = new JButton("An\u00E1lise Sint\u00E1tica");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AnasinSimples anasin = new AnasinSimples(exp4);
				
				if(anasin != null) {
					anasin.anasint();
					JOptionPane.showMessageDialog(null,"\n"+ anasin);	
				}
				
			}
		});
		button_4.setBounds(275, 180, 148, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("An\u00E1lise Lexica");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnalexSimples analexSimples = new AnalexSimples(exp4);
				analexSimples.analex();
				JOptionPane.showMessageDialog(null,analexSimples);
			}
		});
		button_5.setBounds(275, 205, 148, 23);
		contentPane.add(button_5);
	}
}
