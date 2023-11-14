package me.giyong8504;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본 생성자
@AllArgsConstructor
@Getter
@Entity // 엔티티로 지정
public class Member {

    @Id // id 필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키 자동 증감
    @Column(name = "id", updatable = false)
    private Long id; // DB 테이블의 'id' 컬럼과 매칭

    @Column(name = "name", nullable = false) // name이라는 not null 컬럼과 매칭
    private String name; // DB 테이블의 'name' 컬럼과 명칭
}
