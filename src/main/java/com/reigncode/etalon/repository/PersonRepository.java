package com.reigncode.etalon.repository;

import com.reigncode.etalon.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Denis on 3/16/2015.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
}
