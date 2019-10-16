package Sprint2.BestGymEver;

public class Person {

    private String name;
    private String socNr;
    private String regDate;

    protected Person(String name, String socNr, String regDate) {
        this.name = name;
        this.socNr = socNr;
        this.regDate = regDate;
    }

    public String getName() {
        return name;
    }

    public String getSocNr() {
        return socNr;
    }
    public String getRegDate() {
        return regDate;
    }

}
