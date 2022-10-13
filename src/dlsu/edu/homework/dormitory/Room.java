package dlsu.edu.homework.dormitory;

public class Room {

    public int capacity;
    private int number;

    public Room(int number, int capacity){
        this.number = number;
        setCapacity(capacity);
    }

//    public Room(int number){
//        this.number = number;
//        this.capacity = 6;
//    }

    public void setCapacity(int capacity) {
        do {
            this.capacity = capacity;
            if(capacity > 6){
                System.out.println("Error: A room can only accommodate up to six guests at most.");
            }
        } while(this.capacity > 6);

    }

    public void setNumber(int number) {
        this.number = number;
    }

}


