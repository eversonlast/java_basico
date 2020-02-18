package oo.composicao;

public class Motor
{
	double fatorinjecao = 1;
	boolean ligado = false;
	
	int giros() {
		if(!ligado) {
			return 0;
		}else {
			return (int)Math.round(fatorinjecao * 3000);
		}
	}
}
