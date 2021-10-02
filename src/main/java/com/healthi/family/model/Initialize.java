package com.healthi.family.model;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Initialize {
	public void couples(Person p1, Person p2) {
		p1.setSpouse(p2);
		p2.setSpouse(p1);
	}

	public Map<String, Person> generateFamilyTree(){
		Map<String, Person> familyTree = new HashMap<String, Person>();
		
		Person kingshan = new Person("King Shan", "male", null, null, null, null);
		Person queenanga = new Person("Queen Anga", "female", null, null, null, null);
		Person chit = new Person("Chit", "male", null, null, null, null);
		Person amba = new Person("Amba", "female", null, null, null, null);
		Person ish = new Person("Ish", "male", null, null, null, null);
		Person vich = new Person("Vich", "male", null, null, null, null);
		Person lika = new Person("Lika", "female", null, null, null, null);
		Person aras = new Person("Aras", "male", null, null, null, null);
		Person chitra = new Person("Chitra", "female", null, null, null, null);
		Person satya = new Person("Satya", "female", null, null, null, null);
		Person vyan = new Person("Vyan", "male", null, null, null, null);
		Person dritha = new Person("Dritha", "female", null, null, null, null);
		Person jaya = new Person("Jaya", "male", null, null, null, null);
		Person tritha = new Person("Tritha", "female", null, null, null, null);
		Person vritha = new Person("Vritha", "male", null, null, null, null);
		Person vila = new Person("Chika", "female", null, null, null, null);
		Person chika = new Person("Chika", "female", null, null, null, null);
		Person arit = new Person("Arit", "male", null, null, null, null);
		Person jnki = new Person("Jnki", "female", null, null, null, null);
		Person ahit = new Person("Ahit", "male", null, null, null, null);
		Person satvy = new Person("Satvy", "female", null, null, null, null);
		Person asva = new Person("Asva", "male", null, null, null, null);
		Person krpi = new Person("Krpi", "female", null, null, null, null);
		Person vyas = new Person("Vyas", "male", null, null, null, null);
		Person atya = new Person("Atya", "female", null, null, null, null);
		Person yodhan = new Person("Yodhan", "male", null, null, null, null);
		Person laki = new Person("Laki", "male", null, null, null, null);
		Person lavnya = new Person("Lavnya", "female", null, null, null, null);
		Person vasa = new Person("Vasa", "male", null, null, null, null);
		Person kriya = new Person("Kriya", "male", null, null, null, null);
		Person krithi = new Person("Krithi", "female", null, null, null, null);

		//set spouse*************************************************************
		couples(kingshan, queenanga);
		couples(chit, amba);
		couples(vich, lika);
		couples(aras, chitra);
		couples(satya, vyan);
		couples(dritha, jaya);
		couples(arit, jnki);
		couples(satvy, asva);
		couples(krpi, vyas);

		//set parents***********************************************************
		chit.setParents(kingshan, queenanga);
		ish.setParents(kingshan, queenanga);
		vich.setParents(kingshan, queenanga);
		aras.setParents(kingshan, queenanga);
		satya.setParents(kingshan, queenanga);

		dritha.setParents(chit, amba);
		tritha.setParents(chit, amba);
		vritha.setParents(chit, amba);

		vila.setParents(vich, lika);
		chika.setParents(vich, lika);

		jnki.setParents(aras, chitra);
		ahit.setParents(aras, chitra);

		asva.setParents(vyan, satya);
		vyas.setParents(vyan, satya);
		atya.setParents(vyan, satya);

		yodhan.setParents(jaya, dritha);

		laki.setParents(arit, jnki);
		lavnya.setParents(arit, jnki);

		vasa.setParents(asva, satvy);

		kriya.setParents(vyas, krpi);
		krithi.setParents(vyas, krpi);

		//set children*****************************************************************
		queenanga.setChildren(Arrays.asList(
				chit, ish, vich, aras, satya
				));
		amba.setChildren(Arrays.asList(
				dritha, tritha, vritha
				));
		lika.setChildren(Arrays.asList(
				vila, chika
				));
		chitra.setChildren(Arrays.asList(
				jnki, ahit
				));
		satya.setChildren(Arrays.asList(
				asva, vyas, atya
				));
		dritha.setChildren(Arrays.asList(
				yodhan
				));
		jnki.setChildren(Arrays.asList(
				laki, lavnya
				));
		satvy.setChildren(Arrays.asList(
				vasa
				));
		krpi.setChildren(Arrays.asList(
				kriya, krithi
				));
		
		//create map******************************************************************************
		//name is key: name must be unique
		familyTree.put(kingshan.getName(), kingshan);
		familyTree.put(queenanga.getName(), queenanga);
		familyTree.put(chit.getName(), chit);
		familyTree.put(amba.getName(), amba);
		familyTree.put(ish.getName(), ish);
		familyTree.put(vich.getName(), vich);
		familyTree.put(lika.getName(), lika);
		familyTree.put(aras.getName(), aras);
		familyTree.put(chitra.getName(), chitra);
		familyTree.put(satya.getName(), satya);
		familyTree.put(vyan.getName(), vyan);
		familyTree.put(dritha.getName(), dritha);
		familyTree.put(jaya.getName(), jaya);
		familyTree.put(tritha.getName(), tritha);
		familyTree.put(vritha.getName(), vritha);
		familyTree.put(vila.getName(), vila);
		familyTree.put(chika.getName(), chika);
		familyTree.put(arit.getName(), arit);
		familyTree.put(jnki.getName(), jnki);
		familyTree.put(ahit.getName(), ahit);
		familyTree.put(satvy.getName(), satvy);
		familyTree.put(asva.getName(), asva);
		familyTree.put(krpi.getName(), krpi);
		familyTree.put(vyas.getName(), vyas);
		familyTree.put(atya.getName(), atya);
		familyTree.put(yodhan.getName(), yodhan);
		familyTree.put(laki.getName(), laki);
		familyTree.put(lavnya.getName(), lavnya);
		familyTree.put(vasa.getName(), vasa);
		familyTree.put(kriya.getName(), kriya);
		familyTree.put(krithi.getName(), krithi);
		
		return familyTree;
	}
}
