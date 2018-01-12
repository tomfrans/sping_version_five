package com.tomfrans.spring.spring5.bootstrap;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.tomfrans.spring.spring5.model.Club;
import com.tomfrans.spring.spring5.model.Manager;
import com.tomfrans.spring.spring5.model.Player;
import com.tomfrans.spring.spring5.repositories.ClubRepository;
import com.tomfrans.spring.spring5.repositories.ManagerRepository;
import com.tomfrans.spring.spring5.repositories.PlayerRepository;

@Component
public class InitialBootstrap implements ApplicationListener<ContextRefreshedEvent> {
	
	private ClubRepository clubRepository;
	private PlayerRepository playerRepository;
	private ManagerRepository managerRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		initializeData();		
	}
	
 	public InitialBootstrap(ClubRepository clubRepository, PlayerRepository playerRepository,
			ManagerRepository managerRepository) {
		this.clubRepository = clubRepository;
		this.playerRepository = playerRepository;
		this.managerRepository = managerRepository;
	}




	private void initializeData(){
		
		Player play1 = new Player("Paul","Pogba", "Midfielder");
		Player play2 = new Player("David","DeGea", "GoalKeeper");
		Player play3= new Player("Eric","Bailey", "Defender");
		Player play4 = new Player("Marcus","Rashford", "Striker");
	
		playerRepository.save(play1);
		playerRepository.save(play2);
		playerRepository.save(play3);
		playerRepository.save(play4);
		
		Club manu = new Club("Manchester United","Old Trafford");
		
	    manu.getPlayers().add(play1);
		manu.getPlayers().add(play2);
		manu.getPlayers().add(play3);
		manu.getPlayers().add(play4);

		Manager manager1 = new Manager("Jose", "Mouricho");
		manu.setManager(manager1);
		managerRepository.save(manager1);
        clubRepository.save(manu);
				
		Player play5 = new Player("Adam","Lallana", "Midfielder");
		Player play6 = new Player("Simon","Mignolet", "GoalKeeper");
		Player play7 = new Player("Joel","Matip", "Defender");
		Player play8 = new Player("Mohammed","Salah", "Striker");
		
		playerRepository.save(play5);
		playerRepository.save(play6);
		playerRepository.save(play7);
		playerRepository.save(play8);
		
		Club liverpool = new Club("Liverpool F.C","Anfield");
		liverpool.getPlayers().add(play5);
		liverpool.getPlayers().add(play6);
		liverpool.getPlayers().add(play7);
		liverpool.getPlayers().add(play8);

		Manager manager2 = new Manager("Jurgen", "Klop");
		liverpool.setManager(manager2);
		managerRepository.save(manager2);
        clubRepository.save(liverpool);
		
		
		
		
		Player play9 = new Player("Eden","Hazard", "Midfielder");
		Player play10 = new Player("Thibaut","Courtois", "GoalKeeper");
		Player play11 = new Player("Daivd","Luiz", "Defender");
		Player play12 = new Player("Alvaro","Morata", "Striker");
		
		playerRepository.save(play9);
		playerRepository.save(play10);
		playerRepository.save(play11);
		playerRepository.save(play12);
		
		Club chelsea = new Club("Chelsea","Stamfordbrige");
		chelsea.getPlayers().add(play9);
		chelsea.getPlayers().add(play10);
		chelsea.getPlayers().add(play11);
		chelsea.getPlayers().add(play12);

		Manager manager3 = new Manager("Antonio", "Conte");
		chelsea.setManager(manager3);
		managerRepository.save(manager3);
		clubRepository.save(chelsea);
	
		
		
		Player play13 = new Player("Mezut","Ozil", "Midfielder");
		Player play14 = new Player("Peter","Cech", "GoalKeeper");
		Player play15 = new Player("Hector","Bellarin", "Defender");
		Player play16 = new Player("Alexandre","Lacazette", "Striker");	
		playerRepository.save(play13);
		playerRepository.save(play14);
		playerRepository.save(play15);
		playerRepository.save(play16);
		
		Club arsenel = new Club("Arsenel","Emirates Stadium");
		arsenel.getPlayers().add(play13);
		arsenel.getPlayers().add(play14);
		arsenel.getPlayers().add(play15);
		arsenel.getPlayers().add(play16);
		
		Manager manager4 = new Manager("Arsene", "Wenger");
		arsenel.setManager(manager4);
		managerRepository.save(manager4);
		clubRepository.save(arsenel);

	}
}
