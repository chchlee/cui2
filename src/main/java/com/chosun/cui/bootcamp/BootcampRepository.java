package com.chosun.cui.bootcamp;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BootcampRepository extends JpaRepository<Bootcamp, Integer> {
//    Page<Bootcamp> findAll(Pageable pageable);

}
