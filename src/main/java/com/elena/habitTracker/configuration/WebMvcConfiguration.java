package com.elena.habitTracker.configuration;

import com.elena.habitTracker.interceptors.LogApplicationActivityInterceptor;
import com.elena.habitTracker.interceptors.StreakInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {
    private final StreakInterceptor streakInterceptor;
    private final LogApplicationActivityInterceptor logInterceptor;

    @Autowired
    public WebMvcConfiguration(StreakInterceptor streakInterceptor, LogApplicationActivityInterceptor logInterceptor) {
        this.streakInterceptor = streakInterceptor;
        this.logInterceptor = logInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.streakInterceptor)
                .addPathPatterns("/activities/add", "/habits/**");
        registry.addInterceptor(this.logInterceptor);
    }
}