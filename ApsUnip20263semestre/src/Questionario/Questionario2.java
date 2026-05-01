package Questionario;

import model.AdicionarPontos;
import model.Sessao;

import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;


import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Questionario2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void Quest2(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questionario1 frame = new Questionario1();
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
	public Questionario2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 833, 737);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 73, 108));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel_3 = new JLabel("OceanScore");
		lblNewLabel_3.setBounds(290, 20, 182, 49);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Yu Gothic Light", Font.PLAIN, 30));
		lblNewLabel_3.setBackground(new Color(0, 128, 255));
		
		JLabel lblNewLabel = new JLabel("<html>"
				+ "Presença de Microplásticos: Ao observar a areia ou a água, você nota pequenos"
				+ "fragmentos coloridos de plástico??");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(95, 231, 631, 66);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		JLabel lblNewLabel_4 = new JLabel("@ApsUnip2026");
		lblNewLabel_4.setBounds(372, 655, 100, 14);
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setBackground(Color.WHITE);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel_3);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel(
				
				"<html>" +
			    "Nome: "   + Sessao.usuario.GetNome() + "<br>" +
			    "Estado: " + Sessao.usuario.GetEstado() + "<br>" +
			    "Cidade: " + Sessao.usuario.GetCidade() +
			    "</html>");
		
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(41, 50, 176, 97);
		contentPane.add(lblNewLabel_1);
		
		//opções A, B, C
		JRadioButton RadA = new JRadioButton("(A) Não, a areia e a água parecem limpas de partículas artificiais.");
		RadA.setForeground(new Color(128, 255, 128));
		RadA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		RadA.setBackground(new Color(0, 73, 108));
		RadA.setBounds(95, 334, 466, 49);
		contentPane.add(RadA);
		
		JRadioButton RadB = new JRadioButton("(B) Noto algumas partículas pequenas misturadas à areia.");
		RadB.setForeground(new Color(255, 255, 128));
		RadB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		RadB.setBackground(new Color(0, 73, 108));
		RadB.setBounds(95, 386, 377, 46);
		contentPane.add(RadB);
		
		JRadioButton RadC = new JRadioButton("(C) Há uma presença visível e abundante de fragmentos plásticos.");
		RadC.setForeground(new Color(255, 128, 128) );
		RadC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		RadC.setBackground(new Color(0, 73, 108));
		RadC.setBounds(95, 435, 485, 41);
		contentPane.add(RadC);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(RadA);
		grupo.add(RadB);
		grupo.add(RadC);
		
		JButton btnNewButton = new JButton("Avançar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//botão para confiar questionário
				AdicionarPontos a = new AdicionarPontos();
				if(RadA.isSelected()) {
					a.Resposta("a");
				} else if(RadB.isSelected()) {
					a.Resposta("b");
				} else if(RadC.isSelected()) {
					a.Resposta("c");
				}else {
					JOptionPane.showMessageDialog(null, "por favor, selecione uma resposta");
					return;
				}
				
				Questionario3 q3 = new Questionario3();
			    Questionario2.this.dispose(); //Fechar a tela
			    q3.setVisible(true); //ir para a proxima tela(Sobre o programa)				   
				
			}
			
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(319, 557, 153, 26);
		contentPane.add(btnNewButton);
	}
}
