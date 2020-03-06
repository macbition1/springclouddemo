package com.chunbiao.controller;

import com.chunbiao.entity.Menu;
import com.chunbiao.entity.Order;
import com.chunbiao.entity.OrderVO;
import com.chunbiao.entity.User;
import com.chunbiao.feign.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/order")
public class OrderHandler {

    @Autowired
    private OrderFeign orderFeign;

    @GetMapping("/save/{mid}")
    public String save(@PathVariable("mid") long mid, HttpSession session){
        User user = (User) session.getAttribute("user");
        Order order = new Order();
        Menu menu = new Menu();
        menu.setId(mid);
        order.setMenu(menu);
//        order.setState(0);
        orderFeign.save(order);
        return "order";
    }
    @GetMapping("/findAllByUid")
    @ResponseBody
    public OrderVO findAllByUid(@RequestParam("page") int page,@RequestParam("limit") int limit, HttpSession session){
        User user = (User) session.getAttribute("user");
        int index = (page -1) *limit;
        return orderFeign.findAllByUid(index,limit,user.getId());
    }

    @GetMapping("/findAll")
    @ResponseBody
    public OrderVO findAll(@RequestParam("page") int page,@RequestParam("limit") int limit, HttpSession session){
        int index = (page -1) * limit;
        return orderFeign.findAll(index,limit);
    }

    @GetMapping("/updateState/{id}")
    public String updateState(@RequestParam("id") long id){
        orderFeign.updateState(id);
        return  "redirect:/menu/redirect/order_handler";


    }
}
