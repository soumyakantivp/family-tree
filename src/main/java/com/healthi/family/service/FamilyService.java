package com.healthi.family.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.healthi.family.model.Initialize;
import com.healthi.family.model.Person;

public class FamilyService{
	//generate family tree
	Initialize family = new Initialize();
	Map<String, Person> familyTree = family.generateFamilyTree();
	;
/* CHILD ADDITION METHOD*/
	public boolean addChild(String mother, String child, String gender) {
		return true;
	}
/* RELATIONSHIPS HANDLING METHODS*/
	
	//return siblings of Person p | null if none.
	public List<Person> getSiblings(Person p){
		Person mother = p.getMother();
		if(mother.equals(null))
			return null;
		List<Person> siblings = new ArrayList<Person>();
		for(Person child: mother.getChildren()) 
			if(!child.equals(p))
				siblings.add(child);
		return siblings;
	}

	//return sons of Person p | null if none.
	public List<Person> getSon(Person p){
		List<Person> sons = new ArrayList<Person>();
		for(Person child: p.getChildren()) 
			if(child.getGender().equalsIgnoreCase("male"))
				sons.add(child);
		return sons;
	}

	//return daughters of Person p | null if none.
	public List<Person> getDaughters(Person p){
		List<Person> daughters = new ArrayList<Person>();
		for(Person child: p.getChildren()) 
			if(child.getGender().equalsIgnoreCase("female"))
				daughters.add(child);
		return daughters;
	}

	//return brothers of Person p | null if none.
	public List<Person> getBrothers(Person p){
		Person mother = p.getMother();
		if(mother.equals(null))
			return null;
		List<Person> brothers = new ArrayList<Person>();
		for(Person child: getSon(mother)) 
			if(!child.equals(p))
				brothers.add(child);
		return brothers;
	}

	//return sisters of Person p | null if none.
	public List<Person> getSisters(Person p){
		Person mother = p.getMother();
		if(mother.equals(null))
			return null;
		List<Person> sisters = new ArrayList<Person>();
		for(Person child: getDaughters(mother)) 
			if(!child.equals(p))
				sisters.add(child);
		return sisters;
	}

	//return brother-in-law of Person p | null if none.
	public List<Person> getBrotherInLaw(Person p){
		List<Person> brotherInLaw = new ArrayList<Person>();

		//add spouse's brothers
		Person spouse = p.getSpouse();
		if(!spouse.equals(null))
			brotherInLaw.addAll(getBrothers(spouse));

		//add husbands of sisters
		List<Person> sisters = getSisters(p);
		for(Person sister: sisters) {
			Person husband = sister.getSpouse();
			if(!husband.equals(null))
				brotherInLaw.add(husband);
		}

		return brotherInLaw;
	}

	//return sister-in-law of Person p | null if none.
	public List<Person> getSisterInLaw(Person p){
		List<Person> sisterInLaw = new ArrayList<Person>();

		//add spouse's sisters
		Person spouse = p.getSpouse();
		if(!spouse.equals(null))
			sisterInLaw.addAll(getSisters(spouse));

		//add wives of brothers
		List<Person> brothers = getBrothers(p);
		for(Person brother: brothers) {
			Person wife = brother.getSpouse();
			if(!wife.equals(null))
				sisterInLaw.add(wife);
		}

		return sisterInLaw;
	}

	//return maternal-aunt of Person p | null if none.
	public List<Person> getMaternalAunt(Person p){
		List<Person> maternalAunt = new ArrayList<Person>();
		Person mother = p.getMother();
		if(!mother.equals(null))
			maternalAunt.addAll(getSisters(p));
		return maternalAunt;
	}

	//return paternal-aunt of Person p | null if none.
	public List<Person> getPaternalAunt(Person p){
		List<Person> paternalAunt = new ArrayList<Person>();
		Person father = p.getFather();
		if(!father.equals(null))
			paternalAunt.addAll(getSisters(p));
		return paternalAunt;
	}

	//return maternal-uncle of Person p | null if none.
	public List<Person> getMaternalUncle(Person p){
		List<Person> maternalUncle = new ArrayList<Person>();
		Person mother = p.getMother();
		if(!mother.equals(null))
			maternalUncle.addAll(getBrothers(p));
		return maternalUncle;
	}

	//return paternal-uncle of Person p | null if none.
	public List<Person> getPaternalUncle(Person p){
		List<Person> paternalUncle = new ArrayList<Person>();
		Person father = p.getFather();
		if(!father.equals(null))
			paternalUncle.addAll(getBrothers(p));
		return paternalUncle;
	}
}
