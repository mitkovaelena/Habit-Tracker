package org.softuni.habitTracker.areas.habits.repositories;

import org.softuni.habitTracker.areas.habits.entities.Habit;
import org.softuni.habitTracker.areas.users.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface HabitRepository extends JpaRepository<Habit, Long> {
    List<Habit> findAllByUser(User user);

    List<Habit> findAllByUserAndNextDueDate(User user, LocalDate date);
}