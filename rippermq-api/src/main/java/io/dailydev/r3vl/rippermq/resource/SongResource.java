package io.dailydev.r3vl.rippermq.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.dailydev.r3vl.rippermq.model.Song;
import io.dailydev.r3vl.rippermq.service.SongService;

@RestController
@RequestMapping("api/v1/song")
public class SongResource {
	
	@Autowired
	SongService songService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Song> addSong(@RequestBody Song song) {
		
		try {
			songService.addSong(song);
		} catch (Exception e) {
			System.out.println("Failed to add " + song.getVideoId() + " to queue!");
			e.printStackTrace();
		}
		return new ResponseEntity<Song>(song, HttpStatus.OK);
	}

}
