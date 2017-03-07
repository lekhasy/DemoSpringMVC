package io.zamo.demoSpringMVC.domain.beans;

import java.util.List;
import io.zamo.demoSpringMVC.domain.entities.Album;

public interface IAlbumRepo {
	List<Album> getAllAlbums();
}