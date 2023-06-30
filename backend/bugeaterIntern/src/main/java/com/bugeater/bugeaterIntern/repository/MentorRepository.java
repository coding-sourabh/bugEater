package com.bugeater.bugeaterIntern.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bugeater.bugeaterIntern.entity.Mentor;

@Repository
public interface MentorRepository extends CrudRepository<Mentor, Integer>{

}
