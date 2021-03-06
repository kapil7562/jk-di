package com.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18NSpanishGreetingService implements IGreetingService{

	@Override
	public String sayGreeting() {
		
		return "Hola Mundo - ES";
	}

}
