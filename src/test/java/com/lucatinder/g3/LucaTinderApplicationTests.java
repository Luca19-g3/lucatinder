package com.lucatinder.g3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

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
		probadorFakerPerfil();
		probadorFakeArrayPerfiles();
		
		
	}
	
	/**
	 * pruevas del javafaker crear 1 perfil ramdom
	 * @author jesus
	 */
	
	 public static void probadorFakerPerfil() {
		 Perfil p = FakePerfiles.perfilRandom();
			System.out.println("-------------------------------------------------------------------------------");
			 System.out.println(p);
			  assertNotEquals(null, p.getCorreo());
			  assertNotEquals(null, p.getEdad());
			  assertNotEquals(null, p.getGenero());
			  assertNotEquals(null, p.getPassword());
			  assertNotEquals(null, p.getNombre());
			  assertNotEquals(null, p.getDescripcion()); 
			  
		 }
	 
		/**
		 * pruevas del javafaker crear 20 perfiles falsos
		 * @author jesus
		 */
	 
	 public static void probadorFakeArrayPerfiles() {
		 
		ArrayList<Perfil> listPerfil = new ArrayList<Perfil>();
		
		 
		listPerfil = FakePerfiles.perfilesRamdom(20);
		
		listPerfil.toString();
		 assertEquals(20, listPerfil.size());
		 
		
		 
	 }
	 
}
	 
	 