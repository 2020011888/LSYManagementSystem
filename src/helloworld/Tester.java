package helloworld;

public class Tester {
public static void main(String[] args) {

		Monster monster = new Monster(1000);
		Hunter hunter = new Hunter(100);

		hunter.attack(monster);
		System.out.println("Monster has " +  monster.getHp() + " hp.");
	}
}
