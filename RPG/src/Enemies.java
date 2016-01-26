import java.util.ArrayList;

public class Enemies
	{
		static ArrayList <Fighter> enemies = new ArrayList<Fighter>();
		
		public static void fillEnemies()
			{
				enemies.add(new Fighter (5,5,20,"Alzak",1));
				enemies.add(new Fighter (5,5,20,"Zabeu",2));
				enemies.add(new Fighter (5,10,20,"Lord Ice",3));
				enemies.add(new Fighter (5,10,20,"The Fire Lord",4));
			}
	}