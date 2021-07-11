package com.springrest.springrest.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Image;

public interface ImageDao extends JpaRepository<Image,Long> {

}
