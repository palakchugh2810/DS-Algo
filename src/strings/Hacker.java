package strings;

import java.util.*;

public class Hacker {

	public static List<Integer> arr;

	public static HashMap<String, List<Integer>> map = new HashMap<>();
	public static List<Integer> listApps;

	public static class RatingStatisticsCollectorImpl implements
			RatingStatisticsCollector {
		@Override
		public void putNewRating(String app, int rating) {
			// arr=new ArrayList<>();

			if (map != null && map.containsKey(app)) {

				arr = map.get(app);
				arr.add(rating);
				map.put(app, arr);
			} else {
				arr = new ArrayList<>();
				arr.add(rating);
				map.put(app, arr);

			}

		}

		@Override
		public double getAverageRating(String app) {
			listApps = map.get(app);
			int sum = 0, av = 0;
			for (int i = 0; i < listApps.size(); i++) {
				sum = sum + listApps.get(i);
			}
			av = sum / listApps.size();
			// for
			System.out.println(app);

			return av;
			// YOUR CODE HERE
		}

		@Override
		public int getRatingsCount(String app) {
			listApps = map.get(app);
			return listApps.size();
			// YOUR CODE HERE
		}
	}

	// //////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

	public interface RatingStatisticsCollector {
		// Ratings feed will call this method when new app rating information is
		// received. This is input to your class. ratings is a non negative
		// integer between 0 to 10.
		public void putNewRating(String app, int rating);

		// Report the average rating of the app.
		public double getAverageRating(String app);

		// Report the total number of rating for an app.
		public int getRatingsCount(String app);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numLines = Integer.parseInt(scanner.nextLine());
		int currentLine = 0;
		while (currentLine++ < numLines) {
			final RatingStatisticsCollector stats = new RatingStatisticsCollectorImpl();
			final Set<String> apps = new TreeSet<>();

			String line = scanner.nextLine();
			String[] inputs = line.split(",");
			for (int i = 0; i < inputs.length; ++i) {
				String[] tokens = inputs[i].split(" ");
				final String app = tokens[0];
				apps.add(app);
				final int runs = Integer.parseInt(tokens[1]);

				stats.putNewRating(app, runs);

			}

			for (String app : apps) {
				System.out
						.println(String.format("%s %.2f %d", app,
								stats.getAverageRating(app),
								stats.getRatingsCount(app)));
			}

		}
		scanner.close();

	}
}
