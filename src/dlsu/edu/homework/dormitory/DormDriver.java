package dlsu.edu.homework.dormitory;

import java.util.ArrayList;

public class DormDriver {
    public void display(/* provide your parameter */) {
		/* display all the guests in the room */
	}
	
	public static void displayDorms(Dormitory[] dorms) {
		int i;
		for (i = 0; i < dorms.length; i++) {
			/* display the name of the dorm, the total
			   number of rooms, and the number of rooms
			   that are not full yet 
			   Hint: override the default toString()
			   method all classes have to do most of 
			   the work for you.*/
			System.out.println(dorms[i].toString());
			
			/* 
			   Display all the names and nationalities
			   of the guests in each room. Part of the 
			   solution is to call the method display() 
			   in DormDriver. Provide your code */
			System.out.println(" ");

		}
	}
	
	
	public static void main(String[] args) {
		Dormitory[] dorms = new Dormitory[2];
		
		dorms[0] = new Dormitory("LS Dorm", 3);
		dorms[1] = new Dormitory("STC Dorm", 5, 4);

		ArrayList<Person> guests = new ArrayList<Person>();
		guests.add(new Person("Andrew", "Filipino"));
		guests.add(new Person("Miguel", "Filipino"));
		guests.add(new Person("Henry", "American"));
		guests.add(new Person("Ray", "Filipino"));
		guests.add(new Person("Bernie", "Filipino"));
		guests.add(new Person("Michael", "Singaporean"));
		guests.add(new Person("Victor", "Filipino"));
		guests.add(new Person("Dennis", "Filipino"));
		guests.add(new Person("Jaime", "Filipino"));
		
		/* Have all Filipinos be in the same room, as
		   long as they fit.  Following first come, first
		   served, those who do not fit will be assigned 
		   to the next room. Use the first dormitory for 
		   the Filipinos.  For the other nationalities, 
		   they will be assigned to the second dormitory in
		   separate rooms. Provide your code. 
		   Note: Do not hard code the adding of guests.
		*/
		
		
		
		
		
		/* Provide your code to call displayDorms() in
		   class DormDriver. */
		displayDorms(dorms);
		   
		

		/* Provide code to transfer Ray to STC Dorm, and
			he wants to be assigned to a currently unoccupied
			room. */
			
		
		
		/* Provide code to transfer Michael to the same room 
		   as Miguel */
			
		

		/* Provide your code to call displayDorms() in
		   class DormDriver. */


		   
	}
}