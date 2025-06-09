package com.battleforgedex.cards.entities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SetInfo {
    private String id;
    private String name;
    private String series;
    private String printedTotal;
    private String total;
    private String releaseDate;
}

