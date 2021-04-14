package com.kotinakarwak.amalgam06.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Base DTO
 *
 * @author kotikarwak
 */

@Data
@AllArgsConstructor
@NoArgsConstructor

@MappedSuperclass
public class BaseDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime created;

    @Column(nullable = false)
    private LocalDateTime modified;


}
