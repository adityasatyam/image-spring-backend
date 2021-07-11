package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Image;

public interface ImageService {
	public List<Image> getImages();
	public Image getImage(Long imageId);
	public Image addImage(Image image);
}
