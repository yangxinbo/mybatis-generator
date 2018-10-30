package com.sinaif.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 广告资源表(AdvertInfo)实体类
 *
 * @author makejava
 * @since 2018-10-30 11:06:14
 */
public class AdvertInfo implements Serializable {
    private static final long serialVersionUID = 751980618111776081L;
    //主键
    private String id;
    //位置编码
    private String positioncode;
    //广告名称
    private String name;
    //跳转后的title
    private String title;
    //广告类型：0图片，1视频，2文本
    private String adverttype;
    //资源url
    private String imgurl;
    //缩略图url
    private String thumbnailurl;
    //浮动类型: 0无悬浮,1悬浮文字,2悬浮图片
    private Integer floattype;
    //浮动文字
    private String floattext;
    //浮动图片地址
    private String floatimgurl;
    //icon下方的文字
    private String icontext;
    //跳转途径，1:内部打开h5链接 ,2:外部打开h5链接，3:仅展示不跳转
    private Integer jumptype;
    //跳转链接
    private String jumplink;
    //状态：0非登录，1登录
    private Integer loginflag;
    //排序
    private Integer sort;
    //状态：1有效，0无效
    private Integer status;
    //备注说明
    private String remark;
    //创建者
    private String createby;
    //创建时间
    private Date createtime;
    //更新者
    private String updateby;
    //最后更新时间
    private Date updatetime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPositioncode() {
        return positioncode;
    }

    public void setPositioncode(String positioncode) {
        this.positioncode = positioncode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAdverttype() {
        return adverttype;
    }

    public void setAdverttype(String adverttype) {
        this.adverttype = adverttype;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getThumbnailurl() {
        return thumbnailurl;
    }

    public void setThumbnailurl(String thumbnailurl) {
        this.thumbnailurl = thumbnailurl;
    }

    public Integer getFloattype() {
        return floattype;
    }

    public void setFloattype(Integer floattype) {
        this.floattype = floattype;
    }

    public String getFloattext() {
        return floattext;
    }

    public void setFloattext(String floattext) {
        this.floattext = floattext;
    }

    public String getFloatimgurl() {
        return floatimgurl;
    }

    public void setFloatimgurl(String floatimgurl) {
        this.floatimgurl = floatimgurl;
    }

    public String getIcontext() {
        return icontext;
    }

    public void setIcontext(String icontext) {
        this.icontext = icontext;
    }

    public Integer getJumptype() {
        return jumptype;
    }

    public void setJumptype(Integer jumptype) {
        this.jumptype = jumptype;
    }

    public String getJumplink() {
        return jumplink;
    }

    public void setJumplink(String jumplink) {
        this.jumplink = jumplink;
    }

    public Integer getLoginflag() {
        return loginflag;
    }

    public void setLoginflag(Integer loginflag) {
        this.loginflag = loginflag;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

}