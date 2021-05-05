package br.com.fernandojr.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fernandojr.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
