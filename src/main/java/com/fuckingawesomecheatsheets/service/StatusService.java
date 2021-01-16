package com.fuckingawesomecheatsheets.service;

import javax.inject.Singleton;
import java.lang.management.ManagementFactory;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

@Singleton
public class StatusService {
    public String getServerStatus() {
        return System.getenv().toString();
    }

    public String getUptime() {
        long uptime = ManagementFactory.getRuntimeMXBean().getUptime();
       return Duration.of(uptime, ChronoUnit.MILLIS).toString();
    }
}
