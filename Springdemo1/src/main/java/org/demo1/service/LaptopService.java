package org.demo1.service;

import org.demo1.repo.LaptopRepository;
import org.demo1.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap) {
       repo.save(lap);
    }

    public boolean isGoodforProg(Laptop laptop){
        return true;
    }
}
