package com.nse.nse.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.nse.nse.entity.Portfolio;
import com.nse.nse.entity.Share;

@org.springframework.stereotype.Service
public interface Service {

	public Portfolio createPortfolio(Portfolio p);

	public List<Portfolio> showPortfolio();

	public boolean buyShare(Integer shareId, Integer portfolioId);

	public boolean sellShare(Integer shareId, Integer portfolioId);

	public List<Share> showShare();

	public Share createShare(Share s);

}