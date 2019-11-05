package designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class VisitableFactory {

	private Map<String, Visitable> visitableMap = new HashMap<>();

	public Visitable getVisitable(String name) {
		if (!visitableMap.containsKey(name)) {
			visitableMap.put(name, new Website(name));
			System.out.println("创建了新的网站" + name);
		} else {
			System.out.println("使用了原有网站" + name);
		}
		return visitableMap.get(name);
	}

}
