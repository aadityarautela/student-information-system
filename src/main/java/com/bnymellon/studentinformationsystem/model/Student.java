package com.bnymellon.studentinformationsystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.sql.Date;
import java.util.Arrays;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long STUDENT_IDENTIFIER;

    @NotNull
    private Long UDID;

    @NotNull
    private Long EMIS_IDENTIFIER;

    @NotNull
    @Size(max = 20)
    private String STUDENT_FIRST_NAME;

    @Size(max = 20)
    private String STUDENT_MIDDLE_NAME;

    @Size(max = 20)
    private String STUDENT_LAST_NAME;

    @NotNull
    @Size(max = 20)
    @Email
    private String STUDENT_EMAIL_ADDRESS_TEXT;

    @NotNull
    @Size(min = 10, max = 10)
    private String STUDENT_CONTACT_NUMBER;

    @NotNull
    @Size(max = 3)
    private String ADMITTED_GRADE_TEXT;

    @NotNull
    @Size(min = 1, max = 1)
    private String DISABILITY_INDICATOR;

    @NotNull
    @Size(min = 2, max = 2)
    private String STUDENT_BIRTH_MONTH_NUMBER;

    @NotNull
    @Size(min = 2, max = 2)
    private String STUDENT_BIRTH_DAY_NUMBER;

    @NotNull
    @Size(min = 4, max = 4)
    private String STUDENT_BIRTH_YEAR;

    @NotNull
    @Size(max = 12)
    private String STUDENT_GENDER_TEXT;

    @NotNull
    @Size(min = 2, max = 2)
    private String ADMISSION_MONTH_NUMBER;

    @NotNull
    @Size(min = 2, max = 2)
    private String ADMISSION_DAY_NUMBER;

    @NotNull
    @Size(min = 4, max = 4)
    private String ADMISSION_YEAR;


    @Size(max = 30)
    private String FATHER_NAME;

    @Size(max = 30)
    private String FATHER_OCCUPATION_TEXT;

    private Double FATHER_ANNUAL_INCOME_AMOUNT;

    @Size(max = 30)
    private String MOTHER_NAME;

    @Size(max = 30)
    private String MOTHER_OCCUPATION_TEXT;

    private Double MOTHER_ANNUAL_INCOME_AMOUNT;

    @Size(max = 12)
    private String STUDENT_AADHAR_IDENTIFIER;

    @NotNull
    @Size(max = 50)
    private String CURRENT_ADDRESS_LINE_1_TEXT;

    @Size(max = 50)
    private String CURRENT_ADDRESS_LINE_2_TEXT;

    @Size(max = 50)
    private String CURRENT_ADDRESS_LINE_3_TEXT;

    @NotNull
    @Size(max = 30)
    private String CURRENT_ADDRESS_CITY_NAME;

    @NotNull
    @Size(max = 30)
    private String CURRENT_ADDRESS_STATE_NAME;

    @NotNull
    @Size(max = 6)
    private String CURRENT_ADDRESS_ZIP_CODE;

    @NotNull
    @Size(max = 50)
    private String PERMANENT_ADDRESS_LINE_1_TEXT;

    @Size(max = 50)
    private String PERMANENT_ADDRESS_LINE_2_TEXT;

    @Size(max = 50)
    private String PERMANENT_ADDRESS_LINE_3_TEXT;

    @NotNull
    @Size(max = 30)
    private String PERMANENT_ADDRESS_CITY_NAME;

    @NotNull
    @Size(max = 30)
    private String PERMANENT_ADDRESS_STATE_NAME;

    @NotNull
    @Size(max = 6)
    private String PERMANENT_ADDRESS_ZIP_CODE;

    @NotNull
    @Size(max = 30)
    private String PRIMARY_CONTACT_NAME;

    @NotNull
    @Size(min = 10, max = 10)
    private String PRIMARY_CONTACT_NUMBER;

    @Size(max = 20)
    private String PRIMARY_CONTACT_RELATIONSHIP_TEXT;

    @Size(max = 30)
    private String SECONDARY_CONTACT_NAME;

    @Size(min = 10, max = 10)
    private String SECONDARY_CONTACT_NUMBER;

    @Size(max = 20)
    private String SECONDARY_CONTACT_RELATIONSHIP_TEXT;

    @Size(max = 30)
    private String PHYSICIAN_NAME;

    @Size(min = 10, max = 10)
    private String PHYSICIAN_PRIMARY_CONTACT_NUMBER;

    @Size(min = 10, max = 10)
    private String PHYSICIAN_SECONDARY_CONTACT_NUMBER;

    @Size(max = 80)
    private String PREFERRED_EMERGENCY_HOSPITAL_NAME;

    @Size(max = 100)
    private String CURRENT_MEDICATION_DETAIL_TEXT;

    @Size(max = 100)
    private String MEDICAL_ALLERGY_DETAIL_TEXT;

    @Size(max = 100)
    private String FOOD_ALLERGY_DETAIL_TEXT;

    @Size(max = 100)
    private String CHRONIC_HEALTH_ISSUE_DETAIL_TEXT;

    @Size(max = 80)
    private String PREVIOUS_SCHOOL_NAME;

    @Size(max = 30)
    private String PREVIOUS_SCHOOL_CITY_NAME;

    @Size(max = 30)
    private String PREVIOUS_SCHOOL_STATE_NAME;

    private Date PREVIOUS_SCHOOL_ADMISSION_DATE;

    private Date PREVIOUS_SCHOOL_LAST_DATE;

    @Size(max = 100)
    private String ADDITIONAL_DETAILS_TEXT;

    @NotNull
    @Size(min = 1, max = 1)
    private String BIRTH_CERTIFICATE_AVAILABLE_INDICATOR;

    @NotNull
    @Size(min = 1, max = 1)
    private String AADHAR_ID_AVAILABLE_INDICATOR;

    @NotNull
    @Size(min = 1, max = 1)
    private String COMMUNITY_CERTIFICATE_APPLICABLE_INDICATOR;

    @NotNull
    @Size(min = 1, max = 1)
    private String COMMUNITY_CERTIFICATE_AVAILABLE_INDICATOR;

    @Size(min = 10, max = 10)
    private String WHATSAPP_NUMBER;

    @Lob
    private byte[] BIRTH_CERTIFICATE_BLOB;

    private String BIRTH_CERTIFICATE_FILENAME;

    @Lob
    private byte[] AADHAR_ID_BLOB;

    private String AADHAR_ID_FILENAME;

    @Lob
    private byte[] COMMUNITY_CERTIFICATE_BLOB;

    private String COMMUNITY_CERTIFICATE_FILENAME;

    private boolean IS_DEACTIVATED;

    public Student() {
    }

    public Student(Student newStudent) {
        this.STUDENT_IDENTIFIER = newStudent.getSTUDENT_IDENTIFIER();
        this.UDID = newStudent.getUDID();
        this.EMIS_IDENTIFIER = newStudent.getEMIS_IDENTIFIER();
        this.STUDENT_FIRST_NAME = newStudent.getSTUDENT_FIRST_NAME();
        this.STUDENT_MIDDLE_NAME = newStudent.getSTUDENT_MIDDLE_NAME();
        this.STUDENT_LAST_NAME = newStudent.getSTUDENT_LAST_NAME();
        this.STUDENT_EMAIL_ADDRESS_TEXT = newStudent.getSTUDENT_EMAIL_ADDRESS_TEXT();
        this.STUDENT_CONTACT_NUMBER = newStudent.getSTUDENT_CONTACT_NUMBER();
        this.ADMITTED_GRADE_TEXT = newStudent.getADMITTED_GRADE_TEXT();
        this.DISABILITY_INDICATOR = newStudent.getDISABILITY_INDICATOR();
        this.STUDENT_BIRTH_MONTH_NUMBER = newStudent.getSTUDENT_BIRTH_MONTH_NUMBER();
        this.STUDENT_BIRTH_DAY_NUMBER = newStudent.getSTUDENT_BIRTH_DAY_NUMBER();
        this.STUDENT_BIRTH_YEAR = newStudent.getSTUDENT_BIRTH_YEAR();
        this.STUDENT_GENDER_TEXT = newStudent.getSTUDENT_GENDER_TEXT();
        this.ADMISSION_MONTH_NUMBER = newStudent.getADMISSION_MONTH_NUMBER();
        this.ADMISSION_DAY_NUMBER = newStudent.getADMISSION_DAY_NUMBER();
        this.ADMISSION_YEAR = newStudent.getADMISSION_YEAR();
        this.FATHER_NAME = newStudent.getFATHER_NAME();
        this.FATHER_OCCUPATION_TEXT = newStudent.getFATHER_OCCUPATION_TEXT();
        this.FATHER_ANNUAL_INCOME_AMOUNT = newStudent.getFATHER_ANNUAL_INCOME_AMOUNT();
        this.MOTHER_NAME = newStudent.getMOTHER_NAME();
        this.MOTHER_OCCUPATION_TEXT = newStudent.getMOTHER_OCCUPATION_TEXT();
        this.MOTHER_ANNUAL_INCOME_AMOUNT = newStudent.getMOTHER_ANNUAL_INCOME_AMOUNT();
        this.STUDENT_AADHAR_IDENTIFIER = newStudent.getSTUDENT_AADHAR_IDENTIFIER();
        this.CURRENT_ADDRESS_LINE_1_TEXT = newStudent.getCURRENT_ADDRESS_LINE_1_TEXT();
        this.CURRENT_ADDRESS_LINE_2_TEXT = newStudent.getCURRENT_ADDRESS_LINE_2_TEXT();
        this.CURRENT_ADDRESS_LINE_3_TEXT = newStudent.getCURRENT_ADDRESS_LINE_3_TEXT();
        this.CURRENT_ADDRESS_CITY_NAME = newStudent.getCURRENT_ADDRESS_CITY_NAME();
        this.CURRENT_ADDRESS_STATE_NAME = newStudent.getCURRENT_ADDRESS_STATE_NAME();
        this.CURRENT_ADDRESS_ZIP_CODE = newStudent.getCURRENT_ADDRESS_ZIP_CODE();
        this.PERMANENT_ADDRESS_LINE_1_TEXT = newStudent.getPERMANENT_ADDRESS_LINE_1_TEXT();
        this.PERMANENT_ADDRESS_LINE_2_TEXT = newStudent.getPERMANENT_ADDRESS_LINE_2_TEXT();
        this.PERMANENT_ADDRESS_LINE_3_TEXT = newStudent.getPERMANENT_ADDRESS_LINE_3_TEXT();
        this.PERMANENT_ADDRESS_CITY_NAME = newStudent.getPERMANENT_ADDRESS_CITY_NAME();
        this.PERMANENT_ADDRESS_STATE_NAME = newStudent.getPERMANENT_ADDRESS_STATE_NAME();
        this.PERMANENT_ADDRESS_ZIP_CODE = newStudent.getPERMANENT_ADDRESS_ZIP_CODE();
        this.PRIMARY_CONTACT_NAME = newStudent.getPRIMARY_CONTACT_NAME();
        this.PRIMARY_CONTACT_NUMBER = newStudent.getPRIMARY_CONTACT_NUMBER();
        this.PRIMARY_CONTACT_RELATIONSHIP_TEXT = newStudent.getPRIMARY_CONTACT_RELATIONSHIP_TEXT();
        this.SECONDARY_CONTACT_NAME = newStudent.getSECONDARY_CONTACT_NAME();
        this.SECONDARY_CONTACT_NUMBER = newStudent.getSECONDARY_CONTACT_NUMBER();
        this.SECONDARY_CONTACT_RELATIONSHIP_TEXT = newStudent.getSECONDARY_CONTACT_RELATIONSHIP_TEXT();
        this.PHYSICIAN_NAME = newStudent.getPHYSICIAN_NAME();
        this.PHYSICIAN_PRIMARY_CONTACT_NUMBER = newStudent.getPHYSICIAN_PRIMARY_CONTACT_NUMBER();
        this.PHYSICIAN_SECONDARY_CONTACT_NUMBER = newStudent.getPHYSICIAN_SECONDARY_CONTACT_NUMBER();
        this.PREFERRED_EMERGENCY_HOSPITAL_NAME = newStudent.getPREFERRED_EMERGENCY_HOSPITAL_NAME();
        this.CURRENT_MEDICATION_DETAIL_TEXT = newStudent.getCURRENT_MEDICATION_DETAIL_TEXT();
        this.MEDICAL_ALLERGY_DETAIL_TEXT = newStudent.getMEDICAL_ALLERGY_DETAIL_TEXT();
        this.FOOD_ALLERGY_DETAIL_TEXT = newStudent.getFOOD_ALLERGY_DETAIL_TEXT();
        this.CHRONIC_HEALTH_ISSUE_DETAIL_TEXT = newStudent.getCHRONIC_HEALTH_ISSUE_DETAIL_TEXT();
        this.PREVIOUS_SCHOOL_NAME = newStudent.getPREVIOUS_SCHOOL_NAME();
        this.PREVIOUS_SCHOOL_CITY_NAME = newStudent.getPREVIOUS_SCHOOL_CITY_NAME();
        this.PREVIOUS_SCHOOL_STATE_NAME = newStudent.getPREVIOUS_SCHOOL_STATE_NAME();
        this.PREVIOUS_SCHOOL_ADMISSION_DATE = newStudent.getPREVIOUS_SCHOOL_ADMISSION_DATE();
        this.PREVIOUS_SCHOOL_LAST_DATE = newStudent.getPREVIOUS_SCHOOL_LAST_DATE();
        this.ADDITIONAL_DETAILS_TEXT = newStudent.getADDITIONAL_DETAILS_TEXT();
        this.BIRTH_CERTIFICATE_AVAILABLE_INDICATOR = newStudent.getBIRTH_CERTIFICATE_AVAILABLE_INDICATOR();
        this.AADHAR_ID_AVAILABLE_INDICATOR = newStudent.getAADHAR_ID_AVAILABLE_INDICATOR();
        this.COMMUNITY_CERTIFICATE_APPLICABLE_INDICATOR = newStudent.getCOMMUNITY_CERTIFICATE_APPLICABLE_INDICATOR();
        this.COMMUNITY_CERTIFICATE_AVAILABLE_INDICATOR = newStudent.getCOMMUNITY_CERTIFICATE_AVAILABLE_INDICATOR();
        this.WHATSAPP_NUMBER = newStudent.getWHATSAPP_NUMBER();
        this.BIRTH_CERTIFICATE_FILENAME = newStudent.getBIRTH_CERTIFICATE_FILENAME();
        this.AADHAR_ID_FILENAME = newStudent.getAADHAR_ID_FILENAME();
        this.COMMUNITY_CERTIFICATE_FILENAME = newStudent.getCOMMUNITY_CERTIFICATE_FILENAME();
        this.IS_DEACTIVATED = false;
    }

    public Long getSTUDENT_IDENTIFIER() {
        return STUDENT_IDENTIFIER;
    }

    public void setSTUDENT_IDENTIFIER(Long STUDENT_IDENTIFIER) {
        this.STUDENT_IDENTIFIER = STUDENT_IDENTIFIER;
    }

    public Long getUDID() {
        return UDID;
    }

    public void setUDID(Long UDID) {
        this.UDID = UDID;
    }

    public Long getEMIS_IDENTIFIER() {
        return EMIS_IDENTIFIER;
    }

    public void setEMIS_IDENTIFIER(Long EMIS_IDENTIFIER) {
        this.EMIS_IDENTIFIER = EMIS_IDENTIFIER;
    }

    public String getSTUDENT_FIRST_NAME() {
        return STUDENT_FIRST_NAME;
    }

    public void setSTUDENT_FIRST_NAME(String STUDENT_FIRST_NAME) {
        this.STUDENT_FIRST_NAME = STUDENT_FIRST_NAME;
    }

    public String getSTUDENT_MIDDLE_NAME() {
        return STUDENT_MIDDLE_NAME;
    }

    public void setSTUDENT_MIDDLE_NAME(String STUDENT_MIDDLE_NAME) {
        this.STUDENT_MIDDLE_NAME = STUDENT_MIDDLE_NAME;
    }

    public String getSTUDENT_LAST_NAME() {
        return STUDENT_LAST_NAME;
    }

    public void setSTUDENT_LAST_NAME(String STUDENT_LAST_NAME) {
        this.STUDENT_LAST_NAME = STUDENT_LAST_NAME;
    }

    public String getSTUDENT_EMAIL_ADDRESS_TEXT() {
        return STUDENT_EMAIL_ADDRESS_TEXT;
    }

    public void setSTUDENT_EMAIL_ADDRESS_TEXT(String STUDENT_EMAIL_ADDRESS_TEXT) {
        this.STUDENT_EMAIL_ADDRESS_TEXT = STUDENT_EMAIL_ADDRESS_TEXT;
    }

    public String getSTUDENT_CONTACT_NUMBER() {
        return STUDENT_CONTACT_NUMBER;
    }

    public void setSTUDENT_CONTACT_NUMBER(String STUDENT_CONTACT_NUMBER) {
        this.STUDENT_CONTACT_NUMBER = STUDENT_CONTACT_NUMBER;
    }

    public String getADMITTED_GRADE_TEXT() {
        return ADMITTED_GRADE_TEXT;
    }

    public void setADMITTED_GRADE_TEXT(String ADMITTED_GRADE_TEXT) {
        this.ADMITTED_GRADE_TEXT = ADMITTED_GRADE_TEXT;
    }

    public String getDISABILITY_INDICATOR() {
        return DISABILITY_INDICATOR;
    }

    public void setDISABILITY_INDICATOR(String DISABILITY_INDICATOR) {
        this.DISABILITY_INDICATOR = DISABILITY_INDICATOR;
    }

    public String getSTUDENT_BIRTH_MONTH_NUMBER() {
        return STUDENT_BIRTH_MONTH_NUMBER;
    }

    public void setSTUDENT_BIRTH_MONTH_NUMBER(String STUDENT_BIRTH_MONTH_NUMBER) {
        this.STUDENT_BIRTH_MONTH_NUMBER = STUDENT_BIRTH_MONTH_NUMBER;
    }

    public String getSTUDENT_BIRTH_DAY_NUMBER() {
        return STUDENT_BIRTH_DAY_NUMBER;
    }

    public void setSTUDENT_BIRTH_DAY_NUMBER(String STUDENT_BIRTH_DAY_NUMBER) {
        this.STUDENT_BIRTH_DAY_NUMBER = STUDENT_BIRTH_DAY_NUMBER;
    }

    public String getSTUDENT_BIRTH_YEAR() {
        return STUDENT_BIRTH_YEAR;
    }

    public void setSTUDENT_BIRTH_YEAR(String STUDENT_BIRTH_YEAR) {
        this.STUDENT_BIRTH_YEAR = STUDENT_BIRTH_YEAR;
    }

    public String getSTUDENT_GENDER_TEXT() {
        return STUDENT_GENDER_TEXT;
    }

    public void setSTUDENT_GENDER_TEXT(String STUDENT_GENDER_TEXT) {
        this.STUDENT_GENDER_TEXT = STUDENT_GENDER_TEXT;
    }

    public String getADMISSION_MONTH_NUMBER() {
        return ADMISSION_MONTH_NUMBER;
    }

    public void setADMISSION_MONTH_NUMBER(String ADMISSION_MONTH_NUMBER) {
        this.ADMISSION_MONTH_NUMBER = ADMISSION_MONTH_NUMBER;
    }

    public String getADMISSION_DAY_NUMBER() {
        return ADMISSION_DAY_NUMBER;
    }

    public void setADMISSION_DAY_NUMBER(String ADMISSION_DAY_NUMBER) {
        this.ADMISSION_DAY_NUMBER = ADMISSION_DAY_NUMBER;
    }

    public String getADMISSION_YEAR() {
        return ADMISSION_YEAR;
    }

    public void setADMISSION_YEAR(String ADMISSION_YEAR) {
        this.ADMISSION_YEAR = ADMISSION_YEAR;
    }

    public String getFATHER_NAME() {
        return FATHER_NAME;
    }

    public void setFATHER_NAME(String FATHER_NAME) {
        this.FATHER_NAME = FATHER_NAME;
    }

    public String getFATHER_OCCUPATION_TEXT() {
        return FATHER_OCCUPATION_TEXT;
    }

    public void setFATHER_OCCUPATION_TEXT(String FATHER_OCCUPATION_TEXT) {
        this.FATHER_OCCUPATION_TEXT = FATHER_OCCUPATION_TEXT;
    }

    public Double getFATHER_ANNUAL_INCOME_AMOUNT() {
        return FATHER_ANNUAL_INCOME_AMOUNT;
    }

    public void setFATHER_ANNUAL_INCOME_AMOUNT(Double FATHER_ANNUAL_INCOME_AMOUNT) {
        this.FATHER_ANNUAL_INCOME_AMOUNT = FATHER_ANNUAL_INCOME_AMOUNT;
    }

    public String getMOTHER_NAME() {
        return MOTHER_NAME;
    }

    public void setMOTHER_NAME(String MOTHER_NAME) {
        this.MOTHER_NAME = MOTHER_NAME;
    }

    public String getMOTHER_OCCUPATION_TEXT() {
        return MOTHER_OCCUPATION_TEXT;
    }

    public void setMOTHER_OCCUPATION_TEXT(String MOTHER_OCCUPATION_TEXT) {
        this.MOTHER_OCCUPATION_TEXT = MOTHER_OCCUPATION_TEXT;
    }

    public Double getMOTHER_ANNUAL_INCOME_AMOUNT() {
        return MOTHER_ANNUAL_INCOME_AMOUNT;
    }

    public void setMOTHER_ANNUAL_INCOME_AMOUNT(Double MOTHER_ANNUAL_INCOME_AMOUNT) {
        this.MOTHER_ANNUAL_INCOME_AMOUNT = MOTHER_ANNUAL_INCOME_AMOUNT;
    }

    public String getSTUDENT_AADHAR_IDENTIFIER() {
        return STUDENT_AADHAR_IDENTIFIER;
    }

    public void setSTUDENT_AADHAR_IDENTIFIER(String STUDENT_AADHAR_IDENTIFIER) {
        this.STUDENT_AADHAR_IDENTIFIER = STUDENT_AADHAR_IDENTIFIER;
    }

    public String getCURRENT_ADDRESS_LINE_1_TEXT() {
        return CURRENT_ADDRESS_LINE_1_TEXT;
    }

    public void setCURRENT_ADDRESS_LINE_1_TEXT(String CURRENT_ADDRESS_LINE_1_TEXT) {
        this.CURRENT_ADDRESS_LINE_1_TEXT = CURRENT_ADDRESS_LINE_1_TEXT;
    }

    public String getCURRENT_ADDRESS_LINE_2_TEXT() {
        return CURRENT_ADDRESS_LINE_2_TEXT;
    }

    public void setCURRENT_ADDRESS_LINE_2_TEXT(String CURRENT_ADDRESS_LINE_2_TEXT) {
        this.CURRENT_ADDRESS_LINE_2_TEXT = CURRENT_ADDRESS_LINE_2_TEXT;
    }

    public String getCURRENT_ADDRESS_LINE_3_TEXT() {
        return CURRENT_ADDRESS_LINE_3_TEXT;
    }

    public void setCURRENT_ADDRESS_LINE_3_TEXT(String CURRENT_ADDRESS_LINE_3_TEXT) {
        this.CURRENT_ADDRESS_LINE_3_TEXT = CURRENT_ADDRESS_LINE_3_TEXT;
    }

    public String getCURRENT_ADDRESS_CITY_NAME() {
        return CURRENT_ADDRESS_CITY_NAME;
    }

    public void setCURRENT_ADDRESS_CITY_NAME(String CURRENT_ADDRESS_CITY_NAME) {
        this.CURRENT_ADDRESS_CITY_NAME = CURRENT_ADDRESS_CITY_NAME;
    }

    public String getCURRENT_ADDRESS_STATE_NAME() {
        return CURRENT_ADDRESS_STATE_NAME;
    }

    public void setCURRENT_ADDRESS_STATE_NAME(String CURRENT_ADDRESS_STATE_NAME) {
        this.CURRENT_ADDRESS_STATE_NAME = CURRENT_ADDRESS_STATE_NAME;
    }

    public String getCURRENT_ADDRESS_ZIP_CODE() {
        return CURRENT_ADDRESS_ZIP_CODE;
    }

    public void setCURRENT_ADDRESS_ZIP_CODE(String CURRENT_ADDRESS_ZIP_CODE) {
        this.CURRENT_ADDRESS_ZIP_CODE = CURRENT_ADDRESS_ZIP_CODE;
    }

    public String getPERMANENT_ADDRESS_LINE_1_TEXT() {
        return PERMANENT_ADDRESS_LINE_1_TEXT;
    }

    public void setPERMANENT_ADDRESS_LINE_1_TEXT(String PERMANENT_ADDRESS_LINE_1_TEXT) {
        this.PERMANENT_ADDRESS_LINE_1_TEXT = PERMANENT_ADDRESS_LINE_1_TEXT;
    }

    public String getPERMANENT_ADDRESS_LINE_2_TEXT() {
        return PERMANENT_ADDRESS_LINE_2_TEXT;
    }

    public void setPERMANENT_ADDRESS_LINE_2_TEXT(String PERMANENT_ADDRESS_LINE_2_TEXT) {
        this.PERMANENT_ADDRESS_LINE_2_TEXT = PERMANENT_ADDRESS_LINE_2_TEXT;
    }

    public String getPERMANENT_ADDRESS_LINE_3_TEXT() {
        return PERMANENT_ADDRESS_LINE_3_TEXT;
    }

    public void setPERMANENT_ADDRESS_LINE_3_TEXT(String PERMANENT_ADDRESS_LINE_3_TEXT) {
        this.PERMANENT_ADDRESS_LINE_3_TEXT = PERMANENT_ADDRESS_LINE_3_TEXT;
    }

    public String getPERMANENT_ADDRESS_CITY_NAME() {
        return PERMANENT_ADDRESS_CITY_NAME;
    }

    public void setPERMANENT_ADDRESS_CITY_NAME(String PERMANENT_ADDRESS_CITY_NAME) {
        this.PERMANENT_ADDRESS_CITY_NAME = PERMANENT_ADDRESS_CITY_NAME;
    }

    public String getPERMANENT_ADDRESS_STATE_NAME() {
        return PERMANENT_ADDRESS_STATE_NAME;
    }

    public void setPERMANENT_ADDRESS_STATE_NAME(String PERMANENT_ADDRESS_STATE_NAME) {
        this.PERMANENT_ADDRESS_STATE_NAME = PERMANENT_ADDRESS_STATE_NAME;
    }

    public String getPERMANENT_ADDRESS_ZIP_CODE() {
        return PERMANENT_ADDRESS_ZIP_CODE;
    }

    public void setPERMANENT_ADDRESS_ZIP_CODE(String PERMANENT_ADDRESS_ZIP_CODE) {
        this.PERMANENT_ADDRESS_ZIP_CODE = PERMANENT_ADDRESS_ZIP_CODE;
    }

    public String getPRIMARY_CONTACT_NAME() {
        return PRIMARY_CONTACT_NAME;
    }

    public void setPRIMARY_CONTACT_NAME(String PRIMARY_CONTACT_NAME) {
        this.PRIMARY_CONTACT_NAME = PRIMARY_CONTACT_NAME;
    }

    public String getPRIMARY_CONTACT_NUMBER() {
        return PRIMARY_CONTACT_NUMBER;
    }

    public void setPRIMARY_CONTACT_NUMBER(String PRIMARY_CONTACT_NUMBER) {
        this.PRIMARY_CONTACT_NUMBER = PRIMARY_CONTACT_NUMBER;
    }

    public String getPRIMARY_CONTACT_RELATIONSHIP_TEXT() {
        return PRIMARY_CONTACT_RELATIONSHIP_TEXT;
    }

    public void setPRIMARY_CONTACT_RELATIONSHIP_TEXT(String PRIMARY_CONTACT_RELATIONSHIP_TEXT) {
        this.PRIMARY_CONTACT_RELATIONSHIP_TEXT = PRIMARY_CONTACT_RELATIONSHIP_TEXT;
    }

    public String getSECONDARY_CONTACT_NAME() {
        return SECONDARY_CONTACT_NAME;
    }

    public void setSECONDARY_CONTACT_NAME(String SECONDARY_CONTACT_NAME) {
        this.SECONDARY_CONTACT_NAME = SECONDARY_CONTACT_NAME;
    }

    public String getSECONDARY_CONTACT_NUMBER() {
        return SECONDARY_CONTACT_NUMBER;
    }

    public void setSECONDARY_CONTACT_NUMBER(String SECONDARY_CONTACT_NUMBER) {
        this.SECONDARY_CONTACT_NUMBER = SECONDARY_CONTACT_NUMBER;
    }

    public String getSECONDARY_CONTACT_RELATIONSHIP_TEXT() {
        return SECONDARY_CONTACT_RELATIONSHIP_TEXT;
    }

    public void setSECONDARY_CONTACT_RELATIONSHIP_TEXT(String SECONDARY_CONTACT_RELATIONSHIP_TEXT) {
        this.SECONDARY_CONTACT_RELATIONSHIP_TEXT = SECONDARY_CONTACT_RELATIONSHIP_TEXT;
    }

    public String getPHYSICIAN_NAME() {
        return PHYSICIAN_NAME;
    }

    public void setPHYSICIAN_NAME(String PHYSICIAN_NAME) {
        this.PHYSICIAN_NAME = PHYSICIAN_NAME;
    }

    public String getPHYSICIAN_PRIMARY_CONTACT_NUMBER() {
        return PHYSICIAN_PRIMARY_CONTACT_NUMBER;
    }

    public void setPHYSICIAN_PRIMARY_CONTACT_NUMBER(String PHYSICIAN_PRIMARY_CONTACT_NUMBER) {
        this.PHYSICIAN_PRIMARY_CONTACT_NUMBER = PHYSICIAN_PRIMARY_CONTACT_NUMBER;
    }

    public String getPHYSICIAN_SECONDARY_CONTACT_NUMBER() {
        return PHYSICIAN_SECONDARY_CONTACT_NUMBER;
    }

    public void setPHYSICIAN_SECONDARY_CONTACT_NUMBER(String PHYSICIAN_SECONDARY_CONTACT_NUMBER) {
        this.PHYSICIAN_SECONDARY_CONTACT_NUMBER = PHYSICIAN_SECONDARY_CONTACT_NUMBER;
    }

    public String getPREFERRED_EMERGENCY_HOSPITAL_NAME() {
        return PREFERRED_EMERGENCY_HOSPITAL_NAME;
    }

    public void setPREFERRED_EMERGENCY_HOSPITAL_NAME(String PREFERRED_EMERGENCY_HOSPITAL_NAME) {
        this.PREFERRED_EMERGENCY_HOSPITAL_NAME = PREFERRED_EMERGENCY_HOSPITAL_NAME;
    }

    public String getCURRENT_MEDICATION_DETAIL_TEXT() {
        return CURRENT_MEDICATION_DETAIL_TEXT;
    }

    public void setCURRENT_MEDICATION_DETAIL_TEXT(String CURRENT_MEDICATION_DETAIL_TEXT) {
        this.CURRENT_MEDICATION_DETAIL_TEXT = CURRENT_MEDICATION_DETAIL_TEXT;
    }

    public String getMEDICAL_ALLERGY_DETAIL_TEXT() {
        return MEDICAL_ALLERGY_DETAIL_TEXT;
    }

    public void setMEDICAL_ALLERGY_DETAIL_TEXT(String MEDICAL_ALLERGY_DETAIL_TEXT) {
        this.MEDICAL_ALLERGY_DETAIL_TEXT = MEDICAL_ALLERGY_DETAIL_TEXT;
    }

    public String getFOOD_ALLERGY_DETAIL_TEXT() {
        return FOOD_ALLERGY_DETAIL_TEXT;
    }

    public void setFOOD_ALLERGY_DETAIL_TEXT(String FOOD_ALLERGY_DETAIL_TEXT) {
        this.FOOD_ALLERGY_DETAIL_TEXT = FOOD_ALLERGY_DETAIL_TEXT;
    }

    public String getCHRONIC_HEALTH_ISSUE_DETAIL_TEXT() {
        return CHRONIC_HEALTH_ISSUE_DETAIL_TEXT;
    }

    public void setCHRONIC_HEALTH_ISSUE_DETAIL_TEXT(String CHRONIC_HEALTH_ISSUE_DETAIL_TEXT) {
        this.CHRONIC_HEALTH_ISSUE_DETAIL_TEXT = CHRONIC_HEALTH_ISSUE_DETAIL_TEXT;
    }

    public String getPREVIOUS_SCHOOL_NAME() {
        return PREVIOUS_SCHOOL_NAME;
    }

    public void setPREVIOUS_SCHOOL_NAME(String PREVIOUS_SCHOOL_NAME) {
        this.PREVIOUS_SCHOOL_NAME = PREVIOUS_SCHOOL_NAME;
    }

    public String getPREVIOUS_SCHOOL_CITY_NAME() {
        return PREVIOUS_SCHOOL_CITY_NAME;
    }

    public void setPREVIOUS_SCHOOL_CITY_NAME(String PREVIOUS_SCHOOL_CITY_NAME) {
        this.PREVIOUS_SCHOOL_CITY_NAME = PREVIOUS_SCHOOL_CITY_NAME;
    }

    public String getPREVIOUS_SCHOOL_STATE_NAME() {
        return PREVIOUS_SCHOOL_STATE_NAME;
    }

    public void setPREVIOUS_SCHOOL_STATE_NAME(String PREVIOUS_SCHOOL_STATE_NAME) {
        this.PREVIOUS_SCHOOL_STATE_NAME = PREVIOUS_SCHOOL_STATE_NAME;
    }

    public Date getPREVIOUS_SCHOOL_ADMISSION_DATE() {
        return PREVIOUS_SCHOOL_ADMISSION_DATE;
    }

    public void setPREVIOUS_SCHOOL_ADMISSION_DATE(Date PREVIOUS_SCHOOL_ADMISSION_DATE) {
        this.PREVIOUS_SCHOOL_ADMISSION_DATE = PREVIOUS_SCHOOL_ADMISSION_DATE;
    }

    public Date getPREVIOUS_SCHOOL_LAST_DATE() {
        return PREVIOUS_SCHOOL_LAST_DATE;
    }

    public void setPREVIOUS_SCHOOL_LAST_DATE(Date PREVIOUS_SCHOOL_LAST_DATE) {
        this.PREVIOUS_SCHOOL_LAST_DATE = PREVIOUS_SCHOOL_LAST_DATE;
    }

    public String getADDITIONAL_DETAILS_TEXT() {
        return ADDITIONAL_DETAILS_TEXT;
    }

    public void setADDITIONAL_DETAILS_TEXT(String ADDITIONAL_DETAILS_TEXT) {
        this.ADDITIONAL_DETAILS_TEXT = ADDITIONAL_DETAILS_TEXT;
    }

    public String getBIRTH_CERTIFICATE_AVAILABLE_INDICATOR() {
        return BIRTH_CERTIFICATE_AVAILABLE_INDICATOR;
    }

    public void setBIRTH_CERTIFICATE_AVAILABLE_INDICATOR(String BIRTH_CERTIFICATE_AVAILABLE_INDICATOR) {
        this.BIRTH_CERTIFICATE_AVAILABLE_INDICATOR = BIRTH_CERTIFICATE_AVAILABLE_INDICATOR;
    }

    public String getAADHAR_ID_AVAILABLE_INDICATOR() {
        return AADHAR_ID_AVAILABLE_INDICATOR;
    }

    public void setAADHAR_ID_AVAILABLE_INDICATOR(String AADHAR_ID_AVAILABLE_INDICATOR) {
        this.AADHAR_ID_AVAILABLE_INDICATOR = AADHAR_ID_AVAILABLE_INDICATOR;
    }

    public String getCOMMUNITY_CERTIFICATE_APPLICABLE_INDICATOR() {
        return COMMUNITY_CERTIFICATE_APPLICABLE_INDICATOR;
    }

    public void setCOMMUNITY_CERTIFICATE_APPLICABLE_INDICATOR(String COMMUNITY_CERTIFICATE_APPLICABLE_INDICATOR) {
        this.COMMUNITY_CERTIFICATE_APPLICABLE_INDICATOR = COMMUNITY_CERTIFICATE_APPLICABLE_INDICATOR;
    }

    public String getCOMMUNITY_CERTIFICATE_AVAILABLE_INDICATOR() {
        return COMMUNITY_CERTIFICATE_AVAILABLE_INDICATOR;
    }

    public void setCOMMUNITY_CERTIFICATE_AVAILABLE_INDICATOR(String COMMUNITY_CERTIFICATE_AVAILABLE_INDICATOR) {
        this.COMMUNITY_CERTIFICATE_AVAILABLE_INDICATOR = COMMUNITY_CERTIFICATE_AVAILABLE_INDICATOR;
    }

    public String getWHATSAPP_NUMBER() {
        return WHATSAPP_NUMBER;
    }

    public void setWHATSAPP_NUMBER(String WHATSAPP_NUMBER) {
        this.WHATSAPP_NUMBER = WHATSAPP_NUMBER;
    }

    @JsonIgnore
    public byte[] getBIRTH_CERTIFICATE_BLOB() {
        return BIRTH_CERTIFICATE_BLOB;
    }

    public void setBIRTH_CERTIFICATE_BLOB(byte[] BIRTH_CERTIFICATE_BLOB) {
        this.BIRTH_CERTIFICATE_BLOB = Arrays.copyOf(BIRTH_CERTIFICATE_BLOB, BIRTH_CERTIFICATE_BLOB.length);
    }

    public String getBIRTH_CERTIFICATE_FILENAME() {
        return BIRTH_CERTIFICATE_FILENAME;
    }

    public void setBIRTH_CERTIFICATE_FILENAME(String BIRTH_CERTIFICATE_FILENAME) {
        this.BIRTH_CERTIFICATE_FILENAME = BIRTH_CERTIFICATE_FILENAME;
    }

    @JsonIgnore
    public byte[] getAADHAR_ID_BLOB() {
        return AADHAR_ID_BLOB;
    }

    public void setAADHAR_ID_BLOB(byte[] AADHAR_ID_BLOB) {
        this.AADHAR_ID_BLOB = Arrays.copyOf(AADHAR_ID_BLOB, AADHAR_ID_BLOB.length);
    }

    public String getAADHAR_ID_FILENAME() {
        return AADHAR_ID_FILENAME;
    }

    public void setAADHAR_ID_FILENAME(String AADHAR_ID_FILENAME) {
        this.AADHAR_ID_FILENAME = AADHAR_ID_FILENAME;
    }

    @JsonIgnore
    public byte[] getCOMMUNITY_CERTIFICATE_BLOB() {
        return COMMUNITY_CERTIFICATE_BLOB;
    }

    public void setCOMMUNITY_CERTIFICATE_BLOB(byte[] COMMUNITY_CERTIFICATE_BLOB) {
        this.COMMUNITY_CERTIFICATE_BLOB = Arrays.copyOf(COMMUNITY_CERTIFICATE_BLOB, COMMUNITY_CERTIFICATE_BLOB.length);
    }

    public String getCOMMUNITY_CERTIFICATE_FILENAME() {
        return COMMUNITY_CERTIFICATE_FILENAME;
    }

    public void setCOMMUNITY_CERTIFICATE_FILENAME(String COMMUNITY_CERTIFICATE_FILENAME) {
        this.COMMUNITY_CERTIFICATE_FILENAME = COMMUNITY_CERTIFICATE_FILENAME;
    }

    public boolean isIS_DEACTIVATED() {
        return IS_DEACTIVATED;
    }

    public void setIS_DEACTIVATED(boolean IS_DEACTIVATED) {
        this.IS_DEACTIVATED = IS_DEACTIVATED;
    }
}
