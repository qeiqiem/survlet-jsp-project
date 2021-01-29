package spms.vo;

public class Page {
	int curPage;
	int maxPage;
	int startNum;
	int endNum;
	String search;
	String filter;
	String option;
	String order="bno"; //default 설정
	
	public String getOrder() {
		return order;
	}
	public Page setOrder(String order) {
		this.order = order;
		return this;
	}
	public int getStartNum() {
		return startNum;
	}
	public Page setStartNum(int startNum) {
		this.startNum = startNum;
		return this;
	}
	public int getEndNum() {
		return endNum;
	}
	public Page setEndNum(int endNum) {
		this.endNum = endNum;
		return this;
	}
	public int getCurPage() {
		return curPage;
	}
	public Page setCurPage(int curPage) {
		this.curPage = curPage;
		return this;
	}
	public int getMaxPage() {
		return maxPage;
	}
	public Page setMaxPage(int maxPage) {
		this.maxPage = maxPage;
		return this;
	}
	public String getSearch() {
		return search;
	}
	public Page setSearch(String search) {
		this.search = search;
		return this;
	}
	public String getFilter() {
		return filter;
	}
	public Page setFilter(String filter) {
		this.filter = filter;
		return this;
	}
	public String getOption() {
		return option;
	}
	public Page setOption(String option) {
		this.option = option;
		return this;
	}
	
	
}
