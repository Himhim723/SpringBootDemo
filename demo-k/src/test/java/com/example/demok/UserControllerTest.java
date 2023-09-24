package com.example.demok;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultHandler;

import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.ArgumentMatchers.notNull;
import static org.springframework.test.web.servlet.ResultMatcher.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demok.model.User;
import com.example.demok.service.UserService;

//This is another Testing Environment
// which may not require a full context
@WebMvcTest  // @AutoConfigureMocMvc
public class UserControllerTest {
  @Autowired
  private MockMvc mockMvc;
  
  @MockBean 
  private UserService userService;

  @Test
  void testGetUsers() throws Exception{
    
    // Mockito.when(userService.findUsers()).thenReturn(List.of(new User(1),new User(2)));
    ResultActions mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/users"));
    mvcResult.andExpect(status().isOk())
             .andExpect(content().contentType("application/json"))
             .andExpect(jsonPath("$.code").value(20000))
             //.andExpect(jsonPath("$.data").doesNotExist())
             .andDo(MockMvcResultHandlers.print());
            //  .andExpect(jsonPath("$.data[1].id").value(2));
    
  }

  // @Test
  // void testGetArrivalTime() throws Exception{
  //   ResultActions mvcResult = mockMvc.perform(get("/api/v1/arrivaltime"))
  //                                    .andExpect(status().isOk())
  //                                    .andExpect(content().contentType("application/json"))
  //                                    .andDo(MockMvcResultHandlers.print()); 
  
  // }
}
