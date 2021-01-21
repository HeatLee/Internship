package com.markevich.hostel.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "request")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
    private int year;
    private boolean is_confirmed;


}
