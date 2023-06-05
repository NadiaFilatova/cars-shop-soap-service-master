package com.nadia.model.repository;

import com.nadia.model.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nadia Filatova
 * @since 6/1/23
 */

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long> {
}
