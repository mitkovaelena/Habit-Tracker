package com.elena.habitTracker.areas.habits.services;

import com.elena.habitTracker.areas.habits.entities.Habit;
import com.elena.habitTracker.areas.habits.models.binding.HabitAddBindingModel;
import com.elena.habitTracker.areas.habits.models.binding.HabitEditBindingModel;
import com.elena.habitTracker.areas.habits.models.view.HabitViewModel;
import com.elena.habitTracker.areas.habits.models.view.HabitsPageViewModel;
import com.elena.habitTracker.areas.users.entities.User;
import org.springframework.data.domain.Pageable;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;

public interface HabitService {
    Habit saveHabit(HabitAddBindingModel habitAddBindingModel);

    HabitEditBindingModel getHabitEditDTOById(Long id);

    HabitViewModel getHabitViewDTOById(Long id);

    Habit getHabitById(Long id);

    Habit editHabit(Long id, HabitEditBindingModel habitEditBindingModel);

    LocalDate getStartDateById(Long id);

    void deleteHabit(Long id);

    HabitsPageViewModel getHabitsPageByUser(User user, Pageable pageable);

    List<Habit> getAllHabits();

    List<HabitViewModel> getAllHabitsByUserDueToday(User user) throws ParseException;

    void resetStreak(Long id);

    void calculateNextDueDate(Long id);

    String extractLineChartData(Long id);

    String extractHeatmapData(Long id);

    void renewHabit(Long id);
}
