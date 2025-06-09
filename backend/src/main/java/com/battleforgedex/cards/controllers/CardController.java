// cards/controller/CardController.java
package com.battleforgedex.cards.controllers;

import com.battleforgedex.cards.dto.CardDto;
import com.battleforgedex.cards.mapper.CardMapper;
import com.battleforgedex.cards.services.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cards")
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;
    private final CardMapper cardMapper;

    @GetMapping
    public List<CardDto> getAllCards() {
        return cardService.findAll().stream()
                .map(cardMapper::toDto)
                .collect(Collectors.toList());
    }

    @PostMapping("/sync")
    public void syncCards() {
        cardService.syncCards();
    }

    @GetMapping("/search")
    public List<CardDto> search(@RequestParam(required = false) String name,
                                @RequestParam(required = false) String type,
                                @RequestParam(required = false) String rarity) {
        if (name != null) return cardService.searchByName(name).stream().map(cardMapper::toDto).toList();
        if (type != null) return cardService.searchByType(type).stream().map(cardMapper::toDto).toList();
        if (rarity != null) return cardService.searchByRarity(rarity).stream().map(cardMapper::toDto).toList();
        return List.of();
    }
}