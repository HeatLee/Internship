package com.markevich.hostel.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "privileges")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
public class Privilege {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "request_id", referencedColumnName = "id")
    private Request request;
    @OneToMany()
    private List<PrivilegeName> privilegeName;


}
