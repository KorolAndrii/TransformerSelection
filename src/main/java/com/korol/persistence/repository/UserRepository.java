package com.korol.persistence.repository;

import com.korol.persistence.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by Somebody on 10.09.2016.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM \"user\" u\n" +
            "WHERE u.username = ?1", nativeQuery = true)
    User getByUserName(String userName);
}
