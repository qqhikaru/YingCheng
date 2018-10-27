package oo.day01;
//引用类型画等号与null的演示
public class RefNullDemo {
	public static void main(String[] args) {
		Cell c = new Cell();
		c.row = 2;
		c.col = 5;
		Cell cc = c; //指向了同一个对象
		cc.row = 8;
		System.out.println(c.row); //8
		
		int a=5;
		int b=a; //赋值
		b = 8;
		System.out.println(a); //5
		
		
		Cell c1 = new Cell();
		c1.row = 2;
		c1.col = 5;
		c1 = null; //空，没有指向任何对象
		//c1.row = 4; //NullPointerException空指针异常
	}
}


























