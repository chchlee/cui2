package com.chosun.cui;


import com.chosun.cui.bootcamp.Bootcamp;
import com.chosun.cui.bootcamp.BootcampService;
import com.chosun.cui.competition.CompetitionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CuiApplicationTests {

    @Autowired
    private BootcampService bootcampService;

    @Autowired
    private CompetitionService competitionService;



    @Test
    void testJpa(){
//        Bootcamp b1 = new Bootcamp();
//        b1.setBName();
//        b1.setBContent();
//        b1.setBDay();
//        b1.setBLocation();
//        b1.setBCost();
//        this.bootcampService.save(b1);
    }


}
