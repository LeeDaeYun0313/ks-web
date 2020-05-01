package com.daeyun.app.repository;

import com.daeyun.app.entity.Work;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkRepository extends JpaRepository<Work, String> {
}
