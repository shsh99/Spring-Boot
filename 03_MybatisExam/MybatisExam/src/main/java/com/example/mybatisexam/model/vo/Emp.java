package com.example.mybatisexam.model.vo;

import com.example.mybatisexam.model.common.BaseTimeEntity;
import lombok.*;

/**
 * packageName : com.example.mybatisexam.model.vo
 * fileName : Emp
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
@NoArgsConstructor
@AllArgsConstructor
public class Emp extends BaseTimeEntity {
    private int eno;
    private String ename;
    private String job;
    private int manager;
    private String hiredate;
    private int salary;
    private int commission;
    private int dno;

}
