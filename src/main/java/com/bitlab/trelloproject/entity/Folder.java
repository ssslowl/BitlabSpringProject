package com.bitlab.trelloproject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Table
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String name;

    @Column
    @ManyToMany
    List<TaskCategories> categories; // Many To Many
}
