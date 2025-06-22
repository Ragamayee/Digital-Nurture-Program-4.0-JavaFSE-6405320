public class Computer{
	String CPU;
	String RAM;
	String storage;
	
	private Computer(Builder b) {
		this.CPU= b.CPU;
		this.RAM= b.RAM;
		this.storage= b.storage;
	}
	
	static class Builder{
		
		String CPU;
		String RAM;
		String storage;
		
	public Builder setCPU(String CPU) {
		this.CPU= CPU;
		return this;
	}
	
	public Builder setRAM(String RAM) {
		this.RAM= RAM;
		return this;
	}
	
	public Builder set_storage(String storage) {
		this.storage= storage;
		return this;
	}
	
	public Computer build() {
		return new Computer(this);
	}

	}
	
}