import java.util.*;

public class Thanos {

    public static void main(String[] args) {
    	ArrayList<Hero> heroes = new ArrayList<> ();
    	Hero hero1 = new Hero("Black Widow",34);
    	Hero hero2 = new Hero("Captain America",100);
    	Hero hero3 = new Hero("Vision",3);
    	Hero hero4 = new Hero("Iron Man",48);
    	Hero hero5 = new Hero("Scarlet Witch",29);
    	Hero hero6= new Hero("Thor",1500);
    	Hero hero7 = new Hero("Hulk",49);
    	Hero hero8 = new Hero("Doctor Strange",42);

    	
    	
    	/*for(int i=0; i < heroes.size();++i) {
    		Hero hero = heroes.get(i);
    		
    	}*/
    	
    	heroes.add(hero1);       
    	heroes.add(hero2);        
    	heroes.add(hero3); 
    	heroes.add(hero4);
    	heroes.add(hero5);     
    	heroes.add(hero6);       
    	heroes.add(hero7);
    	heroes.add(hero8);
    	
    	
    	heroes.get(5);
    	hero6.setAge(1501);	
    	
   //Collections.shuffle(heroes);
   
   List<Hero> halflist=heroes.subList(0,4);
    	
   for(Hero hero: halflist) {
	   Collections.shuffle(halflist);
	  
		 System.out.println(hero.getName());
		
	}
    	
    }
}
