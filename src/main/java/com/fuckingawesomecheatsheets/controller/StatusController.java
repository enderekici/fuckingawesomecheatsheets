package com.fuckingawesomecheatsheets.controller;

import com.fuckingawesomecheatsheets.service.StatusService;
import io.micronaut.context.ApplicationContext;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

@Controller("/status")
public class StatusController {
    @Inject
    ApplicationContext applicationContext;
    @Inject
    StatusService statusService;

    @Get
    public String getServerStatus() {
        return statusService.getServerStatus();
    }
     @Get("uptime")
    public String getUptime() {
        return statusService.getUptime();
    }

}
