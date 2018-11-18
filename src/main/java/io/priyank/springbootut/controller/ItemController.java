package io.priyank.springbootut.controller;

import io.priyank.springbootut.model.Item;
import io.priyank.springbootut.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/item")
    public Item getItem() {
        return this.itemService.retreiveItem();
    }
}
