package com.example.nikola;

/**
 * Created by Nikola on 17/05/2016.
 */

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    Collection<Bookmark> findByAccountUsername(String username);
}
