
package com.blogapi.controller;

import com.blogapi.service.PostService;
import com.blogapi.model.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {
 private final PostService service;

 @GetMapping
 public List<PostResponse> getAll(){
  return service.getAll();
 }

 @PostMapping
 public PostResponse create(@RequestBody PostRequest req){
  return service.create(req);
 }
}
