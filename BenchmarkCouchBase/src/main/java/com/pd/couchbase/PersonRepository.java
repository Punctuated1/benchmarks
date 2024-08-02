package com.pd.couchbase;

import java.util.List;

import org.springframework.data.couchbase.repository.Collection;
import org.springframework.data.repository.CrudRepository;

@Collection("person")
public interface PersonRepository extends CrudRepository<Person, Integer> {

	List<Person> findByLastName(String lastName);

}
