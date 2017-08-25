package exercises.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    //initialize
    private ArrayList<Object> menuItems;
    private Date dateUpdated;

    //construtor
    public Menu(ArrayList<Object> menuItems, Date dateUpdated) {
        this.menuItems = menuItems;
        this.dateUpdated = dateUpdated;
    }

    //getters
    public ArrayList<Object> getMenuItems() {
        return this.menuItems;
    }

    public Date getDateUpdated() {
        return this.dateUpdated;
    }

    //setters
    public void setMenuItems(ArrayList<Object> aMenuItem) {
        this.menuItems.add(aMenuItem);
    }

    public void setDateUpdated(Date aDateUpdated) {
        this.dateUpdated = aDateUpdated;
    }
}
