package exercises.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<Object> menuItems;
    private Date dateUpdated;

    public ArrayList<Object> getMenuItems() {
        return this.menuItems;
    }

    public Date getDateUpdated() {
        return this.dateUpdated;
    }

    public void setMenuItems(ArrayList<Object> aMenuItem) {
        menuItems.add(aMenuItem);
    }
}
