package Projeto.Semana.Spring.React.da.DevSuperior.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Projeto.Semana.Spring.React.da.DevSuperior.dto.SaleSucessDTO;
import Projeto.Semana.Spring.React.da.DevSuperior.dto.SaleSumDTO;
import Projeto.Semana.Spring.React.da.DevSuperior.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new Projeto.Semana.Spring.React.da.DevSuperior.dto.SaleSumDTO(obj.seller, SUM(obj.amount )) "
			+ " FROM Sale AS obj GROUP BY obj.seller ")
	List<SaleSumDTO> amountGroupedBySeller();

	@Query("SELECT new Projeto.Semana.Spring.React.da.DevSuperior.dto.SaleSucessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM Sale AS obj GROUP BY obj.seller ")
	List<SaleSucessDTO> sucessGroupedBySeller();	
}
