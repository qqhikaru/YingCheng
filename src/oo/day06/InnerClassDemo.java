package oo.day06;
//内部类的演示
public class InnerClassDemo {
	public static void main(String[] args) {
		Mama m = new Mama();
		//Baby b = new Baby(); //编译错误，内部类对外不具备可见性
	}
}

class Mama{ //外部类
	private String name;
	Baby createBaby(){
		return new Baby(); //内部类通常在外部类中创建
	}
	class Baby{ //内部类
		void show(){
			System.out.println(name);
			System.out.println(Mama.this.name);
			//System.out.println(this.name); //编译错误，当前对象Baby中没有name属性
		}
	}
}















