package JavaChallengeStudy.Hello.user;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;


@Entity
@Getter
@Table(name="users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Integer number;

    @Builder
    public Users(Long id, String name, Integer number){
        this.id = id;
        this.name = name;
        this.number = number;
    }
}
