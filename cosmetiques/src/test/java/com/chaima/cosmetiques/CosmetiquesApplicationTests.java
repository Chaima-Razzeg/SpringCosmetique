package com.chaima.cosmetiques;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.chaima.cosmetiques.entities.Cosmetique;
import com.chaima.cosmetiques.entities.Rayon;
import com.chaima.cosmetiques.repos.CosmetiqueRepository;

@SpringBootTest
class CosmetiquesApplicationTests {
	
	@Autowired
	private CosmetiqueRepository cosmetiqueRepository;
	
	//@Test
	//public void testCreateCosmetique() {
	//Cosmetique cosm = new Cosmetique("Bain de Huile",29.9,new Date());
	//cosmetiqueRepository.save(cosm);
	//}
	
	 @Test
	 public void testFindCosmetique()
	 {
	 Cosmetique c = cosmetiqueRepository.findById(1L).get();
	 System.out.println(c);
	 }
	 
	 @Test
	 public void testUpdateCosmetique()
	 {
	 Cosmetique c = cosmetiqueRepository.findById(1L).get();
	 c.setPrixCosmetique(65.200);
	 cosmetiqueRepository.save(c);
	 }
	 
	 @Test
	 public void testDeleteCosmetique()
	 {
	 cosmetiqueRepository.deleteById(1L);;
	 }

	 @Test
	 public void testListerTousCosmetiques()
	 {
	 List<Cosmetique> cosms = cosmetiqueRepository.findAll();
	 for (Cosmetique c : cosms)
	 {
	 System.out.println(c);
	 }
	 }
	 
	 @Test
	 public void testFindCosmetiqueByNom()
	 {
	 List<Cosmetique> cosms = cosmetiqueRepository.findByNomCosmetique("Ecran solaire SPF50");
	 for (Cosmetique c : cosms)
	 {
	 System.out.println(c);
	 }
	 }
	 
	 @Test
	 public void testFindCosmetiqueByNomContains()
	 {
	 List<Cosmetique> cosms = cosmetiqueRepository.findByNomCosmetiqueContains("e");
	 for (Cosmetique c : cosms)
	 {
	 System.out.println(c);
	 }
	 }
	 
	 @Test
	 public void testfindByNomPrix()
	 {
	 List<Cosmetique> cosms = cosmetiqueRepository.findByNomPrix("Ecran solaire SPF50", 89.9);
	 for (Cosmetique c :cosms)
	 {
	    System.out.println(c);
	 }
	 }
	 
	 @Test
	 public void testfindByRayon()
	 {
	 Rayon ray = new Rayon();
	 ray.setIdRay(1L);
	 List<Cosmetique> cosms = cosmetiqueRepository.findByRayon(ray);
	 for (Cosmetique c : cosms)
	 {
	    System.out.println(c);
	 }
	 }
	 
	 @Test
	 public void findByRayonIdRay()
	 {
	 List<Cosmetique> cosms = cosmetiqueRepository.findByRayonIdRay(1L);
	 for (Cosmetique c : cosms)
	 {
	    System.out.println(c);
	 }
	  }
	 
	 @Test
	 public void testfindByOrderByNomCosmetiqueAsc()
	 {
	 List<Cosmetique> cosms =
	 cosmetiqueRepository.findByOrderByNomCosmetiqueAsc();
	 for (Cosmetique c : cosms)
	   {
	    System.out.println(c);
	   }
	 }
	 
	 @Test
	 public void testTrierCosmetiquesNomsPrix()
	 {
	 List<Cosmetique> cosms = cosmetiqueRepository.trierCosmetiquesNomsPrix();
	 for (Cosmetique c : cosms)
	 {
	   System.out.println(c);
	 }
	 }

	 
	 
}


