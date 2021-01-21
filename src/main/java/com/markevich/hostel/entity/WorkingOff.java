package com.markevich.hostel.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "working_off")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
public class WorkingOff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
    private int amount;

}
