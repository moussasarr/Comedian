package myComedian;

public class Joke {
	private String jokeSetup;
	private String jokePunchline;
	
	
	public String getJokeSetup() {
		return jokeSetup;
	}


	public void setJokeSetup(String jokeSetup) {
		this.jokeSetup = jokeSetup;
	}


	public String getJokePunchline() {
		return jokePunchline;
	}


	public void setJokePunchline(String jokePunchline) {
		this.jokePunchline = jokePunchline;
	}


	public Joke(String jokeSetup, String jokePunchline) {
		this.jokeSetup = jokeSetup;
		this.jokePunchline = jokePunchline;
	}
	

}
