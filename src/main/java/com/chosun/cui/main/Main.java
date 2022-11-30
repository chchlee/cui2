package com.chosun.cui.main;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Main {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer MNumber;

    @Column(length = 200)
    private String MSName;

    @Column(columnDefinition = "TEXT")
    private String MSContent;

    @Column(length = 200)
    private String MKakao;
}