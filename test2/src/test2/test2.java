package test2;
import static net.mindview.util.Print.*;
import java.lang.Math;
import java.util.*;

public class test2 {
	
    class Dog{  //������������static�ģ��ڲ����Ƕ�̬�ģ����о�̬��������ֱ�ӵ��ö�̬����
    			//������� ��
    			//			1�����ڲ����Ϊ��̬ static eg��statc class Dog
    			//          2���ȴ����ⲿ��ʵ���ٴ����ڲ���ʵ�� ��������
    	String names;
    	String says;
    }
    
	
    public static void main(String args[]){  
    	
    	char ch = 't';
    	System.out.println(ch);
    	Integer n1 = new Integer(47);
    	Integer n2 = new Integer(47);
    	print(n1==n2);
    	print(n1.equals(n2));//compare value
    	
    	/*        */
    	
    	Dog dog1 = new test2().new Dog();
    	Dog dog2 = new test2().new Dog();
    	dog1.names = "spot";
    	dog1.says = "Ruff";
    	dog2.names = "scruffy";
    	dog2.says = "Wurf";
    	
    	print("dog1 name is " + dog1.names + " it says " + dog1.says);
    	print("dog2 name is " + dog2.names + " it says " + dog2.says);
    	
    	/*     */
    	print(Math.E);
    	Random random = new Random(47);
        
    }
    
}
