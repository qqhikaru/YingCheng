package com.yingcheng.www.entity;

import java.io.Serializable;
/**
 * 借助次对象封装分页信息
 * 1.当前页面
 * 2.记录数
 * 3.页数
 * @author soft01
 *
 */
public class PageObject implements Serializable{
	private static final long serialVersionUID = 1L;
	/**当前页*/
	private int pageCurrent=1;
	/**记录数*/
	private int rowCount;
	/**总页数*/
	private int pageCount;
	/**每页要显示的记录数*/
	private int pageSize;
	/**取下页数据的起始页数*/
	private int startIndex;
	/**当前页数据最后*/
	private int endIndex;
	
	public int getPageCurrent() {
		return pageCurrent;
	}
	public void setPageCurrent(int pageCurrent) {
		this.pageCurrent = pageCurrent;
	}
	public int getRowCount() {
		return rowCount;
	}
	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**根据当前页计算记录的开始位置*/
	public int getStartIndex(){
		return (pageCurrent-1)*pageSize+1;
	}
	/**返回值为总页数*/
	public int getPageCount(){
		if(rowCount%pageSize==0){
			return rowCount/pageSize;
		}else{
			return rowCount/pageSize+1;
		}
	}
	public int getEndIndex(){
		return getStartIndex()+pageSize-1;
	}
	public void setEndIndex(int endIndex){
		this.endIndex=endIndex;
	}
	
}
