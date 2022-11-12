package com.chosun.cui.employment;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Employment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ENumber;

    @Column(length = 200)
    private String EName;

    @Column(columnDefinition = "TEXT")
    private String EContent;

    @Column(length = 200)
    private String EDay;
}
