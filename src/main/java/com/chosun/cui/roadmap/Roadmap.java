package com.chosun.cui.roadmap;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Roadmap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer INumber;

    @Column(length = 200)
    private String IName;

    @Column(columnDefinition = "TEXT")
    private String IContent;

    @Column(length = 200)
    private String IDay;

}