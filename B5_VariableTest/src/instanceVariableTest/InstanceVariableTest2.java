package instanceVariableTest;

public class InstanceVariableTest2 extends  InstanceVariableTest1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariableTest1 a = new InstanceVariableTest1();
int z = a.i+a.j;//can be called outside the class
System.out.println(z);
	}

}
