package designpattern.builder;

public class NoodleBuilder {

	private Noodle noodle;

	public NoodleBuilder() {
		noodle = new Noodle();
	}

	public NoodleBuilder size(String size) {
		noodle.setSize(size);
		return this;
	}

	public NoodleBuilder withEgg(Boolean withEgg) {
		noodle.setWithEgg(withEgg);
		return this;
	}

	public Noodle build() {
		return noodle;
	}
}
