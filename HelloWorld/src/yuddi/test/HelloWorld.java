package yuddi.test;

//import java.util.Scanner;

public class HelloWorld {//������������ļ�ͬ��
    public static void main(String []args) {
    	func4();
    	func7();
    	func8();
    	circle circle1 = new circle();
//    	circle1.circle(7.9);
    	circle1.showradius();
    }
    
    public static void func4() {//�ַ���
    	String str = "123";
    	System.out.println(str+('a'+'b'));//�ַ�����������ӣ��������Ҽӣ����û���ַ�����Ӿ�ת��Ϊ�������
    	System.out.println(Integer.parseInt(str));
    }
    
    public static int func5(int n) {
    	if(n>0)
    		return 1;
    	else if(n==0)
    		return 0;
    	else //else if �ᱨ����Ϊ�����������û�з���ֵ
    		return -1;
    }
    
    public static void func7() {//һά����
    	int[] array = new int[10];
    	array[0]=0;
    	System.out.print(array[0]);
    }
    
    public static void func8() {//��ά����
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

class circle{//��̬��ʵ��
	double radius;
	public circle(){
		
	}
	public circle(double newradius) {//���췽��
		radius = newradius;
	}
	public void showradius() {
		System.out.println(radius+"\n");
	}
}

