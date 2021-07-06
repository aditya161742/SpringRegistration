package com.springbootregistration.Repositories.interf;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootregistration.models.Users;

@Repository
public interface UserDetailsInterf extends CrudRepository<Users,Long>{

	
}
