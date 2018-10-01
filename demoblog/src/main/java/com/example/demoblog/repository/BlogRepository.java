package com.example.demoblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;



import com.example.demoblog.model.BlogModel;

        import java.util.List;

        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.stereotype.Repository;

@Repository("blogRepository")
public interface BlogRepository extends JpaRepository<BlogModel, Integer> {
    BlogModel findById (int id);

    List<BlogModel> findAll();

    //BlogModel findByWord (String word);
}