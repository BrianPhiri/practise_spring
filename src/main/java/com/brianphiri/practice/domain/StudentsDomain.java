package com.brianphiri.practice.domain;

import com.brianphiri.practice.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * StudentsDomain
 */
public interface StudentsDomain extends JpaRepository<Students, Long> {

}