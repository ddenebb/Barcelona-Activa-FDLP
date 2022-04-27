package poo_computer;

public class Computer {
	// attributes
	private String brand;
	private String model;
	private String processor;
	private String ramSize;
	private String hdSize;

	public Computer(){
		brand = "Dell";
		model = "XPS";
		processor = " Intel® Core™ i5-12600T";
		ramSize = "8GB DDR5";
		hdSize = "SSD 512 GB";
	}
	
	public void ComputerSetMakeAndModel(String brand, String model) {
		this.brand = brand;
		this.model = model;		
	}
	
	public void ComputerSetAllAtributes(String brand, String model, String processor, String ramSize, String hdSize) {
		this.brand = brand;
		this.model = model;
		this.processor = processor;
		this.ramSize = ramSize;
		this.hdSize = hdSize;
	}
		
	//getter methods
	public String getProperties() {
		return("Computer brand is " + brand + " " + model + ", " + "Processor is " + processor + ", has " + ramSize + " of RAM and the size oh the hard drive is " + hdSize);
	}
	public String getBrand() {
		return("Computer brand is " + brand);
	}
	public String getModel() {
		return("Computer model is " + model);
	}
	public String getCPU() {
		return("Computer processor is " + processor);
	}
	public String getRam() {
		return("Total RAM memory is " + ramSize);
	}
	public String getHDSize() {
		return("Hard drive size is " + hdSize);
		}
	//setter methods
	public void setCPU(String setCPU) {
		processor = setCPU;
		}
	public void setRam(String setRam) {
		ramSize = setRam;
		}
	public void setHDSize(String setHDSize) {
		hdSize = setHDSize;
		}
	
	public String runningProgramInfo(String RunProg) {
		return("Currently running: " + RunProg);
	}
	public String toString(){//overriding the toString() method  
		  return brand+" "+model+" "+processor+" "+ramSize+" "+hdSize;  
	}
	
	
} // final de la classe
