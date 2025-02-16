package io.ssafy.gatee.domain.file.dao;

import io.ssafy.gatee.domain.file.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FileRepository extends JpaRepository<File, Long> {

    File findByUrl(String url);

    boolean existsByUrl(String url);
}
