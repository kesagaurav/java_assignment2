package com.example.eval.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.model.Food;
import com.example.repository.FoodDao;
import com.example.service.FoodService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FoodServiceTests {
	@MockBean
	private FoodDao fDao;
	
	private FoodService fserv;
	
	private Food food;
	
	@Before
	public void setUp() throws Exception{
		fserv=new FoodService(fDao);
		food=new Food(3,"pizza",1500);
		when(fDao.findByFoodName("Pizza")).thenReturn(food);
		when(fDao.findByFoodName("nope")).thenReturn(null);
	
	}
	
	@Test
	public void testFindByNameSuccess() {
		assertEquals(fserv.getFoodByName("Pizza"),food);
	}
	
	@Test
	public void testFindByName() {
		assertEquals(fserv.getFoodByName("nope"),null);

	}
}
