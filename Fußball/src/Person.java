public abstract class Person {
    private String name;
    private int alter;


    public Person(String name, int alter) {
        this.alter = alter;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    @Override
    public String toString() {

        String text = "\n\tName\t\t= " + name;
        text += "\n\talter\t\t=  " + alter;
        return text;
    }

}
