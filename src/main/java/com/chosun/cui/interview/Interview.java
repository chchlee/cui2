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

    @Column(length = 200)
    private String IVLName;

    @Column(length = 200)
    private String IVLGraduation;

    @Column(length = 200)
    private String IVLDepartment;

    @Column(length = 200)
    private String IVLEnterprise;

    @Column(length = 200)
    private String IVLDate;

    @Column(length = 200)
    private String IVLJob;

    @Column(length = 200)
    private String IVLCredit;

    @Column(length = 200)
    private String IVLCertificate;

    @Column(columnDefinition = "TEXT")
    private String IVLContents;
}
