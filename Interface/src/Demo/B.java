package Demo;

public interface B {

	interface c {
		void m4();
	}
	
	interface d extends c{
		void m5();
	}
	class A implements c,d
	{

		@Override
		public void m5() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void m4() {
			// TODO Auto-generated method stub
			
		}
		
	}
	int a=10;
	void m1();
}
