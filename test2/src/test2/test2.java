package test2;
import static net.mindview.util.Print.*;

public class test2 {
	
    static class Dog{  //������������static�ģ��ڲ����Ƕ�̬�ģ����о�̬��������ֱ�ӵ��ö�̬����
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
    	
    	Dog spot = new Dog();
    	Dog scruffy = new Dog();
    	spot.names = "spot";
    	spot.says = "Ruff";
    	scruffy.names = "scruffy";
    	scruffy.says = "Wurf";
        
    }
    
}
