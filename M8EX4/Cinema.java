
public class Cinema extends Building{
	int maxCapacity;
	int ticketPrice;
	int numOfAssistants;
	
	Cinema (String type, String name, int numOfFloors, int areaSqM, int maxCapacity){
		super (type, name, numOfFloors, areaSqM);
		this.maxCapacity = maxCapacity;
		ticketPrice = 0;
		numOfAssistants = 0;
		
	}
	
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public void setNumOfAssistants(int numOfAssistants) {
		this.numOfAssistants = numOfAssistants;
	}
	
	public void movieSession(){
		if (numOfAssistants <= maxCapacity) {
			int revenue = ticketPrice * numOfAssistants;
			System.out.println ("Total session´s revenue is " + revenue + " euros ");
		} else {
			System.out.println ("Venue´s maximum capacity would be exceeded. Make sure number of assistants doesn't exceed maximum capacity");
		}
		
	}
}

