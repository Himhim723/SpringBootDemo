package com.example.demok.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PokemonAblum {
    public int count;
    public String next;
    public String previous;
    public List<Pokemon> results;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Pokemon {
        public String name;
        public String url;

    }
}
