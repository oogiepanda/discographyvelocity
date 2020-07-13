package com.oogie.discographyvelocity.controller;

import com.oogie.discographyvelocity.service.ServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SongListController {
    @Autowired
    private ServiceFacade songListService;

    @RequestMapping(value = "/songlist", method = RequestMethod.GET)
    public String songListInfo(@ModelAttribute("model")ModelMap model) throws Exception {
        model.addAttribute("songlists",songListService.doService("get"));
        return "songListInfo";
    }
}
