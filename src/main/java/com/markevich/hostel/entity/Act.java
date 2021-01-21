package com.markevich.hostel.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "act")
@Getter @Setter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
public class Act {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String violation;
    private Date date;
    private String composedBy;


}
