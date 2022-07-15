package beans;

import java.time.Duration;

import enums.TrainingType;

public class Training {
    private Integer id;
    private String name;
    private TrainingType trainingType;
    private Integer sportingVenue;
    private Duration trainingDuration;
    private String trainer;
    private String description;
    private String image;

    public Training() {
        super();
    }

    public Training(Integer id, String name, TrainingType trainingType, Integer sportingVenue, Duration trainingDuration, String trainer, String description, String image) {
        super();
        this.id = id;
        this.name = name;
        this.trainingType = trainingType;
        this.sportingVenue = sportingVenue;
        this.trainingDuration = trainingDuration;
        this.trainer = trainer;
        this.description = description;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TrainingType getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(TrainingType trainingType) {
        this.trainingType = trainingType;
    }

    public Integer getSportingVenue() {
        return sportingVenue;
    }

    public void setSportingVenue(Integer sportingVenue) {
        this.sportingVenue = sportingVenue;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Duration getTrainingDuration() {
        return trainingDuration;
    }

    public void setTrainingDuration(Duration trainingDuration) {
        this.trainingDuration = trainingDuration;
    }
}
