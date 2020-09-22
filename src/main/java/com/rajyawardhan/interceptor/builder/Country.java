package com.rajyawardhan.interceptor.builder;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@Builder(setterPrefix = "with")
//@EqualsAndHashCode
@ToString
@Getter
public class Country {
    private String name;
    private int numberOfStates;
    private int gdpInTrillions;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return name.equals(country.name);
    }

    @Override
    public int hashCode() {
        return 111111;
    }
}
