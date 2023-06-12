package instanceVariableTest;

public class InstanceVariableTest1 {
int i;//non static
int j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariableTest1 a = new InstanceVariableTest1();
		
int k =a.i+a.j;
System.out.println(k);
	}
public  static void add() {
	InstanceVariableTest1 a = new InstanceVariableTest1();
	int h = a.i+a.j;
	System.out.println(h);
}
}
