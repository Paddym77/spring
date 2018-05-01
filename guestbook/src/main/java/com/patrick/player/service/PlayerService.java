package com.patrick.player.service;

import com.patrick.player.domain.PlayerEntry;
import com.patrick.player.domain.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


    @Service
    public class PlayerService {
        @Autowired
        private PlayerRepository playerEntryRepository;
        public List<PlayerEntry> findAllEntries () {
            return this.playerEntryRepository.findAll ();
        }

        public PlayerEntry findplayerEntryById(Integer id) {

            return this.playerEntryRepository.findPlayerEntryById(id);

        }
        public List <PlayerEntry> findplayerEntryByUser(String user) {
            return this.playerEntryRepository.findPlayerEntryByUser(user);
        }

        public void deleteplayerEntryById(Integer id) {
            this.playerEntryRepository.delete (id);
        }

        public void save (PlayerEntry newEntry) {
            this.playerEntryRepository.save (newEntry);
        }
        public PlayerEntry findOne (Integer id) {
            return this.playerEntryRepository.findOne (id);
        }


    }


