package com.test.hplus.repositrory;

import com.test.hplus.beans.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Mohammed Amr
 * @created 17/05/2021 - 01:50
 * @project hplus-app
 */

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("select u from user u where u.username = :name")
    public User searchByName(@Param("name") String username);
}
