package exercises.restaurant;

import java.util.Date;

public class MenuItem {

    private String name;
    private Double price;
    private String description;
    private String category;
    private Date dateAdded;

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public void setPrice(Double aPrice) {
        this.price = aPrice;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public void setCategory(String aCategory) {
        this.category = aCategory;
    }

    public void setDateAdded(Date aDateAdded) {
        this.dateAdded = aDateAdded;
    }


}
