package com.markevich.hostel.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "privilege_name")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
public class PrivilegeName {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Enumerated(EnumType.ORDINAL)
    private PrivilegeNames name;
}

enum PrivilegeNames {
    ChNPP("ЧАЭС");
    private String name;

    PrivilegeNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
