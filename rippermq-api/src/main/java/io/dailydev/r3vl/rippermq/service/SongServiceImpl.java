package io.dailydev.r3vl.rippermq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.dailydev.r3vl.rippermq.model.Song;
import io.dailydev.r3vl.rippermq.util.RabbitMQUtil;

@Service
public class SongServiceImpl implements SongService {
	
	@Autowired
	RabbitMQUtil rabbitMQUtil;

	@Override
	public boolean addSong(Song song) throws Exception {
		rabbitMQUtil.sendVideoId(song.getVideoId());
		return false;
	}

}
