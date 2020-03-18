package com.example.demo.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BanxicoCode;
import com.example.demo.model.Book;
import com.example.demo.model.Car;
import com.example.demo.model.ErrorMessage;
import com.example.demo.model.GoodMessage;
import com.example.demo.model.Magazine;
import com.example.demo.repo.BanxicoCodeRepository;
import com.example.demo.repo.BookRepository;
import com.example.demo.repo.CarRepository;
import com.example.demo.repo.ErrorMessageRepository;
import com.example.demo.repo.GoodMessageRepository;
import com.example.demo.repo.MagazineRepository;

@Service
public class ErrorMessageServiceImpl implements ErrorMessageService{

	@Autowired
	CarRepository carRepo;
	
	@Autowired
	ErrorMessageRepository repo;
	
	@Autowired
	BookRepository bookRepo;
	
	@Autowired
	MagazineRepository magRepo;
	
	@Autowired
	BanxicoCodeRepository banxicoCodeRepo;
	
	@Autowired
	GoodMessageRepository goodMessageRepo;
	
	public boolean insertErrorMessage(int banxicoCode, String banxicoDecription) {
		
		sayChees();
		
		BanxicoCode banxicoCode2;
		
		boolean result = true;
		ErrorMessage resultMessage=repo.saveAndFlush(new ErrorMessage(2, 1, "wobaloba db dub"));
		bookRepo.saveAndFlush(new Book(1, "Moby"));
		magRepo.saveAndFlush(new Magazine("bobadas"));
		Optional<BanxicoCode> banxicoCodeR = banxicoCodeRepo.findById(new Long(1));
		banxicoCodeR.ifPresent(message0 -> {
		    System.out.println(">>>>got code = " + message0.getBanxicoDescription());    
		});
		
		Optional<GoodMessage> gm = goodMessageRepo.findById(new Long(1)); 
		gm.ifPresent(message -> {
		    System.out.println("User's name = " + message.getContent()); 
		    System.out.println("and banxicocode: "+message.getBanxicoCode().getBanxicoDescription());
		});
		System.out.println("----------------M2------------------");
		Optional<GoodMessage> gm2 = goodMessageRepo.findById(new Long(2));
		gm2.ifPresent(message2 -> {
		    System.out.println("User's name = " + message2.getContent()); 
		    System.out.println("and banxicocode: "+message2.getBanxicoCode().getBanxicoDescription());
		});
		
		Optional<ErrorMessage> errorMessageResult = repo.findById(new Long(1));
		errorMessageResult.ifPresent(message -> {
		    System.out.println("User's name = " + message.getBanxicoDescription());    
		});
		if(resultMessage == null) {
			result = false;
		}
		
		System.out.println("traversing rom the other side:");
		System.out.println("Getting the banxicoCode");
		Optional<BanxicoCode> banxicoCode2Opt = banxicoCodeRepo.findById(new Long(1));
		
		BanxicoCode banxicoCode22 = banxicoCode2Opt.orElse(null);
		System.out.println("banxicoCode22: "+banxicoCode22.getBanxicoCodeId() + " - "+banxicoCode22.getBanxicoDescription());
		List<GoodMessage> messages2 = banxicoCode22.getGoodMesssages();
		System.out.println("resulting messages: ");
		Iterator<GoodMessage> iter22 = messages2.iterator();
		while(iter22.hasNext()){
			GoodMessage tempGoodMessage = iter22.next();
			System.out.println("   > "+tempGoodMessage.getGoodMessageId()+ " - "+tempGoodMessage.getContent());
		}
		
		carRepo.save(new Car("TEMERARY", "sports"));
		
		repo.flush();
		return result;		
	}
	
}
