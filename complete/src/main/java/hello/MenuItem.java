package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class MenuItem {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String menuname;
	private Boolean available;
	private Double comboprice;
	private Double eachprice;
	private String image;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMenuname() {
		return menuname;
	}
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	public Double getComboprice() {
		return comboprice;
	}
	public void setComboprice(Double comboprice) {
		this.comboprice = comboprice;
	}
	public Double getEachprice() {
		return eachprice;
	}
	public void setEachprice(Double eachprice) {
		this.eachprice = eachprice;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
}
