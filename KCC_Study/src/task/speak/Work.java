package task.speak;

public class Work extends Man implements Speakable {

	public Work(String name) {
		super(name);
	}

	@Override
	public String speak() {
		return super.getName()+" 열심히 일해야 한다.";
	}

}
