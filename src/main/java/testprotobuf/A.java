package testprotobuf;

import io.protostuff.Tag;

public class A {

	@Tag(1)
	String a;
	
	@Tag(2)
	int b;
	
	@Tag(3)
	long c;
	
	@Tag(4)
	String d;
	
	@Tag(5)
	B e;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public long getC() {
		return c;
	}

	public void setC(long c) {
		this.c = c;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public B getE() {
		return e;
	}

	public void setE(B e) {
		this.e = e;
	}

}
