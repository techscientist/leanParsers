
class CopyrightModel {

	public String licence_url;
	public String holder;
	public String holder_url;
	public String logo;
	public String licence;
	public int year;

	public CopyrightModel(String licence_url, String holder, String holder_url, String logo, String licence, int year) {

		this.licence_url = licence_url;
		this.holder = holder;
		this.holder_url = holder_url;
		this.logo = logo;
		this.licence = licence;
		this.year = year;

	}

}