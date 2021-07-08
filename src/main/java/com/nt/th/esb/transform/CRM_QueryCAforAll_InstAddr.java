package com.nt.th.esb.transform;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 18/11/2563.
 */
@Root(name="InstAddr",strict=false)
public class CRM_QueryCAforAll_InstAddr {
	
    @Element(required=false, name="InstAddr_Detail")
    private String InstAddr_Detail;
    @Element(required=false, name="InstAddr_Number")
    private String InstAddr_Number;
    @Element(required=false, name="InstAddr_RoomNo")
    private String InstAddr_RoomNo;
    @Element(required=false, name="InstAddr_FloorNo")
    private String InstAddr_FloorNo;
    @Element(required=false, name="InstAddr_Village")
    private String InstAddr_Village;
    @Element(required=false, name="InstAddr_Building")
    private String InstAddr_Building;
    @Element(required=false, name="InstAddr_Moo")
    private String InstAddr_Moo;
    @Element(required=false, name="InstAddr_Soi")
    private String InstAddr_Soi;
    @Element(required=false, name="InstAddr_Road")
    private String InstAddr_Road;
    @Element(required=false, name="InstAddr_Latitude")
    private String InstAddr_Latitude;
    @Element(required=false, name="InstAddr_Longitude")
    private String InstAddr_Longitude;
    @Element(required=false, name="InstAddr_SubDistrict_Name")
    private String InstAddr_SubDistrict_Name;
    @Element(required=false, name="InstAddr_District_Name")
    private String InstAddr_District_Name;
    @Element(required=false, name="InstAddr_Province_Name")
    private String InstAddr_Province_Name;
    @Element(required=false, name="InstAddr_Addr_ZipCode")
    private String InstAddr_Addr_ZipCode;
    @Element(required=false, name="InstAddr_Country_Name")
    private String InstAddr_Country_Name;
    
	public String getInstAddr_Detail() {
		return InstAddr_Detail;
	}
	public void setInstAddr_Detail(String instAddr_Detail) {
		InstAddr_Detail = instAddr_Detail;
	}
	public String getInstAddr_Number() {
		return InstAddr_Number;
	}
	public void setInstAddr_Number(String instAddr_Number) {
		InstAddr_Number = instAddr_Number;
	}
	public String getInstAddr_RoomNo() {
		return InstAddr_RoomNo;
	}
	public void setInstAddr_RoomNo(String instAddr_RoomNo) {
		InstAddr_RoomNo = instAddr_RoomNo;
	}
	public String getInstAddr_FloorNo() {
		return InstAddr_FloorNo;
	}
	public void setInstAddr_FloorNo(String instAddr_FloorNo) {
		InstAddr_FloorNo = instAddr_FloorNo;
	}
	public String getInstAddr_Village() {
		return InstAddr_Village;
	}
	public void setInstAddr_Village(String instAddr_Village) {
		InstAddr_Village = instAddr_Village;
	}
	public String getInstAddr_Building() {
		return InstAddr_Building;
	}
	public void setInstAddr_Building(String instAddr_Building) {
		InstAddr_Building = instAddr_Building;
	}
	public String getInstAddr_Moo() {
		return InstAddr_Moo;
	}
	public void setInstAddr_Moo(String instAddr_Moo) {
		InstAddr_Moo = instAddr_Moo;
	}
	public String getInstAddr_Soi() {
		return InstAddr_Soi;
	}
	public void setInstAddr_Soi(String instAddr_Soi) {
		InstAddr_Soi = instAddr_Soi;
	}
	public String getInstAddr_Road() {
		return InstAddr_Road;
	}
	public void setInstAddr_Road(String instAddr_Road) {
		InstAddr_Road = instAddr_Road;
	}
	public String getInstAddr_Latitude() {
		return InstAddr_Latitude;
	}
	public void setInstAddr_Latitude(String instAddr_Latitude) {
		InstAddr_Latitude = instAddr_Latitude;
	}
	public String getInstAddr_Longitude() {
		return InstAddr_Longitude;
	}
	public void setInstAddr_Longitude(String instAddr_Longitude) {
		InstAddr_Longitude = instAddr_Longitude;
	}
	public String getInstAddr_SubDistrict_Name() {
		return InstAddr_SubDistrict_Name;
	}
	public void setInstAddr_SubDistrict_Name(String instAddr_SubDistrict_Name) {
		InstAddr_SubDistrict_Name = instAddr_SubDistrict_Name;
	}
	public String getInstAddr_District_Name() {
		return InstAddr_District_Name;
	}
	public void setInstAddr_District_Name(String instAddr_District_Name) {
		InstAddr_District_Name = instAddr_District_Name;
	}
	public String getInstAddr_Province_Name() {
		return InstAddr_Province_Name;
	}
	public void setInstAddr_Province_Name(String instAddr_Province_Name) {
		InstAddr_Province_Name = instAddr_Province_Name;
	}
	public String getInstAddr_Addr_ZipCode() {
		return InstAddr_Addr_ZipCode;
	}
	public void setInstAddr_Addr_ZipCode(String instAddr_Addr_ZipCode) {
		InstAddr_Addr_ZipCode = instAddr_Addr_ZipCode;
	}
	public String getInstAddr_Country_Name() {
		return InstAddr_Country_Name;
	}
	public void setInstAddr_Country_Name(String instAddr_Country_Name) {
		InstAddr_Country_Name = instAddr_Country_Name;
	}

}
