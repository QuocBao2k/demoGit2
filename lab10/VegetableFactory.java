class VegetableFactory{
	public Vegetable getVegetable(String type){
		switch(type){
			case "Carrot" :
			return new Carrot();
			case "Cabbage" :
			return new Cabbage();
			case "Pumpkin" :
			return new Pumpkin();
			default :
			return null;
		}
	}
}