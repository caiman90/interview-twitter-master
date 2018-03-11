package com.javalanguagezone.interviewtwitter.controller;

import com.javalanguagezone.interviewtwitter.service.UserService;
import com.javalanguagezone.interviewtwitter.service.dto.TweetDTO;
import com.javalanguagezone.interviewtwitter.service.dto.UserDTO;

import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Collection;
import static org.springframework.http.HttpStatus.CREATED;

@RestController
public class UserController {

  private UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/followers")
  public Collection<UserDTO> followers(Principal principal) {
    return userService.getUsersFollowers(principal);
  }

  @GetMapping("/following")
  public Collection<UserDTO> following(Principal principal) {
    return userService.getUsersFollowing(principal);
  }

  @PostMapping("/auth/register")
  @ResponseStatus(CREATED)
  public UserDTO register(@RequestBody UserDTO userDto) {
    return userService.createUser(userDto);
  }
}
