package composite;

import java.util.List;

public class StoreNode {
	String name;
	StoreNode parentStore;
	List<StoreNode> childrenStore;
	int starScore = 0;
	public StoreNode(String name){
		this.name = name;
	}
	void AddStar(int score){
		starScore += score;
		for(StoreNode store : childrenStore){
			store.starScore += score;
			store.AddStar(score);
		}
	}
}
