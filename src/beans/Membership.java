package beans;

import java.util.Date;

import enums.MembershipType;

public class Membership {
    private String id;
    private MembershipType membershipType;
    private Date dateOfPayment;
    private Date timeOfExpiration;
    private Double price;
    private String customer;
    private boolean status;
    private Double numberOfAppointments;

    public Membership() {
        super();
    }

    public Membership(String id, MembershipType membershipType, Date dateOfPayment, Date timeOfExpiration, Double price, String customer, boolean status, Double numberOfAppointments) {
        super();
        this.id = id;
        this.membershipType = membershipType;
        this.dateOfPayment = dateOfPayment;
        this.timeOfExpiration = timeOfExpiration;
        this.price = price;
        this.customer = customer;
        this.status = status;
        this.numberOfAppointments = numberOfAppointments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

    public Date getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(Date dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public Date getTimeOfExpiration() {
        return timeOfExpiration;
    }

    public void setTimeOfExpiration(Date timeOfExpiration) {
        this.timeOfExpiration = timeOfExpiration;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Double getNumberOfAppointments() {
        return numberOfAppointments;
    }

    public void setNumberOfAppointments(Double numberOfAppointments) {
        this.numberOfAppointments = numberOfAppointments;
    }
}
