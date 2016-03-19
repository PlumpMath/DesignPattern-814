package composite;

public class CompositeTest {
	public static void main(String[] args){
		StoreNode storeFirst1 = new StoreNode("First1");
		StoreNode storeSecond1 = new StoreNode("Second1");
		StoreNode storeSecond2 = new StoreNode("Second2");
		StoreNode storeThird1 = new StoreNode("Third1");
		StoreNode storeThird2 = new StoreNode("Third2");
		StoreNode storeThird3 = new StoreNode("Third3");
		Market market = new Market(storeFirst1);
		storeFirst1.childrenStore.add(storeSecond1);
		storeFirst1.childrenStore.add(storeSecond2);
		storeSecond1.childrenStore.add(storeThird1);
		storeSecond1.childrenStore.add(storeThird2);
		storeSecond2.childrenStore.add(storeThird3);
		market.mainStore.childrenStore.get(0).AddStar(1);
	}
}
