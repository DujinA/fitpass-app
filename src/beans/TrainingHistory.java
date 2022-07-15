package beans;

import java.util.Date;

public class TrainingHistory {
    private Integer id;
    private Date dateAndTimeOfTraining;
    private Integer training;
    private String customer;
    private String trainer;

    public TrainingHistory() {
        super();
    }

    public TrainingHistory(Integer id, Date dateAndTimeOfTraining, Integer training, String customer, String trainer) {
        super();
        this.id = id;
        this.dateAndTimeOfTraining = dateAndTimeOfTraining;
        this.training = training;
        this.customer = customer;
        this.trainer = trainer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateAndTimeOfTraining() {
        return dateAndTimeOfTraining;
    }

    public void setDateAndTimeOfTraining(Date dateAndTimeOfTraining) {
        this.dateAndTimeOfTraining = dateAndTimeOfTraining;
    }

    public Integer getTraining() {
        return training;
    }

    public void setTraining(Integer training) {
        this.training = training;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }
}
