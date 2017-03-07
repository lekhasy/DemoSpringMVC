package io.zamo.demoSpringMVC.domain.entities;

public class Album {

	private final String _albumName;
	private final String _id;
	private final String _imagePath;
	
	public String getAlbumName(){
		return _albumName;
	}
	
	public String getId(){
		return _id;
	}
	
	public String getImagePath(){
		return _imagePath;
	}
	
	
	public Album(String albumId, String albumName, String imagePath) {
		this._id = albumId;
		this._albumName = albumName;
		this._imagePath = imagePath;
	}
}
