package test240729.object1;

public class Music {
	
	private String title;
	private String singer;
	
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	public Music() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	
	
	public int hashCode() {
		return 0;
	}
	
	public boolean equals(Object obj) {
		return true;
	}
	
	public int compareTo() {
		return 0;
	}

}
