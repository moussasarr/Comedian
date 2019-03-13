package myComedian;
import java.util.ArrayList;

public class JokeBot extends Bot {
	protected  ArrayList<Joke> jokesIKnow;
	
	public JokeBot(ArrayList<Joke> jokesIknow) {
		this.jokesIKnow = jokesIknow;
	}
	
	public void tellJoke() {
		Double rand = Math.random()*(jokesIKnow.size());
		int jokeIndex = rand.intValue();
		Joke jokeToSay = jokesIKnow.get(jokeIndex);
		sayJoke(jokeToSay);
	}
	
	protected void sayJoke(Joke joke) {
		talk(joke.getJokeSetup());
		talk(joke.getJokePunchline());
	}
}
