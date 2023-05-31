package JavaChallengeStudy.Hello.board.dto;

import JavaChallengeStudy.Hello.board.entity.Board;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ResponseBoardDto {
    private Long id;
    private String boardName;
    private String content;

    //질문 여기서는 왜 entity를 의존하지 않는가?
    @Builder
    public ResponseBoardDto(Long id, String boardName, String content){
        this.id = id;
        this.boardName = boardName;
        this.content = content;
    }

}
