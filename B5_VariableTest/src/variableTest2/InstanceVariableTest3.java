package variableTest2;

import instanceVariableTest.InstanceVariableTest1;

public class InstanceVariableTest3 extends InstanceVariableTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariableTest1 a = new InstanceVariableTest1();
		int k = a.i+a.j;//cannot be called outside the package
		System.out.println(k);
	}

}
