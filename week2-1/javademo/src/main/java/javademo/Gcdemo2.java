package javademo;

public class Gcdemo2 {
	int objId;

	Gcdemo2(int objId) {
		this.objId = objId;
		System.out.println("created" + this.objId);

	}

	public static void main(String[] args) {
		new Gcdemo2(1);
		new Gcdemo2(2);
		for(int i=0;i<100;i++)
		{
			System.gc();
		}

	}
	@Override
	protected void finalize() {
		System.out.println("finalized"+objId);
	}

}
