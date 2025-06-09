package com.battleforgedex.cards.mapper;

import com.battleforgedex.cards.dto.CardDto;
import com.battleforgedex.cards.entities.Card;
import org.springframework.stereotype.Component;

@Component
public class CardMapper {
    public CardDto toDto(Card card) {
        return CardDto.builder()
                .id(card.getId())
                .name(card.getName())
                .rarity(card.getRarity())
                .types(card.getTypes())
                .setName(card.getSet() != null ? card.getSet().getName() : null)
                .serieName(card.getSerie() != null ? card.getSerie().getName() : null)
                .build();
    }
}