package com.ConsumindoApiJava.demoConsumindoApiJava.Controller;

import com.ConsumindoApiJava.demoConsumindoApiJava.Character.Character;
import com.ConsumindoApiJava.demoConsumindoApiJava.Character.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/characters")
public class CharacterController {
    @Autowired
    private CharacterService characterService;

    //==========================================================================

    // Endpoint para obter todos os personagens
    @GetMapping("/character/{id}")
    public ResponseEntity<Character> getCharacterById(@PathVariable Long id) {
        Character character = characterService.getCharacterById(id);
        if (character != null) {
            return ResponseEntity.ok(character);
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    //     //Endpoint para adicionar um novo personagem
    @PostMapping
    public ResponseEntity<Character> addCharacter(@RequestBody Character character) {
        Character addedCharacter = characterService.addCharacter(character);
        return ResponseEntity.ok(addedCharacter);
    }

    //Endpoint para remover um personagem por Event.ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCharacter(@PathVariable Long id) {
        if (characterService.characterExists(id)) {
            characterService.deleteCharacter(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    //
    @GetMapping
    public ResponseEntity<List<Character>> getAllCharacters() {
        List<Character> characters = characterService.getAllCharacters();
        return ResponseEntity.ok(characters);
    }

    //==========================================================================






//    @PostMapping
//    public ResponseEntity<Void> addCharacter(@RequestBody Character newCharacter) {
//        // Lógica para adicionar um novo personagem (pode ser fictício)
//        // ...
//
//
//        // Retornar um status de sucesso (201 Created) após a adição do personagem
//        return ResponseEntity.status(HttpStatus.CREATED).build();
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteCharacter(@PathVariable long id) {
//        // Lógica para remover o personagem com o ID fornecido
//        // ...
//
//        // Retornar um status de sucesso (204 No Content) após a remoção do personagem
//        return ResponseEntity.noContent().build();
//    }


    @GetMapping("/{id}")

    public ResponseEntity<Character> getCharacterById(@PathVariable long id) {
        // URL da API para obter informações sobre um personagem específico
        String apiUrl = "https://narutodb.xyz/api/character/" + id;

        // Fazer a chamada à API e obter a resposta
        ResponseEntity<Character> response = new RestTemplate().getForEntity(apiUrl, Character.class);

        // Verificar se a chamada foi bem-sucedida (código 2xx)
        if (response.getStatusCode().is2xxSuccessful()) {
            // Retornar as informações do personagem
            return ResponseEntity.ok(response.getBody());
        } else {
            // Retornar um status de erro caso a chamada falhe
            return ResponseEntity.status(response.getStatusCode()).build();
        }



    }

}
