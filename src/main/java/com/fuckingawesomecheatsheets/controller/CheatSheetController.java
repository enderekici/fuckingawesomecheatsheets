package com.fuckingawesomecheatsheets.controller;

import com.fuckingawesomecheatsheets.model.CheatSheet;
import com.fuckingawesomecheatsheets.service.CheatSheetService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;
import java.util.Collection;

@Controller
public class CheatSheetController {
    @Inject
    CheatSheetService cheatSheetService;

    @Get
    public Collection<CheatSheet> getAllCheatSheets() {
        return cheatSheetService.getAllCheatSheets();
    }
}
