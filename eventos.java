import java.lang.Math;

class eventos {
	player jogador;
	void gera() {
		int i = (int)(Math.random()*5);
		acontece(i);
	}
	//Eventos vão existir aqui
	void acontece(int i) {
		switch (i) {
			case 1:
				jogador.skip = true;
				System.out.println("Jogador perdeu o turno");
				break;
			case 2:
				int j = (int)(Math.random()*5)*-1;
				jogador.anda(j);
				System.out.println("Voltou "+j);
				break;
			case 3:
				jogador.speed+=1;
				System.out.println("Jogador tomou toddynho, agora esta mais rapido");
				break;
			case 4:
				jogador.speed-=1;
				System.out.println("Jogador cansou de correr, agora esta mais lento");
				break;
			default:
				break;
		}
	}
}