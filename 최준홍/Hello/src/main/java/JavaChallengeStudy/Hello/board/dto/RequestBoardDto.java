package JavaChallengeStudy.Hello.board.dto;

import JavaChallengeStudy.Hello.board.entity.Board;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class RequestBoardDto {

    private String boardName;

    private String content;

    private List<String> tagsList;

    @Builder
    public RequestBoardDto( String boardName, String content,List<String> tagsList){
//        this.id =id;
        this.boardName = boardName;
        this.content = content;
        this.tagsList = tagsList;
    }

    public Board mapToEntity(RequestBoardDto requestBoardDto){
        return Board.mapToEntity(requestBoardDto);
    }

    public String toStringTag(List<String> tagsList){
        System.out.println(tagsList);
        return String.join(",",tagsList);
    }
}
