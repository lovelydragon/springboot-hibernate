/**
 * 
 */
package com.spring.model;
import javax.persistence.*;
import java.util.Date;
/**Description: 实体类
 * 
 * @author luwenhuang
 * @date 2017年8月15日 下午5:31:04
 */
@Entity //加入这个注解，Demo就会进行持久化了
@Table(name="User")
public class User {

	@Id
	@GeneratedValue //主键，自动递 增
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="date")
	private Date date;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
