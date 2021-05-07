package com.markerhub.controller;


import com.markerhub.common.lang.Result;
import com.markerhub.entity.Book;
import com.markerhub.entity.User;
import com.markerhub.service.BookService;
import com.markerhub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 关注公众号：MarkerHub
 * @since 2021-05-02
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/index")
    public Result index(){
        Book book = bookService.getById(1L);
        return Result.succ(200,"操作成功",book);
    }
}
