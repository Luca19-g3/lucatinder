package com.lucatinder.g3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lucatinder.g3.modelo.Perfil;
import com.lucatinder.g3.utilidades.FakePerfiles;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LucaTinderApplicationTests {

	@Test
	public void contextLoads() {
		probadorFakerUsuairo();
		
		
	}
	
	/**
	 * pruevas del javafaker
	 * @author jesus
	 */
	
	 public static void probadorFakerUsuairo() {
		 Perfil p = FakePerfiles.perfilRandom();
			System.out.println("-------------------------------------------------------------------------------");
			 System.out.println(p);
			 System.out.println("-------------------------------------------------------------------------------");
		
		 }

}
