
/*
 * A weather app that tells you what clothes you need to wear instead of the actual weather.
 * Idea generated using https://www.ideasgrab.com/random-idea-generator/
 * create a background scheduler for this, like everyday on 4:00 pm, send a reminder or sth.
 * Learn how to make deeper level system prompt! 
 */
import java.util.*;

import httpOpt.HttpRequest;
import httpOpt.sslOpt;


public class Main {
	public static void main(String[] args) {
		System.out.println("== WELCOME! ==");
		java.util.Scanner sc= new Scanner(System.in);
		String in_command = "";
		sslOpt opt = new sslOpt();
		// ssl certificate, trust.
		// govcert.cer downloaded anyway.
		
		opt.trustAllHosts();
		while (true) {
			in_command = "";
			while (true) {
				System.out.println("Enter a command: (c: current weather, f: weather forcast)");
				System.out.print(">	");
				in_command = sc.nextLine().trim().toLowerCase();
				if (in_command.equals("c") || in_command.equals("f")) {
					break;
				}
			}
			switch (in_command) {
			case("c"): {
				// that request lib is just a simple wrapper of the original java.net API.
				HttpRequest req = new HttpRequest("https://data.weather.gov.hk/weatherAPI/opendata/weather.php?dataType=rhrread&lang=en",
						HttpRequest.METHOD_GET);
				System.out.println(req.body());
				break;
			}
			case("f"):
				break;
			default:
				break;
			}
		}
	}
}
