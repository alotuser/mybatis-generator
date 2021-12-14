package com.zd.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zd.common.base.BaseModel;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 菜谱主表 
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_menu_dict")
@ApiModel(value = "SysMenuDict对象", description = "菜谱主表 ")
public class SysMenuDict extends BaseModel {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("菜谱id,新增规律需要确认")
    @TableId(value = "menu_id", type = IdType.AUTO)
    private Long menuId;

    @ApiModelProperty("菜谱名字")
    private String menuName;

    @ApiModelProperty("助记符")
    private String menuHelpCode;

    @ApiModelProperty("季节,适合季节，春夏秋冬，中间用竖线分割")
    private String season;

    @ApiModelProperty("范围,默认全国")
    private String district;

    @ApiModelProperty("人群")
    private String crowd;

    @ApiModelProperty("重量（克）")
    private BigDecimal mEnergy;

    @ApiModelProperty("蛋白质（克")
    private BigDecimal mProtein;

    @ApiModelProperty("脂肪（克）")
    private BigDecimal mFat;

    @ApiModelProperty("碳水化合物（克）")
    private BigDecimal mCarbohydrate;

    @ApiModelProperty("膳食纤维")
    private BigDecimal mDf;

    @ApiModelProperty("钙(ca)（毫克）")
    private BigDecimal mCa;

    @ApiModelProperty("铁(fe)（毫克）")
    private BigDecimal mFe;

    @ApiModelProperty("锌(zn) （毫克）")
    private BigDecimal mZn;

    @ApiModelProperty("硒(se)（毫克）")
    private BigDecimal mSe;

    @ApiModelProperty("铜(cu) （毫克）")
    private BigDecimal mCu;

    @ApiModelProperty("锰(mn) （毫克）")
    private BigDecimal mMn;

    @ApiModelProperty("镁(mg) （毫克）")
    private BigDecimal mMg;

    @ApiModelProperty("钠(na) （毫克）")
    private BigDecimal mNa;

    @ApiModelProperty("钾(k) （毫克）")
    private BigDecimal mK;

    @ApiModelProperty("磷(p) （毫克）")
    private BigDecimal mP;

    @ApiModelProperty("胆固醇（毫克）")
    private BigDecimal mCho;

    @ApiModelProperty("碘(i)(微克)")
    private BigDecimal mI;

    @ApiModelProperty("维生素a（微克re）")
    private BigDecimal mVita;

    @ApiModelProperty("维生素e(毫克)")
    private BigDecimal mVite;

    @ApiModelProperty("维生素b1（毫克）")
    private BigDecimal mVitb1;

    @ApiModelProperty("维生素b2（毫克）")
    private BigDecimal mVitb2;

    @ApiModelProperty("维生素c（毫克）")
    private BigDecimal mVitc;

    @ApiModelProperty("烟酸（毫克）")
    private BigDecimal mVitpp;

    @ApiModelProperty("饱和(sfa) （克）")
    private BigDecimal mSfa;

    @ApiModelProperty("单不饱和(mufa)（克）")
    private BigDecimal mMufa;

    @ApiModelProperty("多不饱和(pufa)（克）")
    private BigDecimal mPufa;

    @ApiModelProperty("叶酸(vpp)（微克）")
    private BigDecimal mFolicacid;

    @ApiModelProperty("年龄范围")
    private BigDecimal agesCaleid;

    @ApiModelProperty("餐次")
    private String mealTimeCode;

    @ApiModelProperty("餐次")
    private String mealTimeName;

    @ApiModelProperty("菜谱种类编码")
    private String menuCateCode;

    @ApiModelProperty("菜谱种类名字")
    private String menuCateName;

    @ApiModelProperty("疾病类别营养素控制状态")
    private String nutrientsControlState;

    private String cnofit;

    private String ckeycode;

    private String ckey;

    @ApiModelProperty("是否启用")
    private String isEnable;

    @ApiModelProperty("是否是冷食")
    private String isIceCrusher;

    @ApiModelProperty("是否是甜食")
    private String isSweetFood;

    @ApiModelProperty("是否是咸食")
    private String isSaltyFood;

    @ApiModelProperty("是否是汤类")
    private String isSoup;

    @ApiModelProperty("制作方法")
    private String construction;

    @ApiModelProperty("是否是常用")
    private String isCommonUse;

    @ApiModelProperty("是否适合健康人群")
    private String isPatientPopulation;

    @ApiModelProperty("是否适合疾病人群")
    private String isDiseaseCrowd;

    private String libraryType;

    private String series;

    @ApiModelProperty("图片路径")
    private String img;

    @ApiModelProperty("步骤描述")
    private String steps;

    @ApiModelProperty("创建时间 ")
    private LocalDateTime createTime;

    @ApiModelProperty("创建人编码 ")
    private String createUserCode;

    @ApiModelProperty("创建人名称 ")
    private String createUserName;

    @ApiModelProperty("更新时间 ")
    private LocalDateTime updateTime;

    @ApiModelProperty("更新人编码 ")
    private String updateUserCode;

    @ApiModelProperty("更新人名称 ")
    private String updateUserName;

    /**		
	 * 菜谱id,新增规律需要确认		
     */
    public Long getMenuId() {
        return menuId;
    }

    /**		
	 * 菜谱id,新增规律需要确认		
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
    /**		
	 * 菜谱名字		
     */
    public String getMenuName() {
        return menuName;
    }

    /**		
	 * 菜谱名字		
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    /**		
	 * 助记符		
     */
    public String getMenuHelpCode() {
        return menuHelpCode;
    }

    /**		
	 * 助记符		
     */
    public void setMenuHelpCode(String menuHelpCode) {
        this.menuHelpCode = menuHelpCode;
    }
    /**		
	 * 季节,适合季节，春夏秋冬，中间用竖线分割		
     */
    public String getSeason() {
        return season;
    }

    /**		
	 * 季节,适合季节，春夏秋冬，中间用竖线分割		
     */
    public void setSeason(String season) {
        this.season = season;
    }
    /**		
	 * 范围,默认全国		
     */
    public String getDistrict() {
        return district;
    }

    /**		
	 * 范围,默认全国		
     */
    public void setDistrict(String district) {
        this.district = district;
    }
    /**		
	 * 人群		
     */
    public String getCrowd() {
        return crowd;
    }

    /**		
	 * 人群		
     */
    public void setCrowd(String crowd) {
        this.crowd = crowd;
    }
    /**		
	 * 重量（克）		
     */
    public BigDecimal getmEnergy() {
        return mEnergy;
    }

    /**		
	 * 重量（克）		
     */
    public void setmEnergy(BigDecimal mEnergy) {
        this.mEnergy = mEnergy;
    }
    /**		
	 * 蛋白质（克		
     */
    public BigDecimal getmProtein() {
        return mProtein;
    }

    /**		
	 * 蛋白质（克		
     */
    public void setmProtein(BigDecimal mProtein) {
        this.mProtein = mProtein;
    }
    /**		
	 * 脂肪（克）		
     */
    public BigDecimal getmFat() {
        return mFat;
    }

    /**		
	 * 脂肪（克）		
     */
    public void setmFat(BigDecimal mFat) {
        this.mFat = mFat;
    }
    /**		
	 * 碳水化合物（克）		
     */
    public BigDecimal getmCarbohydrate() {
        return mCarbohydrate;
    }

    /**		
	 * 碳水化合物（克）		
     */
    public void setmCarbohydrate(BigDecimal mCarbohydrate) {
        this.mCarbohydrate = mCarbohydrate;
    }
    /**		
	 * 膳食纤维		
     */
    public BigDecimal getmDf() {
        return mDf;
    }

    /**		
	 * 膳食纤维		
     */
    public void setmDf(BigDecimal mDf) {
        this.mDf = mDf;
    }
    /**		
	 * 钙(ca)（毫克）		
     */
    public BigDecimal getmCa() {
        return mCa;
    }

    /**		
	 * 钙(ca)（毫克）		
     */
    public void setmCa(BigDecimal mCa) {
        this.mCa = mCa;
    }
    /**		
	 * 铁(fe)（毫克）		
     */
    public BigDecimal getmFe() {
        return mFe;
    }

    /**		
	 * 铁(fe)（毫克）		
     */
    public void setmFe(BigDecimal mFe) {
        this.mFe = mFe;
    }
    /**		
	 * 锌(zn) （毫克）		
     */
    public BigDecimal getmZn() {
        return mZn;
    }

    /**		
	 * 锌(zn) （毫克）		
     */
    public void setmZn(BigDecimal mZn) {
        this.mZn = mZn;
    }
    /**		
	 * 硒(se)（毫克）		
     */
    public BigDecimal getmSe() {
        return mSe;
    }

    /**		
	 * 硒(se)（毫克）		
     */
    public void setmSe(BigDecimal mSe) {
        this.mSe = mSe;
    }
    /**		
	 * 铜(cu) （毫克）		
     */
    public BigDecimal getmCu() {
        return mCu;
    }

    /**		
	 * 铜(cu) （毫克）		
     */
    public void setmCu(BigDecimal mCu) {
        this.mCu = mCu;
    }
    /**		
	 * 锰(mn) （毫克）		
     */
    public BigDecimal getmMn() {
        return mMn;
    }

    /**		
	 * 锰(mn) （毫克）		
     */
    public void setmMn(BigDecimal mMn) {
        this.mMn = mMn;
    }
    /**		
	 * 镁(mg) （毫克）		
     */
    public BigDecimal getmMg() {
        return mMg;
    }

    /**		
	 * 镁(mg) （毫克）		
     */
    public void setmMg(BigDecimal mMg) {
        this.mMg = mMg;
    }
    /**		
	 * 钠(na) （毫克）		
     */
    public BigDecimal getmNa() {
        return mNa;
    }

    /**		
	 * 钠(na) （毫克）		
     */
    public void setmNa(BigDecimal mNa) {
        this.mNa = mNa;
    }
    /**		
	 * 钾(k) （毫克）		
     */
    public BigDecimal getmK() {
        return mK;
    }

    /**		
	 * 钾(k) （毫克）		
     */
    public void setmK(BigDecimal mK) {
        this.mK = mK;
    }
    /**		
	 * 磷(p) （毫克）		
     */
    public BigDecimal getmP() {
        return mP;
    }

    /**		
	 * 磷(p) （毫克）		
     */
    public void setmP(BigDecimal mP) {
        this.mP = mP;
    }
    /**		
	 * 胆固醇（毫克）		
     */
    public BigDecimal getmCho() {
        return mCho;
    }

    /**		
	 * 胆固醇（毫克）		
     */
    public void setmCho(BigDecimal mCho) {
        this.mCho = mCho;
    }
    /**		
	 * 碘(i)(微克)		
     */
    public BigDecimal getmI() {
        return mI;
    }

    /**		
	 * 碘(i)(微克)		
     */
    public void setmI(BigDecimal mI) {
        this.mI = mI;
    }
    /**		
	 * 维生素a（微克re）		
     */
    public BigDecimal getmVita() {
        return mVita;
    }

    /**		
	 * 维生素a（微克re）		
     */
    public void setmVita(BigDecimal mVita) {
        this.mVita = mVita;
    }
    /**		
	 * 维生素e(毫克)		
     */
    public BigDecimal getmVite() {
        return mVite;
    }

    /**		
	 * 维生素e(毫克)		
     */
    public void setmVite(BigDecimal mVite) {
        this.mVite = mVite;
    }
    /**		
	 * 维生素b1（毫克）		
     */
    public BigDecimal getmVitb1() {
        return mVitb1;
    }

    /**		
	 * 维生素b1（毫克）		
     */
    public void setmVitb1(BigDecimal mVitb1) {
        this.mVitb1 = mVitb1;
    }
    /**		
	 * 维生素b2（毫克）		
     */
    public BigDecimal getmVitb2() {
        return mVitb2;
    }

    /**		
	 * 维生素b2（毫克）		
     */
    public void setmVitb2(BigDecimal mVitb2) {
        this.mVitb2 = mVitb2;
    }
    /**		
	 * 维生素c（毫克）		
     */
    public BigDecimal getmVitc() {
        return mVitc;
    }

    /**		
	 * 维生素c（毫克）		
     */
    public void setmVitc(BigDecimal mVitc) {
        this.mVitc = mVitc;
    }
    /**		
	 * 烟酸（毫克）		
     */
    public BigDecimal getmVitpp() {
        return mVitpp;
    }

    /**		
	 * 烟酸（毫克）		
     */
    public void setmVitpp(BigDecimal mVitpp) {
        this.mVitpp = mVitpp;
    }
    /**		
	 * 饱和(sfa) （克）		
     */
    public BigDecimal getmSfa() {
        return mSfa;
    }

    /**		
	 * 饱和(sfa) （克）		
     */
    public void setmSfa(BigDecimal mSfa) {
        this.mSfa = mSfa;
    }
    /**		
	 * 单不饱和(mufa)（克）		
     */
    public BigDecimal getmMufa() {
        return mMufa;
    }

    /**		
	 * 单不饱和(mufa)（克）		
     */
    public void setmMufa(BigDecimal mMufa) {
        this.mMufa = mMufa;
    }
    /**		
	 * 多不饱和(pufa)（克）		
     */
    public BigDecimal getmPufa() {
        return mPufa;
    }

    /**		
	 * 多不饱和(pufa)（克）		
     */
    public void setmPufa(BigDecimal mPufa) {
        this.mPufa = mPufa;
    }
    /**		
	 * 叶酸(vpp)（微克）		
     */
    public BigDecimal getmFolicacid() {
        return mFolicacid;
    }

    /**		
	 * 叶酸(vpp)（微克）		
     */
    public void setmFolicacid(BigDecimal mFolicacid) {
        this.mFolicacid = mFolicacid;
    }
    /**		
	 * 年龄范围		
     */
    public BigDecimal getAgesCaleid() {
        return agesCaleid;
    }

    /**		
	 * 年龄范围		
     */
    public void setAgesCaleid(BigDecimal agesCaleid) {
        this.agesCaleid = agesCaleid;
    }
    /**		
	 * 餐次		
     */
    public String getMealTimeCode() {
        return mealTimeCode;
    }

    /**		
	 * 餐次		
     */
    public void setMealTimeCode(String mealTimeCode) {
        this.mealTimeCode = mealTimeCode;
    }
    /**		
	 * 餐次		
     */
    public String getMealTimeName() {
        return mealTimeName;
    }

    /**		
	 * 餐次		
     */
    public void setMealTimeName(String mealTimeName) {
        this.mealTimeName = mealTimeName;
    }
    /**		
	 * 菜谱种类编码		
     */
    public String getMenuCateCode() {
        return menuCateCode;
    }

    /**		
	 * 菜谱种类编码		
     */
    public void setMenuCateCode(String menuCateCode) {
        this.menuCateCode = menuCateCode;
    }
    /**		
	 * 菜谱种类名字		
     */
    public String getMenuCateName() {
        return menuCateName;
    }

    /**		
	 * 菜谱种类名字		
     */
    public void setMenuCateName(String menuCateName) {
        this.menuCateName = menuCateName;
    }
    /**		
	 * 疾病类别营养素控制状态		
     */
    public String getNutrientsControlState() {
        return nutrientsControlState;
    }

    /**		
	 * 疾病类别营养素控制状态		
     */
    public void setNutrientsControlState(String nutrientsControlState) {
        this.nutrientsControlState = nutrientsControlState;
    }
    /**		
	 * 		
     */
    public String getCnofit() {
        return cnofit;
    }

    /**		
	 * 		
     */
    public void setCnofit(String cnofit) {
        this.cnofit = cnofit;
    }
    /**		
	 * 		
     */
    public String getCkeycode() {
        return ckeycode;
    }

    /**		
	 * 		
     */
    public void setCkeycode(String ckeycode) {
        this.ckeycode = ckeycode;
    }
    /**		
	 * 		
     */
    public String getCkey() {
        return ckey;
    }

    /**		
	 * 		
     */
    public void setCkey(String ckey) {
        this.ckey = ckey;
    }
    /**		
	 * 是否启用		
     */
    public String getIsEnable() {
        return isEnable;
    }

    /**		
	 * 是否启用		
     */
    public void setIsEnable(String isEnable) {
        this.isEnable = isEnable;
    }
    /**		
	 * 是否是冷食		
     */
    public String getIsIceCrusher() {
        return isIceCrusher;
    }

    /**		
	 * 是否是冷食		
     */
    public void setIsIceCrusher(String isIceCrusher) {
        this.isIceCrusher = isIceCrusher;
    }
    /**		
	 * 是否是甜食		
     */
    public String getIsSweetFood() {
        return isSweetFood;
    }

    /**		
	 * 是否是甜食		
     */
    public void setIsSweetFood(String isSweetFood) {
        this.isSweetFood = isSweetFood;
    }
    /**		
	 * 是否是咸食		
     */
    public String getIsSaltyFood() {
        return isSaltyFood;
    }

    /**		
	 * 是否是咸食		
     */
    public void setIsSaltyFood(String isSaltyFood) {
        this.isSaltyFood = isSaltyFood;
    }
    /**		
	 * 是否是汤类		
     */
    public String getIsSoup() {
        return isSoup;
    }

    /**		
	 * 是否是汤类		
     */
    public void setIsSoup(String isSoup) {
        this.isSoup = isSoup;
    }
    /**		
	 * 制作方法		
     */
    public String getConstruction() {
        return construction;
    }

    /**		
	 * 制作方法		
     */
    public void setConstruction(String construction) {
        this.construction = construction;
    }
    /**		
	 * 是否是常用		
     */
    public String getIsCommonUse() {
        return isCommonUse;
    }

    /**		
	 * 是否是常用		
     */
    public void setIsCommonUse(String isCommonUse) {
        this.isCommonUse = isCommonUse;
    }
    /**		
	 * 是否适合健康人群		
     */
    public String getIsPatientPopulation() {
        return isPatientPopulation;
    }

    /**		
	 * 是否适合健康人群		
     */
    public void setIsPatientPopulation(String isPatientPopulation) {
        this.isPatientPopulation = isPatientPopulation;
    }
    /**		
	 * 是否适合疾病人群		
     */
    public String getIsDiseaseCrowd() {
        return isDiseaseCrowd;
    }

    /**		
	 * 是否适合疾病人群		
     */
    public void setIsDiseaseCrowd(String isDiseaseCrowd) {
        this.isDiseaseCrowd = isDiseaseCrowd;
    }
    /**		
	 * 		
     */
    public String getLibraryType() {
        return libraryType;
    }

    /**		
	 * 		
     */
    public void setLibraryType(String libraryType) {
        this.libraryType = libraryType;
    }
    /**		
	 * 		
     */
    public String getSeries() {
        return series;
    }

    /**		
	 * 		
     */
    public void setSeries(String series) {
        this.series = series;
    }
    /**		
	 * 图片路径		
     */
    public String getImg() {
        return img;
    }

    /**		
	 * 图片路径		
     */
    public void setImg(String img) {
        this.img = img;
    }
    /**		
	 * 步骤描述		
     */
    public String getSteps() {
        return steps;
    }

    /**		
	 * 步骤描述		
     */
    public void setSteps(String steps) {
        this.steps = steps;
    }
    /**		
	 * 创建时间 		
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**		
	 * 创建时间 		
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    /**		
	 * 创建人编码 		
     */
    public String getCreateUserCode() {
        return createUserCode;
    }

    /**		
	 * 创建人编码 		
     */
    public void setCreateUserCode(String createUserCode) {
        this.createUserCode = createUserCode;
    }
    /**		
	 * 创建人名称 		
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**		
	 * 创建人名称 		
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }
    /**		
	 * 更新时间 		
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**		
	 * 更新时间 		
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
    /**		
	 * 更新人编码 		
     */
    public String getUpdateUserCode() {
        return updateUserCode;
    }

    /**		
	 * 更新人编码 		
     */
    public void setUpdateUserCode(String updateUserCode) {
        this.updateUserCode = updateUserCode;
    }
    /**		
	 * 更新人名称 		
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**		
	 * 更新人名称 		
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    @Override
    public String toString() {
        return "SysMenuDict{" +
            "menuId=" + menuId +
            ", menuName=" + menuName +
            ", menuHelpCode=" + menuHelpCode +
            ", season=" + season +
            ", district=" + district +
            ", crowd=" + crowd +
            ", mEnergy=" + mEnergy +
            ", mProtein=" + mProtein +
            ", mFat=" + mFat +
            ", mCarbohydrate=" + mCarbohydrate +
            ", mDf=" + mDf +
            ", mCa=" + mCa +
            ", mFe=" + mFe +
            ", mZn=" + mZn +
            ", mSe=" + mSe +
            ", mCu=" + mCu +
            ", mMn=" + mMn +
            ", mMg=" + mMg +
            ", mNa=" + mNa +
            ", mK=" + mK +
            ", mP=" + mP +
            ", mCho=" + mCho +
            ", mI=" + mI +
            ", mVita=" + mVita +
            ", mVite=" + mVite +
            ", mVitb1=" + mVitb1 +
            ", mVitb2=" + mVitb2 +
            ", mVitc=" + mVitc +
            ", mVitpp=" + mVitpp +
            ", mSfa=" + mSfa +
            ", mMufa=" + mMufa +
            ", mPufa=" + mPufa +
            ", mFolicacid=" + mFolicacid +
            ", agesCaleid=" + agesCaleid +
            ", mealTimeCode=" + mealTimeCode +
            ", mealTimeName=" + mealTimeName +
            ", menuCateCode=" + menuCateCode +
            ", menuCateName=" + menuCateName +
            ", nutrientsControlState=" + nutrientsControlState +
            ", cnofit=" + cnofit +
            ", ckeycode=" + ckeycode +
            ", ckey=" + ckey +
            ", isEnable=" + isEnable +
            ", isIceCrusher=" + isIceCrusher +
            ", isSweetFood=" + isSweetFood +
            ", isSaltyFood=" + isSaltyFood +
            ", isSoup=" + isSoup +
            ", construction=" + construction +
            ", isCommonUse=" + isCommonUse +
            ", isPatientPopulation=" + isPatientPopulation +
            ", isDiseaseCrowd=" + isDiseaseCrowd +
            ", libraryType=" + libraryType +
            ", series=" + series +
            ", img=" + img +
            ", steps=" + steps +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
