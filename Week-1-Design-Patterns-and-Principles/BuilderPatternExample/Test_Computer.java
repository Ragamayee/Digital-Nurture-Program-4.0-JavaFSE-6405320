public class Test_Computer{
	public static void main(String[] args) {
		Computer.Builder gamingPC = new Computer.Builder();
		gamingPC.setCPU("Intel i9");
		gamingPC.setRAM("32GB");
		gamingPC.set_storage("1TB SSD");
		gamingPC.build();

        Computer.Builder officePC = new Computer.Builder();
        officePC.setCPU("Intel i5");
        officePC.setRAM("8GB");
        officePC.set_storage("512GB SSD");
        officePC.build();
        
        System.out.println("Gaming PC: \n"+ gamingPC.CPU+"\n"+ gamingPC.RAM+"\n"+ gamingPC.storage+"\n");
        System.out.println("Office PC: \n"+officePC.CPU+"\n"+ officePC.RAM+"\n"+ officePC.storage);
	}
}