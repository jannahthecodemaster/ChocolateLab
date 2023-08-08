package com.bnta.chocolate.components;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    EstateRepository estateRepository;

    @Autowired
    ChocolateRepository chocolateRepository;
    public DataLoader(){

    }
    @Override
    public void run(ApplicationArguments args){
        Estate estate1 = new Estate("chocolate land", "Barbados");
        estateRepository.save(estate1);
        Estate estate2 = new Estate("caramel cruise", "Colombia");
        estateRepository.save(estate2);
        Chocolate chocolate1 = new Chocolate("Twix", 48, estate1);
        chocolateRepository.save(chocolate1);
        Chocolate chocolate2 = new Chocolate("Mars", 35, estate2);
        chocolateRepository.save(chocolate2);
        Chocolate chocolate3 = new Chocolate("Crunchie", 5, estate2);
        chocolateRepository.save(chocolate3);
    }


}
