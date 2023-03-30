public class CitiesHaveNoFoundation {
    private long Id;
    private String name;
    private String region;
    private String district;
    private int population;

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


    @Override
    public String toString() {
       return "City" + "{name=" + "'" + getName() + "', region='"  + getRegion() + "', district='" + getDistrict() + "', population='" + getPopulation();
    }
}
