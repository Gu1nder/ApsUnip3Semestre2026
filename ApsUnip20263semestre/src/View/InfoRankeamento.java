package View;

import java.awt.EventQueue;
import Questionario.Questionario1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InfoRankeamento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void InfoRankeament() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoRankeamento frame = new InfoRankeamento();
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
	public InfoRankeamento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 800);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 73, 108));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel_3 = new JLabel("OceanScore");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Yu Gothic Light", Font.PLAIN, 30));
		lblNewLabel_3.setBackground(new Color(0, 128, 255));
		
		JLabel lblNewLabel_4 = new JLabel("@ApsUnip2026");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setBackground(Color.WHITE);
		
		JLabel lblNewLabel = new JLabel("<html>" +
                "<h2>Oceano Resiliente</h2>" +
                "<br>" +
                "<b>Status:</b> Indica que a região apresenta alto nível de conservação e consciência sobre o" +
                "uso sustentável dos recursos marinhos.<br><br>" +
                "</html>");
		lblNewLabel.setForeground(new Color(128, 255, 0));
		
		
		JLabel lblNewLabel_2 = new JLabel(
		        "<html>"
		        +"<h2>Alerta de Degradação</h2>" 
		        + "<b>Status:</b> Equilíbrio Frágil<br><br>" 
		        +"Indica impactos visíveis. É necessário reforçar a fiscalização e reduzir o" 
		        + "descarte de resíduos para proteger a vida na água. <br><br>"

		        + "</html>");
		lblNewLabel_2.setForeground(new Color(255, 255, 128));
		
		JLabel lblNewLabel_5 = new JLabel(
		        "<html>" 
		        + "<h2>Zona Crítica Marinha</h2>" 
		        + "<br>" 
		        + "<b>Status:</b> Risco Ambiental Alto<br><br>" 
		        + "Alerta máximo! O ecossistema está severamente comprometido por poluição" 
		        + "ou exploração predatória. Ação urgente necessária."
		        + "</html>");
		lblNewLabel_5.setForeground(new Color(255, 128, 128));
		
		JLabel lblNewLabel_6 = new JLabel("<html>"
				+"O ranking da qualidade da água da sua cidade está sendo classificado da seguinte forma:"
				+"</html>");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//botão para a proxima pagina
				Questionario1 q = new Questionario1();
				
			    InfoRankeamento.this.dispose(); 
			    q.setVisible(true); 
			}
		});
		btnContinuar.setForeground(Color.BLACK);
		btnContinuar.setBackground(new Color(255, 255, 255));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(260)
							.addComponent(lblNewLabel_3))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(114)
							.addComponent(lblNewLabel_6))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(149)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 419, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(149)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 419, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(149)
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 386, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
								.addGap(307)
								.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
								.addGap(260)
								.addComponent(btnContinuar, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(128, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(11)
					.addComponent(lblNewLabel_3)
					.addGap(26)
					.addComponent(lblNewLabel_6)
					.addGap(6)
					.addComponent(lblNewLabel)
					.addGap(6)
					.addComponent(lblNewLabel_2)
					.addGap(6)
					.addComponent(lblNewLabel_5)
					.addGap(42)
					.addComponent(btnContinuar, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(lblNewLabel_4)
					.addGap(156))
		);
		contentPane.setLayout(gl_contentPane);

	}

}
