import java.util.ArrayList;

class RootModel {

	public String state;
	public String schedule_published_on;
	public String description;
	public String timezone;
	public String organizer_description;
	public CreatorModel _creator;
	public String organizer_name;
	public String code_of_conduct;
	public String logo;
	public String name;
	public String background_image;
	public String start_time;
	public String privacy;
	public String location_name;
	public VersionModel _version;
	public String end_time;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String topic;

	public RootModel(String state, String schedule_published_on, String description, String timezone, String organizer_description, CreatorModel creator, String organizer_name, String code_of_conduct, String logo, String name, String background_image, String start_time, String privacy, String location_name, VersionModel version, String end_time, String type, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String email, Call_for_papersModel call_for_papers, int id, String topic) {

		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.name = name;
		this.background_image = background_image;
		this.start_time = start_time;
		this.privacy = privacy;
		this.location_name = location_name;
		this._version = version;
		this.end_time = end_time;
		this.type = type;
		this.social_links = social_links;
		this._copyright = copyright;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.topic = topic;

	}

}