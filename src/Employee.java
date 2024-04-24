public class Employee {




    String name;
    int level;
    String answersTo;

    public void Employee(String name, int level, String answersTo) {
        this.name = name;
        this.level = level;
        this.answersTo = answersTo;
    }public void Employee() {

    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getAnswersTo() {
        return answersTo;
    }

    public void setAnswersTo(String answersTo) {
        this.answersTo = answersTo;
    }



    @Override
    public String toString() {
        return this.name + " " +
                this.level + " " +
                this.answersTo;
    }

}
