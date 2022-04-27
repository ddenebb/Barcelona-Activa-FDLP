/*
 * Create a new Java project with a class named "Computer", in addition to the class mentioned in main.

This class will have the attributes of the brand, the model, the processor, the amount of RAM memory and the capacity of the hard drive.

The application must be able to generate computers in different ways:

    * From the brand and the model Names 

    * Indicating all the attributes.

The Computer class must have the following methods:

    Methods that allow each attribute to be consulted
    Methods that allow to modify the processor, the quantity of ram memory and the capacity of the hard disk
    A method that will return a string per parameter and will return a string that says: 
    "At these times it is executing: 'X'" (X is the parameter returned by the method and which will normally be the name of a program) 
    Example: " Actually executing: Eclipse"
    A method that will return a full description of the host (toString()).

At the main of the project, create computers in the 2 possible ways and check that the created methods work correctly.


 */package poo_computer;

public class poo_Computer_use {
	
	public static void main(String[] args) {
		//String brandName, model, processor, ramSize, hdSize;
		
		Computer Machine1 = new Computer();
		Computer Machine2 = new Computer();
		
		Machine1.ComputerSetMakeAndModel("HP", "ENVY Desktop TE01-1150xt");
		
		Machine2.ComputerSetAllAtributes("HP", "ENVY Desktop TE01-1150xt", "Intel® Core™ i7-10700 (2.9 GHz up to 4.8 GHz, 16 MB L3 cache, 8 cores)", "32 GB DDR4-2666 SDRAM (2 x 16 GB)", "1 TB Intel® SSD + 32 GB Intel® Optane™ memory");
		
		System.out.println(Machine1.toString());
		System.out.println(Machine2.toString());
		//System.out.println(Machine1.getProperties());
		//System.out.println(Machine2.getProperties());
		/*System.out.println(Machine1.getBrand());
		System.out.println(Machine1.getModel());
		System.out.println(Machine1.getCPU());
		System.out.println(Machine1.getRam());
		System.out.println(Machine1.getHDSize());
		System.out.println(Machine2.getBrand());
		System.out.println(Machine2.getModel());
		System.out.println(Machine2.getCPU());
		System.out.println(Machine2.getRam());
		System.out.println(Machine2.getHDSize());*/
		
		System.out.println(Machine1.runningProgramInfo("Visual Code"));
		System.out.println(Machine2.runningProgramInfo("Eclipse"));

		Machine1.setCPU("Intel® Core™ i7 12700K");
		Machine1.setRam("32 GB DDR5");
		Machine1.setHDSize("SSD NVMe PCIe M.2 de 512 GB + 3,5 inches HDD SATA + 1 TB @ 7200 RPM with 64 MB cache");
		
		System.out.println(Machine1.toString());
		System.out.println(Machine2.toString());
		//System.out.println(Machine1.getProperties());
		//System.out.println(Machine2.getProperties());
		/*System.out.println(Machine1.getBrand());
		System.out.println(Machine1.getModel());
		System.out.println(Machine1.getCPU());
		System.out.println(Machine1.getRam());
		System.out.println(Machine1.runningProgramInfo("Visual Code"));

		System.out.println(Machine1.getHDSize());
		System.out.println(Machine2.getBrand());
		System.out.println(Machine2.getModel());
		System.out.println(Machine2.getCPU());
		System.out.println(Machine2.getRam());
		System.out.println(Machine2.getHDSize());
		System.out.println(Machine2.runningProgramInfo("Eclipse"));*/

	}

}
 
