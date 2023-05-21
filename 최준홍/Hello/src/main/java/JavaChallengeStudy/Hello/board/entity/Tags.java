package JavaChallengeStudy.Hello.board.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "tags")
@ToString
public class Tags {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title_kor", length = 100, nullable = false)
    private String titleKor;

    @Column(name = "title_eng", length = 100, nullable = false)
    private String titleEng;

    @Builder
    public Tags(Long id, String titleKor, String titleEng) {
        this.id = id;
        this.titleKor = titleKor;
        this.titleEng = titleEng;
    }
}