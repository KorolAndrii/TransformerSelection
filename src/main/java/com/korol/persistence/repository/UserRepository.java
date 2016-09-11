package com.korol.persistence.repository;

import com.korol.persistence.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Somebody on 10.09.2016.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
