package net.lovexq.seckill.domain.estate.dto;

import net.lovexq.seckill.domain.estate.model.EstateItemModel;
import net.lovexq.seckill.domain.estate.model.EstateImageModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 房源条目DTO
 *
 * @author LuPindong
 * @time 2017-04-20 16:40
 */
public class EstateItemDTO extends EstateItemModel {

    private List<EstateImageModel> estateImageList = new ArrayList();

    private String batch;

    private String detailHref;

    private Long bodyLength;

    private String CrawlerState;

    private String totalPriceStr;
    private String unitPriceStr;
    private String downPayments;
    private String areaStr;
    private String focusNumStr;
    private String watchNumStr;
    private Boolean newEstate;

    public EstateItemDTO() {
        super();
    }

    public EstateItemDTO(Long id) {
        super(id);
    }

    public List<EstateImageModel> getEstateImageList() {
        return estateImageList;
    }

    public void setEstateImageList(List<EstateImageModel> estateImageList) {
        this.estateImageList = estateImageList;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getDetailHref() {
        return detailHref;
    }

    public void setDetailHref(String detailHref) {
        this.detailHref = detailHref;
    }

    public Long getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(Long bodyLength) {
        this.bodyLength = bodyLength;
    }

    public String getCrawlerState() {
        return CrawlerState;
    }

    public void setCrawlerState(String crawlerState) {
        CrawlerState = crawlerState;
    }

    public String getTotalPriceStr() {
        return totalPriceStr;
    }

    public void setTotalPriceStr(String totalPriceStr) {
        this.totalPriceStr = totalPriceStr;
    }

    public String getUnitPriceStr() {
        return unitPriceStr;
    }

    public void setUnitPriceStr(String unitPriceStr) {
        this.unitPriceStr = unitPriceStr;
    }

    public String getDownPayments() {
        return downPayments;
    }

    public void setDownPayments(String downPayments) {
        this.downPayments = downPayments;
    }

    public String getAreaStr() {
        return areaStr;
    }

    public void setAreaStr(String areaStr) {
        this.areaStr = areaStr;
    }

    public String getFocusNumStr() {
        return focusNumStr;
    }

    public void setFocusNumStr(String focusNumStr) {
        this.focusNumStr = focusNumStr;
    }

    public String getWatchNumStr() {
        return watchNumStr;
    }

    public void setWatchNumStr(String watchNumStr) {
        this.watchNumStr = watchNumStr;
    }

    public Boolean getNewEstate() {
        return newEstate;
    }

    public void setNewEstate(Boolean newEstate) {
        this.newEstate = newEstate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EstateItemDTO)) return false;
        if (!super.equals(o)) return false;
        EstateItemDTO that = (EstateItemDTO) o;
        return Objects.equals(detailHref, that.detailHref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), detailHref);
    }
}
