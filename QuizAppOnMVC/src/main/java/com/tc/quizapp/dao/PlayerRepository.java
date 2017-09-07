package com.tc.quizapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tc.quizapp.model.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long>
{

}
