package io.zamo.demoSpringMVC.beans;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.zamo.demoSpringMVC.domain.beans.IAlbumRepo;
import io.zamo.demoSpringMVC.domain.entities.Album;

@Repository
public class AlbumRepo implements IAlbumRepo {

	@Override
	public List<Album> getAllAlbums() {
		// TODO Auto-generated method stub
		return null;
	}
}