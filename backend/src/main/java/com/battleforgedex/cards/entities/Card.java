package com.battleforgedex.cards.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Card {
    @Id
    private String id;

    private String name;
    private String supertype;
    private String subtypes;
    private String level;
    private String hp;
    private String rarity;
    private String artist;
    private String number;
    private String flavorText;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> types;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> rules;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> weaknesses;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> resistances;

    @Embedded
    private SetInfo set;

    @Embedded
    private SerieInfo serie;
}

