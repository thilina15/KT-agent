package com.simple_chat.open_ai_chat.repository;

import com.simple_chat.open_ai_chat.model.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository<Agent,Long> {
}
