package com.notsohan.noteTaking.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table
public class NoteTaker {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;
    @NotBlank
    @Column(name = "title")
    private String title;
    @NotBlank
    @Column(name = "note")
    private String note;

    public NoteTaker(String title, String note) {
        this.title = title;
        this.note = note;
    }
}
