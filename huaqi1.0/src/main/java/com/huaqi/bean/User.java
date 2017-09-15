package com.huaqi.bean;

import javax.validation.constraints.Pattern;

public class User {
    @Pattern(regexp = "\\d{17}(\\d|x)",message = "请输入正确身份证号如无身份证请自创18位数字ID")
    private String id;

    @Pattern(regexp = "[\\w]{6,16}",message = "请输入6-16位数字，字母，下划线的组合")
    private String password;

    @Pattern(regexp = "[\u4e00-\u9fa5]{2,20}",message = "请输入合法姓名")
    private String userName;

    private Double age;

    private String gender;

    private Double address;

    @Pattern(regexp = "([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})",message = "请输入正确email")
    private String email;

    @Pattern(regexp = "[1][3,4,5,7,8][0-9]{9}",message = "请输入正确手机号码")
    private String tel;

    private String userType;

    private Double majorExpenditure;

    private Double renovatedHouse;

    private Double houseValue;

    private Double agriculturalEquip;

    private Double vehicleValue;

    private Double fixedAssets;

    private Double agriHypothecaryValue;

    private Double deposit;

    private Double aveIncome;

    private Double monthIncome;

    private Double monthRatal;

    private Double commerceHypothecaryValue;

    private Double liabilities;

    private Double villageCadres;

    private Double guarantee;

    private Double elderLive;

    private Double honor;

    private Double loanGuaratee;

    private Double informationLevel;

    private Double personalInsurance;

    private Double healthExamination;

    private Double interestRate;

    private Double residenceTime;

    private Double maritalStatus;

    private Double married;

    private Double divorced;

    private Double phoneNumReplace;

    private Double fallIll;

    private Double educationBackground;

    private Double mainStemDistance;

    private Double treatmentCosts;

    private Double raisingNumber;

    private Double childrenEdu;

    private Double manpowerRate;

    private Double modernAgriTech;

    private Double propertyInsurance;

    private Double disasterNumber;

    private Double damageRate;

    private Double loanUse;

    private Double newsAttention;

    private Double educationAttention;

    private Double onlineFrequency;

    private Double broadbandBandwidth;

    private Double phoneCharge;

    private Double weChat;

    private Double arrearage;

    private Double badActions;

    private Double layPayment;

    private Double privateLending;

    private Double evaluateResult;

    private Double paydebtAbilityScore;

    private String paydebtAbilityLevel;

    private Double paydebtPotentialScore;

    private String paydebtPotentialLevel;

    private Double paydebtSystemScore;

    private String paydebtSystemLevel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Double getAddress() {
        return address;
    }

    public void setAddress(Double address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public Double getMajorExpenditure() {
        return majorExpenditure;
    }

    public void setMajorExpenditure(Double majorExpenditure) {
        this.majorExpenditure = majorExpenditure;
    }

    public Double getRenovatedHouse() {
        return renovatedHouse;
    }

    public void setRenovatedHouse(Double renovatedHouse) {
        this.renovatedHouse = renovatedHouse;
    }

    public Double getHouseValue() {
        return houseValue;
    }

    public void setHouseValue(Double houseValue) {
        this.houseValue = houseValue;
    }

    public Double getAgriculturalEquip() {
        return agriculturalEquip;
    }

    public void setAgriculturalEquip(Double agriculturalEquip) {
        this.agriculturalEquip = agriculturalEquip;
    }

    public Double getVehicleValue() {
        return vehicleValue;
    }

    public void setVehicleValue(Double vehicleValue) {
        this.vehicleValue = vehicleValue;
    }

    public Double getFixedAssets() {
        return fixedAssets;
    }

    public void setFixedAssets(Double fixedAssets) {
        this.fixedAssets = fixedAssets;
    }

    public Double getAgriHypothecaryValue() {
        return agriHypothecaryValue;
    }

    public void setAgriHypothecaryValue(Double agriHypothecaryValue) {
        this.agriHypothecaryValue = agriHypothecaryValue;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getAveIncome() {
        return aveIncome;
    }

    public void setAveIncome(Double aveIncome) {
        this.aveIncome = aveIncome;
    }

    public Double getMonthIncome() {
        return monthIncome;
    }

    public void setMonthIncome(Double monthIncome) {
        this.monthIncome = monthIncome;
    }

    public Double getMonthRatal() {
        return monthRatal;
    }

    public void setMonthRatal(Double monthRatal) {
        this.monthRatal = monthRatal;
    }

    public Double getCommerceHypothecaryValue() {
        return commerceHypothecaryValue;
    }

    public void setCommerceHypothecaryValue(Double commerceHypothecaryValue) {
        this.commerceHypothecaryValue = commerceHypothecaryValue;
    }

    public Double getLiabilities() {
        return liabilities;
    }

    public void setLiabilities(Double liabilities) {
        this.liabilities = liabilities;
    }

    public Double getVillageCadres() {
        return villageCadres;
    }

    public void setVillageCadres(Double villageCadres) {
        this.villageCadres = villageCadres;
    }

    public Double getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(Double guarantee) {
        this.guarantee = guarantee;
    }

    public Double getElderLive() {
        return elderLive;
    }

    public void setElderLive(Double elderLive) {
        this.elderLive = elderLive;
    }

    public Double getHonor() {
        return honor;
    }

    public void setHonor(Double honor) {
        this.honor = honor;
    }

    public Double getLoanGuaratee() {
        return loanGuaratee;
    }

    public void setLoanGuaratee(Double loanGuaratee) {
        this.loanGuaratee = loanGuaratee;
    }

    public Double getInformationLevel() {
        return informationLevel;
    }

    public void setInformationLevel(Double informationLevel) {
        this.informationLevel = informationLevel;
    }

    public Double getPersonalInsurance() {
        return personalInsurance;
    }

    public void setPersonalInsurance(Double personalInsurance) {
        this.personalInsurance = personalInsurance;
    }

    public Double getHealthExamination() {
        return healthExamination;
    }

    public void setHealthExamination(Double healthExamination) {
        this.healthExamination = healthExamination;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getResidenceTime() {
        return residenceTime;
    }

    public void setResidenceTime(Double residenceTime) {
        this.residenceTime = residenceTime;
    }

    public Double getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Double maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Double getMarried() {
        return married;
    }

    public void setMarried(Double married) {
        this.married = married;
    }

    public Double getDivorced() {
        return divorced;
    }

    public void setDivorced(Double divorced) {
        this.divorced = divorced;
    }

    public Double getPhoneNumReplace() {
        return phoneNumReplace;
    }

    public void setPhoneNumReplace(Double phoneNumReplace) {
        this.phoneNumReplace = phoneNumReplace;
    }

    public Double getFallIll() {
        return fallIll;
    }

    public void setFallIll(Double fallIll) {
        this.fallIll = fallIll;
    }

    public Double getEducationBackground() {
        return educationBackground;
    }

    public void setEducationBackground(Double educationBackground) {
        this.educationBackground = educationBackground;
    }

    public Double getMainStemDistance() {
        return mainStemDistance;
    }

    public void setMainStemDistance(Double mainStemDistance) {
        this.mainStemDistance = mainStemDistance;
    }

    public Double getTreatmentCosts() {
        return treatmentCosts;
    }

    public void setTreatmentCosts(Double treatmentCosts) {
        this.treatmentCosts = treatmentCosts;
    }

    public Double getRaisingNumber() {
        return raisingNumber;
    }

    public void setRaisingNumber(Double raisingNumber) {
        this.raisingNumber = raisingNumber;
    }

    public Double getChildrenEdu() {
        return childrenEdu;
    }

    public void setChildrenEdu(Double childrenEdu) {
        this.childrenEdu = childrenEdu;
    }

    public Double getManpowerRate() {
        return manpowerRate;
    }

    public void setManpowerRate(Double manpowerRate) {
        this.manpowerRate = manpowerRate;
    }

    public Double getModernAgriTech() {
        return modernAgriTech;
    }

    public void setModernAgriTech(Double modernAgriTech) {
        this.modernAgriTech = modernAgriTech;
    }

    public Double getPropertyInsurance() {
        return propertyInsurance;
    }

    public void setPropertyInsurance(Double propertyInsurance) {
        this.propertyInsurance = propertyInsurance;
    }

    public Double getDisasterNumber() {
        return disasterNumber;
    }

    public void setDisasterNumber(Double disasterNumber) {
        this.disasterNumber = disasterNumber;
    }

    public Double getDamageRate() {
        return damageRate;
    }

    public void setDamageRate(Double damageRate) {
        this.damageRate = damageRate;
    }

    public Double getLoanUse() {
        return loanUse;
    }

    public void setLoanUse(Double loanUse) {
        this.loanUse = loanUse;
    }

    public Double getNewsAttention() {
        return newsAttention;
    }

    public void setNewsAttention(Double newsAttention) {
        this.newsAttention = newsAttention;
    }

    public Double getEducationAttention() {
        return educationAttention;
    }

    public void setEducationAttention(Double educationAttention) {
        this.educationAttention = educationAttention;
    }

    public Double getOnlineFrequency() {
        return onlineFrequency;
    }

    public void setOnlineFrequency(Double onlineFrequency) {
        this.onlineFrequency = onlineFrequency;
    }

    public Double getBroadbandBandwidth() {
        return broadbandBandwidth;
    }

    public void setBroadbandBandwidth(Double broadbandBandwidth) {
        this.broadbandBandwidth = broadbandBandwidth;
    }

    public Double getPhoneCharge() {
        return phoneCharge;
    }

    public void setPhoneCharge(Double phoneCharge) {
        this.phoneCharge = phoneCharge;
    }

    public Double getWeChat() {
        return weChat;
    }

    public void setWeChat(Double weChat) {
        this.weChat = weChat;
    }

    public Double getArrearage() {
        return arrearage;
    }

    public void setArrearage(Double arrearage) {
        this.arrearage = arrearage;
    }

    public Double getBadActions() {
        return badActions;
    }

    public void setBadActions(Double badActions) {
        this.badActions = badActions;
    }

    public Double getLayPayment() {
        return layPayment;
    }

    public void setLayPayment(Double layPayment) {
        this.layPayment = layPayment;
    }

    public Double getPrivateLending() {
        return privateLending;
    }

    public void setPrivateLending(Double privateLending) {
        this.privateLending = privateLending;
    }

    public Double getEvaluateResult() {
        return evaluateResult;
    }

    public void setEvaluateResult(Double evaluateResult) {
        this.evaluateResult = evaluateResult;
    }

    public Double getPaydebtAbilityScore() {
        return paydebtAbilityScore;
    }

    public void setPaydebtAbilityScore(Double paydebtAbilityScore) {
        this.paydebtAbilityScore = paydebtAbilityScore;
    }

    public String getPaydebtAbilityLevel() {
        return paydebtAbilityLevel;
    }

    public void setPaydebtAbilityLevel(String paydebtAbilityLevel) {
        this.paydebtAbilityLevel = paydebtAbilityLevel == null ? null : paydebtAbilityLevel.trim();
    }

    public Double getPaydebtPotentialScore() {
        return paydebtPotentialScore;
    }

    public void setPaydebtPotentialScore(Double paydebtPotentialScore) {
        this.paydebtPotentialScore = paydebtPotentialScore;
    }

    public String getPaydebtPotentialLevel() {
        return paydebtPotentialLevel;
    }

    public void setPaydebtPotentialLevel(String paydebtPotentialLevel) {
        this.paydebtPotentialLevel = paydebtPotentialLevel == null ? null : paydebtPotentialLevel.trim();
    }

    public Double getPaydebtSystemScore() {
        return paydebtSystemScore;
    }

    public void setPaydebtSystemScore(Double paydebtSystemScore) {
        this.paydebtSystemScore = paydebtSystemScore;
    }

    public String getPaydebtSystemLevel() {
        return paydebtSystemLevel;
    }

    public void setPaydebtSystemLevel(String paydebtSystemLevel) {
        this.paydebtSystemLevel = paydebtSystemLevel == null ? null : paydebtSystemLevel.trim();
    }
}