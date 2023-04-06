package jp.co.internous.ecsite.model.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="purchase")
public class Purchase {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="user_id")
	private long user_id;
	
	@Column(name="goods_id")
	private long goods_id;
	
	@Column(name="goods_name")
	private String goods_name;
	
	@Column(name="item_count")
	private long item_count;
	
	@Column(name="total")
	private long total;
	
	@Column(name="created_at")
	private Timestamp created_at;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getUserId() {
		return user_id;
	}
	
	public void setUserId(long user_id) {
		this.user_id = user_id;
	}
	public long getGoodsId() {
		return goods_id;
	}
	
	public void setGoodsId(long goods_id) {
		this.goods_id = goods_id;
	}
	
	public String getGoodsName() {
		return goods_name;
	}
	
	public void setGoodsName(String goods_name) {
		this.goods_name = goods_name;
	}
	
	public long getItemCount() {
		return item_count;
	}
	
	public void setItemCount(long item_count) {
		this.item_count = item_count;
	}
	public long getTotal() {
		return total;
	}
	
	public void setTotal(long total){
		this.total = total;
	}
	
	public Timestamp getCreatedAt() {
		return created_at ;
	}
	
	public void setCreatedAt(Timestamp created_at) {
		this.created_at = created_at;
	}

}
