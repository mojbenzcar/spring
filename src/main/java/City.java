public class City {

    private String name;
    private String religion;


    private int population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", religion='" + religion + '\'' +
                ", population=" + population +
                ", area=" + area +
                '}';
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    private int area;

    public City(){

    }

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public City(String name) {
        this.name = name;
    }

    public void getMessage(){
        System.out.printf("very funny");
    }

}
