package designpattern.composite;

/**
 * 组合模式又称为“部分-整体模式”，客户端在不用了解其内部构造的情况下，对一个整体进行操作
 * 
 * @author Administrator
 *
 */
public class CompositePattern {

	public static void main(String[] args) {
		Folder rootFolder = new Folder("root");
		Folder leftFolder = new Folder("left");
		leftFolder.add(new File("left file 1"));
		leftFolder.add(new File("left file 2"));
		leftFolder.add(new File("left file 3"));
		Folder rightFolder = new Folder("right");
		rightFolder.add(new File("right file 1"));
		rightFolder.add(new File("right file 2"));
		rightFolder.add(new File("right file 3"));
		rootFolder.add(leftFolder);
		rootFolder.add(rightFolder);
		rootFolder.delete();
	}

}
