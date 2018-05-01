package com.patrick.player.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayerRepository
        extends CrudRepository<PlayerEntry, Integer> {
    @Override
    List<PlayerEntry> findAll ();

    PlayerEntry findPlayerEntryById(Integer id);


    List<PlayerEntry> findPlayerEntryByUser(String user);

}
