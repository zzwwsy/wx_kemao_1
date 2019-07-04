package org.zzwwsy.weixin.library.service;

import org.zzwwsy.weixin.library.domain.Book;
import org.zzwwsy.weixin.library.domain.DebitList;
import org.springframework.data.domain.Page;

public interface LibraryService {

	Page<Book> search(String keyword, int pageNumber);

	void add(String id, DebitList list);

	void remove(String id, DebitList list);

}
