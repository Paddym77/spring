package com.patrick.player.controller;

import com.patrick.player.domain.PlayerEntry;
import com.patrick.player.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@Controller

public class PlayerWebController {

    private static final String PLAYER_TEMPLATE = "Player";
    private static final String ENTRIES_TEMPLATE_ID = "entries";
    private static final String HOMEPAGE_REDIRECT = "redirect:/";
    private static final String NEW_ENTRY_TEMPLATE_ID = "newEntry";
    private static final String PLAYER_FROM_HEADER_ID = "formHeader";

    @Autowired
    private PlayerService playerService;

    @GetMapping("/")
    public String displayPlayer(Model model)
    {   model.addAttribute (PLAYER_FROM_HEADER_ID, "Add a New Player");
        model.addAttribute (ENTRIES_TEMPLATE_ID, this.playerService.findAllEntries ());
        model.addAttribute ("newEntry", new PlayerEntry());
        return PLAYER_TEMPLATE;
    }
    @GetMapping ("/delete/{id}")
    public String deleteComment (@PathVariable Integer id) {
        this.playerService.deleteplayerEntryById(id);
        return HOMEPAGE_REDIRECT;
    }
    @GetMapping ("update/{id}")
    public String editComment (Model model, @PathVariable Integer id) {
        model.addAttribute (ENTRIES_TEMPLATE_ID, this.playerService.findAllEntries ());
        model.addAttribute (PLAYER_FROM_HEADER_ID, "Please Edit the Player");
        model.addAttribute (NEW_ENTRY_TEMPLATE_ID, this.playerService.findOne (id));
        return PLAYER_TEMPLATE;
    }
    @PostMapping ("/")
    public String addComment (Model model,
    @Valid @ModelAttribute (NEW_ENTRY_TEMPLATE_ID)
            PlayerEntry newEntry,
            BindingResult bindingResult) {
        if (!bindingResult.hasErrors ()) {
            this.playerService.save (newEntry);
            return HOMEPAGE_REDIRECT;
        }
        else {
            model.addAttribute (ENTRIES_TEMPLATE_ID, this.playerService.findAllEntries ());
            return PLAYER_TEMPLATE;
        }
    }

    @PostMapping ("update/{id}")
    public String saveComment (Model model,
       @PathVariable Integer id,
        @Valid @ModelAttribute (NEW_ENTRY_TEMPLATE_ID) PlayerEntry newEntry,
      BindingResult bindingResult) {
        if (!bindingResult.hasErrors ()) {
            PlayerEntry current = this.playerService.findOne (id);
            current.setUser (newEntry.getUser ());
            current.setComment (newEntry.getComment ());
            this.playerService.save (current);
            return HOMEPAGE_REDIRECT;
        }
        else {
            model.addAttribute (PLAYER_FROM_HEADER_ID, "Please Correct the Player");
            model.addAttribute (ENTRIES_TEMPLATE_ID, this.playerService.findAllEntries ());
            return PLAYER_TEMPLATE;
        }
    }



}

