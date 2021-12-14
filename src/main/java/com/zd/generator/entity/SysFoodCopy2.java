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
 * 食物成分表
 * </p>
 *
 * @author zdview
 * @since 2021-12-07
 */
@TableName("sys_food_copy2")
@ApiModel(value = "SysFoodCopy2对象", description = "食物成分表")
public class SysFoodCopy2 extends BaseModel {

    private static final long serialVersionUID = 1L;

    @TableId(value = "f_id", type = IdType.AUTO)
    private Integer fId;

    @ApiModelProperty("版本 2004,2009,2018,2019 ")
    private String version;

    @ApiModelProperty("食物id")
    private String foodId;

    @ApiModelProperty("食物名称")
    private String foodName;

    @ApiModelProperty("食部(可食用部分),市品的情况乘以该数再除以100 ")
    private String department;

    @ApiModelProperty("能量")
    private String energy;

    @ApiModelProperty("蛋白质")
    private String protein;

    @ApiModelProperty("脂肪")
    private String fat;

    @ApiModelProperty("碳水化合物")
    private String carbohydrate;

    @ApiModelProperty("膳食纤维")
    private String df;

    @ApiModelProperty("钙")
    private String ca;

    @ApiModelProperty("铁")
    private String fe;

    @ApiModelProperty("锌")
    private String zn;

    @ApiModelProperty("硒")
    private String se;

    @ApiModelProperty("铜")
    private String cu;

    @ApiModelProperty("锰")
    private String mn;

    @ApiModelProperty("镁")
    private String mg;

    @ApiModelProperty("钠")
    private String na;

    @ApiModelProperty("钾")
    private String k;

    @ApiModelProperty("磷")
    private String p;

    @ApiModelProperty("视黄醇当量")
    private String vita;

    @ApiModelProperty("维生素e")
    private String vite;

    @ApiModelProperty("维生素b1")
    private String vitb1;

    @ApiModelProperty("维生素b2")
    private String vitb2;

    @ApiModelProperty("维生素c")
    private String vitc;

    @ApiModelProperty("烟酸")
    private String vitpp;

    @ApiModelProperty("天冬氨酸")
    private String asp;

    @ApiModelProperty("苏氨酸（毫克）")
    private String thr;

    @ApiModelProperty("丝氨酸（毫克）")
    private String ser;

    @ApiModelProperty("谷氨酸（毫克）")
    private String glu;

    @ApiModelProperty("脯氨酸（毫克）")
    private String pro;

    @ApiModelProperty("甘氨酸（毫克）")
    private String gly;

    @ApiModelProperty("丙氨酸（毫克）")
    private String ala;

    @ApiModelProperty("胱氨酸（毫克）")
    private String cys;

    @ApiModelProperty("缬氨酸（毫克）")
    private String val;

    @ApiModelProperty("蛋氨酸（毫克）")
    private String met;

    @ApiModelProperty("异亮氨酸（毫克）")
    private String ile;

    @ApiModelProperty("亮氨酸（毫克）")
    private String leu;

    @ApiModelProperty("酪氨酸（毫克）")
    private String tyr;

    @ApiModelProperty("苯丙氨酸（毫克）")
    private String phe;

    @ApiModelProperty("赖氨酸（毫克）")
    private String lys;

    @ApiModelProperty("组氨酸（毫克）")
    private String his;

    @ApiModelProperty("精氨酸（毫克）")
    private String arg;

    @ApiModelProperty("色氨酸（毫克）")
    private String trp;

    @ApiModelProperty("c6:0（%）")
    private String f6c;

    @ApiModelProperty("c8:0（%）")
    private String f8c;

    @ApiModelProperty("c10:0（%）")
    private String f10c;

    @ApiModelProperty("c11:0（%）")
    private String f11c;

    @ApiModelProperty("c12:0（%）")
    private String f12c;

    @ApiModelProperty("c13:0（%）")
    private String f13c;

    @ApiModelProperty("c14:0（%）")
    private String f14c;

    @ApiModelProperty("c14:1（%）")
    private String f14c1;

    @ApiModelProperty("c14:0（%）")
    private String f15c;

    @ApiModelProperty("c14:1（%）")
    private String f15c1;

    @ApiModelProperty("c16:0（%）")
    private String f16c;

    @ApiModelProperty("c16:1（%）")
    private String f16c1;

    @ApiModelProperty("c16:2（%）")
    private String f16c2;

    @ApiModelProperty("c17:1（%）")
    private String f17c1;

    @ApiModelProperty("c17:0（%）")
    private String f17c;

    @ApiModelProperty("c18:0（%）")
    private String f18c;

    @ApiModelProperty("c18:1（%）")
    private String f18c1;

    @ApiModelProperty("c18:2（%）亚油酸(mg)")
    private String f18c2;

    @ApiModelProperty("c18:3（%）")
    private String f18c3;

    @ApiModelProperty("c19:0（%）")
    private String f19c;

    @ApiModelProperty("c20:0（%）")
    private String f20c;

    @ApiModelProperty("c20:1（%）")
    private String f20c1;

    @ApiModelProperty("c20:2（%）")
    private String f20c2;

    @ApiModelProperty("c20:3（%）")
    private String f20c3;

    @ApiModelProperty("c20:4（%）花生四烯酸(mg)")
    private String f20c4;

    @ApiModelProperty("c20:5（%）")
    private String f20c5;

    @ApiModelProperty("c22:0（%）")
    private String f22c;

    @ApiModelProperty("c22:1（%）")
    private String f22c1;

    @ApiModelProperty("c22:2（%）")
    private String f22c3;

    @ApiModelProperty("c22:3（%）")
    private String f22c4;

    @ApiModelProperty("c22:4（%）")
    private String f22c5;

    @ApiModelProperty("c22:5（%）二十二碳六烯酸(mg)")
    private String f22c6;

    @ApiModelProperty("未知（%）")
    private String unknownpercent;

    @ApiModelProperty("c18:3a")
    private String f18c3a;

    @ApiModelProperty("c18:3r")
    private String f18c3r;

    @ApiModelProperty("胆固醇（毫克）")
    private String cho;

    @ApiModelProperty("水（克）")
    private String water;

    @ApiModelProperty("饱和(sfa)（克）")
    private String sfa;

    @ApiModelProperty("叶酸")
    private String usp;

    @ApiModelProperty("碘(i) （微克）")
    private String i;

    @ApiModelProperty("灰分（克）")
    private String ash;

    @ApiModelProperty("血糖生成指数")
    private String gi;

    @ApiModelProperty("单不饱和(mufa)（克）")
    private String mufa;

    @ApiModelProperty("多不饱和(pufa)（克）")
    private String pufa;

    @ApiModelProperty("未知（克）")
    private String unknowngram;

    @ApiModelProperty("胡萝卜素（微克）")
    private String renieratene;

    @ApiModelProperty("视黄醇（微克）")
    private String prepalin;

    @ApiModelProperty("维生素e(α-e)（毫克）")
    private String vitaminEAe;

    @ApiModelProperty("维生素e (β+γ)-e")
    private String vitaminEBy;

    @ApiModelProperty("维生素e (δ-e)")
    private String vitaminEQe;

    @ApiModelProperty("嘌呤")
    private String purine;

    @ApiModelProperty("助记码")
    private String inputCode;

    @ApiModelProperty("旧编码")
    private String oldCode;

    @ApiModelProperty("地区")
    private String area;

    @ApiModelProperty("编码")
    private String foodCode;

    @ApiModelProperty("食物类型编码")
    private String foodTypeCode;

    @ApiModelProperty("食物类型名称")
    private String foodTypeName;

    private String foodPreUnit;

    @ApiModelProperty("食物单位")
    private String foodUnit;

    private String cholin;

    private String panto;

    @ApiModelProperty("维生素k")
    private String vitk;

    @ApiModelProperty("维生素d")
    private String vitd;

    @ApiModelProperty("维生素b6")
    private String vitb6;

    @ApiModelProperty("维生素b12")
    private String vitb12;

    private String f24c;

    private String f24c1;

    private String f18c4;

    private String bio;

    private String sourceType;

    @ApiModelProperty("备用列1")
    private String cmdField1;

    @ApiModelProperty("备用列2")
    private String cmdField2;

    @ApiModelProperty("备用列3")
    private String cmdField3;

    @ApiModelProperty("备用列4")
    private String cmdField4;

    @ApiModelProperty("备用列5")
    private String cmdField5;

    private String cr;

    @ApiModelProperty("糖尿病食物")
    private String glycuresisFood;

    @ApiModelProperty("糖尿病食物重量")
    private String glycuresisFoodWeight;

    @ApiModelProperty("糖尿病食物重量描述")
    private String gFDescribe;

    private String fos;

    private String helpCode;

    private String wpc;

    private String wpci;

    private String wpcs;

    private String cs;

    private String glnl;

    private String mct;

    private String lct;

    private String vitb5;

    private String ci;

    private String carnitine;

    @ApiModelProperty("牛黄酸(mg)")
    private String taurine;

    @ApiModelProperty("肌醇(mg)")
    private String inositol;

    private String gln;

    private String choline;

    private String pc;

    private String dha;

    private String nucleotide;

    private String mo;

    @ApiModelProperty("是否优质蛋白质(1是，0否)")
    private String isGoodProtein;

    private String cl;

    private String creatine;

    private String scfa;

    private String mcfa;

    private String lcfa;

    @ApiModelProperty("生熟折算系数")
    private String reduced;

    private String unit;

    private String unitWeight;

    @ApiModelProperty("0.否 1.常用 2.正常")
    private String isUse;

    private String weight;

    private String useReduced;

    @ApiModelProperty("规格")
    private String specification;

    @ApiModelProperty("最小规格单位")
    private String weightUnit;

    @ApiModelProperty("最小规格单位价")
    private String weightUnitPrice;

    @ApiModelProperty("最小规格单位指导价")
    private String weightUnitGuidePrice;

    @ApiModelProperty("单位指导价")
    private String guidePrice;

    private String priceUnit;

    private String price;

    private String bca;

    private String bfe;

    private String bzn;

    private String bvita;

    private String bvitb1;

    private String bvitb2;

    private String bvitc;

    private String busp;

    private String bprotein;

    private String bfat;

    private String bcarbothdrate;

    private String bse;

    private String bzn6;

    private String bvite;

    private String bvitpp;

    private String bcu;

    private String bmn;

    private String bmg;

    private String bna;

    private String bk;

    private String bp;

    private String priceWeight;

    @ApiModelProperty("图片路径")
    private String foodImg;

    private BigDecimal zsxs;

    private String spec;

    private String usages;

    private String description;

    private String illustration;

    private String pricePurchase;

    private String weightUnitPricePurchase;

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
	 * 		
     */
    public Integer getfId() {
        return fId;
    }

    /**		
	 * 		
     */
    public void setfId(Integer fId) {
        this.fId = fId;
    }
    /**		
	 * 版本 2004,2009,2018,2019 		
     */
    public String getVersion() {
        return version;
    }

    /**		
	 * 版本 2004,2009,2018,2019 		
     */
    public void setVersion(String version) {
        this.version = version;
    }
    /**		
	 * 食物id		
     */
    public String getFoodId() {
        return foodId;
    }

    /**		
	 * 食物id		
     */
    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }
    /**		
	 * 食物名称		
     */
    public String getFoodName() {
        return foodName;
    }

    /**		
	 * 食物名称		
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    /**		
	 * 食部(可食用部分),市品的情况乘以该数再除以100 		
     */
    public String getDepartment() {
        return department;
    }

    /**		
	 * 食部(可食用部分),市品的情况乘以该数再除以100 		
     */
    public void setDepartment(String department) {
        this.department = department;
    }
    /**		
	 * 能量		
     */
    public String getEnergy() {
        return energy;
    }

    /**		
	 * 能量		
     */
    public void setEnergy(String energy) {
        this.energy = energy;
    }
    /**		
	 * 蛋白质		
     */
    public String getProtein() {
        return protein;
    }

    /**		
	 * 蛋白质		
     */
    public void setProtein(String protein) {
        this.protein = protein;
    }
    /**		
	 * 脂肪		
     */
    public String getFat() {
        return fat;
    }

    /**		
	 * 脂肪		
     */
    public void setFat(String fat) {
        this.fat = fat;
    }
    /**		
	 * 碳水化合物		
     */
    public String getCarbohydrate() {
        return carbohydrate;
    }

    /**		
	 * 碳水化合物		
     */
    public void setCarbohydrate(String carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
    /**		
	 * 膳食纤维		
     */
    public String getDf() {
        return df;
    }

    /**		
	 * 膳食纤维		
     */
    public void setDf(String df) {
        this.df = df;
    }
    /**		
	 * 钙		
     */
    public String getCa() {
        return ca;
    }

    /**		
	 * 钙		
     */
    public void setCa(String ca) {
        this.ca = ca;
    }
    /**		
	 * 铁		
     */
    public String getFe() {
        return fe;
    }

    /**		
	 * 铁		
     */
    public void setFe(String fe) {
        this.fe = fe;
    }
    /**		
	 * 锌		
     */
    public String getZn() {
        return zn;
    }

    /**		
	 * 锌		
     */
    public void setZn(String zn) {
        this.zn = zn;
    }
    /**		
	 * 硒		
     */
    public String getSe() {
        return se;
    }

    /**		
	 * 硒		
     */
    public void setSe(String se) {
        this.se = se;
    }
    /**		
	 * 铜		
     */
    public String getCu() {
        return cu;
    }

    /**		
	 * 铜		
     */
    public void setCu(String cu) {
        this.cu = cu;
    }
    /**		
	 * 锰		
     */
    public String getMn() {
        return mn;
    }

    /**		
	 * 锰		
     */
    public void setMn(String mn) {
        this.mn = mn;
    }
    /**		
	 * 镁		
     */
    public String getMg() {
        return mg;
    }

    /**		
	 * 镁		
     */
    public void setMg(String mg) {
        this.mg = mg;
    }
    /**		
	 * 钠		
     */
    public String getNa() {
        return na;
    }

    /**		
	 * 钠		
     */
    public void setNa(String na) {
        this.na = na;
    }
    /**		
	 * 钾		
     */
    public String getK() {
        return k;
    }

    /**		
	 * 钾		
     */
    public void setK(String k) {
        this.k = k;
    }
    /**		
	 * 磷		
     */
    public String getP() {
        return p;
    }

    /**		
	 * 磷		
     */
    public void setP(String p) {
        this.p = p;
    }
    /**		
	 * 视黄醇当量		
     */
    public String getVita() {
        return vita;
    }

    /**		
	 * 视黄醇当量		
     */
    public void setVita(String vita) {
        this.vita = vita;
    }
    /**		
	 * 维生素e		
     */
    public String getVite() {
        return vite;
    }

    /**		
	 * 维生素e		
     */
    public void setVite(String vite) {
        this.vite = vite;
    }
    /**		
	 * 维生素b1		
     */
    public String getVitb1() {
        return vitb1;
    }

    /**		
	 * 维生素b1		
     */
    public void setVitb1(String vitb1) {
        this.vitb1 = vitb1;
    }
    /**		
	 * 维生素b2		
     */
    public String getVitb2() {
        return vitb2;
    }

    /**		
	 * 维生素b2		
     */
    public void setVitb2(String vitb2) {
        this.vitb2 = vitb2;
    }
    /**		
	 * 维生素c		
     */
    public String getVitc() {
        return vitc;
    }

    /**		
	 * 维生素c		
     */
    public void setVitc(String vitc) {
        this.vitc = vitc;
    }
    /**		
	 * 烟酸		
     */
    public String getVitpp() {
        return vitpp;
    }

    /**		
	 * 烟酸		
     */
    public void setVitpp(String vitpp) {
        this.vitpp = vitpp;
    }
    /**		
	 * 天冬氨酸		
     */
    public String getAsp() {
        return asp;
    }

    /**		
	 * 天冬氨酸		
     */
    public void setAsp(String asp) {
        this.asp = asp;
    }
    /**		
	 * 苏氨酸（毫克）		
     */
    public String getThr() {
        return thr;
    }

    /**		
	 * 苏氨酸（毫克）		
     */
    public void setThr(String thr) {
        this.thr = thr;
    }
    /**		
	 * 丝氨酸（毫克）		
     */
    public String getSer() {
        return ser;
    }

    /**		
	 * 丝氨酸（毫克）		
     */
    public void setSer(String ser) {
        this.ser = ser;
    }
    /**		
	 * 谷氨酸（毫克）		
     */
    public String getGlu() {
        return glu;
    }

    /**		
	 * 谷氨酸（毫克）		
     */
    public void setGlu(String glu) {
        this.glu = glu;
    }
    /**		
	 * 脯氨酸（毫克）		
     */
    public String getPro() {
        return pro;
    }

    /**		
	 * 脯氨酸（毫克）		
     */
    public void setPro(String pro) {
        this.pro = pro;
    }
    /**		
	 * 甘氨酸（毫克）		
     */
    public String getGly() {
        return gly;
    }

    /**		
	 * 甘氨酸（毫克）		
     */
    public void setGly(String gly) {
        this.gly = gly;
    }
    /**		
	 * 丙氨酸（毫克）		
     */
    public String getAla() {
        return ala;
    }

    /**		
	 * 丙氨酸（毫克）		
     */
    public void setAla(String ala) {
        this.ala = ala;
    }
    /**		
	 * 胱氨酸（毫克）		
     */
    public String getCys() {
        return cys;
    }

    /**		
	 * 胱氨酸（毫克）		
     */
    public void setCys(String cys) {
        this.cys = cys;
    }
    /**		
	 * 缬氨酸（毫克）		
     */
    public String getVal() {
        return val;
    }

    /**		
	 * 缬氨酸（毫克）		
     */
    public void setVal(String val) {
        this.val = val;
    }
    /**		
	 * 蛋氨酸（毫克）		
     */
    public String getMet() {
        return met;
    }

    /**		
	 * 蛋氨酸（毫克）		
     */
    public void setMet(String met) {
        this.met = met;
    }
    /**		
	 * 异亮氨酸（毫克）		
     */
    public String getIle() {
        return ile;
    }

    /**		
	 * 异亮氨酸（毫克）		
     */
    public void setIle(String ile) {
        this.ile = ile;
    }
    /**		
	 * 亮氨酸（毫克）		
     */
    public String getLeu() {
        return leu;
    }

    /**		
	 * 亮氨酸（毫克）		
     */
    public void setLeu(String leu) {
        this.leu = leu;
    }
    /**		
	 * 酪氨酸（毫克）		
     */
    public String getTyr() {
        return tyr;
    }

    /**		
	 * 酪氨酸（毫克）		
     */
    public void setTyr(String tyr) {
        this.tyr = tyr;
    }
    /**		
	 * 苯丙氨酸（毫克）		
     */
    public String getPhe() {
        return phe;
    }

    /**		
	 * 苯丙氨酸（毫克）		
     */
    public void setPhe(String phe) {
        this.phe = phe;
    }
    /**		
	 * 赖氨酸（毫克）		
     */
    public String getLys() {
        return lys;
    }

    /**		
	 * 赖氨酸（毫克）		
     */
    public void setLys(String lys) {
        this.lys = lys;
    }
    /**		
	 * 组氨酸（毫克）		
     */
    public String getHis() {
        return his;
    }

    /**		
	 * 组氨酸（毫克）		
     */
    public void setHis(String his) {
        this.his = his;
    }
    /**		
	 * 精氨酸（毫克）		
     */
    public String getArg() {
        return arg;
    }

    /**		
	 * 精氨酸（毫克）		
     */
    public void setArg(String arg) {
        this.arg = arg;
    }
    /**		
	 * 色氨酸（毫克）		
     */
    public String getTrp() {
        return trp;
    }

    /**		
	 * 色氨酸（毫克）		
     */
    public void setTrp(String trp) {
        this.trp = trp;
    }
    /**		
	 * c6:0（%）		
     */
    public String getf6c() {
        return f6c;
    }

    /**		
	 * c6:0（%）		
     */
    public void setf6c(String f6c) {
        this.f6c = f6c;
    }
    /**		
	 * c8:0（%）		
     */
    public String getf8c() {
        return f8c;
    }

    /**		
	 * c8:0（%）		
     */
    public void setf8c(String f8c) {
        this.f8c = f8c;
    }
    /**		
	 * c10:0（%）		
     */
    public String getf10c() {
        return f10c;
    }

    /**		
	 * c10:0（%）		
     */
    public void setf10c(String f10c) {
        this.f10c = f10c;
    }
    /**		
	 * c11:0（%）		
     */
    public String getf11c() {
        return f11c;
    }

    /**		
	 * c11:0（%）		
     */
    public void setf11c(String f11c) {
        this.f11c = f11c;
    }
    /**		
	 * c12:0（%）		
     */
    public String getf12c() {
        return f12c;
    }

    /**		
	 * c12:0（%）		
     */
    public void setf12c(String f12c) {
        this.f12c = f12c;
    }
    /**		
	 * c13:0（%）		
     */
    public String getf13c() {
        return f13c;
    }

    /**		
	 * c13:0（%）		
     */
    public void setf13c(String f13c) {
        this.f13c = f13c;
    }
    /**		
	 * c14:0（%）		
     */
    public String getf14c() {
        return f14c;
    }

    /**		
	 * c14:0（%）		
     */
    public void setf14c(String f14c) {
        this.f14c = f14c;
    }
    /**		
	 * c14:1（%）		
     */
    public String getf14c1() {
        return f14c1;
    }

    /**		
	 * c14:1（%）		
     */
    public void setf14c1(String f14c1) {
        this.f14c1 = f14c1;
    }
    /**		
	 * c14:0（%）		
     */
    public String getf15c() {
        return f15c;
    }

    /**		
	 * c14:0（%）		
     */
    public void setf15c(String f15c) {
        this.f15c = f15c;
    }
    /**		
	 * c14:1（%）		
     */
    public String getf15c1() {
        return f15c1;
    }

    /**		
	 * c14:1（%）		
     */
    public void setf15c1(String f15c1) {
        this.f15c1 = f15c1;
    }
    /**		
	 * c16:0（%）		
     */
    public String getf16c() {
        return f16c;
    }

    /**		
	 * c16:0（%）		
     */
    public void setf16c(String f16c) {
        this.f16c = f16c;
    }
    /**		
	 * c16:1（%）		
     */
    public String getf16c1() {
        return f16c1;
    }

    /**		
	 * c16:1（%）		
     */
    public void setf16c1(String f16c1) {
        this.f16c1 = f16c1;
    }
    /**		
	 * c16:2（%）		
     */
    public String getf16c2() {
        return f16c2;
    }

    /**		
	 * c16:2（%）		
     */
    public void setf16c2(String f16c2) {
        this.f16c2 = f16c2;
    }
    /**		
	 * c17:1（%）		
     */
    public String getf17c1() {
        return f17c1;
    }

    /**		
	 * c17:1（%）		
     */
    public void setf17c1(String f17c1) {
        this.f17c1 = f17c1;
    }
    /**		
	 * c17:0（%）		
     */
    public String getf17c() {
        return f17c;
    }

    /**		
	 * c17:0（%）		
     */
    public void setf17c(String f17c) {
        this.f17c = f17c;
    }
    /**		
	 * c18:0（%）		
     */
    public String getf18c() {
        return f18c;
    }

    /**		
	 * c18:0（%）		
     */
    public void setf18c(String f18c) {
        this.f18c = f18c;
    }
    /**		
	 * c18:1（%）		
     */
    public String getf18c1() {
        return f18c1;
    }

    /**		
	 * c18:1（%）		
     */
    public void setf18c1(String f18c1) {
        this.f18c1 = f18c1;
    }
    /**		
	 * c18:2（%）亚油酸(mg)		
     */
    public String getf18c2() {
        return f18c2;
    }

    /**		
	 * c18:2（%）亚油酸(mg)		
     */
    public void setf18c2(String f18c2) {
        this.f18c2 = f18c2;
    }
    /**		
	 * c18:3（%）		
     */
    public String getf18c3() {
        return f18c3;
    }

    /**		
	 * c18:3（%）		
     */
    public void setf18c3(String f18c3) {
        this.f18c3 = f18c3;
    }
    /**		
	 * c19:0（%）		
     */
    public String getf19c() {
        return f19c;
    }

    /**		
	 * c19:0（%）		
     */
    public void setf19c(String f19c) {
        this.f19c = f19c;
    }
    /**		
	 * c20:0（%）		
     */
    public String getf20c() {
        return f20c;
    }

    /**		
	 * c20:0（%）		
     */
    public void setf20c(String f20c) {
        this.f20c = f20c;
    }
    /**		
	 * c20:1（%）		
     */
    public String getf20c1() {
        return f20c1;
    }

    /**		
	 * c20:1（%）		
     */
    public void setf20c1(String f20c1) {
        this.f20c1 = f20c1;
    }
    /**		
	 * c20:2（%）		
     */
    public String getf20c2() {
        return f20c2;
    }

    /**		
	 * c20:2（%）		
     */
    public void setf20c2(String f20c2) {
        this.f20c2 = f20c2;
    }
    /**		
	 * c20:3（%）		
     */
    public String getf20c3() {
        return f20c3;
    }

    /**		
	 * c20:3（%）		
     */
    public void setf20c3(String f20c3) {
        this.f20c3 = f20c3;
    }
    /**		
	 * c20:4（%）花生四烯酸(mg)		
     */
    public String getf20c4() {
        return f20c4;
    }

    /**		
	 * c20:4（%）花生四烯酸(mg)		
     */
    public void setf20c4(String f20c4) {
        this.f20c4 = f20c4;
    }
    /**		
	 * c20:5（%）		
     */
    public String getf20c5() {
        return f20c5;
    }

    /**		
	 * c20:5（%）		
     */
    public void setf20c5(String f20c5) {
        this.f20c5 = f20c5;
    }
    /**		
	 * c22:0（%）		
     */
    public String getf22c() {
        return f22c;
    }

    /**		
	 * c22:0（%）		
     */
    public void setf22c(String f22c) {
        this.f22c = f22c;
    }
    /**		
	 * c22:1（%）		
     */
    public String getf22c1() {
        return f22c1;
    }

    /**		
	 * c22:1（%）		
     */
    public void setf22c1(String f22c1) {
        this.f22c1 = f22c1;
    }
    /**		
	 * c22:2（%）		
     */
    public String getf22c3() {
        return f22c3;
    }

    /**		
	 * c22:2（%）		
     */
    public void setf22c3(String f22c3) {
        this.f22c3 = f22c3;
    }
    /**		
	 * c22:3（%）		
     */
    public String getf22c4() {
        return f22c4;
    }

    /**		
	 * c22:3（%）		
     */
    public void setf22c4(String f22c4) {
        this.f22c4 = f22c4;
    }
    /**		
	 * c22:4（%）		
     */
    public String getf22c5() {
        return f22c5;
    }

    /**		
	 * c22:4（%）		
     */
    public void setf22c5(String f22c5) {
        this.f22c5 = f22c5;
    }
    /**		
	 * c22:5（%）二十二碳六烯酸(mg)		
     */
    public String getf22c6() {
        return f22c6;
    }

    /**		
	 * c22:5（%）二十二碳六烯酸(mg)		
     */
    public void setf22c6(String f22c6) {
        this.f22c6 = f22c6;
    }
    /**		
	 * 未知（%）		
     */
    public String getUnknownpercent() {
        return unknownpercent;
    }

    /**		
	 * 未知（%）		
     */
    public void setUnknownpercent(String unknownpercent) {
        this.unknownpercent = unknownpercent;
    }
    /**		
	 * c18:3a		
     */
    public String getf18c3a() {
        return f18c3a;
    }

    /**		
	 * c18:3a		
     */
    public void setf18c3a(String f18c3a) {
        this.f18c3a = f18c3a;
    }
    /**		
	 * c18:3r		
     */
    public String getf18c3r() {
        return f18c3r;
    }

    /**		
	 * c18:3r		
     */
    public void setf18c3r(String f18c3r) {
        this.f18c3r = f18c3r;
    }
    /**		
	 * 胆固醇（毫克）		
     */
    public String getCho() {
        return cho;
    }

    /**		
	 * 胆固醇（毫克）		
     */
    public void setCho(String cho) {
        this.cho = cho;
    }
    /**		
	 * 水（克）		
     */
    public String getWater() {
        return water;
    }

    /**		
	 * 水（克）		
     */
    public void setWater(String water) {
        this.water = water;
    }
    /**		
	 * 饱和(sfa)（克）		
     */
    public String getSfa() {
        return sfa;
    }

    /**		
	 * 饱和(sfa)（克）		
     */
    public void setSfa(String sfa) {
        this.sfa = sfa;
    }
    /**		
	 * 叶酸		
     */
    public String getUsp() {
        return usp;
    }

    /**		
	 * 叶酸		
     */
    public void setUsp(String usp) {
        this.usp = usp;
    }
    /**		
	 * 碘(i) （微克）		
     */
    public String getI() {
        return i;
    }

    /**		
	 * 碘(i) （微克）		
     */
    public void setI(String i) {
        this.i = i;
    }
    /**		
	 * 灰分（克）		
     */
    public String getAsh() {
        return ash;
    }

    /**		
	 * 灰分（克）		
     */
    public void setAsh(String ash) {
        this.ash = ash;
    }
    /**		
	 * 血糖生成指数		
     */
    public String getGi() {
        return gi;
    }

    /**		
	 * 血糖生成指数		
     */
    public void setGi(String gi) {
        this.gi = gi;
    }
    /**		
	 * 单不饱和(mufa)（克）		
     */
    public String getMufa() {
        return mufa;
    }

    /**		
	 * 单不饱和(mufa)（克）		
     */
    public void setMufa(String mufa) {
        this.mufa = mufa;
    }
    /**		
	 * 多不饱和(pufa)（克）		
     */
    public String getPufa() {
        return pufa;
    }

    /**		
	 * 多不饱和(pufa)（克）		
     */
    public void setPufa(String pufa) {
        this.pufa = pufa;
    }
    /**		
	 * 未知（克）		
     */
    public String getUnknowngram() {
        return unknowngram;
    }

    /**		
	 * 未知（克）		
     */
    public void setUnknowngram(String unknowngram) {
        this.unknowngram = unknowngram;
    }
    /**		
	 * 胡萝卜素（微克）		
     */
    public String getRenieratene() {
        return renieratene;
    }

    /**		
	 * 胡萝卜素（微克）		
     */
    public void setRenieratene(String renieratene) {
        this.renieratene = renieratene;
    }
    /**		
	 * 视黄醇（微克）		
     */
    public String getPrepalin() {
        return prepalin;
    }

    /**		
	 * 视黄醇（微克）		
     */
    public void setPrepalin(String prepalin) {
        this.prepalin = prepalin;
    }
    /**		
	 * 维生素e(α-e)（毫克）		
     */
    public String getVitaminEAe() {
        return vitaminEAe;
    }

    /**		
	 * 维生素e(α-e)（毫克）		
     */
    public void setVitaminEAe(String vitaminEAe) {
        this.vitaminEAe = vitaminEAe;
    }
    /**		
	 * 维生素e (β+γ)-e		
     */
    public String getVitaminEBy() {
        return vitaminEBy;
    }

    /**		
	 * 维生素e (β+γ)-e		
     */
    public void setVitaminEBy(String vitaminEBy) {
        this.vitaminEBy = vitaminEBy;
    }
    /**		
	 * 维生素e (δ-e)		
     */
    public String getVitaminEQe() {
        return vitaminEQe;
    }

    /**		
	 * 维生素e (δ-e)		
     */
    public void setVitaminEQe(String vitaminEQe) {
        this.vitaminEQe = vitaminEQe;
    }
    /**		
	 * 嘌呤		
     */
    public String getPurine() {
        return purine;
    }

    /**		
	 * 嘌呤		
     */
    public void setPurine(String purine) {
        this.purine = purine;
    }
    /**		
	 * 助记码		
     */
    public String getInputCode() {
        return inputCode;
    }

    /**		
	 * 助记码		
     */
    public void setInputCode(String inputCode) {
        this.inputCode = inputCode;
    }
    /**		
	 * 旧编码		
     */
    public String getOldCode() {
        return oldCode;
    }

    /**		
	 * 旧编码		
     */
    public void setOldCode(String oldCode) {
        this.oldCode = oldCode;
    }
    /**		
	 * 地区		
     */
    public String getArea() {
        return area;
    }

    /**		
	 * 地区		
     */
    public void setArea(String area) {
        this.area = area;
    }
    /**		
	 * 编码		
     */
    public String getFoodCode() {
        return foodCode;
    }

    /**		
	 * 编码		
     */
    public void setFoodCode(String foodCode) {
        this.foodCode = foodCode;
    }
    /**		
	 * 食物类型编码		
     */
    public String getFoodTypeCode() {
        return foodTypeCode;
    }

    /**		
	 * 食物类型编码		
     */
    public void setFoodTypeCode(String foodTypeCode) {
        this.foodTypeCode = foodTypeCode;
    }
    /**		
	 * 食物类型名称		
     */
    public String getFoodTypeName() {
        return foodTypeName;
    }

    /**		
	 * 食物类型名称		
     */
    public void setFoodTypeName(String foodTypeName) {
        this.foodTypeName = foodTypeName;
    }
    /**		
	 * 		
     */
    public String getFoodPreUnit() {
        return foodPreUnit;
    }

    /**		
	 * 		
     */
    public void setFoodPreUnit(String foodPreUnit) {
        this.foodPreUnit = foodPreUnit;
    }
    /**		
	 * 食物单位		
     */
    public String getFoodUnit() {
        return foodUnit;
    }

    /**		
	 * 食物单位		
     */
    public void setFoodUnit(String foodUnit) {
        this.foodUnit = foodUnit;
    }
    /**		
	 * 		
     */
    public String getCholin() {
        return cholin;
    }

    /**		
	 * 		
     */
    public void setCholin(String cholin) {
        this.cholin = cholin;
    }
    /**		
	 * 		
     */
    public String getPanto() {
        return panto;
    }

    /**		
	 * 		
     */
    public void setPanto(String panto) {
        this.panto = panto;
    }
    /**		
	 * 维生素k		
     */
    public String getVitk() {
        return vitk;
    }

    /**		
	 * 维生素k		
     */
    public void setVitk(String vitk) {
        this.vitk = vitk;
    }
    /**		
	 * 维生素d		
     */
    public String getVitd() {
        return vitd;
    }

    /**		
	 * 维生素d		
     */
    public void setVitd(String vitd) {
        this.vitd = vitd;
    }
    /**		
	 * 维生素b6		
     */
    public String getVitb6() {
        return vitb6;
    }

    /**		
	 * 维生素b6		
     */
    public void setVitb6(String vitb6) {
        this.vitb6 = vitb6;
    }
    /**		
	 * 维生素b12		
     */
    public String getVitb12() {
        return vitb12;
    }

    /**		
	 * 维生素b12		
     */
    public void setVitb12(String vitb12) {
        this.vitb12 = vitb12;
    }
    /**		
	 * 		
     */
    public String getf24c() {
        return f24c;
    }

    /**		
	 * 		
     */
    public void setf24c(String f24c) {
        this.f24c = f24c;
    }
    /**		
	 * 		
     */
    public String getf24c1() {
        return f24c1;
    }

    /**		
	 * 		
     */
    public void setf24c1(String f24c1) {
        this.f24c1 = f24c1;
    }
    /**		
	 * 		
     */
    public String getf18c4() {
        return f18c4;
    }

    /**		
	 * 		
     */
    public void setf18c4(String f18c4) {
        this.f18c4 = f18c4;
    }
    /**		
	 * 		
     */
    public String getBio() {
        return bio;
    }

    /**		
	 * 		
     */
    public void setBio(String bio) {
        this.bio = bio;
    }
    /**		
	 * 		
     */
    public String getSourceType() {
        return sourceType;
    }

    /**		
	 * 		
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
    /**		
	 * 备用列1		
     */
    public String getCmdField1() {
        return cmdField1;
    }

    /**		
	 * 备用列1		
     */
    public void setCmdField1(String cmdField1) {
        this.cmdField1 = cmdField1;
    }
    /**		
	 * 备用列2		
     */
    public String getCmdField2() {
        return cmdField2;
    }

    /**		
	 * 备用列2		
     */
    public void setCmdField2(String cmdField2) {
        this.cmdField2 = cmdField2;
    }
    /**		
	 * 备用列3		
     */
    public String getCmdField3() {
        return cmdField3;
    }

    /**		
	 * 备用列3		
     */
    public void setCmdField3(String cmdField3) {
        this.cmdField3 = cmdField3;
    }
    /**		
	 * 备用列4		
     */
    public String getCmdField4() {
        return cmdField4;
    }

    /**		
	 * 备用列4		
     */
    public void setCmdField4(String cmdField4) {
        this.cmdField4 = cmdField4;
    }
    /**		
	 * 备用列5		
     */
    public String getCmdField5() {
        return cmdField5;
    }

    /**		
	 * 备用列5		
     */
    public void setCmdField5(String cmdField5) {
        this.cmdField5 = cmdField5;
    }
    /**		
	 * 		
     */
    public String getCr() {
        return cr;
    }

    /**		
	 * 		
     */
    public void setCr(String cr) {
        this.cr = cr;
    }
    /**		
	 * 糖尿病食物		
     */
    public String getGlycuresisFood() {
        return glycuresisFood;
    }

    /**		
	 * 糖尿病食物		
     */
    public void setGlycuresisFood(String glycuresisFood) {
        this.glycuresisFood = glycuresisFood;
    }
    /**		
	 * 糖尿病食物重量		
     */
    public String getGlycuresisFoodWeight() {
        return glycuresisFoodWeight;
    }

    /**		
	 * 糖尿病食物重量		
     */
    public void setGlycuresisFoodWeight(String glycuresisFoodWeight) {
        this.glycuresisFoodWeight = glycuresisFoodWeight;
    }
    /**		
	 * 糖尿病食物重量描述		
     */
    public String getgFDescribe() {
        return gFDescribe;
    }

    /**		
	 * 糖尿病食物重量描述		
     */
    public void setgFDescribe(String gFDescribe) {
        this.gFDescribe = gFDescribe;
    }
    /**		
	 * 		
     */
    public String getFos() {
        return fos;
    }

    /**		
	 * 		
     */
    public void setFos(String fos) {
        this.fos = fos;
    }
    /**		
	 * 		
     */
    public String getHelpCode() {
        return helpCode;
    }

    /**		
	 * 		
     */
    public void setHelpCode(String helpCode) {
        this.helpCode = helpCode;
    }
    /**		
	 * 		
     */
    public String getWpc() {
        return wpc;
    }

    /**		
	 * 		
     */
    public void setWpc(String wpc) {
        this.wpc = wpc;
    }
    /**		
	 * 		
     */
    public String getWpci() {
        return wpci;
    }

    /**		
	 * 		
     */
    public void setWpci(String wpci) {
        this.wpci = wpci;
    }
    /**		
	 * 		
     */
    public String getWpcs() {
        return wpcs;
    }

    /**		
	 * 		
     */
    public void setWpcs(String wpcs) {
        this.wpcs = wpcs;
    }
    /**		
	 * 		
     */
    public String getCs() {
        return cs;
    }

    /**		
	 * 		
     */
    public void setCs(String cs) {
        this.cs = cs;
    }
    /**		
	 * 		
     */
    public String getGlnl() {
        return glnl;
    }

    /**		
	 * 		
     */
    public void setGlnl(String glnl) {
        this.glnl = glnl;
    }
    /**		
	 * 		
     */
    public String getMct() {
        return mct;
    }

    /**		
	 * 		
     */
    public void setMct(String mct) {
        this.mct = mct;
    }
    /**		
	 * 		
     */
    public String getLct() {
        return lct;
    }

    /**		
	 * 		
     */
    public void setLct(String lct) {
        this.lct = lct;
    }
    /**		
	 * 		
     */
    public String getVitb5() {
        return vitb5;
    }

    /**		
	 * 		
     */
    public void setVitb5(String vitb5) {
        this.vitb5 = vitb5;
    }
    /**		
	 * 		
     */
    public String getCi() {
        return ci;
    }

    /**		
	 * 		
     */
    public void setCi(String ci) {
        this.ci = ci;
    }
    /**		
	 * 		
     */
    public String getCarnitine() {
        return carnitine;
    }

    /**		
	 * 		
     */
    public void setCarnitine(String carnitine) {
        this.carnitine = carnitine;
    }
    /**		
	 * 牛黄酸(mg)		
     */
    public String getTaurine() {
        return taurine;
    }

    /**		
	 * 牛黄酸(mg)		
     */
    public void setTaurine(String taurine) {
        this.taurine = taurine;
    }
    /**		
	 * 肌醇(mg)		
     */
    public String getInositol() {
        return inositol;
    }

    /**		
	 * 肌醇(mg)		
     */
    public void setInositol(String inositol) {
        this.inositol = inositol;
    }
    /**		
	 * 		
     */
    public String getGln() {
        return gln;
    }

    /**		
	 * 		
     */
    public void setGln(String gln) {
        this.gln = gln;
    }
    /**		
	 * 		
     */
    public String getCholine() {
        return choline;
    }

    /**		
	 * 		
     */
    public void setCholine(String choline) {
        this.choline = choline;
    }
    /**		
	 * 		
     */
    public String getPc() {
        return pc;
    }

    /**		
	 * 		
     */
    public void setPc(String pc) {
        this.pc = pc;
    }
    /**		
	 * 		
     */
    public String getDha() {
        return dha;
    }

    /**		
	 * 		
     */
    public void setDha(String dha) {
        this.dha = dha;
    }
    /**		
	 * 		
     */
    public String getNucleotide() {
        return nucleotide;
    }

    /**		
	 * 		
     */
    public void setNucleotide(String nucleotide) {
        this.nucleotide = nucleotide;
    }
    /**		
	 * 		
     */
    public String getMo() {
        return mo;
    }

    /**		
	 * 		
     */
    public void setMo(String mo) {
        this.mo = mo;
    }
    /**		
	 * 是否优质蛋白质(1是，0否)		
     */
    public String getIsGoodProtein() {
        return isGoodProtein;
    }

    /**		
	 * 是否优质蛋白质(1是，0否)		
     */
    public void setIsGoodProtein(String isGoodProtein) {
        this.isGoodProtein = isGoodProtein;
    }
    /**		
	 * 		
     */
    public String getCl() {
        return cl;
    }

    /**		
	 * 		
     */
    public void setCl(String cl) {
        this.cl = cl;
    }
    /**		
	 * 		
     */
    public String getCreatine() {
        return creatine;
    }

    /**		
	 * 		
     */
    public void setCreatine(String creatine) {
        this.creatine = creatine;
    }
    /**		
	 * 		
     */
    public String getScfa() {
        return scfa;
    }

    /**		
	 * 		
     */
    public void setScfa(String scfa) {
        this.scfa = scfa;
    }
    /**		
	 * 		
     */
    public String getMcfa() {
        return mcfa;
    }

    /**		
	 * 		
     */
    public void setMcfa(String mcfa) {
        this.mcfa = mcfa;
    }
    /**		
	 * 		
     */
    public String getLcfa() {
        return lcfa;
    }

    /**		
	 * 		
     */
    public void setLcfa(String lcfa) {
        this.lcfa = lcfa;
    }
    /**		
	 * 生熟折算系数		
     */
    public String getReduced() {
        return reduced;
    }

    /**		
	 * 生熟折算系数		
     */
    public void setReduced(String reduced) {
        this.reduced = reduced;
    }
    /**		
	 * 		
     */
    public String getUnit() {
        return unit;
    }

    /**		
	 * 		
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }
    /**		
	 * 		
     */
    public String getUnitWeight() {
        return unitWeight;
    }

    /**		
	 * 		
     */
    public void setUnitWeight(String unitWeight) {
        this.unitWeight = unitWeight;
    }
    /**		
	 * 0.否 1.常用 2.正常		
     */
    public String getIsUse() {
        return isUse;
    }

    /**		
	 * 0.否 1.常用 2.正常		
     */
    public void setIsUse(String isUse) {
        this.isUse = isUse;
    }
    /**		
	 * 		
     */
    public String getWeight() {
        return weight;
    }

    /**		
	 * 		
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }
    /**		
	 * 		
     */
    public String getUseReduced() {
        return useReduced;
    }

    /**		
	 * 		
     */
    public void setUseReduced(String useReduced) {
        this.useReduced = useReduced;
    }
    /**		
	 * 规格		
     */
    public String getSpecification() {
        return specification;
    }

    /**		
	 * 规格		
     */
    public void setSpecification(String specification) {
        this.specification = specification;
    }
    /**		
	 * 最小规格单位		
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**		
	 * 最小规格单位		
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }
    /**		
	 * 最小规格单位价		
     */
    public String getWeightUnitPrice() {
        return weightUnitPrice;
    }

    /**		
	 * 最小规格单位价		
     */
    public void setWeightUnitPrice(String weightUnitPrice) {
        this.weightUnitPrice = weightUnitPrice;
    }
    /**		
	 * 最小规格单位指导价		
     */
    public String getWeightUnitGuidePrice() {
        return weightUnitGuidePrice;
    }

    /**		
	 * 最小规格单位指导价		
     */
    public void setWeightUnitGuidePrice(String weightUnitGuidePrice) {
        this.weightUnitGuidePrice = weightUnitGuidePrice;
    }
    /**		
	 * 单位指导价		
     */
    public String getGuidePrice() {
        return guidePrice;
    }

    /**		
	 * 单位指导价		
     */
    public void setGuidePrice(String guidePrice) {
        this.guidePrice = guidePrice;
    }
    /**		
	 * 		
     */
    public String getPriceUnit() {
        return priceUnit;
    }

    /**		
	 * 		
     */
    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
    }
    /**		
	 * 		
     */
    public String getPrice() {
        return price;
    }

    /**		
	 * 		
     */
    public void setPrice(String price) {
        this.price = price;
    }
    /**		
	 * 		
     */
    public String getBca() {
        return bca;
    }

    /**		
	 * 		
     */
    public void setBca(String bca) {
        this.bca = bca;
    }
    /**		
	 * 		
     */
    public String getBfe() {
        return bfe;
    }

    /**		
	 * 		
     */
    public void setBfe(String bfe) {
        this.bfe = bfe;
    }
    /**		
	 * 		
     */
    public String getBzn() {
        return bzn;
    }

    /**		
	 * 		
     */
    public void setBzn(String bzn) {
        this.bzn = bzn;
    }
    /**		
	 * 		
     */
    public String getBvita() {
        return bvita;
    }

    /**		
	 * 		
     */
    public void setBvita(String bvita) {
        this.bvita = bvita;
    }
    /**		
	 * 		
     */
    public String getBvitb1() {
        return bvitb1;
    }

    /**		
	 * 		
     */
    public void setBvitb1(String bvitb1) {
        this.bvitb1 = bvitb1;
    }
    /**		
	 * 		
     */
    public String getBvitb2() {
        return bvitb2;
    }

    /**		
	 * 		
     */
    public void setBvitb2(String bvitb2) {
        this.bvitb2 = bvitb2;
    }
    /**		
	 * 		
     */
    public String getBvitc() {
        return bvitc;
    }

    /**		
	 * 		
     */
    public void setBvitc(String bvitc) {
        this.bvitc = bvitc;
    }
    /**		
	 * 		
     */
    public String getBusp() {
        return busp;
    }

    /**		
	 * 		
     */
    public void setBusp(String busp) {
        this.busp = busp;
    }
    /**		
	 * 		
     */
    public String getBprotein() {
        return bprotein;
    }

    /**		
	 * 		
     */
    public void setBprotein(String bprotein) {
        this.bprotein = bprotein;
    }
    /**		
	 * 		
     */
    public String getBfat() {
        return bfat;
    }

    /**		
	 * 		
     */
    public void setBfat(String bfat) {
        this.bfat = bfat;
    }
    /**		
	 * 		
     */
    public String getBcarbothdrate() {
        return bcarbothdrate;
    }

    /**		
	 * 		
     */
    public void setBcarbothdrate(String bcarbothdrate) {
        this.bcarbothdrate = bcarbothdrate;
    }
    /**		
	 * 		
     */
    public String getBse() {
        return bse;
    }

    /**		
	 * 		
     */
    public void setBse(String bse) {
        this.bse = bse;
    }
    /**		
	 * 		
     */
    public String getBzn6() {
        return bzn6;
    }

    /**		
	 * 		
     */
    public void setBzn6(String bzn6) {
        this.bzn6 = bzn6;
    }
    /**		
	 * 		
     */
    public String getBvite() {
        return bvite;
    }

    /**		
	 * 		
     */
    public void setBvite(String bvite) {
        this.bvite = bvite;
    }
    /**		
	 * 		
     */
    public String getBvitpp() {
        return bvitpp;
    }

    /**		
	 * 		
     */
    public void setBvitpp(String bvitpp) {
        this.bvitpp = bvitpp;
    }
    /**		
	 * 		
     */
    public String getBcu() {
        return bcu;
    }

    /**		
	 * 		
     */
    public void setBcu(String bcu) {
        this.bcu = bcu;
    }
    /**		
	 * 		
     */
    public String getBmn() {
        return bmn;
    }

    /**		
	 * 		
     */
    public void setBmn(String bmn) {
        this.bmn = bmn;
    }
    /**		
	 * 		
     */
    public String getBmg() {
        return bmg;
    }

    /**		
	 * 		
     */
    public void setBmg(String bmg) {
        this.bmg = bmg;
    }
    /**		
	 * 		
     */
    public String getBna() {
        return bna;
    }

    /**		
	 * 		
     */
    public void setBna(String bna) {
        this.bna = bna;
    }
    /**		
	 * 		
     */
    public String getBk() {
        return bk;
    }

    /**		
	 * 		
     */
    public void setBk(String bk) {
        this.bk = bk;
    }
    /**		
	 * 		
     */
    public String getBp() {
        return bp;
    }

    /**		
	 * 		
     */
    public void setBp(String bp) {
        this.bp = bp;
    }
    /**		
	 * 		
     */
    public String getPriceWeight() {
        return priceWeight;
    }

    /**		
	 * 		
     */
    public void setPriceWeight(String priceWeight) {
        this.priceWeight = priceWeight;
    }
    /**		
	 * 图片路径		
     */
    public String getFoodImg() {
        return foodImg;
    }

    /**		
	 * 图片路径		
     */
    public void setFoodImg(String foodImg) {
        this.foodImg = foodImg;
    }
    /**		
	 * 		
     */
    public BigDecimal getZsxs() {
        return zsxs;
    }

    /**		
	 * 		
     */
    public void setZsxs(BigDecimal zsxs) {
        this.zsxs = zsxs;
    }
    /**		
	 * 		
     */
    public String getSpec() {
        return spec;
    }

    /**		
	 * 		
     */
    public void setSpec(String spec) {
        this.spec = spec;
    }
    /**		
	 * 		
     */
    public String getUsages() {
        return usages;
    }

    /**		
	 * 		
     */
    public void setUsages(String usages) {
        this.usages = usages;
    }
    /**		
	 * 		
     */
    public String getDescription() {
        return description;
    }

    /**		
	 * 		
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**		
	 * 		
     */
    public String getIllustration() {
        return illustration;
    }

    /**		
	 * 		
     */
    public void setIllustration(String illustration) {
        this.illustration = illustration;
    }
    /**		
	 * 		
     */
    public String getPricePurchase() {
        return pricePurchase;
    }

    /**		
	 * 		
     */
    public void setPricePurchase(String pricePurchase) {
        this.pricePurchase = pricePurchase;
    }
    /**		
	 * 		
     */
    public String getWeightUnitPricePurchase() {
        return weightUnitPricePurchase;
    }

    /**		
	 * 		
     */
    public void setWeightUnitPricePurchase(String weightUnitPricePurchase) {
        this.weightUnitPricePurchase = weightUnitPricePurchase;
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
        return "SysFoodCopy2{" +
            "fId=" + fId +
            ", version=" + version +
            ", foodId=" + foodId +
            ", foodName=" + foodName +
            ", department=" + department +
            ", energy=" + energy +
            ", protein=" + protein +
            ", fat=" + fat +
            ", carbohydrate=" + carbohydrate +
            ", df=" + df +
            ", ca=" + ca +
            ", fe=" + fe +
            ", zn=" + zn +
            ", se=" + se +
            ", cu=" + cu +
            ", mn=" + mn +
            ", mg=" + mg +
            ", na=" + na +
            ", k=" + k +
            ", p=" + p +
            ", vita=" + vita +
            ", vite=" + vite +
            ", vitb1=" + vitb1 +
            ", vitb2=" + vitb2 +
            ", vitc=" + vitc +
            ", vitpp=" + vitpp +
            ", asp=" + asp +
            ", thr=" + thr +
            ", ser=" + ser +
            ", glu=" + glu +
            ", pro=" + pro +
            ", gly=" + gly +
            ", ala=" + ala +
            ", cys=" + cys +
            ", val=" + val +
            ", met=" + met +
            ", ile=" + ile +
            ", leu=" + leu +
            ", tyr=" + tyr +
            ", phe=" + phe +
            ", lys=" + lys +
            ", his=" + his +
            ", arg=" + arg +
            ", trp=" + trp +
            ", f6c=" + f6c +
            ", f8c=" + f8c +
            ", f10c=" + f10c +
            ", f11c=" + f11c +
            ", f12c=" + f12c +
            ", f13c=" + f13c +
            ", f14c=" + f14c +
            ", f14c1=" + f14c1 +
            ", f15c=" + f15c +
            ", f15c1=" + f15c1 +
            ", f16c=" + f16c +
            ", f16c1=" + f16c1 +
            ", f16c2=" + f16c2 +
            ", f17c1=" + f17c1 +
            ", f17c=" + f17c +
            ", f18c=" + f18c +
            ", f18c1=" + f18c1 +
            ", f18c2=" + f18c2 +
            ", f18c3=" + f18c3 +
            ", f19c=" + f19c +
            ", f20c=" + f20c +
            ", f20c1=" + f20c1 +
            ", f20c2=" + f20c2 +
            ", f20c3=" + f20c3 +
            ", f20c4=" + f20c4 +
            ", f20c5=" + f20c5 +
            ", f22c=" + f22c +
            ", f22c1=" + f22c1 +
            ", f22c3=" + f22c3 +
            ", f22c4=" + f22c4 +
            ", f22c5=" + f22c5 +
            ", f22c6=" + f22c6 +
            ", unknownpercent=" + unknownpercent +
            ", f18c3a=" + f18c3a +
            ", f18c3r=" + f18c3r +
            ", cho=" + cho +
            ", water=" + water +
            ", sfa=" + sfa +
            ", usp=" + usp +
            ", i=" + i +
            ", ash=" + ash +
            ", gi=" + gi +
            ", mufa=" + mufa +
            ", pufa=" + pufa +
            ", unknowngram=" + unknowngram +
            ", renieratene=" + renieratene +
            ", prepalin=" + prepalin +
            ", vitaminEAe=" + vitaminEAe +
            ", vitaminEBy=" + vitaminEBy +
            ", vitaminEQe=" + vitaminEQe +
            ", purine=" + purine +
            ", inputCode=" + inputCode +
            ", oldCode=" + oldCode +
            ", area=" + area +
            ", foodCode=" + foodCode +
            ", foodTypeCode=" + foodTypeCode +
            ", foodTypeName=" + foodTypeName +
            ", foodPreUnit=" + foodPreUnit +
            ", foodUnit=" + foodUnit +
            ", cholin=" + cholin +
            ", panto=" + panto +
            ", vitk=" + vitk +
            ", vitd=" + vitd +
            ", vitb6=" + vitb6 +
            ", vitb12=" + vitb12 +
            ", f24c=" + f24c +
            ", f24c1=" + f24c1 +
            ", f18c4=" + f18c4 +
            ", bio=" + bio +
            ", sourceType=" + sourceType +
            ", cmdField1=" + cmdField1 +
            ", cmdField2=" + cmdField2 +
            ", cmdField3=" + cmdField3 +
            ", cmdField4=" + cmdField4 +
            ", cmdField5=" + cmdField5 +
            ", cr=" + cr +
            ", glycuresisFood=" + glycuresisFood +
            ", glycuresisFoodWeight=" + glycuresisFoodWeight +
            ", gFDescribe=" + gFDescribe +
            ", fos=" + fos +
            ", helpCode=" + helpCode +
            ", wpc=" + wpc +
            ", wpci=" + wpci +
            ", wpcs=" + wpcs +
            ", cs=" + cs +
            ", glnl=" + glnl +
            ", mct=" + mct +
            ", lct=" + lct +
            ", vitb5=" + vitb5 +
            ", ci=" + ci +
            ", carnitine=" + carnitine +
            ", taurine=" + taurine +
            ", inositol=" + inositol +
            ", gln=" + gln +
            ", choline=" + choline +
            ", pc=" + pc +
            ", dha=" + dha +
            ", nucleotide=" + nucleotide +
            ", mo=" + mo +
            ", isGoodProtein=" + isGoodProtein +
            ", cl=" + cl +
            ", creatine=" + creatine +
            ", scfa=" + scfa +
            ", mcfa=" + mcfa +
            ", lcfa=" + lcfa +
            ", reduced=" + reduced +
            ", unit=" + unit +
            ", unitWeight=" + unitWeight +
            ", isUse=" + isUse +
            ", weight=" + weight +
            ", useReduced=" + useReduced +
            ", specification=" + specification +
            ", weightUnit=" + weightUnit +
            ", weightUnitPrice=" + weightUnitPrice +
            ", weightUnitGuidePrice=" + weightUnitGuidePrice +
            ", guidePrice=" + guidePrice +
            ", priceUnit=" + priceUnit +
            ", price=" + price +
            ", bca=" + bca +
            ", bfe=" + bfe +
            ", bzn=" + bzn +
            ", bvita=" + bvita +
            ", bvitb1=" + bvitb1 +
            ", bvitb2=" + bvitb2 +
            ", bvitc=" + bvitc +
            ", busp=" + busp +
            ", bprotein=" + bprotein +
            ", bfat=" + bfat +
            ", bcarbothdrate=" + bcarbothdrate +
            ", bse=" + bse +
            ", bzn6=" + bzn6 +
            ", bvite=" + bvite +
            ", bvitpp=" + bvitpp +
            ", bcu=" + bcu +
            ", bmn=" + bmn +
            ", bmg=" + bmg +
            ", bna=" + bna +
            ", bk=" + bk +
            ", bp=" + bp +
            ", priceWeight=" + priceWeight +
            ", foodImg=" + foodImg +
            ", zsxs=" + zsxs +
            ", spec=" + spec +
            ", usages=" + usages +
            ", description=" + description +
            ", illustration=" + illustration +
            ", pricePurchase=" + pricePurchase +
            ", weightUnitPricePurchase=" + weightUnitPricePurchase +
            ", createTime=" + createTime +
            ", createUserCode=" + createUserCode +
            ", createUserName=" + createUserName +
            ", updateTime=" + updateTime +
            ", updateUserCode=" + updateUserCode +
            ", updateUserName=" + updateUserName +
        "}";
    }
}
