package com.markevich.hostel.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "violators")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
public class Violator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "act_id")
    private Act act;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
