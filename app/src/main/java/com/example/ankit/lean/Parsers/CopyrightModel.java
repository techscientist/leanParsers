
class CopyrightModel {

	public String licence_url;
	public String licence;
	public String holder_url;
	public int year;
	public String logo;
	public String holder;

	public CopyrightModel(String licence_url, String licence, String holder_url, int year, String logo, String holder) {

		this.licence_url = licence_url;
		this.licence = licence;
		this.holder_url = holder_url;
		this.year = year;
		this.logo = logo;
		this.holder = holder;

	}

}