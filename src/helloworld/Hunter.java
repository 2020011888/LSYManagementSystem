package helloworld;

public class Hunter {
	private int power;

	Hunter(int power){
		this.power = power;
	}

	public void attack(Monster monster) {
		monster.setHp(monster.getHp() - power);
		System.out.println("Hunter attacked Monster with a power of 100.");
	}
}


