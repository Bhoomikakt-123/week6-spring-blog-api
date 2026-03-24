
package com.blogapi.model.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity @Data
public class Post {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
 private String title;
 private String content;
 private String author;
 private LocalDateTime createdAt;
 private LocalDateTime updatedAt;
 @ManyToOne
 private Category category;
}
