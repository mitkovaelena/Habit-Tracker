package com.elena.habitTracker.areas.logs.services;

import com.elena.habitTracker.areas.logs.entities.ApplicationLog;
import com.elena.habitTracker.areas.logs.models.view.LogsPageViewModel;
import com.elena.habitTracker.util.ApplicationConstants;
import org.springframework.data.domain.Pageable;

public interface LogService {
    void saveLog(ApplicationLog log);

    LogsPageViewModel getAllByPage(Pageable pageable);
}
