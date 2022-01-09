public class HumanTest {
    public static void main(String[] args) {

		Human human = new Human();
		
		Runnable runnable = human;
		runnable.runnable();
		
		
		Stop stop = human;
		stop.stop();
		
		Human person = human;
		person.runnable();
		person.stop();
		
	}

}
