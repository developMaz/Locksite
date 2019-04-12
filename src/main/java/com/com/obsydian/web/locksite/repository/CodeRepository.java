package com.com.obsydian.web.locksite.repository;

import com.com.obsydian.web.locksite.domain.Code;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CodeRepository extends CrudRepository<Code, Integer> {

	@Override
	List<Code> findAll();

	List<Code> findAllByOrderByAccessCodeAsc();

	Optional<Code> findById (Integer id);

	@Override
	Code save(Code code);

	@Override
	void delete(Code code);


}
