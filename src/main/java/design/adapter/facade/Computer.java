package design.adapter.facade;

public class Computer {
	private CPU cpu;
	private Disk disk;
	private Memory memory;
	
	public Computer(){
		cpu = new CPU();
		disk = new Disk();
		memory = new Memory();
	}
	
	public void startup(){
		System.out.println("computer start up.");
		cpu.startup();
		disk.startup();
		memory.startup();
	}
	
	public void shutdown(){
		System.out.println("computer shut down.");
		cpu.shutdown();
		disk.shutdown();
		memory.shutdown();
		
	}

}
