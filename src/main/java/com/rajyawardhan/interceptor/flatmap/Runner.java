package com.rajyawardhan.interceptor.flatmap;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Runner {
    public static void main(String[] args) {
        List<Room> rooms = asList(
                Room.builder()
                        .name("A101")
                        .people(asList("Aman", "Ajay", "Abhi"))
                        .ages(asList(10, 12, 72)).build(),
                Room.builder()
                        .name("A102")
                        .people(asList("Balram", "Bijoy"))
                        .ages(asList(30, 65)).build()
        );

        List<String> result = rooms
                .stream()
                .flatMap(room -> room.getPeople().stream())
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
