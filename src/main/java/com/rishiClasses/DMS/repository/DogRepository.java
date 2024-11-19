package com.rishiClasses.DMS.repository;
import java.util.List;

//author:Rishil Reddy Dandoori/S568997
import org.springframework.data.repository.CrudRepository;

import com.rishiClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);

}
