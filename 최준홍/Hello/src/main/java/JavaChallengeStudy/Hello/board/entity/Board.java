package JavaChallengeStudy.Hello.board.entity;

import JavaChallengeStudy.Hello.board.dto.RequestBoardDto;
import JavaChallengeStudy.Hello.common.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "boards")
public class Board extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String boardName;

    @Column
    private String content;

    @Column
    private String tags;

    @Builder
    public Board( String boardName, String content, String tags){
//        this.id = id ;
        this.boardName =boardName;
        this.content = content;
        this.tags  = tags;
    }

    public static Board mapToEntity(RequestBoardDto boards){
        return Board.builder()
//                .id(boards.getId())
                .boardName(boards.getBoardName())
                .content(boards.getContent())
                .tags(boards.toStringTag(boards.getTagsList()))
                .build();
    }






}
