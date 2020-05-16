package com.student.repositary;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.student.models.User;

@Repository
public interface FlipcartRepositary extends MongoRepository<User, Integer>{

	List<User> getUserByName(String name);

}
