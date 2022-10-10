package com.implementationcms.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column
    @NotEmpty
    public String content;

    @Column
    private Boolean commentStatus;

    @Column
    private LocalDateTime createdCommentTime;

    @Column
    private LocalDateTime updatedCommentTime;


}
