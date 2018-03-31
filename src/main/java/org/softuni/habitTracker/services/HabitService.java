package org.softuni.habitTracker.services;

import org.softuni.habitTracker.domain.entities.Habit;
import org.softuni.habitTracker.domain.entities.User;
import org.softuni.habitTracker.domain.models.binding.HabitAddDTO;
import org.softuni.habitTracker.domain.models.binding.HabitEditDTO;
import org.softuni.habitTracker.domain.models.view.HabitViewDTO;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface HabitService {
    void saveHabit(HabitAddDTO habitAddDTO);

    HabitEditDTO getHabitEditDTOById(Long id);

    HabitViewDTO getHabitViewDTOById(Long id);

    Habit getHabitById(Long id);

    void editHabit(Long id, HabitEditDTO habitEditDTO);

    LocalDate getStartDateById(Long id);

    void deleteHabit(Long id);

    List<HabitViewDTO> getAllHabitsByUser(User user);

    List<HabitViewDTO> getAllHabitsByUserDueToday(User user) throws ParseException;

    void resetStreak(Long id);

    void calculateNextDueDate(Long id);
}
