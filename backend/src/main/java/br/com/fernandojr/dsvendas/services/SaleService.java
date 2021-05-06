package br.com.fernandojr.dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fernandojr.dsvendas.dto.SaleDTO;
import br.com.fernandojr.dsvendas.dto.SaleSuccessDTO;
import br.com.fernandojr.dsvendas.dto.SaleSumDTO;
import br.com.fernandojr.dsvendas.entities.Sale;
import br.com.fernandojr.dsvendas.repositories.SaleRepository;
import br.com.fernandojr.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository saleRepository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result = saleRepository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return saleRepository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO>	successGroupedBySeller(){
		return saleRepository.successGroupedBySeller();
	}
	
}
