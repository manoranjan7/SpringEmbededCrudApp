package com.student.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.models.User;
import com.student.repositary.FlipcartRepositary;

@Service
public class FlipcartServices {
	
	@Autowired
	FlipcartRepositary flipRepositary;
	

	public void receivingOrder(User user) {
		// TODO Auto-generated method stub
		flipRepositary.save(user);
		
	}


	public List<User> getUserByName(String name) {
		// TODO Auto-generated method stub
		return flipRepositary.getUserByName(name);
		
	}

}
