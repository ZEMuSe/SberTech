import java.util.HashMap;
import java.util.Map;

public class CitiesHaveNoFoundation implements Comparable<CitiesHaveNoFoundation> {
    private long Id;
    private String name;
    private String region;
    private String district;
    private  int population;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public CitiesHaveNoFoundation(){

    }

    public CitiesHaveNoFoundation(long id, String name, String region, String district, int population) {
        Id = id;
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
    }

    public CitiesHaveNoFoundation(String[] string){
        Id = Long.parseLong(string[0]);
        name = string[1];
        region = string[2];
        district = string[3];
        population = Integer.parseInt(string[4]);
    }

    public static void printMaxPopulation(CitiesHaveNoFoundation[] citiesHaveNoFoundationsArr){
        int maxPopulation = 0;
        int maxIndex = 0;
        for (int i = 0; i < citiesHaveNoFoundationsArr.length; i++){
            if (citiesHaveNoFoundationsArr[i].getPopulation() > maxPopulation){
                maxPopulation = citiesHaveNoFoundationsArr[i].getPopulation();
                maxIndex = i+1;
            }
        }
        System.out.println("[" +  maxIndex + "] = " + maxPopulation);
    }

    public static void printCitiesQuantity(CitiesHaveNoFoundation[] citiesHaveNoFoundations){
        int n = citiesHaveNoFoundations.length;
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            if (map.containsKey(citiesHaveNoFoundations[i].getRegion())){
                int c = map.get(citiesHaveNoFoundations[i].getRegion());
                map.replace(citiesHaveNoFoundations[i].getRegion(), c + 1);
            } else
                map.put(citiesHaveNoFoundations[i].getRegion(), 1);
        }
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            if (entry.getValue() > 1){
                System.out.println(entry.getKey() + " = " + entry.getValue());
            } else
                continue;
        }

    }

    @Override
    public String toString() {
       return "City" + "{name=" + "'" + getName() + "', region='"  + getRegion() + "', district='" + getDistrict() + "', population='" + getPopulation();
    }


    @Override
    public int compareTo(CitiesHaveNoFoundation o) {
        int regionCompare = district.compareTo(o.district);
        if (regionCompare != 0){
            return regionCompare;
        } else {
            return name.compareToIgnoreCase(o.name);
        }
    }
}
