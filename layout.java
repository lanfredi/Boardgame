import java.lang.Object;
import java.util.*;

class layout{

	//método rodado no começo do jogo, coloque aqui as instruçoes, etc.
	void begin(){
		limpa();
		System.out.println("Bem-vindo ao Boardgame-Online Ofline Edition!\n\nEsse e um jogo de tabuleiro baseado em rodadas em que seu objetivo e chegar o mais longe possivel em 20 rodadas."); 
		System.out.println("A cada turno todos os jogadores lancam um dado e andam o numero de casas indicado pela soma dos valores dos dados.\nPorém a cada turno existe uma chance de ocorrer um evento que pode ajuda-lo ou atrapalha-lo em seu objetivo.");
	
	}
	
	//na verdade esse aqui é bem inútil, só começa o jogo se o jogador apertar 1
	boolean ready(){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("\nPressione '1' para comecar!");
			if(sc.nextInt() == 1){
				return true;
			}
			else{
				return false;
			}
		}
		catch (InputMismatchException ex){
			return false;
			
		}
	}	
	
	//"limpa" a tela
	void limpa(){
		for(int i=0; i<300; i++)
			System.out.println("\n");
	}

	//mostra uma tabela com as posiçoes dos jogadores
	void tabela(player[] jogador){
		limpa();
		System.out.println("----------------------------------------------------------------------");
		for(int i=0; i<jogador.length; i++)
			System.out.println("Jogador [" + i + "] -> Casa " + jogador[i].posicao + " | Velocidade " + jogador[i].speed);
		System.out.println("----------------------------------------------------------------------");
	
	}
}