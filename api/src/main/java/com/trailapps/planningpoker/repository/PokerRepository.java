package com.trailapps.planningpoker.repository;

import com.trailapps.planningpoker.model.Poker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokerRepository extends JpaRepository<Poker, String> {}
