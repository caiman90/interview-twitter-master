package com.javalanguagezone.interviewtwitter.service.dto;

import com.javalanguagezone.interviewtwitter.domain.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@Getter
@NoArgsConstructor(access = PRIVATE)
public class UserDTO {
  private Long id;
  private String username;
  private String firstName;
  private String lastName;
  private String password;
  private String fullName;
  private int numOfTweets;
  private int numOfFollowers;
  private int numOfFollowing;
  private boolean following;

  public UserDTO(User user) {
    this.id = user.getId();
    this.username = user.getUsername();
    this.fullName = user.getFirstName() + " " + user.getLastName();
    this.numOfFollowers = user.getFollowers().size();
    this.numOfFollowing = user.getFollowing().size();
    this.numOfTweets = 0;
  }

  public void setNumOfTweets(int numOfTweets) {
    this.numOfTweets = numOfTweets;
  }
  public void setFollowing(boolean following) { this.following = following; }

}
