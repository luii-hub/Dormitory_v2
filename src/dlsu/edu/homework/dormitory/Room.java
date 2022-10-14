package dlsu.edu.homework.dormitory;

import java.util.ArrayList;

public class Room {

    private int capacity;
    private int number;
    private ArrayList<Person> guests = new ArrayList<Person>();

    public Room(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
    }

    public Room(int number) {
        this.number = number;
        this.capacity = 6;
    }

    public int getGuestCount() {
        return guests.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public void addGuest(Person guest) {
        guests.add(guest);
    }

    //Get Guest Room Number, Guest Name, and Guest Nationality.
    public String getGuestInfo(){
        String guestInfo = "";
        if(guests.size() != 0){
            guestInfo += "Room Number: " + this.number + "\n";
            for(Person guest : guests){
                guestInfo += "Guest: " + guest.getName() + ", " + guest.getNationality() + "\n";
            }
            return guestInfo;
        }
        return null;
    }

    public ArrayList<Person> getGuestList(){
        return guests;
    }
}


