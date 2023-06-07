class ImageLoader{
	private ImageLoader instance = null;
	
	private ImageLoader(){
		
	}
	
	public static ImageLoader getInstance(){
		if(instance == null){
			instance = new ImageLoader();
		}
		return instance;
	}
	
	public String loadImage(){
		System.out.println("Loaded successfully");
	}
	
}