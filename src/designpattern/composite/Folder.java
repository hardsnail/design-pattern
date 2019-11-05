package designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Deletable {

	private String name;

	private List<Deletable> deletableList = new ArrayList<>();

	public Folder(String name) {
		super();
		this.name = name;
	}

	public boolean add(Deletable deletable) {
		return deletableList.add(deletable);
	}

	public boolean remove(Deletable deletable) {
		return deletableList.remove(deletable);
	}

	@Override
	public void delete() {
		for (Deletable deletable : deletableList) {
			deletable.delete();
		}
		System.out.println("folder \"" + name + "\" has been deleted");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
