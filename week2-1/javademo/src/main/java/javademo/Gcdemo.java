package javademo;

public class Gcdemo {
	int objId;

	Gcdemo(int objId) {
		this.objId = objId;
		System.out.println("created" + this.objId);

	}

	public static void main(String[] args) {
		for(int i=0;i<10000;i++)
		{
			new Gcdemo(i);
		}

	}
	@Override
	protected void finalize() {
		System.out.println("finalized"+objId);
	}

}
