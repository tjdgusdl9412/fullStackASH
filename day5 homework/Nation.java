public class Nation {
    private String countryname; //나라이름
    public int landarea; //나라면적
    public int population; //인구
    private static String Earth; //행성이름

    public Nation(){

    }

    public Nation(String countryname, int landarea, int population) {
        this.countryname = countryname;
        this.landarea = landarea;
        this.population = population;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public int getLandarea() {
        return landarea;
    }

    public void setLandarea(int landarea) {
        this.landarea = landarea;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override

    public String toString() {
        return "Nation [landarea=" + landarea + ", countryname=" + countryname + ", population=" + population + "]";
    }

    
}

class China extends Nation{
    private String clothes = "chipao";
    
    public China(){

    }

    public China(String countryname, int landarea, int population, String clothes) {
        super(countryname, landarea, population);
        this.clothes = clothes;
    }

    public void setClothes(String clothes){
        this.clothes = clothes;
    }
}

class USA extends Nation{
    private int army = 4000000;

    public USA(){

    }

    
    public USA(String countryname, int landarea, int population, int army) {
        super(countryname, landarea, population);
        this.army = army;
    }



    public void setArmy(int army){
        this.army = army;
    }
}

class Korea extends Nation{
    private String food = "kimchi";

    public Korea(){

    }

    public Korea(String countryname, int landarea, int population, String food) {
        super(countryname, landarea, population);
        this.food = food;
    }

    public void setFood(String food){
        this.food = food;
    }
}