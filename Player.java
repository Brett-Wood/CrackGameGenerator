
public class Player {
	private int handicap;
	private int[] scores = new int[18];
	private String name;
	public Player()
	{
		this.handicap = 0;
		for(int index: scores)
		{
			scores[index] = 0;
		}
	}
	public void setHandicap(int handicap)
	{
		this.handicap = handicap;
	}
	public void setScore(int holeNumber, int score)
	{
		this.scores[holeNumber] = score;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int totalStrokes()
	{
		int total = 0;
		for(int score: this.scores)
		{
			total+= score;
		}
		return total;
	}
	public String toString()
	{
		return this.name + ": ("+this.handicap+") Scorecard: " +this.scores[0]+" "+this.scores[1]+ " "+this.scores[2]+" "+this.scores[3]+ " "
				+this.scores[4]+" "+this.scores[5]+ " "+this.scores[6]+" "+this.scores[7]+ " "
						+this.scores[8]+" "+this.scores[9]+ " "+this.scores[10]+" "+this.scores[11]+ " "
						+this.scores[12]+" "+this.scores[13]+ " "+this.scores[14]+" "+this.scores[15]+ 
						" "+this.scores[16]+" "+this.scores[17]+" Total Strokes: "+totalStrokes();
	}
	
}
