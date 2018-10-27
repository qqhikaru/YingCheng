package oo.day04;
//static的演示
public class StaticDemo {
	public static void main(String[] args) {
		Loo o1 = new Loo();
		o1.show();
		Loo o2 = new Loo();
		o2.show();
		
		System.out.println(Loo.b); //建议类名点来访问
		//System.out.println(o1.b); //不建议通过对象来访问
		
		Moo.test();
	
		Noo o3 = new Noo();
		Noo o4 = new Noo();
		Noo o5 = new Noo();
	}
}


class Noo{ //演示静态块
	Noo(){ //创建对象时被自动执行
		System.out.println("构造方法");
	}
	static{ //类被加载时自动执行
		System.out.println("静态块");
	}
}


class Moo{ //演示静态方法
	int a;
	static int b;
	void show(){ //有隐式的this
		System.out.println(a); //this.a
		System.out.println(b); //Moo.b
	}
	static void test(){ //没有隐式的this
		//静态方法没有隐式的this，
		//没有this就意味着没有对象，
		//而实例成员必须通过对象来访问
		//静态方法中不能直接访问实例成员
		//System.out.println(a); //编译错误
		System.out.println(b); //Moo.b
	}
}


class Loo{ //演示静态变量
	int a; //实例变量
	static int b; //静态变量
	Loo(){
		a++;
		b++;
	}
	void show(){
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}












