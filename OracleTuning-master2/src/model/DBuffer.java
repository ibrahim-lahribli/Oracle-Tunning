package model;

public class DBuffer {
	
	private int value;
	
	

	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public DBuffer(int value) {
		super();
		this.value = value;
	}
	public DBuffer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DBuffer [value=" + value + "]";
	}
	
	
	

}
