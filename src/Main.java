import Constants.FileNames;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{

        String fileName = FileNames.FILE_NAME;
        Scanner scanner = new Scanner(new File(fileName));
        List<CitiesHaveNoFoundation> list = new ArrayList<>();

        while (scanner.hasNextLine()) {
            CitiesHaveNoFoundation citiesHaveNoFoundation = CitiesFactory.getCityFromFactory(scanner);
            list.add(citiesHaveNoFoundation);
        }
        list
                .forEach(System.out::println);
    }
}