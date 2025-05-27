package com.pl.premspringboot.player;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//this extends the jpa repository interface which provides crud operations for the player entity
@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {
    void deleteByPlayerName(String playerName); // finds a player in the repo by name and deletes it
    Optional<Player> findByPlayerName(String playerName); //find any play by name. optional handles cases where the player isnt found

}

