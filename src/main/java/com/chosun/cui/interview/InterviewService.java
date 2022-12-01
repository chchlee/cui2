package com.chosun.cui.interview;

import lombok.RequiredArgsConstructor;
import com.chosun.cui.DataNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class InterviewService {

    private final InterviewRepository interviewRepository;

    public List<Interview> getList(){
        return this.interviewRepository.findAll();
    };

    public Interview getInterview(Integer IVNumber){
        Optional<Interview> interview = this.interviewRepository.findById(IVNumber);
        if (interview.isPresent()){
            return interview.get();
        }else{
            throw new DataNotFoundException("question not found");
        }
    }

}
