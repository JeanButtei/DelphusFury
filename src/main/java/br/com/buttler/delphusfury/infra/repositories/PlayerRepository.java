package br.com.buttler.delphusfury.infra.repositories;

import br.com.buttler.delphusfury.infra.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
