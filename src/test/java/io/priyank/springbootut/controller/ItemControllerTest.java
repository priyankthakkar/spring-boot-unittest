package io.priyank.springbootut.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ItemController.class)
public class ItemControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getItem_basic() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders
                .get("/item")
                .accept(MediaType.APPLICATION_JSON);

        // We are using JSONAssert (content().json()) method here
        // JSONAssert has two modes, strict and non-strict
        // non-strict mode allows us to verify the response even if the response is the super set of expected response
        // Also, we can write JSON content without using escape characters as written in example below
        // It needs escape characters only of the value contains the space in between characters
        MvcResult result = this.mockMvc
                .perform(request)
                .andExpect(status().isOk())
                .andExpect(content().json("{id: 1, name: Ball, price: 10, quantity: 100}"))
                .andReturn();
    }
}
