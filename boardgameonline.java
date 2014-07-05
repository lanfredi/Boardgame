class boardgameonline {

	public static void main (String[] args){
		//declarações
		player[] jogador = new player[4];
		board a = new board();
		layout lay = new layout();
		for (int i=0;i<jogador.length;i++) {
			jogador[i] = new player();
		}
		
		//começo do jogo
		lay.begin();
		while(!lay.ready())
			lay.ready();
		lay.limpa();
		
		
		
		
		a.play(jogador);
		lay.tabela(jogador);
	}	
}