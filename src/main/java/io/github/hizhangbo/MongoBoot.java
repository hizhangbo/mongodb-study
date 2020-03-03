package io.github.hizhangbo;

import io.github.hizhangbo.model.Book;
import io.github.hizhangbo.model.aggregate.BookAggregate;
import io.github.hizhangbo.repository.BookRepo;
import io.github.hizhangbo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Bob
 * @date 2020-03-03 10:50
 */
@ComponentScan("io.github.hizhangbo")
public class MongoBoot {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MongoBoot.class);

//        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//        for (String name : beanDefinitionNames) {
//            System.out.println(name);
//        }

        BookService bookService = applicationContext.getBean(BookService.class);

        // 单条件查询
//        List<Book> books = bookService.findByPublisher("四川人民出版社");
//        System.out.println(books);

        // 分组聚合
//        List<BookAggregate> bookAggregates = bookService.groupByPublisherAndClassify();
//        System.out.println(bookAggregates);

        // 总条数
//        long count = bookService.count();
//        System.out.println(count);

        // 分页
//        Page<Book> books = bookService.findByPage(0, 10);
//        books.get().forEach(System.out::println);


    }
}
