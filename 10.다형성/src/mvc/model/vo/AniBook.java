package mvc.model.vo;

public class AniBook extends Book{
	private int accessAge;
	
	public AniBook() {
		// TODO Auto-generated constructor stub
	}

	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		// TODO Auto-generated constructor stub
		this.accessAge = accessAge;
	}

	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" / "+accessAge;
	}
	
	
	

}
