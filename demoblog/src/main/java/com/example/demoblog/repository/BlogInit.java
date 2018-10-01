package com.example.demoblog.repository;



        import java.text.DateFormat;
        import java.text.SimpleDateFormat;
        import java.util.Date;

        import com.example.demoblog.repository.BlogRepository;
        import com.example.demoblog.model.BlogModel;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.ApplicationArguments;
        import org.springframework.boot.ApplicationRunner;
        import org.springframework.stereotype.Component;

@Component
public class BlogInit implements ApplicationRunner {

    private BlogRepository blogRepository;

    @Autowired
    public BlogInit(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        long count = blogRepository.count();


            BlogModel b1 = new BlogModel();

            b1.setText(">>>>>>>>xxxxxxxxxxxxxx>>>>>>>>>>>>");

            BlogModel b2 = new BlogModel();

        b2.setText("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>");



        blogRepository.save(b1);
        blogRepository.save(b2);


    }

}