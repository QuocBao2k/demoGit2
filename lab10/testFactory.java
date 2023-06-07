class testFactory{
	public static void main(String[] args){
		VegetableFactory factory= new VegetableFactory();
		factory.getVegetable("Carrot");
		System.out.println(factory.getVegetable("Carrot").getInfo());
		
	}
}