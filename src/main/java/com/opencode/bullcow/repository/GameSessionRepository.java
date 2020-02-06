package com.opencode.bullcow.repository;

import com.opencode.bullcow.entity.GameSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameSessionRepository extends JpaRepository<GameSession, Integer> {
}
