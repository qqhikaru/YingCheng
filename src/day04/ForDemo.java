package day04;
//for的演示
public class ForDemo {
	public static void main(String[] args) {
		int sum = 0; //和
		for(int i=1;i<=100;i++){
			if(i%10!=3){ //个位不得3的
				sum += i;
			}
		}
		System.out.println("sum="+sum);
		
		
		
		
		/*
		int sum = 0; //和
		for(int i=1;i<=100;i++){
			//求1到100的累加和，但是跳过个位为3的
			if(i%10==3){ //个位为3的
				continue; //跳过循环体中剩余语句而进入下一次循环
			}
			sum += i;
		}
		System.out.println("sum="+sum);
		*/
		/*
		 * sum=0
		 * i=1 sum=1
		 * i=2 sum=1+2
		 * i=3 
		 * i=4 sum=1+2+4
		 * ...
		 * i=13 
		 */
		
		
		
		
		
		
		
		
		
		
		/*
		int sum = 0; //和
		for(int i=1;i<=100;i++){
			if(sum>4000){
				break;
			}
			sum += i;
		}
		System.out.println("sum="+sum);
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		for(int i=0,j=6;i<5;i+=2,j-=2){
		}
		*/
		/*
		 * i=0,j=6
		 * i=2,j=4
		 * i=4,j=2
		 * i=6,j=0
		 */
		
		/*
		for(;;){ //没有条件的循环就是个死循环
			System.out.println("我要学习...");
		}
		*/
		
		/*
		int sum = 0;
		for(int i=1;i<=100;){
			sum += i;
			i++;
		}
		System.out.println("sum="+sum);
		*/
		
		/*
		int sum = 0;
		int i=1;
		for(;i<=100;i++){
			sum += i;
		}
		System.out.println("sum="+sum);
		*/
		
		/*
		//累加:1+2+3+4+5+...+99+100=?
		int sum = 0; //和
		for(int i=1;i<=100;i++){
			sum += i;
		}
		System.out.println("sum="+sum);
		*/
		/*
		 * sum=0
		 * i=1 sum=1
		 * i=2 sum=1+2
		 * i=3 sum=1+2+3
		 * i=4 sum=1+2+3+4
		 * ...
		 * i=100 sum=1+2+3+4+...+100
		 * i=101
		 */
		
		
		
		
		
		
		
		
		
		
		/*
		for(int times=0;times<10;times++){
			System.out.println("行动是成功的阶梯");
		}
		
		for(int num=1;num<=9;num++){
			System.out.println(num+"*9="+num*9);
		}
		*/
	}
}




















