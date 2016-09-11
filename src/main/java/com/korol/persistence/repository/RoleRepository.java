package com.korol.persistence.repository;

import com.korol.persistence.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Somebody on 11.09.2016.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
