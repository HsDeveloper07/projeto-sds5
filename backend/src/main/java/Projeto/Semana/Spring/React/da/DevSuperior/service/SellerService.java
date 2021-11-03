package Projeto.Semana.Spring.React.da.DevSuperior.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Projeto.Semana.Spring.React.da.DevSuperior.dto.SellerDTO;
import Projeto.Semana.Spring.React.da.DevSuperior.entities.Seller;
import Projeto.Semana.Spring.React.da.DevSuperior.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;

	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}

}
