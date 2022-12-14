package com.chosun.cui.bootcamp;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class BootcampService {

    private final BootcampRepository bootcampRepository;

    public Page<Bootcamp> getList(int page){
        List<Sort.Order> sorts = new ArrayList<>();
        sorts.add(Sort.Order.desc("BNumber"));
        Pageable pageable = PageRequest.of(page,10,Sort.by(sorts));
        return this.bootcampRepository.findAll(pageable);
    }
}
