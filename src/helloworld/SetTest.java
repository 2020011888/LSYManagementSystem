package helloworld;
import java.util.HashSet;

public class SetTest {
	public static void main(String[] args) {
		String song = "Hey Rose"
				+" I bought you five roses"
				+ " Will not you come to my show"
				+ " Show you how to live life"
				+ " you know you are fucking gold"
				+ " Give you all my time if you wanna take it slow"
				+ " Your soul is lovely";
		String[] words = song.split(" ");
		
		HashSet<String> set = new HashSet<String>(); 
		for(int i=0; i < words.length; i++) {
			set.add(words[i]);
		}
		System.out.println(set.size());
		
		HashSet<String> set1 = new HashSet<String>(); 
		for(int i=0; i < words.length; i++) {
			set1.add(words[i].toLowerCase());
		}
		System.out.println(set1.size());
	}
}