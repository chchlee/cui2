package com.chosun.cui.internship;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class InternshipService {

    private final InternshipRepository internshipRepository;

    public List<Internship> getList(){
        return this.internshipRepository.findAll();
    }
}
