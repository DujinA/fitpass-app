package beans;

import enums.SportingVenueType;
import enums.TrainingType;

public class SportingVenue {
    private Integer id;
    private String name;
    private SportingVenueType sportingVenueType;
    private TrainingType trainingContent;
    private boolean status;
    private Location location;
    private String image;
    private Double rating = 0.0;
    private Integer businessHour;

    public SportingVenue() {
        super();
    }

    public SportingVenue(Integer id, String name, SportingVenueType sportingVenueType, TrainingType trainingContent, boolean status, Location location, String image, Double rating, Integer businessHour) {
        super();
        this.id = id;
        this.name = name;
        this.sportingVenueType = sportingVenueType;
        this.trainingContent = trainingContent;
        this.status = status;
        this.location = location;
        this.image = image;
        this.rating = rating;
        this.businessHour = businessHour;
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

    public SportingVenueType getSportingVenueType() {
        return sportingVenueType;
    }

    public void setSportingVenueType(SportingVenueType sportingVenueType) {
        this.sportingVenueType = sportingVenueType;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public TrainingType getTrainingContent() {
        return trainingContent;
    }

    public void setTrainingContent(TrainingType trainingContent) {
        this.trainingContent = trainingContent;
    }

    public Integer getBusinessHour() {
        return businessHour;
    }

    public void setBusinessHour(Integer businessHour) {
        this.businessHour = businessHour;
    }
}
