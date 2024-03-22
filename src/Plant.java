public class Plant {
    // Klases properties
    private String plantName;
    private String plantLatinName;
    private boolean plantIsAnnual;
    private String plantOriginContinent;
    private double plantHeightMeters;
    private boolean plantIsEdible;


    public void setPlantName(String plantName) { // Cia mano setteriai

        this.plantName = plantName;
    }

    public void setLatinPlantName(String plantLatinName) {

        this.plantLatinName = plantLatinName;
    }

    public void setplantIsAnnual(boolean plantIsAnnual) {

        this.plantIsAnnual = plantIsAnnual;
    }
    public void setPlantIsEdible(boolean isEdible) {

        this.plantIsEdible = isEdible;
    }
    public void setPlantHeightMeters(double height) {

        this.plantHeightMeters = height;
    }

    public void setPlantOriginContinent(String continent) { // Cia mano setteriai

        this.plantOriginContinent = continent;
    }

    public String getPlantName() { // Cia mano geteriai
        return this.plantName;
    }
    public String getLatinPlantName() { 
        return this.plantLatinName;
    }

    public String getPlantOriginContinent() {
        return this.plantOriginContinent;
    }

    public boolean getPlantYearOld () {
        return this.plantIsAnnual;
    }
    public double getPlantHeightMeters (double v) {
        return this.plantHeightMeters;
    }
    public boolean getPlantPlantIsEdible () { // Cia mano geteriai
        return this.plantIsEdible;
    }



    public Plant() { // Tuscias konstruktorius

    }

    public Plant(String plantName, String latinName, boolean annual,String continent,double plantHeightMeters,boolean plantIsEdible) { // Pilnas konstruktorius
        this.plantName = plantName;
        this.plantLatinName = latinName;
        this.plantIsAnnual = annual;
          this.plantOriginContinent = continent;
          this.plantHeightMeters = plantHeightMeters;
          this.plantIsEdible = plantIsEdible;


    }

    @Override
    public String toString() {
        return this.plantName + " " +
                this.plantLatinName + " " +
                (this.plantIsAnnual ? "vienmetis" : "daugiametis" ) + " " +
                this.plantOriginContinent + " " +
                this.plantHeightMeters + " " +
                (this.plantIsEdible ? "" :"ne") + "valgomas";
    }
}


