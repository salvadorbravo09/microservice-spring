package com.debuggeandoideas.companies_crud.repositories;

import com.debuggeandoideas.companies_crud.entities.WebSite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebSiteRepository extends JpaRepository<WebSite, Long> {
}
