package net.ebook.service.impl;

import net.ebook.dao.BookStatisticDao;
import net.ebook.service.BookStatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author ROKG
 * @Description
 * @Date: Created in 上午12:15 2018/1/27
 * @Modified By:
 */
@Service
public class BookStatisticServiceImpl implements BookStatisticService {

    @Autowired
    BookStatisticDao statisticDao;
}