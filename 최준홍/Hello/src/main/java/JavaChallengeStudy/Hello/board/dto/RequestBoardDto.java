package JavaChallengeStudy.Hello.board.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class RequestBoardDto {
    private Long id;

    private String boardName;

    @Builder
    public RequestBoardDto(Long id, String boardName){
//        this.id =id;
        this.boardName = boardName;
    }
}
