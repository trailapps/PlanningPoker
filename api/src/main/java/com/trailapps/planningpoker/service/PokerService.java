package com.trailapps.planningpoker.service;

import com.trailapps.planningpoker.model.Poker;
import com.trailapps.planningpoker.repository.PokerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PokerService {
  private final PokerRepository pokerRepository;

  public List<Poker> getPokerPoints() {
    return pokerRepository.findAll();
  }
}
