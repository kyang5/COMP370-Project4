package com.list.model.list;

import java.util.Calendar;
import java.util.Date;

public class ItemImpl implements Item{

    private String item;
    private Calendar dueDate;
    private Priority priority;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Calendar getDueDate() {
        return dueDate;
    }

    public void setDueDate(Calendar dueDate) {
        this.dueDate = dueDate;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority Priority) {
        this.priority = priority;
    }
}
