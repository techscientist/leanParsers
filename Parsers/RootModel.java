import java.util.ArrayList;

class RootModel {

	public String timezoe;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public int id;
	public VesionModel _vesion;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String end_time;
	public String organizer_name;
	public CreatorModel _creator;
	public String privacy;
	public String schedule_published_on;
	public String starttime;
	public String name;
	public String stat;
	public String email;
	public String location_name;
	public String tpic;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String tye;
	public String logo;

	public RootModel(String timezoe, CopyrightModel copyright, String code_of_conduct, int id, VesionModel vesion, String organizer_description, Call_for_papersModel call_for_papers, String description, String end_time, String organizer_name, CreatorModel creator, String privacy, String schedule_published_on, String starttime, String name, String stat, String email, String location_name, String tpic, String background_image, ArrayList<Social_linksModel> social_links, String tye, String logo) {

		this.timezoe = timezoe;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this._vesion = vesion;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.starttime = starttime;
		this.name = name;
		this.stat = stat;
		this.email = email;
		this.location_name = location_name;
		this.tpic = tpic;
		this.background_image = background_image;
		this.social_links = social_links;
		this.tye = tye;
		this.logo = logo;

	}

}