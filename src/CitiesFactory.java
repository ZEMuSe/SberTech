import java.util.Scanner;

public class CitiesFactory {
    private enum CitiKind{
        NO_FOUNDATION {
            CitiesHaveNoFoundation getCity(String city) {
                String[] strings = city.split(";");
                return new CitiesHaveNoFoundation(strings);
            }
        },
        HAVE_FOUNDATION{
            CitiesHaveFoundation getCity(String city){
                String[] strings = city.split(";");
                return new CitiesHaveFoundation(strings);
            }
        };
        abstract CitiesHaveNoFoundation getCity(String city);
    }
    public static CitiesHaveNoFoundation getCityFromFactory(Scanner scanner){
        String city = scanner.nextLine();
        final int LENGTH = 6;
        String kind = "NO_FOUNDATION";
        String[] strings = city.split(";");
        if (strings.length == LENGTH){
            kind = "HAVE_FOUNDATION";
        }
        return CitiKind.valueOf(kind).getCity(city);
    }
}
