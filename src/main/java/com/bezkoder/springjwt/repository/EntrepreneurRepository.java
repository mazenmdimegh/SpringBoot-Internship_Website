package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Entrepreneur;
import com.bezkoder.springjwt.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EntrepreneurRepository extends JpaRepository<Entrepreneur, Long> {
	Optional<User> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
}
