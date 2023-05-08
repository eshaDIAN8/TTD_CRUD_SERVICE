package com.citi.converter.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citi.converter.model.Convert;

@Repository
public interface ConvertRepo extends JpaRepository<Convert, String>{

	//@Query("select formula from e where convertedUnit:=convertedUnit")
	public Convert findByName(String converTedUnit);

	

	
	


	

}
