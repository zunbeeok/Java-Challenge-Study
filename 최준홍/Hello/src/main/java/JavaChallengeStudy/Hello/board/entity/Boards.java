package JavaChallengeStudy.Hello.board.entity;

import JavaChallengeStudy.Hello.board.dto.RequestBoardDto;
import JavaChallengeStudy.Hello.common.BaseTimeEntity;
import lombok.Builder;

import javax.persistence.*;

@Entity
@Table(name = "boards")
public class Boards extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String boardName;

    public Boards(Long id, String boardName){
        this.id = id ;
        this.boardName =boardName;
    }

    @Builder
    public static Boards mapToEntity(RequestBoardDto boards){
        return Boards.builder()
                .id()
    }




}
