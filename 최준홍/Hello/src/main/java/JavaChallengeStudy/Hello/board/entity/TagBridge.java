package JavaChallengeStudy.Hello.board.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "tag_bridges")
@ToString(exclude = {"board", "tags"})
public class TagBridge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id", nullable = false)
    private Board board;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_id", nullable = false)
    private Tags tags;

    @Builder
    public TagBridge(Long id, Board board, Tags tags) {
        this.id = id;
        this.board = board;
        this.tags = tags;
    }
}