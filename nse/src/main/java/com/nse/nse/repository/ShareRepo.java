package com.nse.nse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nse.nse.entity.Share;

public interface ShareRepo extends JpaRepository<Share, Integer> {

}
