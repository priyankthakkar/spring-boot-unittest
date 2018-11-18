package io.priyank.springbootut.service;

import io.priyank.springbootut.model.Item;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    public Item retreiveItem() {
        return new Item(1, "Ball", 10, 100);
    }
}
