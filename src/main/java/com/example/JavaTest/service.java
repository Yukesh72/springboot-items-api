package com.example.JavaTest;

import com.example.JavaTest.model;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class service {

    private List<model> items = new ArrayList<>(); // STORAGE
    private long counter = 1;

    public model addItem(model item) //TO ADD DETAILS
    {
        item.setId(counter++);
        items.add(item);
        return item;
    }

    public Optional<model> getItembyId(Long id)    //TO SHOW DETAILS
    {
        return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }
}
