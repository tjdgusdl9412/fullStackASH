public class Human implements Runnable, Stop{

	@Override
	public void runnable() {
		System.out.println("human runnable");
	}

	@Override
	public void stop() {
		System.out.println("human stop");		
	}
}