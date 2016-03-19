package decorator;

public class Bed extends Furniture {
	Room room;
	public Bed(Room room){
		this.room = room;
	}
	@Override
	public String getRoom() {
		return room.getRoom() + " Bed";
	}
}
