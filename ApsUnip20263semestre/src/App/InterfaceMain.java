package App;

import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import View.SobreOPrograma;
import model.Sessao;
import model.User;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceMain extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField CidadePanel;
	private JTextField EstadoPanel;
	private JTextField NomePanel;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceMain frame = new InterfaceMain();
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
	public InterfaceMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 324, 327);
		
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 73, 108));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(29, 110, 61, 26);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		JLabel lblNewLabel_1 = new JLabel("Estado:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(46, 147, 71, 19);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		JLabel lblNewLabel_2 = new JLabel("Cidade:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(29, 177, 71, 26);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		CidadePanel = new JTextField();
		CidadePanel.setBounds(110, 184, 130, 20);
		CidadePanel.setColumns(10);
		
		EstadoPanel = new JTextField();
		EstadoPanel.setBounds(127, 150, 113, 20);
		EstadoPanel.setColumns(10);
		
		NomePanel = new JTextField();
		NomePanel.setBounds(104, 119, 137, 20);
		NomePanel.setColumns(10);
		contentPane.setLayout(null);
		
		lblNewLabel_3 = new JLabel("HydroScore");
		lblNewLabel_3.setBackground(new Color(0, 128, 255));
		lblNewLabel_3.setBounds(69, 48, 163, 49);
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Yu Gothic Light", Font.PLAIN, 30));
		contentPane.add(lblNewLabel_3);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblNewLabel_2);
		contentPane.add(EstadoPanel);
		contentPane.add(CidadePanel);
		contentPane.add(lblNewLabel);
		contentPane.add(NomePanel);
		
		User u = new User();
		//botão de continue q está abaixo do login
		JButton btnNewButton = new JButton("Avançar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SobreOPrograma s = new SobreOPrograma();
				
				
				//botão para colocar sua cidade e estado
				u.SetEstado(CidadePanel.getText());
				u.SetCidade(EstadoPanel.getText());
				
				
				String nome = NomePanel.getText();
				String estado = EstadoPanel.getText();
				String cidade = CidadePanel.getText();
				
				//estrutura condicional q adicionei para o login do programa
				if (nome.isEmpty()) {
				    JOptionPane.showMessageDialog(null, "Por favor preencha o seu Nome!");
				} else if (!nome.matches("[a-zA-ZÀ-ÿ ]+")) {
				    JOptionPane.showMessageDialog(null, "O campo de Nome só aceita letras!");
				} else if (estado.isEmpty()) {
				    JOptionPane.showMessageDialog(null, "Por favor coloque o nome do seu Estado!");
				} else if (!estado.matches("[a-zA-ZÀ-ÿ ]+")) {
				    JOptionPane.showMessageDialog(null, "O campo de Estado só aceita letras!");
				} else if (cidade.isEmpty()) {
				    JOptionPane.showMessageDialog(null, "Por favor coloque o nome da sua Cidade!");
				} else if (!cidade.matches("[a-zA-ZÀ-ÿ ]+")) {
				    JOptionPane.showMessageDialog(null, "O campo de Cidade só aceita letras!");
				} else {
					//aqui envia os dados digitado no formulário para o User e os dados são guardado na sessão
					
					u.SetNome(nome);
					u.SetEstado(estado);
					u.SetCidade(cidade);
					Sessao.usuario = u;
					
				    JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!");

				    InterfaceMain.this.dispose(); //Fechar a tela
				    s.setVisible(true); //ir para a proxima tela(Sobre o programa)				   
				}
			}
			
			
			
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(82, 220, 153, 26);
		contentPane.add(btnNewButton);
		
		lblNewLabel_4 = new JLabel("@ApsUnip2026");
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(110, 263, 105, 14);
		contentPane.add(lblNewLabel_4);

	}
}
