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
            rooms.add(new Room(i+1, 6));
        }
    }

//    public bool isValidGuest(Person acceptGuest, Room acceptRoom){
//        if(acceptRoom.capacity)
//    }
    public void setName(String name) {
        this.name = name;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public String toString() {
        return "Dorm: " + name + "\n" + "No. of Rooms: " + roomCount + "\n" + "Full Rooms: " + "N/A" + "\n";
    }
}
