package beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enums.UserGender;
import enums.UserRole;

public class User {

    private Integer id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private UserGender gender;
    private Date DateOfBirth;
    private UserRole role;
    // if user is customer
    private Integer membership;
    private List<Integer> venuesVisited = new ArrayList<Integer>();
    private Integer points;
    private CustomerType customerType;
    // if user is trainer
    private List<Integer> trainingHistory = new ArrayList<Integer>();
    // if user is manager
    private Integer sportingVenue;


    public User() {
        super();
    }

    public User(Integer id, String username, String password, String firstName, String lastName, UserGender gender, Date dateOfBirth, UserRole role, Integer membership, List<Integer> venuesVisited, Integer points, CustomerType customerType, List<Integer> trainingHistory, Integer sportingVenue) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.DateOfBirth = dateOfBirth;
        this.role = role;
        this.membership = membership;
        this.venuesVisited = venuesVisited;
        this.points = points;
        this.customerType = customerType;
        this.trainingHistory = trainingHistory;
        this.sportingVenue = sportingVenue;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserGender getGender() {
        return gender;
    }

    public void setGender(UserGender gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public Integer getMembership() {
        return membership;
    }

    public void setMembership(Integer membership) {
        this.membership = membership;
    }

    public List<Integer> getVenuesVisited() {
        return venuesVisited;
    }

    public void setVenuesVisited(List<Integer> venuesVisited) {
        this.venuesVisited = venuesVisited;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public List<Integer> getTrainingHistory() {
        return trainingHistory;
    }

    public void setTrainingHistory(List<Integer> trainingHistory) {
        this.trainingHistory = trainingHistory;
    }

    public Integer getSportingVenue() {
        return sportingVenue;
    }

    public void setSportingVenue(Integer sportingVenue) {
        this.sportingVenue = sportingVenue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
