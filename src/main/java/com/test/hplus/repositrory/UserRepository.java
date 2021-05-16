package com.test.hplus.repositrory;

import com.test.hplus.beans.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Mohammed Amr
 * @created 17/05/2021 - 01:50
 * @project hplus-app
 */

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
