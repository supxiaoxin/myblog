package com.mys.controller;

import com.mys.queryvo.BlogQuery;
import com.mys.service.BlogService;
import com.mys.service.MemoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Description: 时间轴页面显示控制器
 * @Author: supxiaoxin
 */
@Controller
public class ArchiveShowController {

    @Autowired
    private MemoryService memoryService;

    @GetMapping("/archives")
    public String archive(Model model){
        model.addAttribute("memorys",  memoryService.listMemory());
        return "archives";
    }

}