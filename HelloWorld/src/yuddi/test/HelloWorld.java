package yuddi.test;

//import java.util.Scanner;

public class HelloWorld {//公共类必须与文件同名
    public static void main(String []args) {
    	func4();
    	func7();
    	func8();
    	circle circle1 = new circle();
//    	circle1.circle(7.9);
    	circle1.showradius();
    }
    
    public static void func4() {//字符串
    	String str = "123";
    	System.out.println(str+('a'+'b'));//字符串和数字相加，从左向右加，如果没有字符串相加就转化为数字相加
    	System.out.println(Integer.parseInt(str));
    }
    
    public static int func5(int n) {
    	if(n>0)
    		return 1;
    	else if(n==0)
    		return 0;
    	else //else if 会报错，因为编译器会觉得没有返回值
    		return -1;
    }
    
    public static void func7() {//一维数组
    	int[] array = new int[10];
    	array[0]=0;
    	System.out.print(array[0]);
    }
    
    public static void func8() {//二维数组
    	int[][] array = new int[5][5];
    	for(int j=0;j<5;j++) {
    		for(int i=0;i<5;i++) {
    			array[j][i]=j*10+i;
    		}
    	}
    	for(int j=0;j<5;j++) {
    		for(int i=0;i<5;i++) {
    			System.out.print(array[j][i]+"\n");
    		}
    	}
    	System.out.println(array.length);
    }
}

class circle{//静态与实例
	double radius;
	public circle(){
		
	}
	public circle(double newradius) {//构造方法
		radius = newradius;
	}
	public void showradius() {
		System.out.println(radius+"\n");
	}
}

