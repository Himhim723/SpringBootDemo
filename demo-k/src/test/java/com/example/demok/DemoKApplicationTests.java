package com.example.demok;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import com.example.demok.service.UserService;

//Hamcrest -> Matchers
// JUnit5 -> Jupiter -> @Mock 
// Spring Test Framework -> @WebMockMvc
// What is SpringBootTest?

// I am going to test the server start context, with dependency checking
@SpringBootTest
@AutoConfigureMockMvc
// mvn test -> Simulate App Sever Start (Bean Injection on Context)
class DemoKApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

	@Test
	void testMTR() throws Exception {
		ResultActions mvcResult = mockMvc.perform(get("/api/v1/arrivaltime"))
                                     .andExpect(status().isOk())
                                     .andExpect(content().contentType("application/json"))
                                     .andDo(MockMvcResultHandlers.print()); 
	}

}
