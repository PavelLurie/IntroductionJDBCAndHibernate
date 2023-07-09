package model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long id;
    private String name;
    private String lastName;
    private byte age;
}
