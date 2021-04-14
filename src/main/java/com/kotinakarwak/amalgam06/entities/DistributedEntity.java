package com.kotinakarwak.amalgam06.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Base class for entities.
 *
 * @author kotikarwak
 */

@Data
@NoArgsConstructor
@AllArgsConstructor

@MappedSuperclass  // Make class abstract.
public class DistributedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime created;

    @Column(nullable = false)
    private LocalDateTime modified;

}
