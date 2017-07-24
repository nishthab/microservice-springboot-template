package com.nmspringstack.dao.jpa;

import com.nmspringstack.domain.Todo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
public interface TODORepository extends PagingAndSortingRepository<Todo, Long> {

	// TODO Change this JPA Repository to add custom query methods  to suit your application
	
	Page<Todo> findAll(Pageable pageable);
	
}
