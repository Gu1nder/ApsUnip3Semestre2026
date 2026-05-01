package model;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class MensagemFinal {
	
	public static JLabel MensFinal() {

	    JLabel label;

	    if (Sessao.usuario.GetPontos() >= 75) {
	        label = new JLabel("<html>"
	        		+ "<h1> Oceano Resiliente!</h1> <br>"
	        		+ "<br>"
	        		+ "<h2>Status: Ecossistema Preservado</h2>"
	        		+ "<br>"
	        		+ "Essa região mostra um alto nível de preservação e consciência<br>"
	        		+ "sobre a importância de ser sustentável."
	        		+ "</html>");
	        label.setForeground(new Color(128, 255, 128));
	        label.setFont(new Font("Tahoma", Font.PLAIN, 14));

	    } else if (Sessao.usuario.GetPontos() >= 50) {
	        label = new JLabel("<html>"
	        		+ "<h1>Alerta de Degradação!</h1> <br>"
	        		+ "<br>"
	        		+ "<h2> Status: Equilíbrio Frágil</h2>"
	        		+ "<br>"
	        		+ "Existem impactos visíveis que precisam de intervenção imediata<br>"
	        		+ "para não se tornarem irreversíveis."
	        		+ "</html>");
	        label.setForeground(new Color(255, 255, 128));
	        label.setFont(new Font("Tahoma", Font.PLAIN, 14));

	    } else {
	        label = new JLabel("<html>"
	        		+ "<h1>Zona Crítica Marinha!</h1> <br>"
	        		+ "<br>"
	        		+ "<h2>Status: Perigoso para consumo</h2>"
	        		+ "<br>"
	        		+ "O ecossistema está severamente comprometido, oferecendo<br>"
	        		+ "riscos à biodiversidade e à saúde humana."
	        		+ "</html>");
	        label.setForeground(new Color(255, 128, 128));
	        label.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    }

	    return label;
	}
}