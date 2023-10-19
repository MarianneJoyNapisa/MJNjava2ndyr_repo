import java.util.*;
public class RouteNavigator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RouteNavigator routenav = new RouteNavigator();
		double routeNum;
		String choice;
		double user_speed;
		
		
		//Display blockage
		System.out.print("Welcome to Route Navigator\n\nDistance Blockage:");
		System.out.print("\nIs road to Barili blocked? ");
		choice = sc.nextLine();
		
		if (choice.equalsIgnoreCase("no")) { // barili
		    System.out.print("Enter speed (km/hr): ");
		    user_speed = sc.nextDouble();
		    routeNum = 1;
            String display = estarrival(routeNum, user_speed);
            routebarili(); // Directions
            System.out.println(display); //output
		    
		} else if (choice.equalsIgnoreCase("yes")) {
		        System.out.print("\nIs road to Dumanjug blocked? ");
		        choice = sc.nextLine();
		        
		        if (choice.equalsIgnoreCase("no")) {
		            System.out.print("Enter speed (km/hr): ");
		            user_speed = sc.nextDouble();
		            routeNum = 2;
                    String display = estarrival(routeNum, user_speed);
                    routedumanjug(); // Directions
                    System.out.println(display);//output
		            
		        }else{
			        
			        if (choice.equalsIgnoreCase("yes")) {
			            System.out.print("\nEnter speed (km/hr): ");
			            user_speed = sc.nextDouble();
			            routeNum = 3;
	                    String display = estarrival(routeNum, user_speed);
	                    routeargao(); // Directions
	                    System.out.println(display);//output
			        }
		        }
		}
	}
	private static void routebarili() {
		System.out.print("\n\n-----Recommended Route-----\n"
						+ "Cebu City (Southbus Terminal) - START\n"
						+ "Route 1: Minglanilla\n"
						+ "Route 2: San Fernando\n"
						+ "Route 3: Carcar\n"
						+ "Route 4.1: Barili\n"
						+ "Route 4.1.1: Dumanjug\n"
						+ "Route 4.1.2: Alcantara\n"
						+ "Moalboal - END\n");
	}
	private static void routedumanjug() {
		System.out.print("\n\n-----Recommended Route-----\n"
				+ "Cebu City (Southbus Terminal) - START\n"
				+ "Route 1: Minglanilla\n"
				+ "Route 2: San Fernando\n"
				+ "Route 3: Carcar\n"
				+ "Route 4.2: Sibonga\n"
				+ "Route 4.1.1: Dumanjug\n"
				+ "Route 4.1.2: Alcantara\n"
				+ "Moalboal - END\n");
	}
	private static void routeargao() {
		System.out.print("\n\n-----Recommended Route-----\n"
				+ "Cebu City (Southbus Terminal) - START\n"
				+ "Route 1: Minglanilla\n"
				+ "Route 2: San Fernando\n"
				+ "Route 3: Carcar\n"
				+ "Route 4.2: Sibonga\n"
				+ "Route 5: Argao\n"
				+ "Route 5.1: Ronda\n"
				+ "Route 5.2: Alcantara\n"
				+ "Moalboal - END\n");
	}
    private static String estarrival(double roadNum, double travSpeed) {
        // Distance measurements (km)
        final double toBarili = 85;
        final double toDumanjug = 98;
        final double toArgao = 108;
        double distance;
        double speed;

        if (roadNum == 1) {
            distance = toBarili;
            speed = travSpeed;
        } else if (roadNum == 2) {
            distance = toDumanjug;
            speed = travSpeed;
        } else if (roadNum == 3) {
            distance = toArgao;
            speed = travSpeed;
        } else {
            System.out.println("Invalid road number.");
            return "Invalid road number.";
        }

        int hours = (int)(distance / speed);
        int mins = (int)((distance / speed * 60) % 60);
        return "\nSpeed: " + speed + " km/hr\nDistance: " + distance + " km\nEstimated T.O.A (Time of Arrival): " + hours + " Hour(s) " + mins + " Minute(s)";
    }

}
