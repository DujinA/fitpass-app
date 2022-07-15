package beans;

import enums.CustomerTypeEnum;

public class CustomerType {
    private CustomerTypeEnum typeOfCostumer;
    private Integer discount;
    private Integer points;

    public CustomerType() {
        super();
    }

    public CustomerType(CustomerTypeEnum typeOfCostumer, Integer discount, Integer points) {
        super();
        this.typeOfCostumer = typeOfCostumer;
        this.discount = discount;
        this.points = points;
    }


    public CustomerTypeEnum getTypeOfCostumer() {
        return typeOfCostumer;
    }

    public void setTypeOfCostumer(CustomerTypeEnum typeOfCostumer) {
        this.typeOfCostumer = typeOfCostumer;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
