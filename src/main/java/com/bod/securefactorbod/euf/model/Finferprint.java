package com.bod.securefactorbod.euf.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Finferprint implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id_Fingerprint;
	
	private Long id_Machine;
	
	private Boolean nav_On_Line;
	
	private Boolean cookies_On;
	
	private String num_Ver_Prov;
	
	private String name_Prov_Nav;
	
	private String num_Comp_Nav;
	
	private String den_Nav;
	
	private String platform;
	
	private String agent_us_nav;
	
	private String lang;
	
	public Finferprint() {
		
	}
	
	
	public Finferprint(Long id_Fingerprint, Long id_Machine, Boolean nav_On_Line, Boolean cookies_On,
			String num_Ver_Prov, String name_Prov_Nav, String num_Comp_Nav, String den_Nav, String platform,
			String agent_us_nav, String lang, String version_Nav, Boolean no_Reg_User_Action, Boolean java_On,
			String ip_Addr, String cookie_Value, String name_Cookie, String cod_Country) {
		super();
		this.id_Fingerprint = id_Fingerprint;
		this.id_Machine = id_Machine;
		this.nav_On_Line = nav_On_Line;
		this.cookies_On = cookies_On;
		this.num_Ver_Prov = num_Ver_Prov;
		this.name_Prov_Nav = name_Prov_Nav;
		this.num_Comp_Nav = num_Comp_Nav;
		this.den_Nav = den_Nav;
		this.platform = platform;
		this.agent_us_nav = agent_us_nav;
		this.lang = lang;
		this.version_Nav = version_Nav;
		this.no_Reg_User_Action = no_Reg_User_Action;
		this.java_On = java_On;
		this.ip_Addr = ip_Addr;
		this.cookie_Value = cookie_Value;
		this.name_Cookie = name_Cookie;
		this.cod_Country = cod_Country;
	}

	public Long getId_Fingerprint() {
		return id_Fingerprint;
	}

	public void setId_Fingerprint(Long id_Fingerprint) {
		this.id_Fingerprint = id_Fingerprint;
	}

	public Long getId_Machine() {
		return id_Machine;
	}

	public void setId_Machine(Long id_Machine) {
		this.id_Machine = id_Machine;
	}

	public Boolean getNav_On_Line() {
		return nav_On_Line;
	}

	public void setNav_On_Line(Boolean nav_On_Line) {
		this.nav_On_Line = nav_On_Line;
	}

	public Boolean getCookies_On() {
		return cookies_On;
	}

	public void setCookies_On(Boolean cookies_On) {
		this.cookies_On = cookies_On;
	}

	public String getNum_Ver_Prov() {
		return num_Ver_Prov;
	}

	public void setNum_Ver_Prov(String num_Ver_Prov) {
		this.num_Ver_Prov = num_Ver_Prov;
	}

	public String getName_Prov_Nav() {
		return name_Prov_Nav;
	}

	public void setName_Prov_Nav(String name_Prov_Nav) {
		this.name_Prov_Nav = name_Prov_Nav;
	}

	public String getNum_Comp_Nav() {
		return num_Comp_Nav;
	}

	public void setNum_Comp_Nav(String num_Comp_Nav) {
		this.num_Comp_Nav = num_Comp_Nav;
	}

	public String getDen_Nav() {
		return den_Nav;
	}

	public void setDen_Nav(String den_Nav) {
		this.den_Nav = den_Nav;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getAgent_us_nav() {
		return agent_us_nav;
	}

	public void setAgent_us_nav(String agent_us_nav) {
		this.agent_us_nav = agent_us_nav;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getVersion_Nav() {
		return version_Nav;
	}

	public void setVersion_Nav(String version_Nav) {
		this.version_Nav = version_Nav;
	}

	public Boolean getNo_Reg_User_Action() {
		return no_Reg_User_Action;
	}

	public void setNo_Reg_User_Action(Boolean no_Reg_User_Action) {
		this.no_Reg_User_Action = no_Reg_User_Action;
	}

	public Boolean getJava_On() {
		return java_On;
	}

	public void setJava_On(Boolean java_On) {
		this.java_On = java_On;
	}

	public String getIp_Addr() {
		return ip_Addr;
	}

	public void setIp_Addr(String ip_Addr) {
		this.ip_Addr = ip_Addr;
	}

	public String getCookie_Value() {
		return cookie_Value;
	}

	public void setCookie_Value(String cookie_Value) {
		this.cookie_Value = cookie_Value;
	}

	public String getName_Cookie() {
		return name_Cookie;
	}

	public void setName_Cookie(String name_Cookie) {
		this.name_Cookie = name_Cookie;
	}

	public String getCod_Country() {
		return cod_Country;
	}

	public void setCod_Country(String cod_Country) {
		this.cod_Country = cod_Country;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private String version_Nav;
	
	private Boolean no_Reg_User_Action;
	
	private Boolean java_On;
	
	private String ip_Addr;
	
	private String cookie_Value;
	
	private String name_Cookie;
	
	private String cod_Country;
	
	
	
	

}
