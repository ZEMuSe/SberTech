
public class CitiesHaveFoundation extends CitiesHaveNoFoundation {

    private long Id;
    private String name;
    private String region;
    private String district;
    private int population;
    private String foundation;

    public CitiesHaveFoundation() {
    }

    public CitiesHaveFoundation(String[] strings){
        super(strings);
        foundation = strings[5];
    }

}
