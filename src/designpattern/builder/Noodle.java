package designpattern.builder;

public class Noodle {

	private String size;

	private Boolean withEgg;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Boolean getWithEgg() {
		return withEgg;
	}

	public void setWithEgg(Boolean withEgg) {
		this.withEgg = withEgg;
	}

	@Override
	public String toString() {
		return String.format("Size is %s, withEgg is %b", size, withEgg);
	}
}
