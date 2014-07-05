class player {
	int posicao = 0;
	int speed = 0;
	boolean skip = false;
	boolean dead = false;
	
	
	void anda (int i) {
		posicao += (i + speed);
	}
}