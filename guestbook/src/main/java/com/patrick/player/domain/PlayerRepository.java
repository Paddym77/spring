package com.patrick.player.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayerRepository
        extends CrudRepository<PlayerEntry, Integer> {
    @Override
    List<PlayerEntry> findAll ();

    PlayerEntry findGuestBookEntryById (Integer id);


    List<PlayerEntry> findGuestBookEntryByUser (String user);

}
