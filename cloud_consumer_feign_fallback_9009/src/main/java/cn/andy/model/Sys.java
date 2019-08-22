package cn.andy.model;


import lombok.*;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Accessors(chain = true)
public class Sys {
    private String id;
    private String password;
    private String number;

}
