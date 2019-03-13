package myComedian;

public class Bot {
  private static final String creatorName = "Moussa Sarr";
  private  String name ="ROBOT_X";
  
  

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


protected void talk(String whatToSay) {
	System.out.println(getName() + ": " + whatToSay);
}
  
}
