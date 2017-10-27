package io.dailydev.r3vl.rippermq.service;

import org.springframework.stereotype.Service;

import io.dailydev.r3vl.rippermq.model.Song;

@Service
public class SongServiceImpl implements SongService {

	@Override
	public boolean addSong(Song song) {
		// Code goes here that will interact with the MQ!
		return false;
	}

}
