package com.chosun.cui.competition;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CNumber;

    @Column(length = 200)
    private String CName;

    @Column(columnDefinition = "TEXT")
    private String CContent;

    @Column(length = 200)
    private String CDay;

    @Column(length = 200)
    private Integer CCost;


}
