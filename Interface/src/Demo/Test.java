package Demo;

public class Test implements A,B{

	
	public static void main(String[] args) {
	//	System.out.println(a);
		System.out.println(b);
		Test t=new Test();
		t.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m11111");
	}
}
