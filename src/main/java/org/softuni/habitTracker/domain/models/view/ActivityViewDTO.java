package org.softuni.habitTracker.domain.models.view;

import org.softuni.habitTracker.domain.entities.Habit;
import org.softuni.habitTracker.util.Constants;
import org.softuni.habitTracker.util.validators.EndDateAfterStartDate;

import java.util.Date;

@EndDateAfterStartDate(message = Constants.INVALID_DATE)
public class ActivityViewDTO {
    private Long id;
    private Date date;
    private Habit habit;
    public ActivityViewDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Habit getHabit() {
        return habit;
    }

    public void setHabit(Habit habit) {
        this.habit = habit;
    }
}