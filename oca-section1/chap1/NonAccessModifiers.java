package chap1;

public class NonAccessModifiers {

	public final void trial(int s, final int ss){
		//ss++;
		final int x;
		x=2;
		//x=3;
	}
	public void trial2(int s, final int ss){
		//ss++;
		final int x;
		x=2;
		//x=3;
	}
	NonAccessModifiers anany = new NonAccessModifiers(){
		public void trial2(int arg0, int arg1) {
			// TODO Auto-generated method stub
			super.trial2(arg0, arg1);
		}
		//trial metotunu override edemezsin çünkü final	
	};
	
	public native void go();
}
