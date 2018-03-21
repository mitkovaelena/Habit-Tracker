package org.softuni.habitTracker.domain.models.binding;

import org.softuni.habitTracker.domain.entities.Log;
import org.softuni.habitTracker.domain.entities.User;
import org.softuni.habitTracker.util.Constants;
import org.softuni.habitTracker.util.validators.EndDateAfterStartDate;
import org.softuni.habitTracker.util.validators.PresentOrFuture;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

@EndDateAfterStartDate(message = Constants.INVALID_DATE)
public class HabitAddDTO {
    @NotNull
    @NotEmpty(message = Constants.TITLE_NOT_EMPTY)
    private String title;

    @NotNull(message = Constants.FREQUENCY_NOT_EMPTY)
    private String frequency;

    @NotNull(message = Constants.DATE_NOT_EMPTY)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PresentOrFuture
    private Date startDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;

    private User user;

    public HabitAddDTO() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}