package org.redhat.support;

import fuse.pocs.blueprint.openjpa.Person;
import fuse.pocs.blueprint.openjpa.PersonService;

public class ConsumerServiceImpl {
	
	private PersonService personService;
	
	public void doStuff() {
		Person person = new Person();
		person.setName("Middleware support");
		//personService.saveAndRollback(person);
		personService.save(person);
		//System.out.println(personService.findByName("Middleware support"));
	}

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
}
