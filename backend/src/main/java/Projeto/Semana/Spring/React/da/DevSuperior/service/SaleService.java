package Projeto.Semana.Spring.React.da.DevSuperior.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Projeto.Semana.Spring.React.da.DevSuperior.dto.SaleDTO;
import Projeto.Semana.Spring.React.da.DevSuperior.entities.Sale;
import Projeto.Semana.Spring.React.da.DevSuperior.repositories.SaleRepository;
import Projeto.Semana.Spring.React.da.DevSuperior.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;

	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}

}
