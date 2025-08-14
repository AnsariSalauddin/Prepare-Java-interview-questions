package in.company;



import java.util.*;
import java.util.stream.Collectors;

// App class to store app data
class App {
    private String name;
    private int downloads;
    private double rating;

    public App(String name, int downloads, double rating) {
        this.name = name;
        this.downloads = downloads;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getDownloads() {
        return downloads;
    }

    public double getRating() {
        return rating;
    }
}

// MobileAppAnalyzer class for analysis
class MobileAppAnalyzer {

    public static double getAverageRating(List<App> apps) {
        return apps.stream()
                .mapToDouble(App::getRating)
                .average()
                .orElse(0.0);
    }

    public static Map<String, Integer> getMappedData(List<App> apps) {
        return apps.stream()
                .collect(Collectors.toMap(
                        App::getName,
                        App::getDownloads
                ));
    }
}

// Main class
public class MobileAppRatingAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<App> appList = new ArrayList<>();

        try {
            int n = Integer.parseInt(scanner.nextLine().trim());
            for (int i = 0; i < n; i++) {
                String line = scanner.nextLine().trim();
                String[] parts = line.split(",");
                if (parts.length != 3) {
                    System.out.println("Invalid input format. Skipping line: " + line);
                    continue;
                }

                String name = parts[0].trim();
                int downloads = Integer.parseInt(parts[1].trim());
                double rating = Double.parseDouble(parts[2].trim());

                appList.add(new App(name, downloads, rating));
            }

            // Calculate average rating and map
            double avgRating = MobileAppAnalyzer.getAverageRating(appList);
            Map<String, Integer> appDownloadMap = MobileAppAnalyzer.getMappedData(appList);

            // Output
            System.out.printf("%.2f%n", avgRating);
            System.out.println(appDownloadMap);

        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}


