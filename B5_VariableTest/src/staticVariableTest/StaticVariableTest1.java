package staticVariableTest;
//static or class level
public class StaticVariableTest1 {
static int i;
static int j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int i;
//int j;
int k =i+j;
System.out.println(k);
	}
public static void sub() {
	int h =i+j;
	System.out.println(h);
}
}
