import java.util.Scanner;
import java.lang.Math;
class board {
	
	int size;
	int turns = 20;
	int thisturn = 1;
		
	
	//Métodos principais
	//Enquanto o jogo está rodando, roda a rotina padrão de um turno (exceções serão tratadas em turno())
	void play(player[] jogador){
		while (isHappening()) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Turno "+thisturn+"/"+turns);
			for(int i=0;i<jogador.length;i++) {
				turno(jogador[i]);
				System.out.println("Posicao do jogador["+i+"] = "+jogador[i].posicao);
			}
			thisturn++;
			//Faz esperar um enter ;)
			sc.nextLine();
		}
	}
	
	//Faz o turno acontecer, e um evento no final
	void turno (player jogador) {
		eventos event = new eventos();
		
		if (!jogador.skip) {
			int dado1 = (int)(Math.random()*6)+1;
			wait(1);
			int dado2 = (int)(Math.random()*6)+1;
			wait(1);
			int dado=dado1+dado2;
			System.out.println("Dado = "+dado);
			jogador.anda(dado);
			event.jogador = jogador;
			event.gera();
		} else jogador.skip = false;
	}
	
	
	
	
	
	
	//Métodos auxiliares
	//Testa se o jogo está acontecendo a qualquer momento (vai ser um aglomerado de ifs)
	boolean isHappening () {
		if (thisturn<=turns) {
			return true;
		}
		else return false;
	}
	
	//Método pra esperar n milisegundos (corrigir o random)
	public static void wait (int n){
		long t0, t1;
		t0 = System.currentTimeMillis();
		do {
			t1 = System.currentTimeMillis();
		} while (t1 - t0 < n);
	}

}