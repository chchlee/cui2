package com.chosun.cui.creator;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Creator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CRNumber;

    @Column(length = 200)
    private String CRName;

    @Column(columnDefinition = "TEXT")
    private String CRContent;

}
