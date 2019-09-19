package com.tedu.sp01.pojo;
/**
 * 商品信息
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //无参构造函数
@AllArgsConstructor //有参构造函数
public class Item {
	private Integer id; //商品ID
	private String name; //商品名称
	private Integer number; //商品库存
}