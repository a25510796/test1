package com.tedu.sp01.pojo;
/**
 * ��Ʒ��Ϣ
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //�޲ι��캯��
@AllArgsConstructor //�вι��캯��
public class Item {
	private Integer id; //��ƷID
	private String name; //��Ʒ����
	private Integer number; //��Ʒ���
}