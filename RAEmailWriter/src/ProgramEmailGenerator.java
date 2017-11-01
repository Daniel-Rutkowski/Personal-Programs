import java.util.ArrayList;
import java.util.Scanner;

public class ProgramEmailGenerator {
	
	// This program is used to generate the text for Email Announcements to my Hall I am in charge of as a Resident Assistant.
	private String eventName = "Frisbee Game";
	private String eventDay = "Tuesday";
	private String eventTime = "3PM";
	private String eventLocation = "Walker Lawn";
	private ArrayList<String> eventDetails = new ArrayList<String>();
	
	public static void main(String[] args) {
		ProgramEmailGenerator init = new ProgramEmailGenerator();
		init.emailWriter();
	}

	public void emailWriter() {
		Scanner scanner = new Scanner(System.in);
		int numOfDetails = 0;
		try {
			System.out.println("Event Name");
			eventName = scanner.nextLine();
			System.out.println("Event Day");
			eventDay = scanner.nextLine();
			System.out.println("Event Time");
			eventTime = scanner.nextLine();
			System.out.println("Event Location");
			eventLocation = scanner.nextLine();
			System.out.println("Number of Details to Add to Event");
			numOfDetails = scanner.nextInt();
			System.out.println("Details to Add");
			for (int i = 0; i <= numOfDetails; i++ ) {
				eventDetails.add(scanner.nextLine());
			}
		} finally {
			scanner.close();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(eventName + " " + eventDay + " @ " + eventTime);
		System.out.println();
		System.out.println("Hey guys,");
		System.out.println();
		System.out.println("We will be having a " + eventName + " this " + eventDay + ", " + eventTime + " at " + eventLocation + ".");
		System.out.println();
		System.out.println("Event Details: ");
		for (int i = 0; i < eventDetails.size(); i++ ) {
			System.out.println("    " + eventDetails.get(i) );
		}
		System.out.println();
		System.out.println("Thanks Guys,");
		System.out.println();
		System.out.println("Daniel and Chris");
	}
}
