package com.trailapps.planningpoker.controller;

import com.trailapps.planningpoker.model.Poker;
import com.trailapps.planningpoker.service.PokerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/poker")
@RequiredArgsConstructor
public class PokerController {
  private final PokerService pokerService;

  @GetMapping
  public List<Poker> getPokerPoints(Principal principal) {
    return pokerService.getPokerPoints();
  }
}
