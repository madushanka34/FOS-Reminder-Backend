package com.project.exam_reminder.Repo;


import com.project.exam_reminder.Entity.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@EnableJpaRepositories
public interface ReminderRepo extends JpaRepository<Reminder, UUID> {
}
