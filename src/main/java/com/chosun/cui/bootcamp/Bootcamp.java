package com.chosun.cui.bootcamp;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class Bootcamp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer BNumber;

    @Column(length = 200)
    private String BName;

    @Column(columnDefinition = "TEXT")
    private String BContent;

    @Column(length = 200)
    private String BDay;

    @Column(length = 200)
    private String BLocation;

    @Column(length = 200)
    private String BCost;

    @Column(length = 200)
    private String BUrl;


}
