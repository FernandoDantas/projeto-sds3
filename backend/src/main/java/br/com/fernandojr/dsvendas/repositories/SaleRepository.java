package br.com.fernandojr.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fernandojr.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
