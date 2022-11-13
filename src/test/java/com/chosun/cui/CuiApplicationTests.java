package com.chosun.cui;


import com.chosun.cui.bootcamp.BootcampService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CuiApplicationTests {

    @Autowired
    private BootcampService bootcampService;

//    @Autowired
//    private CompetitionService competitionService;



//    @Test
//    void testJpa(){
//        String BName = "test";
//        String BContent = "test";
//        String BDay = "test";
//        String BLocation = "test";
//        int BCost = 1110;
//        this.bootcampService.create(BName,BContent,BDay,BLocation,BCost);
//    }


}
