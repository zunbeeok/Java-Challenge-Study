package JavaChallengeStudy.Hello.board.entity;


import JavaChallengeStudy.Hello.user.Users;
import lombok.Builder;

import javax.persistence.*;

@Entity
@Table(name = "comments")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name="user_id", nullable = false)
    private Users userId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name =  "boardId", nullable = false)
    private Boards boardId;

    @Column
    private String comment;

    @Builder
    public Comments(Long id, Users userId, Boards boardId, String comment){
        this.id = id;
        this.userId = userId;
        this.boardId = boardId;
        this.comment = comment;
    }
}
