package ua.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.training.model.User;


import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {


    List<User> users = new ArrayList<>();

//    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    public ResponseEntity<List<User>> findAll() {
//        users.add(new User(1, "oleg"));
//        if (users.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
//    }
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView findAll(Model model) {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("aop", "modeland view");
      model.addAttribute("getList", "ojbect");
        return modelAndView;
    }

    @RequestMapping( method = RequestMethod.POST)
    public ModelAndView addUser(@RequestParam(value="param", required=false) String param2 ){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("param1", param2);
        return modelAndView;
    }

    @RequestMapping(value = "addUser", method = RequestMethod.POST)
    public String submit(@ModelAttribute("user")User user) {

        return "users";
    }




//    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    public ResponseEntity<User> addUser(@RequestBody @Validated User user) {
//        HttpHeaders headers = new HttpHeaders();
//        users.add(user);
//        return new ResponseEntity<>(user, headers, HttpStatus.CREATED);
//    }
//
//    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    public ResponseEntity<User> deleteUser(@PathVariable("id") Long id) {
//        users.remove(id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }


}
