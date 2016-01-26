public class Fighter
	{
		int attack;
		int defense;
		int hitpoints;
		String name;
		int rank;
		
		public Fighter(int atk, int def, int hp, String n, int r)
		{
			attack = atk;
			defense = def;
			hitpoints = hp;
			name = n;
			rank = r;
			
		}

		public int getRank() {
			return rank;
		}

		public void setRank(int rank) {
			this.rank = rank;
		}

		public int getAttack()
			{
				return attack;
			}

		public void setAttack(int attack)
			{
				this.attack = attack;
			}

		public int getDefense()
			{
				return defense;
			}

		public void setDefense(int defense)
			{
				this.defense = defense;
			}

		public int getHitpoints()
			{
				return hitpoints;
			}

		public void setHitpoints(int hitpoints)
			{
				this.hitpoints = hitpoints;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}
}