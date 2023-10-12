package com.example.mybatisexam.model.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * packageName : com.example.mybatisexam.model.common
 * fileName : BaseTimeEntity
 * author : GGG
 * date : 2023-10-12
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-10-12         GGG          최초 생성
 */
@Getter
@Setter
@ToString
public class BaseTimeEntity {
    /** 등록일 */
    private String insertTime;

    /** 수정일 */
    private String updateTime;

    public BaseTimeEntity() {
        // TODO : 생성시 현재 날짜 넣기 "yyyy-MM-dd HH:mm:ss"
        this.insertTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        // TODO : 생성시 현재 날짜 넣기 "yyyy-MM-dd HH:mm:ss"
        this.updateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

    }
}
