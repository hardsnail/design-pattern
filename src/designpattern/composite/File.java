package designpattern.composite;

public class File implements Deletable {

	private String name;

	public File(String name) {
		super();
		this.name = name;
	}

	@Override
	public void delete() {
		System.out.println("file \"" + name + "\" has been deleted");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
