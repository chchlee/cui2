package com.chosun.cui.interview;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class InterviewService {

    private final InterviewRepository interviewRepository;

    public List<Interview> getList(){
        return this.interviewRepository.findAll();
    };

}
