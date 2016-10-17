package com.tk.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.tk.pojo.Cost;
import com.tk.service.CostListService;

@Controller
@Scope("prototype")
public class FindCostListAction {
	
	private int page = 1;
	private int pageSize;
	
	private List<Cost> costs;
	private int totalPage;
	
	@Resource
	private CostListService costListService;
	
	public String execute(){
		totalPage = costListService.findTotalPage(pageSize);
		costs = costListService.findByPage(page, pageSize);
		return "success";
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<Cost> getCosts() {
		return costs;
	}

	public void setCosts(List<Cost> costs) {
		this.costs = costs;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	
	
}
