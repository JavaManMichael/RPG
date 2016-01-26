public class LandOfDeath
	{
		static boolean isStillAlive = true;
		static Fighter currentFighter;
		public static void main (String[]args)
		{
			Enemies.fillEnemies();
			System.out.println("Hello Player.");
			System.out.println("You will be fighting a random enemy.");
			
			chooseEnemy();
			while(isStillAlive)
				{
			    battle();
				}
		}
		
		public static void chooseEnemy()
		{
			int dieRoll1;
			
			dieRoll1 = (int)(Math.random()*4);
			
			currentFighter = Enemies.enemies.get(dieRoll1);
			
				if (dieRoll1== 1)
					System.out.println(currentFighter.getName() + " was your chosen enemy.");
				
				else if (dieRoll1 == 2)
					System.out.println(currentFighter.getName() + " was your chosen enemy.");
				
				else if (dieRoll1 == 3)
					System.out.println(currentFighter.getName() + " was your chosen enemy.");
				
				else
					System.out.println(currentFighter.getName() + " was your chosen enemy.");
				
		}
		
		private static void battle()
		{
			System.out.println(currentFighter.getName() + " has " + currentFighter.getHitpoints() + " health points and " + currentFighter.getDefense() + " defense." );
			System.out.println( );
			System.out.println("It is your turn.");
			
			
			
			if(currentFighter.getDefense() < Player.player.getAttack())
				{	
					Enemies.enemies.get( currentFighter.getRank()-1 ).setHitpoints(currentFighter.getHitpoints() - Player.player.getAttack() );
				}
			
			else
				{
				Enemies.enemies.get( currentFighter.getRank()-1 ).setHitpoints(currentFighter.getHitpoints()-1);
				Enemies.enemies.get( currentFighter.getRank()-1 ).setDefense(currentFighter.getDefense()-1);
				}
			
			System.out.println(currentFighter.getName() + " now has " + currentFighter.getHitpoints() + " HP and " + currentFighter.getDefense() + " defense.");
			System.out.println( );
			System.out.println("It is now " + currentFighter.getName() + "'s turn. ");
			System.out.println("You have " + Player.player.getHitpoints() + " HP and " + Player.player.getDefense() + " defense.");
			
			
			if(Player.player.getDefense() < currentFighter.getAttack())
				{	
					Player.player.setHitpoints(Player.player.getHitpoints() - currentFighter.getAttack());
				}
		
			else
				{
				Player.player.setHitpoints(Player.player.getHitpoints()-1);
				Player.player.setDefense(Player.player.getDefense()-1);
				}
			System.out.println("You now have " + Player.player.getHitpoints() + " HP and " + Player.player.getDefense() + " defense.");
			
			if(isStillAlive = Player.player.getHitpoints() <= 0 )
				{
					System.out.println(currentFighter.getName() +" won the game!");
					isStillAlive = false;
				}
			else if(currentFighter.getHitpoints() <= 0 )
				{
					System.out.println("You won the game!");
					isStillAlive = false;
				}
			else
				{
					isStillAlive = true;
				}
		}
	}