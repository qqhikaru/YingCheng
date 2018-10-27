package day05;
//冒泡排序
public class BubbleSort {
	public static void main(String[] args) {
		/*
		 * 要求:
		 * 1)声明整型数组arr，包含10个元素
		 *   遍历数组，给每个元素赋值为0到99之间的随机数
		 *   遍历数组，输出每一个元素的值
		 * 2)对arr数组进行升序排序--冒泡算法实现
		 * 3)遍历数组，输出arr中的每一个元素的值
		 */
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100);
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr.length-1;i++){ //控制轮数
			for(int j=0;j<arr.length-1-i;j++){ //控制次数
				if(arr[j]<arr[j+1]){ //每次都是和它的下一个元素比
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		
		System.out.println("排序后:");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		
	}
}














