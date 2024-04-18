package com.bitlab.trelloproject.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.engine.internal.Cascade;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String title;
    @Column
    String description; // TEXT
    @Column
    int status; // 0 - todo, 1 - intest, 2 - done, 3 - failed

    @OnDelete(action = OnDeleteAction.CASCADE)
    @ManyToOne
    Folder folder; // Many To One
}
