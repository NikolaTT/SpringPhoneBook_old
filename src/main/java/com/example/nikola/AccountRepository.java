package com.example.nikola;

/**
 * Created by Nikola on 17/05/2016.
 */
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByUsername(String username);
}
