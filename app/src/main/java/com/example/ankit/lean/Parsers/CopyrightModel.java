
class CopyrightModel {

	public String licence_url;
	public String holder_url;
	public String licence;
	public String holder;
	public int year;
	public String logo;

	public CopyrightModel(String licence_url, String holder_url, String licence, String holder, int year, String logo) {

		this.licence_url = licence_url;
		this.holder_url = holder_url;
		this.licence = licence;
		this.holder = holder;
		this.year = year;
		this.logo = logo;

	}

}