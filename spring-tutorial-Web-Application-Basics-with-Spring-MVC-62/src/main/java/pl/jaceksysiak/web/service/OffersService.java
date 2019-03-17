package pl.jaceksysiak.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.jaceksysiak.web.dao.Offer;
import pl.jaceksysiak.web.dao.OffersDAO;

@Service("offersService")
public class OffersService {
	
	private OffersDAO offersDao;
 
	
	@Autowired
	public void setOffersDao(OffersDAO offersDao) {
		this.offersDao = offersDao;
	}
 

	public List<Offer> getCurrent(){
		
		return offersDao.getOffers();
	}

}





































