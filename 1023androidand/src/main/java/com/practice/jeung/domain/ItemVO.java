package com.practice.jeung.domain;

public class ItemVO {
	//int를 String으로 설정하는 부분에 대해서 고민
	//데이터에 null이 포함되어 있다면 int는 Exception이 발생
	//==> 나는, itemid는 primary key 이니까 int 로 하고 price는 not null 이 아니므로 string으로 받겠다.
	//==> 현장에서는 디비 구조를 알기 어렵기 때문에 더 고민해야 함.
	private int itemid;
	private String itemname;
	private String price;
	private String	description;
	private String pictureurl;
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPictureurl() {
		return pictureurl;
	}
	public void setPictureurl(String pictureurl) {
		this.pictureurl = pictureurl;
	}
	@Override
	public String toString() {
		return "ItemVO [itemid=" + itemid + ", itemname=" + itemname + ", price=" + price + ", description="
				+ description + ", pictureurl=" + pictureurl + "]";
	}
}
