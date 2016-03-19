package decorator;

public class DecoratorTest {
	public static void main(String[] args) {
		Room room = new BedRoom("BedRoom");
		System.out.println("The room has " + room.getRoom());
		Bed roomWithBed = new Bed(room);
		System.out.println("The room has " + roomWithBed.getRoom());
		Desk roomWithDesk = new Desk(roomWithBed);
		System.out.println("The room has " + roomWithDesk.getRoom());
		Desk roomWithTwoDesk = new Desk(roomWithDesk);
		System.out.println("The room has " + roomWithTwoDesk.getRoom());
	}
}
