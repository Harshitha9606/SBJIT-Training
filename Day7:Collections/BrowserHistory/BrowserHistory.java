package Day7Excercise;

import java.util.LinkedList;

public class BrowserHistory {
	
	private String url;
	

	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}
	
	public BrowserHistory(String url) {
		super();
		this.url = url;
	}

	@Override
	public String toString() {
		return "BrowserHistory [url=" + url + "]";
	}


	public static void main(String[] args) {
		
		LinkedList<BrowserHistory> browseHistory=new LinkedList<BrowserHistory>();
		
		BrowserHistory browsed1=new BrowserHistory("google.com");
		BrowserHistory browsed2=new BrowserHistory("youtube.com");
		BrowserHistory browsed3=new BrowserHistory("w3schools.com");
		BrowserHistory browsed4=new BrowserHistory("spotify.com");
		BrowserHistory browsed5=new BrowserHistory("mp3Converter.com");
		
		browseHistory.add(browsed1);
		browseHistory.add(browsed2);
		browseHistory.add(browsed3);
		browseHistory.add(browsed4);
		browseHistory.add(browsed5);
		
		//removing last visited page!!1
		
		BrowserHistory removed=browseHistory.removeLast();
		
		System.out.println("Removing the last visited page:  "+removed);
		
		System.out.println("After removal of last visited page,The remained Browser History:");
		
		for(BrowserHistory browse:browseHistory)
		{
			System.out.println(browse);
		}
		
	}


	

}
