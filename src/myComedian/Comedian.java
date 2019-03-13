package myComedian;
import java.util.ArrayList;

public class Comedian {

	public static void main(String[] args) {
		ArrayList<Joke> jokeListOne = JokeWriter.getJokeListOne();
		JokeBot jokeBot = new JokeBot(jokeListOne);
		jokeBot.tellJoke();
		
		
		jokeBot.jokesIKnow = JokeWriter.getJokeListTwo();
		ComedianBot drHilarious = new ComedianBot();
		drHilarious.performShow();

	}

}
