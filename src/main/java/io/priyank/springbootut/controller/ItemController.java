package io.priyank.springbootut.controller;

import io.priyank.springbootut.model.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @GetMapping("/item")
    public Item getItem() {
        return new Item(1, "Ball", 10, 100);
    }
}
