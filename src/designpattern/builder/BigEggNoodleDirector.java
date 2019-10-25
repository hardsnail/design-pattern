package designpattern.builder;

public class BigEggNoodleDirector {

	private NoodleBuilder builder = new NoodleBuilder();

	public Noodle create() {
		builder.size("Big");
		builder.withEgg(true);
		return builder.build();
	}
}
