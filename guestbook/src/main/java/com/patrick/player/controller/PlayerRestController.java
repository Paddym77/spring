package com.patrick.player.controller;

import com.patrick.player.domain.PlayerEntry;
import com.patrick.player.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping ("/api")
@RestController
public class PlayerRestController {


        @Autowired
        private PlayerService playerService;

        @GetMapping("/comments")
        public List<PlayerEntry> getAllComments() {
            return playerService.findAllEntries();
        }

        @GetMapping("/comment/{id}")
        public PlayerEntry playerEntryById(@PathVariable("id") Integer id) {
            return this.playerService.findplayerEntryById(id);
        }

        @GetMapping("/user/{user}")
        public List<PlayerEntry> findplayerEntryById(@PathVariable("user") String user) {
            return this.playerService.findplayerEntryByUser(user);
        }

        @DeleteMapping("/comment/{id}")
        public void deleteplayerEntryById(@PathVariable("id") Integer id) {
            this.playerService.deleteplayerEntryById(id);
        }

        @PostMapping("/add")
        public void addComment(@RequestBody PlayerEntry playerEntry) {
            this.playerService.save(playerEntry);
        }

        @PostMapping("/update")
        public void updateComment(@RequestBody PlayerEntry playerEntry) {
            this.playerService.save(playerEntry);
        }

    }
