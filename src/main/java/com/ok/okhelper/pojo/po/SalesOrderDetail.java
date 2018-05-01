package com.ok.okhelper.pojo.po;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "sales_order_detail")
public class SalesOrderDetail {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Long id;

    /**
     * 销售Id 
     */
    @Column(name = "sales_order_id")
    private Long salesOrderId;

    /**
     * 商品Id 
     */
    @Column(name = "product_id")
    private Long productId;

    /**
     * 商品名
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 商品标题
     */
    @Column(name = "product_title")
    private String productTitle;

    /**
     * 商品主图
     */
    @Column(name = "main_img")
    private String mainImg;

    /**
     * 商品数量(最小单位)
     */
    @Column(name = "sales_count")
    private Integer salesCount;

    /**
     * 商品单价 (销售时单价&最小单位)
     */
    @Column(name = "sales_price")
    private BigDecimal salesPrice;

    /**
     * 备注
     */
    private String remarks;

    public SalesOrderDetail(Long id, Long salesOrderId, Long productId, String productName, String productTitle, String mainImg, Integer salesCount, BigDecimal salesPrice, String remarks) {
        this.id = id;
        this.salesOrderId = salesOrderId;
        this.productId = productId;
        this.productName = productName;
        this.productTitle = productTitle;
        this.mainImg = mainImg;
        this.salesCount = salesCount;
        this.salesPrice = salesPrice;
        this.remarks = remarks;
    }

    public SalesOrderDetail() {
        super();
    }

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取销售Id 
     *
     * @return sales_order_id - 销售Id 
     */
    public Long getSalesOrderId() {
        return salesOrderId;
    }

    /**
     * 设置销售Id 
     *
     * @param salesOrderId 销售Id 
     */
    public void setSalesOrderId(Long salesOrderId) {
        this.salesOrderId = salesOrderId;
    }

    /**
     * 获取商品Id 
     *
     * @return product_id - 商品Id 
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 设置商品Id 
     *
     * @param productId 商品Id 
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 获取商品名
     *
     * @return product_name - 商品名
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置商品名
     *
     * @param productName 商品名
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * 获取商品标题
     *
     * @return product_title - 商品标题
     */
    public String getProductTitle() {
        return productTitle;
    }

    /**
     * 设置商品标题
     *
     * @param productTitle 商品标题
     */
    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle == null ? null : productTitle.trim();
    }

    /**
     * 获取商品主图
     *
     * @return main_img - 商品主图
     */
    public String getMainImg() {
        return mainImg;
    }

    /**
     * 设置商品主图
     *
     * @param mainImg 商品主图
     */
    public void setMainImg(String mainImg) {
        this.mainImg = mainImg == null ? null : mainImg.trim();
    }

    /**
     * 获取商品数量(最小单位)
     *
     * @return sales_count - 商品数量(最小单位)
     */
    public Integer getSalesCount() {
        return salesCount;
    }

    /**
     * 设置商品数量(最小单位)
     *
     * @param salesCount 商品数量(最小单位)
     */
    public void setSalesCount(Integer salesCount) {
        this.salesCount = salesCount;
    }

    /**
     * 获取商品单价 (销售时单价&最小单位)
     *
     * @return sales_price - 商品单价 (销售时单价&最小单位)
     */
    public BigDecimal getSalesPrice() {
        return salesPrice;
    }

    /**
     * 设置商品单价 (销售时单价&最小单位)
     *
     * @param salesPrice 商品单价 (销售时单价&最小单位)
     */
    public void setSalesPrice(BigDecimal salesPrice) {
        this.salesPrice = salesPrice;
    }

    /**
     * 获取备注
     *
     * @return remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}