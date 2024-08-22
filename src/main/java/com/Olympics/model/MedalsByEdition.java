package com.Olympics.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MedalsByEdition {

    private int year;
    private int editionId;
    private String edition;
    private String country;

    private String country_noc;

    private int gold;
    private int silver;

    private int bronze;

    private int total;

    @Override
    public String toString() {
        return "year: %d, ediitonId: %d, edition: %s, country: %s".formatted(year,editionId,edition,country);
    }
}
