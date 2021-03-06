package cl.nisumlatam.goblog.controller;

import cl.nisumlatam.goblog.domain.User;
import cl.nisumlatam.goblog.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    IUserService userService;

    //CRUD
    @GetMapping("/users")
    public ResponseEntity<List<User>> loadAlUsers() {
        List<User> users = userService.loadAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
