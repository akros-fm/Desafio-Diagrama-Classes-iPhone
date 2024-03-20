package modelagem_Iphone;

public interface AppTelefone {
	public void fazerChamada(int numero);
	public void receberChamada(boolean atende, int numero);
	public void acessarCorreioDeVoz(String conteudoMsg, int numeroContato);
	public void fazerChamadaCorreioDeVoz(String conteudoMsg, int numeroContato);
	public void receberChamadaCorreioDeVoz(String conteudoMsg, int numeroContato, boolean atende);
	}
