package net.punktuelles;

public class GenericOne<T> {

	private T t;

	public void SetData(T value) {
		this.t = value;
	}

	public void GetData() {
		System.out.println(t);
	}

	public static void main(String[] args) {
		GenericOne<String> s1 = new GenericOne<String>();
		GenericOne<Integer> s2 = new GenericOne<Integer>();
		String s;

		s = "what the hell";
		s1.SetData(s);
		s1.GetData();
		s2.SetData(Integer.valueOf(5));
		s2.GetData();
	}
}
