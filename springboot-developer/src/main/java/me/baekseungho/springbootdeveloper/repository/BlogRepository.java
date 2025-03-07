package me.baekseungho.springbootdeveloper.repository;

import me.baekseungho.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
