package com.mytechexp.predefinefn.predefinedfunctions;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.function.Predicate;

import com.mytechexp.predefinefn.modal.Player;

public class PredicatesEx {
    private ArrayList<Player> ConstructPlayers() {
		ArrayList<Player> pList=new ArrayList<>();
		pList.add(new Player(45,"Ronaldo","FootBall",BigInteger.valueOf(10000000),"Brazil"));
	    pList.add(new Player(39,"Sachin","Cricket",BigInteger.valueOf(1000000),"India"));

		return pList;
	}
    public ArrayList<Player> andfileter(){
        Predicate<Player> nameFilter=p->p.getName().startsWith("S");
        Predicate<Player> ageFilter=p->p.getAge()>35;
        Predicate<Player> gameFilter=p->p.getGame().startsWith("C");
    
        Predicate<Player>gameFilter2=p->p.getGame().startsWith("F");
        
        ArrayList<Player> playerList=ConstructPlayers();
        ArrayList<Player>filterList=new ArrayList<>();
        for(Player player:playerList)
           {
               if(nameFilter.and(ageFilter.and(gameFilter)).test(player))
               filterList.add(player);
    
    
               
           }
        return filterList;
    
        }
    
        public ArrayList<Player> orfileter(){
            Predicate<Player> nameFilter=p->p.getName().startsWith("S");
            Predicate<Player> ageFilter=p->p.getAge()>35;
            Predicate<Player> gameFilter=p->p.getGame().startsWith("C");
        
            Predicate<Player>gameFilter2=p->p.getGame().startsWith("F");
            
            ArrayList<Player> playerList=ConstructPlayers();
            ArrayList<Player>filterList=new ArrayList<>();
            for(Player player:playerList)
               {
                   if(nameFilter.or(ageFilter.or(gameFilter)).test(player))
                   filterList.add(player);
                       
               }
            return filterList;
        
            }
    
    public ArrayList<Player> negatefilter()
    {
        ArrayList<Player> playerList=ConstructPlayers();
        ArrayList<Player>filterList=new ArrayList<>();
        Predicate<Player> ageFilter=p->p.getAge()>50;
    
        for(Player player:playerList)
               {
                   if(ageFilter.negate().test(player))
                   filterList.add(player);
                       
               }
        return filterList;
    }
}
