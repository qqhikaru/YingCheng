package day05;
import java.util.Arrays;
//数组的演示
public class ArrayDemo {
	public static void main(String[] args) {
		//6.数组的排序:
		int[] arr = {32,24,2,54,6,13,0,98};
		for(int i=0;i<arr.length-1;i++){ //控制轮数
			for(int j=0;j<arr.length-1-i;j++){ //控制次数
				if(arr[j]<arr[j+1]){ //每次都是和它的下一个元素比
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
				//若前数大于后数则交换，保证前数小于后数---升序
				//若前数小于后数则交换，保证前数大于后数---降序
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		/*
		int[] arr = {32,24,2,54,6,13,0,98};
		Arrays.sort(arr); //升序排列
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		*/
		
		/*
		//5.数组的复制:
		int[] a = {10,20,30,40,50};
		//数组的扩容(创建了一个新的数组并将源数组数据复制过去了)
		a = Arrays.copyOf(a,a.length+1);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		*/
		
		/*
		int[] a = {10,20,30,40,50};
		//a:源数组
		//a1:目标数组
		//6:目标数组的元素个数
		int[] a1 = Arrays.copyOf(a,4);
		for(int i=0;i<a1.length;i++){
			System.out.println(a1[i]);
		}
		*/
		
		/*
		int[] a = {10,20,30,40,50};
		int[] a1 = new int[6]; //0,0,0,0,0,0
		//a:源数组
		//1:源数组的起始下标
		//a1:目标数组
		//0:目标数组的起始下标
		//4:要复制的元素个数
		System.arraycopy(a,1,a1,0,4);
		for(int i=0;i<a1.length;i++){
			System.out.println(a1[i]);
		}
		*/
		
		
		
		/*
		 * 数组的练习:
		 * 1.声明整型数组arr，包含5个元素
		 * 2.声明整型数组arr1，并直接赋值为1,3,5
		 *   声明整型数组arr2，先new再直接赋值为1,3,5
		 *   声明整型数组arr3，
		 *     给arr3赋值为1,3,5-----------???
		 * 3.声明整型数组arr4，包含3个元素
		 *   输出arr4的长度
		 *   给arr4中第1个元素赋值为100
		 *   给arr4中第2个元素赋值为200
		 *   给arr4中第3个元素赋值为300
		 *   arr4[3] = 400;----------------???
		 *   输出arr4中最后一个元素的值(下标不能写死)
		 * 4.创建类MaxOfArray，在main()中:
		 *   1)声明整型数组arr，包含10个元素
		 *   2)遍历arr数组，给arr中每个元素赋值为0到99的随机数
		 *   3)遍历arr数组，输出arr中每个元素的值
		 */
		
		/*
		//4.数组的遍历:
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100);
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		*/
		
		/*
		//3.数组的访问:
		int[] arr = new int[3];
		System.out.println(arr.length); //3
		arr[0] = 100; //给arr中第1个元素赋值为100
		arr[1] = 200; //给arr中第2个元素赋值为200
		arr[2] = 300;
		//arr[3] = 400; //数组下标越界异常
		System.out.println(arr[arr.length-1]); //输出arr中最后一个元素的值
		*/
		
		/*
		//2.数组的初始化:
		int[] arr = new int[3]; //0,0,0
		int[] arr1 = {1,4,7}; //1,4,7
		int[] arr2 = new int[]{1,4,7}; //1,4,7
		int[] arr3;
		//arr3 = {1,4,7}; //编译错误
		arr3 = new int[]{1,4,7}; //正确
		*/
		
		/*
		//1.数组的定义:
		//声明整型数组arr，包含10个元素
		//每个元素都是int型，默认值为0
		int[] arr = new int[10];
		*/
	}
}



















