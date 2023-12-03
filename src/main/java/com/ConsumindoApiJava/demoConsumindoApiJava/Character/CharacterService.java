package com.ConsumindoApiJava.demoConsumindoApiJava.Character;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CharacterService {
    private final Map<Long, Character> characters = new HashMap<>();
    private long nextId = 1;

    public List<Character> getAllCharacters() {
        return new ArrayList<>(characters.values());
    }

    public Character getCharacterById(Long id) {
        return characters.get(id);
    }

    public Character addCharacter(Character character) {
        long id = nextId++;
        character.setId(id);
        characters.put(id, character);
        return character;
    }

    public void deleteCharacter(Long id) {
        characters.remove(id);
    }

    public boolean characterExists(Long id) {
        return characters.containsKey(id);
    }
}
