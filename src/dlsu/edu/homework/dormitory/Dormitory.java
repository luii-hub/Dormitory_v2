package dlsu.edu.homework.dormitory;

import java.util.ArrayList;

public class Dormitory {
    private String name;
    private int roomCount;
    private ArrayList<Room> rooms = new ArrayList<Room>();

    public Dormitory(String name, int roomCount,  int roomCapacity){
        this.name = name;
        this.roomCount = roomCount;
        for(int i = 0; i < roomCount; i++){
            rooms.add(new Room(i+1, roomCapacity));
        }
    }
    public Dormitory(String name, int roomCount){
        this.name = name;
        this.roomCount = roomCount;
        for(int i = 0; i < roomCount; i++){
            rooms.add(new Room(i+1));
        }
    }

    public int getRoomCount() {
        return rooms.size();
    }

    //Accept Guest given Room Number
    public boolean acceptGuest(Person guest, int roomNumber){

        if(rooms.size() < roomNumber){
            return false;
        }
        else if(rooms.get(roomNumber - 1).getGuestCount() >= rooms.get(roomNumber - 1).getCapacity()){
            if(rooms.get(roomNumber - 1).getGuestCount() == rooms.get(roomNumber - 1).getCapacity()){

            }
            return false;
        }
        else{
            //Accept Guest into a room given its room number
            rooms.get(roomNumber - 1).addGuest(guest);
            return true;
        }
    }

    public String returnGuest(int roomNumber) {
        if(roomNumber > rooms.size()){
            return null;
        }
        else {
            return rooms.get(roomNumber-1).getGuestInfo();
        }
    }

    public void removeGuest(String name){
        for (Room room : rooms) {
            ArrayList<Person> guestList = room.getGuestList();
            for (int j = 0; j < guestList.size(); j++) {
                if (guestList.get(j).getName().compareTo(name) == 0) {
                    guestList.remove(j);
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public String toString() {
        int vacant = 0;

        for(int i = 0; i < rooms.size(); i++){
            if(rooms.get(i).getCapacity() > rooms.get(i).getGuestCount()){
                vacant++;
            }
        }

        return "Dorm: " + name + "\n" + "No. of Rooms: " + rooms.size() + "\n" + "Available Rooms: " + vacant + "\n";
    }
}
