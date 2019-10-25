package designpattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LogInvocationHandler implements InvocationHandler {

	private Object obj;

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		Object result = method.invoke(obj, args);
		after();
		return result;
	}

	public Object getProxy(Object obj) {
		this.obj = obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}

	private void before() {
		System.out.println("LogProxy before");
	}

	private void after() {
		System.out.println("LogProxy after");
	}
}
