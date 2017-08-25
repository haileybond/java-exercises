package exercises.restaurant;

import java.util.Date;

public class MenuItem {

    //initialize
    private String name;
    private Double price;
    private String description;
    private String category;
    private Date dateAdded;


    //constructor
    public MenuItem(String name, Double price, String description, String category, Date dateAdded) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = dateAdded;
    }


    //getters
    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

    public String getCategory() {
        return this.category;
    }

    public Date getDateAdded() {
        return this.dateAdded;
    }


    //setters
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
