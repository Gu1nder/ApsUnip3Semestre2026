package model;

public class AdicionarPontos {
	
	public String a;
	public String b;
	public String c;
	
	//sistema para adicionar pontos no User -> model.Sessao
	
	public boolean Resposta(String resposta) {
	    if (resposta.equals("a")) {
	        Sessao.usuario.SetPontos(Sessao.usuario.GetPontos() + 10);
	        return true;
	    } else if (resposta.equals("b")) {
	        Sessao.usuario.SetPontos(Sessao.usuario.GetPontos() + 5);
	        return true;
	    } else if (resposta.equals("c")) {
	        return false;
	    }
	    return false;
	}
}
