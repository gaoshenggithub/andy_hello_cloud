package cn.andy.model;

import lombok.*;
import lombok.experimental.Accessors;

import java.time.LocalDate;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Accessors(chain = true)
public class User {
    private String id;

    private LocalDate date;

    private String lastName;
}
