package com.zd.generator.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zd.common.base.BaseModel;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("menu_dict")
@ApiModel(value = "MenuDict对象", description = "")
public class MenuDict extends BaseModel {

    private static final long serialVersionUID = 1L;

    private String menuId;

    private String menuName;

    private String menuHelpCode;

    private String season;

    private String district;

    private String crowd;

    private BigDecimal mEnergy;

    private BigDecimal mProtein;

    private BigDecimal mFat;

    private BigDecimal mArbohydrate;

    private BigDecimal mDf;

    private BigDecimal mCa;

    private BigDecimal mFe;

    private BigDecimal mZn;

    private BigDecimal mSe;

    private BigDecimal mCu;

    private BigDecimal mMn;

    private BigDecimal mMg;

    private BigDecimal mNa;

    private BigDecimal mK;

    private BigDecimal mP;

    private BigDecimal mCho;

    private BigDecimal mI;

    private BigDecimal mVita;

    private BigDecimal mVite;

    private BigDecimal mVitb1;

    private BigDecimal mVitb2;

    private BigDecimal mVitc;

    private BigDecimal mVitpp;

    private BigDecimal mSfa;

    private BigDecimal mMufa;

    private BigDecimal mPufa;

    private BigDecimal mFolicacid;

    private BigDecimal agesCaleid;

    private String mealTimeCode;

    private String menuCateCode;

    private String nutrientsControlState;

    private String cnofit;

    private String ckeycode;

    private String ckey;

    private String isEnable;

    private String isIceCrusher;

    private String isSweetFood;

    private String isSaltyFood;

    private String isSoup;

    private String construction;

    private String isCommonUse;

    private String isPatientPopulation;

    private String isDiseaseCrowd;

    private String libraryType;

    private String series;

    private Blob img;

    private String steps;

    private String createDateTime;

    private String updateDateTime;

    /**		
	 * 		
     */
    public String getMenuId() {
        return menuId;
    }

    /**		
	 * 		
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
    /**		
	 * 		
     */
    public String getMenuName() {
        return menuName;
    }

    /**		
	 * 		
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    /**		
	 * 		
     */
    public String getMenuHelpCode() {
        return menuHelpCode;
    }

    /**		
	 * 		
     */
    public void setMenuHelpCode(String menuHelpCode) {
        this.menuHelpCode = menuHelpCode;
    }
    /**		
	 * 		
     */
    public String getSeason() {
        return season;
    }

    /**		
	 * 		
     */
    public void setSeason(String season) {
        this.season = season;
    }
    /**		
	 * 		
     */
    public String getDistrict() {
        return district;
    }

    /**		
	 * 		
     */
    public void setDistrict(String district) {
        this.district = district;
    }
    /**		
	 * 		
     */
    public String getCrowd() {
        return crowd;
    }

    /**		
	 * 		
     */
    public void setCrowd(String crowd) {
        this.crowd = crowd;
    }
    /**		
	 * 		
     */
    public BigDecimal getmEnergy() {
        return mEnergy;
    }

    /**		
	 * 		
     */
    public void setmEnergy(BigDecimal mEnergy) {
        this.mEnergy = mEnergy;
    }
    /**		
	 * 		
     */
    public BigDecimal getmProtein() {
        return mProtein;
    }

    /**		
	 * 		
     */
    public void setmProtein(BigDecimal mProtein) {
        this.mProtein = mProtein;
    }
    /**		
	 * 		
     */
    public BigDecimal getmFat() {
        return mFat;
    }

    /**		
	 * 		
     */
    public void setmFat(BigDecimal mFat) {
        this.mFat = mFat;
    }
    /**		
	 * 		
     */
    public BigDecimal getmArbohydrate() {
        return mArbohydrate;
    }

    /**		
	 * 		
     */
    public void setmArbohydrate(BigDecimal mArbohydrate) {
        this.mArbohydrate = mArbohydrate;
    }
    /**		
	 * 		
     */
    public BigDecimal getmDf() {
        return mDf;
    }

    /**		
	 * 		
     */
    public void setmDf(BigDecimal mDf) {
        this.mDf = mDf;
    }
    /**		
	 * 		
     */
    public BigDecimal getmCa() {
        return mCa;
    }

    /**		
	 * 		
     */
    public void setmCa(BigDecimal mCa) {
        this.mCa = mCa;
    }
    /**		
	 * 		
     */
    public BigDecimal getmFe() {
        return mFe;
    }

    /**		
	 * 		
     */
    public void setmFe(BigDecimal mFe) {
        this.mFe = mFe;
    }
    /**		
	 * 		
     */
    public BigDecimal getmZn() {
        return mZn;
    }

    /**		
	 * 		
     */
    public void setmZn(BigDecimal mZn) {
        this.mZn = mZn;
    }
    /**		
	 * 		
     */
    public BigDecimal getmSe() {
        return mSe;
    }

    /**		
	 * 		
     */
    public void setmSe(BigDecimal mSe) {
        this.mSe = mSe;
    }
    /**		
	 * 		
     */
    public BigDecimal getmCu() {
        return mCu;
    }

    /**		
	 * 		
     */
    public void setmCu(BigDecimal mCu) {
        this.mCu = mCu;
    }
    /**		
	 * 		
     */
    public BigDecimal getmMn() {
        return mMn;
    }

    /**		
	 * 		
     */
    public void setmMn(BigDecimal mMn) {
        this.mMn = mMn;
    }
    /**		
	 * 		
     */
    public BigDecimal getmMg() {
        return mMg;
    }

    /**		
	 * 		
     */
    public void setmMg(BigDecimal mMg) {
        this.mMg = mMg;
    }
    /**		
	 * 		
     */
    public BigDecimal getmNa() {
        return mNa;
    }

    /**		
	 * 		
     */
    public void setmNa(BigDecimal mNa) {
        this.mNa = mNa;
    }
    /**		
	 * 		
     */
    public BigDecimal getmK() {
        return mK;
    }

    /**		
	 * 		
     */
    public void setmK(BigDecimal mK) {
        this.mK = mK;
    }
    /**		
	 * 		
     */
    public BigDecimal getmP() {
        return mP;
    }

    /**		
	 * 		
     */
    public void setmP(BigDecimal mP) {
        this.mP = mP;
    }
    /**		
	 * 		
     */
    public BigDecimal getmCho() {
        return mCho;
    }

    /**		
	 * 		
     */
    public void setmCho(BigDecimal mCho) {
        this.mCho = mCho;
    }
    /**		
	 * 		
     */
    public BigDecimal getmI() {
        return mI;
    }

    /**		
	 * 		
     */
    public void setmI(BigDecimal mI) {
        this.mI = mI;
    }
    /**		
	 * 		
     */
    public BigDecimal getmVita() {
        return mVita;
    }

    /**		
	 * 		
     */
    public void setmVita(BigDecimal mVita) {
        this.mVita = mVita;
    }
    /**		
	 * 		
     */
    public BigDecimal getmVite() {
        return mVite;
    }

    /**		
	 * 		
     */
    public void setmVite(BigDecimal mVite) {
        this.mVite = mVite;
    }
    /**		
	 * 		
     */
    public BigDecimal getmVitb1() {
        return mVitb1;
    }

    /**		
	 * 		
     */
    public void setmVitb1(BigDecimal mVitb1) {
        this.mVitb1 = mVitb1;
    }
    /**		
	 * 		
     */
    public BigDecimal getmVitb2() {
        return mVitb2;
    }

    /**		
	 * 		
     */
    public void setmVitb2(BigDecimal mVitb2) {
        this.mVitb2 = mVitb2;
    }
    /**		
	 * 		
     */
    public BigDecimal getmVitc() {
        return mVitc;
    }

    /**		
	 * 		
     */
    public void setmVitc(BigDecimal mVitc) {
        this.mVitc = mVitc;
    }
    /**		
	 * 		
     */
    public BigDecimal getmVitpp() {
        return mVitpp;
    }

    /**		
	 * 		
     */
    public void setmVitpp(BigDecimal mVitpp) {
        this.mVitpp = mVitpp;
    }
    /**		
	 * 		
     */
    public BigDecimal getmSfa() {
        return mSfa;
    }

    /**		
	 * 		
     */
    public void setmSfa(BigDecimal mSfa) {
        this.mSfa = mSfa;
    }
    /**		
	 * 		
     */
    public BigDecimal getmMufa() {
        return mMufa;
    }

    /**		
	 * 		
     */
    public void setmMufa(BigDecimal mMufa) {
        this.mMufa = mMufa;
    }
    /**		
	 * 		
     */
    public BigDecimal getmPufa() {
        return mPufa;
    }

    /**		
	 * 		
     */
    public void setmPufa(BigDecimal mPufa) {
        this.mPufa = mPufa;
    }
    /**		
	 * 		
     */
    public BigDecimal getmFolicacid() {
        return mFolicacid;
    }

    /**		
	 * 		
     */
    public void setmFolicacid(BigDecimal mFolicacid) {
        this.mFolicacid = mFolicacid;
    }
    /**		
	 * 		
     */
    public BigDecimal getAgesCaleid() {
        return agesCaleid;
    }

    /**		
	 * 		
     */
    public void setAgesCaleid(BigDecimal agesCaleid) {
        this.agesCaleid = agesCaleid;
    }
    /**		
	 * 		
     */
    public String getMealTimeCode() {
        return mealTimeCode;
    }

    /**		
	 * 		
     */
    public void setMealTimeCode(String mealTimeCode) {
        this.mealTimeCode = mealTimeCode;
    }
    /**		
	 * 		
     */
    public String getMenuCateCode() {
        return menuCateCode;
    }

    /**		
	 * 		
     */
    public void setMenuCateCode(String menuCateCode) {
        this.menuCateCode = menuCateCode;
    }
    /**		
	 * 		
     */
    public String getNutrientsControlState() {
        return nutrientsControlState;
    }

    /**		
	 * 		
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
	 * 		
     */
    public String getIsEnable() {
        return isEnable;
    }

    /**		
	 * 		
     */
    public void setIsEnable(String isEnable) {
        this.isEnable = isEnable;
    }
    /**		
	 * 		
     */
    public String getIsIceCrusher() {
        return isIceCrusher;
    }

    /**		
	 * 		
     */
    public void setIsIceCrusher(String isIceCrusher) {
        this.isIceCrusher = isIceCrusher;
    }
    /**		
	 * 		
     */
    public String getIsSweetFood() {
        return isSweetFood;
    }

    /**		
	 * 		
     */
    public void setIsSweetFood(String isSweetFood) {
        this.isSweetFood = isSweetFood;
    }
    /**		
	 * 		
     */
    public String getIsSaltyFood() {
        return isSaltyFood;
    }

    /**		
	 * 		
     */
    public void setIsSaltyFood(String isSaltyFood) {
        this.isSaltyFood = isSaltyFood;
    }
    /**		
	 * 		
     */
    public String getIsSoup() {
        return isSoup;
    }

    /**		
	 * 		
     */
    public void setIsSoup(String isSoup) {
        this.isSoup = isSoup;
    }
    /**		
	 * 		
     */
    public String getConstruction() {
        return construction;
    }

    /**		
	 * 		
     */
    public void setConstruction(String construction) {
        this.construction = construction;
    }
    /**		
	 * 		
     */
    public String getIsCommonUse() {
        return isCommonUse;
    }

    /**		
	 * 		
     */
    public void setIsCommonUse(String isCommonUse) {
        this.isCommonUse = isCommonUse;
    }
    /**		
	 * 		
     */
    public String getIsPatientPopulation() {
        return isPatientPopulation;
    }

    /**		
	 * 		
     */
    public void setIsPatientPopulation(String isPatientPopulation) {
        this.isPatientPopulation = isPatientPopulation;
    }
    /**		
	 * 		
     */
    public String getIsDiseaseCrowd() {
        return isDiseaseCrowd;
    }

    /**		
	 * 		
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
	 * 		
     */
    public Blob getImg() {
        return img;
    }

    /**		
	 * 		
     */
    public void setImg(Blob img) {
        this.img = img;
    }
    /**		
	 * 		
     */
    public String getSteps() {
        return steps;
    }

    /**		
	 * 		
     */
    public void setSteps(String steps) {
        this.steps = steps;
    }
    /**		
	 * 		
     */
    public String getCreateDateTime() {
        return createDateTime;
    }

    /**		
	 * 		
     */
    public void setCreateDateTime(String createDateTime) {
        this.createDateTime = createDateTime;
    }
    /**		
	 * 		
     */
    public String getUpdateDateTime() {
        return updateDateTime;
    }

    /**		
	 * 		
     */
    public void setUpdateDateTime(String updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    @Override
    public String toString() {
        return "MenuDict{" +
            "menuId=" + menuId +
            ", menuName=" + menuName +
            ", menuHelpCode=" + menuHelpCode +
            ", season=" + season +
            ", district=" + district +
            ", crowd=" + crowd +
            ", mEnergy=" + mEnergy +
            ", mProtein=" + mProtein +
            ", mFat=" + mFat +
            ", mArbohydrate=" + mArbohydrate +
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
            ", menuCateCode=" + menuCateCode +
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
            ", createDateTime=" + createDateTime +
            ", updateDateTime=" + updateDateTime +
        "}";
    }
}
