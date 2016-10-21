package at.fhj.itm.swq.debug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book
{
	public Book(int id, String title, String... authors)
	{
		setId(id);
		setTitle(title);
		setAuthors(Arrays.asList(authors));
	}
	

	private int id;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authors == null) ? 0 : authors.hashCode());
		result = prime * result + id;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (authors == null) {
			if (other.authors != null)
				return false;
		} else if (!authors.equals(other.authors))
			return false;
		if (id != other.id)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}


	private String title;
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	
	private List<String> authors = new ArrayList<String>();
	public List<String> getAuthors()
	{
		return authors;
	}
	public void setAuthors(List<String> authors)
	{
		this.authors = authors;
	}
	
	public String toSting()
	{
		return getId() + "," + getTitle() + "," + getAuthors();
	}
}
