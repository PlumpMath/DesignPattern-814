package decorator;

public class Desk extends Furniture {
	Room room;
	public Desk(Room room){
		this.room = room;
	}
	@Override
	public String getRoom() {
		return room.getRoom() + " Desk";
	}
}
