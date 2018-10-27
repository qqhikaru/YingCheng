package oo.day04;
//final的演示
public class FinalDemo {
	public static void main(String[] args) {
		
	}
}


//演示final修饰类
final class Roo{}
//class Soo extends Roo{} //编译错误，final的类不可被继承
class Too{}
final class Uoo extends Too{}


//演示final修饰方法
class Poo{ 
	void show(){}
	final void test(){}
}
class Qoo extends Poo{
	void show(){}
	//void test(){} //编译错误，final的方法不可被重写
}

/*
 * final修饰成员变量，两种初始化方式:
 *   1)声明的同时初始化
 *   2)在构造方法中初始化
 * final修饰局部变量，用之前初始化即可
 */

class Ooo{ //演示final修饰变量
	final int a = 5;
	final int b;
	Ooo(){
		b = 6;
	}
	void show(){
		final int c;
		//a = 55; //编译错误，final的变量不可被改变
	}
}















