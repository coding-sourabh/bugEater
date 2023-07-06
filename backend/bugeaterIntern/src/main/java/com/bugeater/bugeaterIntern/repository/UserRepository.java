package com.bugeater.bugeaterIntern.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.bugeater.bugeaterIntern.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
