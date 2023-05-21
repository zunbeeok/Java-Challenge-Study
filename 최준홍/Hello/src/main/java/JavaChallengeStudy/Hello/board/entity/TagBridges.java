package JavaChallengeStudy.Hello.board.entity;

import JavaChallengeStudy.Hello.board.entity.Boards;
import JavaChallengeStudy.Hello.board.entity.Tags;
import lombok.*;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "tag_bridges")
@ToString(exclude = {"boards", "tags"})
public class TagBridges{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id", nullable = false)
    private Boards boards;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_id", nullable = false)
    private Tags tags;

    @Builder
    public TagBridges(Long id, Boards boards, Tags tags) {
        this.id = id;
        this.boards = boards;
        this.tags = tags;
    }
}