package com.tedu.sp01.pojo;
/**
 * 用户信息
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private Integer id; //用户id
	private String username; //用户账户
	private String password; //用户密码
}
