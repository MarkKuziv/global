package userClient;

public class ClassRoom {
    private int id;
    private String roomManager;
    private int numberOfSeats;

    public ClassRoom(int id, String roomManager, int numberOfSeats) {
        this.id = id;
        this.roomManager = roomManager;
        this.numberOfSeats = numberOfSeats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomManager() {
        return roomManager;
    }

    public void setRoomManager(String roomManager) {
        this.roomManager = roomManager;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "id=" + id +
                ", roomManager='" + roomManager + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
