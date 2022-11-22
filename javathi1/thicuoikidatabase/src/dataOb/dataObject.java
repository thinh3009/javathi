/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataOb;

import java.util.ArrayList;

public interface dataObject<T> {
	public int them(T t);
	public int capNhat(T t);
	public int xoa(T t);
	public ArrayList<T> selectAll();
	public T selectByID(T t);
	public ArrayList<T> selectByCondition(String condition);
	
}
