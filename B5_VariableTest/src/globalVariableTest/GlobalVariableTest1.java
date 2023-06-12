package globalVariableTest;

public class GlobalVariableTest1 {
public static int i;
public static int j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int i;//declare
//int j;//declare
int k =i+j;//operation
System.out.println(k);//default value
	}
public static void add() {
	int k =i+j;//can be called within the class
	System.out.println(k);
	
}
}
