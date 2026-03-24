
package com.blogapi.service;

import com.blogapi.model.entity.*;
import com.blogapi.model.dto.*;
import com.blogapi.repository.*;
import com.blogapi.exception.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service @RequiredArgsConstructor
public class PostService {
 private final PostRepository postRepo;
 private final CategoryRepository catRepo;

 public List<PostResponse> getAll(){
  return postRepo.findAll().stream().map(this::map).collect(Collectors.toList());
 }

 public PostResponse create(PostRequest req){
  Category cat = catRepo.findById(req.getCategoryId())
   .orElseThrow(()->new ResourceNotFoundException("Category not found"));
  Post p=new Post();
  p.setTitle(req.getTitle());
  p.setContent(req.getContent());
  p.setAuthor(req.getAuthor());
  p.setCategory(cat);
  p.setCreatedAt(LocalDateTime.now());
  p.setUpdatedAt(LocalDateTime.now());
  return map(postRepo.save(p));
 }

 private PostResponse map(Post p){
  return PostResponse.builder()
   .id(p.getId())
   .title(p.getTitle())
   .content(p.getContent())
   .author(p.getAuthor())
   .categoryId(p.getCategory().getId())
   .categoryName(p.getCategory().getName())
   .createdAt(p.getCreatedAt())
   .updatedAt(p.getUpdatedAt())
   .build();
 }
}
