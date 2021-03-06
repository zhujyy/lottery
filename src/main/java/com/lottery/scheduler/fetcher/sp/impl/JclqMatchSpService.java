package com.lottery.scheduler.fetcher.sp.impl;

import org.springframework.stereotype.Service;

import com.lottery.scheduler.fetcher.sp.domain.MatchSpDomain;

@Service
public class JclqMatchSpService extends AbstractMatchSpService {

	protected static String TABLE_NAME="jclqsp_";
	
	@Override
	public MatchSpDomain get(String matchNum) {
		return matchSpDao.get(matchNum, TABLE_NAME);
	}

	@Override
	public MatchSpDomain merge(MatchSpDomain spDomain) {
		return matchSpDao.merge(TABLE_NAME, spDomain);
	}

}
