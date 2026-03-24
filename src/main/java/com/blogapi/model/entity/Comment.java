
package com.blogapi.model.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity @Data
public class Comment {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
 private String content;
 private String author;
 @ManyToOne
 private Post post;
}
