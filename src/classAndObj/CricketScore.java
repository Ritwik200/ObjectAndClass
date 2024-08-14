package classAndObj;

class CricketStat {
	int totalscore=0;
	public CricketStat(int score) {
		totalscore = score;
	}
	void six() {
		totalscore = totalscore + 6;
	}
	void four() {
		totalscore = totalscore + 4;
	}
	void singlerun() {
		totalscore = totalscore + 1;
	}
	void showscore() {
		System.out.println("total score is :"+totalscore);
	}
}

public class CricketScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CricketStat obj = new CricketStat(50);
		obj.six();
		obj.showscore();
		obj.four();
		obj.showscore();
		
	}

}
