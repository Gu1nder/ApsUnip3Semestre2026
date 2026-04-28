package model;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class MensagemFinal {
	
	public static JLabel MensFinal() {

	    JLabel label;

	    if (Sessao.usuario.GetPontos() >= 75) {
	        label = new JLabel("<html>"
	        		+ "<h1> Fonte Segura</h1> <br>"
	        		+ "<br>"
	        		+ "<h2>Status: Boa qualidade</h2>"
	        		+ "<br>"
	        		+ "Este nome indica que a água passou no teste e o usuário pode confiar no abastecimento local. <br>"
	        		+ "Transmite tranquilidade e pureza."
	        		+ "</html>");
	        label.setForeground(new Color(128, 255, 128));
	        label.setFont(new Font("Tahoma", Font.PLAIN, 14));

	    } else if (Sessao.usuario.GetPontos() >= 50) {
	        label = new JLabel("<html>"
	        		+ "<h1> Ponto de Atenção</h1> <br>"
	        		+ "<br>"
	        		+ "<h2> Status: Médio para consumo</h2>"
	        		+ "<br>"
	        		+ "Este nome serve como um sinal amarelo. Indica que, embora a água chegue até a casa, existem falhas<br>"
	        		+ " no caminho (cor, cheiro ou infraestrutura) que exigem que o usuário use um filtro ou ferva a água antes de beber."
	        		+ "</html>");
	        label.setForeground(new Color(255, 255, 128));
	        label.setFont(new Font("Tahoma", Font.PLAIN, 14));

	    } else {
	        label = new JLabel("<html>"
	        		+ "<h1>Zona de Risco</h1> <br>"
	        		+ "<br>"
	        		+ "<h2>Status: Perigoso para consumo</h2>"
	        		+ "<br>"
	        		+ "É um nome forte para dar um alerta real. Indica que os dados coletados mostram grandes chances de contaminação ou<br>"
	        		+ "falta total de tratamento, sendo um perigo imediato à saúde."
	        		+ "</html>");
	        label.setForeground(new Color(255, 128, 128));
	        label.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    }

	    return label;
	}
}