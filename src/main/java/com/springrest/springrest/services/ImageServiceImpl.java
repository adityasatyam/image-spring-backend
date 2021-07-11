package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.ImageDao;
import com.springrest.springrest.entities.Image;

@Service
public class ImageServiceImpl implements ImageService {

	@Autowired
	private ImageDao imageDao;
	@Override
	public List<Image> getImages() {
		return imageDao.findAll()  ;
	}

	@Override
	public Image getImage(Long imageId) {
		return imageDao.findById(imageId).get();
	}

	@Override
	public Image addImage(Image image) {
		imageDao.save(image);
		return image;
	}

}
