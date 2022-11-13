package com.chosun.cui.employment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmploymentService {

    private final EmploymentRepository employmentRepository;

    public List<Employment> getList(){
        return this.employmentRepository.findAll();
    }
}
