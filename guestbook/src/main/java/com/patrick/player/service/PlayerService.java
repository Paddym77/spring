package com.patrick.player.service;

import com.patrick.player.domain.PlayerEntry;
import com.patrick.player.domain.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


    @Service
    public class PlayerService {
        @Autowired
        private PlayerRepository guestBookEntryRepository;
        public List<PlayerEntry> findAllEntries () {
            return this.guestBookEntryRepository.findAll ();
        }

        public PlayerEntry findplayerEntryById(Integer id) {

            return this.guestBookEntryRepository.findGuestBookEntryById(id);

        }
        public List <PlayerEntry> findplayerEntryByUser(String user) {
            return this.guestBookEntryRepository.findGuestBookEntryByUser (user);
        }

        public void deleteplayerEntryById(Integer id) {
            this.guestBookEntryRepository.delete (id);
        }

        public void save (PlayerEntry newEntry) {
            this.guestBookEntryRepository.save (newEntry);
        }
        public PlayerEntry findOne (Integer id) {
            return this.guestBookEntryRepository.findOne (id);
        }


    }


