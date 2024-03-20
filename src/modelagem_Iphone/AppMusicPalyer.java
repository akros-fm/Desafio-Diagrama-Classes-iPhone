package modelagem_Iphone;

import java.lang.reflect.Array;

public interface AppMusicPalyer {
	public void tocarFaixa(String music, boolean tocar);
	public void pausarFaixa(String music, boolean pausar);
	public void escolherFaixa(String music, Array Album, Array Artista);
}
