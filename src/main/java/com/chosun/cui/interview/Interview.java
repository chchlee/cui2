package com.chosun.cui.interview;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Interview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IVNumber;

    @Column(length = 200)
    private String IVName;

    private LocalDateTime createDate;
}
