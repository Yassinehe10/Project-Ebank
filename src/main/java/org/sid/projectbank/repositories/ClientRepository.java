package org.sid.projectbank.repositories;

import org.sid.projectbank.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findByNameContains(String keyword);
}
