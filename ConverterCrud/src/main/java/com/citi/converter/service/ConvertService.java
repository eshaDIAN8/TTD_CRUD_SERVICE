package com.citi.converter.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.citi.converter.model.Convert;


public interface ConvertService {

	//double convertedMetric(String convertedUnit ,String fromUnit, String toUnit, double value);

	public String findByKey(String convertedUnit);
	
	/*double convertedMetricInchToMeter(String fromUnit, String toUnit, double value);
	
	double convertedMetricFootToMeter(String fromUnit, String toUnit, double value);
	
	double convertedMetricMileToMeter(String fromUnit, String toUnit, double value);
	
	double convertedMetricMmToMeter(String fromUnit, String toUnit, double value);
	
	double convertedMetricCmToMeter(String fromUnit, String toUnit, double value);
	*/





}