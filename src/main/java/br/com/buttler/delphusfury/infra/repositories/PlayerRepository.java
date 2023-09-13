package br.com.buttler.delphusfury.infra.repositories;

import br.com.buttler.delphusfury.infra.entities.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {
}
