package cn.zucc.affair.pojo;  
/** 
 * @author zhouzhenlong 
 * @date Sept 18, 201212:55:36 PM 
 * @description ��ҳ�� 
 * @version V1.0 
 */  
public class Page {  
    // �ڼ�ҳ  
    private int pageIndex;  
    // ÿҳ��С  
    private int pageSize;  
    // ����  
    private int rowTotal;  
    // �ܹ�����ҳ  
    private int pageTotal;  
  
    public Page(){
    	
    }
    public Page(int pageIndex, int pageSize, int rowTotal) {  
        this.pageIndex = pageIndex;  
        this.pageSize = pageSize;  
        this.rowTotal = rowTotal; 
        System.out.println(pageIndex+" "+pageSize+" "+rowTotal);
        if(rowTotal == 0)
        	 this.pageTotal = 1;
        else
            this.pageTotal = InitPageTotal();
    }  
  
    public int getRowTotal() {  
        return rowTotal;  
    }  
  
    public void setRowTotal(int rowTotal) {  
        this.rowTotal = rowTotal;  
    }  
  
    public int getPageIndex() {  
        return pageIndex;  
    }  
  
    public void setPageIndex(int pageIndex) {  
        this.pageIndex = pageIndex;  
    }  
  
    public int getPageSize() {  
        return pageSize;  
    }  
  
    public void setPageSize(int pageSize) {  
        this.pageSize = pageSize;  
    }  
    public int getPageTotal() {  
        return pageTotal;  
    }  
  
    public void setPageTotal(int pageTotal) {  
        this.pageTotal = pageTotal;  
    }  
    public int InitPageTotal(){
        int pageTotal = 0;  
        if (rowTotal % pageSize == 0) {  
            pageTotal = this.rowTotal / this.pageSize;  
  
        } else {  
            pageTotal = rowTotal / pageSize + 1;  
        }  
        return pageTotal;  
    }
}  