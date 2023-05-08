package com.citi.converter.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.citi.converter.model.Convert;
import com.citi.converter.repository.ConvertRepo;
import com.citi.converter.service.ConvertService;


@Service
public class LengthConverterServiceImpl implements ConvertService {
	
	@Autowired
	ConvertRepo repo;
	
//	@Autowired
	Convert convert = new Convert() ;
	
	@Override
	public String findByKey(String convertedUnit) {
		System.out.println("convertedUnit::"+convertedUnit);
		Convert convert = repo.findByName(convertedUnit);
		System.out.println("in crud service impl ::"+convert.getFormula());
		return convert.getFormula();
	}

	
}
