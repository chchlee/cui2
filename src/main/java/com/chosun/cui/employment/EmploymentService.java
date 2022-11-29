package com.chosun.cui.employment;

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
public class EmploymentService {

    private final EmploymentRepository employmentRepository;

    public Page<Employment> getList(int page){
        List<Sort.Order> sorts = new ArrayList<>();
        sorts.add(Sort.Order.desc("ENumber"));
        Pageable pageable = PageRequest.of(page,10,Sort.by(sorts));
        return this.employmentRepository.findAll(pageable);
    }
}
