package com.nse.nse.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nse.nse.entity.Portfolio;
import com.nse.nse.entity.Share;
import com.nse.nse.service.Service;

@RestController
public class PortfolioController {
	
	@Autowired
private Service service;

	
	@PostMapping("/createPortfolio")
	public ResponseEntity<Portfolio> createPortfolio(@RequestBody Portfolio p) {
		return new ResponseEntity<>(service.createPortfolio(p),HttpStatus.OK);
		
		
	}
	@PostMapping("/buyShare/{shareId}/{portfolioId}")
		public boolean buyShare(@PathVariable Integer shareId,@PathVariable Integer portfolioId ) {
			return service.buyShare(shareId,portfolioId);
			
		}
		
	@PostMapping("/sellShare/{shareId}/{portfolioId}")
	public boolean sellShare(@PathVariable Integer shareId,@PathVariable Integer portfolioId ) {
		return service.sellShare(shareId,portfolioId);
		
	}
		@PostMapping("/showPortfolio")
		public ResponseEntity<List<Portfolio>> showPortfolio() {
			return new ResponseEntity<>(service.showPortfolio(),HttpStatus.OK);
			
			
		}
		@RequestMapping("/createShare")
		public ResponseEntity<Share> createShare(@RequestBody Share s) {
			return new ResponseEntity<>(service.createShare(s), HttpStatus.OK);
		}
		
		
}
 