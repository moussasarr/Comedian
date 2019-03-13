package myComedian;


public class ComedianBot extends JokeBot {
	
	
	public ComedianBot() {
		 super(null);
		 jokesIKnow = JokeWriter.getJokeListTwo();
	}
	
	public void performShow() {
		talk("Good evening Ladies and gentlemen. My name is " + getName());
		talk("Why don' t I tell you some of my favorite jokes ?");
		
		for(Joke joke : jokesIKnow) {
			sayJoke(joke);
		}
		System.out.println("Thanks and Have a Good Night");
	}

}
