package edu.hawaii.its.casdemo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.hawaii.its.casdemo.access.Authorization;

@Repository
public interface AuthorizationRepository extends JpaRepository<Authorization, Integer> {

    @Override
    Optional<Authorization> findById(Integer id);

}
