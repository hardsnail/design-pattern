package designpattern.builder;

public class Client {

	public static void main(String[] args) {
		BigEggNoodleDirector director = new BigEggNoodleDirector();
		Noodle noodle = director.create();
		System.out.println(noodle);
	}
}
