package com.battleforgedex.cards.dto;

import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardDto {
    private String id;
    private String name;
    private String rarity;
    private List<String> types;
    private String setName;
    private String serieName;
}