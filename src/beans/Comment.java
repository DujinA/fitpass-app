package beans;

public class Comment {
    private Integer id;
    private String customer;
    private Integer sportingVenue;
    private String text;
    private Integer grade;

    public Comment() {
        super();
    }

    public Comment(Integer id, String customer, Integer sportingVenue, String text, Integer grade) {
        super();
        this.id = id;
        this.customer = customer;
        this.sportingVenue = sportingVenue;
        this.text = text;
        this.grade = grade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getSportingVenue() {
        return sportingVenue;
    }

    public void setSportingVenue(Integer sportingVenue) {
        this.sportingVenue = sportingVenue;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
