package Spring5.test;

import Spring5.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class TestBook {

    @Test
    public void test (){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

//        Book book = new Book();
//        book.setUserId("1");
//        book.setUserName("java");
//        book.setUstatus("a");
//        bookService.addBook(book);

//        Book book = new Book();
//        book.setUserId("1");
//        book.setUserName("javaee");
//        book.setUstatus("a");
//        bookService.delete("1");
        //查询返回某个值
//        int count = bookService.findCount();
//        System.out.println(count);
        //查询返回对象
//        Book one = bookService.findOne("1");
//        System.out.println(one);

//        List<Book> all = bookService.findAll();
//        System.out.println(all);

    }
}
