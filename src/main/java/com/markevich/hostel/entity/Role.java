package com.markevich.hostel.entity;

import lombok.*;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Entity
@Table(name = "role")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Enumerated(EnumType.STRING)
    @NaturalId
    private Roles role;
}

enum Roles {
    ADMIN, USER, DEFAULT;
}
