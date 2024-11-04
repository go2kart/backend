package in.go2kart.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Params {
  // example query parameter
  @RequestMapping("/params")
  public String addParams(
      @RequestParam("token") int token,
      @RequestParam(value = "userId", required = false, defaultValue = "11") int uId,
      @RequestParam int id) {
    System.out.println("token:" + token);
    System.out.println("id:" + id);
    System.out.println("user-id:" + uId);

    return "user added succssfully";
  }

  // example path variable
  @RequestMapping("/path-variable/{postId}/uid/{userId}")
  public String addPathVar(
      @PathVariable("userId") int uId,
      @PathVariable int postId) {
    System.out.println("userId:" + uId);
    System.out.println("postId:" + postId);

    return "user added successfully";
  }
}
