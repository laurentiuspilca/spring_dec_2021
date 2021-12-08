package com.example.controllers;

import com.example.entities.Product;
import com.example.exceptions.AlreadyExistingProductException;
import com.example.repositories.ProductRepository;
import com.example.services.ProductService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class AddProductControllerTests {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private ProductRepository productRepository;

  @BeforeAll
  public static void beforeAll() {

  }

  @BeforeEach
  public void before() {

  }

  @Test
  @DisplayName("""
      If the endpoint is called without credentials, 
      the response status should be 401 Unauthorized.
      """)
  public void test1() throws Exception {
    ObjectMapper mapper = new ObjectMapper();

    Product p = new Product();
    p.setName("Beer");
    p.setId(1);
    p.setPrice(new BigDecimal(10));

    mockMvc.perform(post("/api/product/")
        .content(mapper.writeValueAsString(p))
        .contentType(MediaType.APPLICATION_JSON)
    ).andExpect(status().isUnauthorized());

  }

  @Test
  @DisplayName("""
      If the endpoint is called with right authentication,
      and product with given name doesn't exist,
      response status should be 200 OK, and product should be saved.
      """)
  @WithMockUser
  public void test2() throws Exception {
    ObjectMapper mapper = new ObjectMapper();

    Product p = new Product();
    p.setName("Beer");
    p.setId(1);
    p.setPrice(new BigDecimal(10));

    when(productRepository.findProductByName(anyString()))
        .thenReturn(Optional.empty());

    mockMvc.perform(post("/api/product/")
        .content(mapper.writeValueAsString(p))
        .contentType(MediaType.APPLICATION_JSON)
    ).andExpect(status().isOk());

    verify(productRepository).save(p);
  }

  @Test
  @DisplayName("""
      If the endpoint is called with right authentication,
      and product with given name exists,
      response status should be 400 Bad request, and product should not be saved.
      """)
  @WithMockUser
  public void test3() throws Exception {
    ObjectMapper mapper = new ObjectMapper();

    Product p = new Product();
    p.setName("Beer");
    p.setId(1);
    p.setPrice(new BigDecimal(10));

    when(productRepository.findProductByName(anyString()))
        .thenReturn(Optional.of(p));

    mockMvc.perform(post("/api/product/")
        .content(mapper.writeValueAsString(p))
        .contentType(MediaType.APPLICATION_JSON)
    ).andExpect(status().isBadRequest());

    verify(productRepository, never()).save(p);
  }
}
