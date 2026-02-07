package com.example.JavaTest;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class control {

    @Autowired
    service s;

    @PostMapping("/additems")
    public ResponseEntity<model> addItem(@Valid @RequestBody model item)
    {
        return ResponseEntity.ok(s.addItem(item));
    }

    @GetMapping("/getitems/{id}")
    public ResponseEntity<model> getItem(@PathVariable Long id)
    {
        return s.getItembyId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
