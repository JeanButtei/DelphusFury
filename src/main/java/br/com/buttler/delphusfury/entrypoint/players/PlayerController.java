package br.com.buttler.delphusfury.entrypoint.players;

import br.com.buttler.delphusfury.infra.entities.Player;
import br.com.buttler.delphusfury.infra.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("player")
public class PlayerController {

    @Autowired
    private PlayerRepository repository;

    @GetMapping(value = "/{id}", produces = "application/json")
    public Player getPlayer(@PathVariable long id) {
        return findPlayerById(id);
    }

    public Player findPlayerById(long id) {
        return repository.getOne(id);
    }
}
