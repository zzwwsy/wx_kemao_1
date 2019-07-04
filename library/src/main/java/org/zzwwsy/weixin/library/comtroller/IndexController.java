package org.zzwwsy.weixin.library.comtroller;

import org.zzwwsy.weixin.library.domain.Book;
import org.zzwwsy.weixin.library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/kemao_1/library")
public class IndexController {

	@Autowired
	private LibraryService libraryService;
	
	@RequestMapping
	public String index(//
			// required表示必须的，如果为false则非必须的
			@RequestParam(name = "keyword", required = false) String keyword, //
			// 因为后面使用Spring Data操作数据库，它在分页的时候第一页从0开始。
			@RequestParam(name = "pageNumber", defaultValue = "0") int pageNumber, Model model//
	) {
		
		Page<Book> page = this.libraryService.search(keyword, pageNumber);
		model.addAttribute("page", page);
		
		return "/WEB-INF/views/library/index.jsp";
	}
}
	