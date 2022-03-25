
public class main {

	public static void main(String[] args) {
		VideoItem [] videoItens = new VideoItem[4];
		
		videoItens[0] = new VideoItem("Paula");
		videoItens[1] = new VideoItem("Iramar");
		videoItens[2] = new VideoItem("Aislania");
		videoItens[3] = new VideoItem("Alan");
		
		Iterator videoIterator = new VideoIterator(videoItens);
		
		while (videoIterator.hasNext()) {
            VideoItem menuItem = (VideoItem)videoIterator.next();
            System.out.println(menuItem.nome);
        }

			
	}

}
