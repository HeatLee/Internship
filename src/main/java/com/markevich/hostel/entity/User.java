package com.markevich.hostel.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_entity")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String login;
    private String password;
    private boolean isAlive;
    private String firstName;
    private String lastName;
    private String middleName;
    private int course;
    private int hostelNumber;
    private int room;
    private int student_id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Role role;

    @OneToMany(mappedBy = "user")
    private List<Violator> violatorList;


}
