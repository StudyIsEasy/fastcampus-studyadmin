package com.fastcampus.admin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
@Getter
@Setter
public class CourseDetail extends BaseEntity{

    private String title;           // 강좌 상세 타이틀

    private String content;         // 강좌 상세 컨텐츠

    @JsonIgnore
    @ManyToOne
    private Course course;          // 강좌

}
