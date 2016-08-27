import java.util.ArrayList;

class RootModel {

	public String location_name;
	public int id;
	public String background_image;
	public String code_of_conduct;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String topic;
	public String privacy;
	public String email;
	public String timezone;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String name;
	public String schedule_published_on;
	public String end_time;
	public String description;
	public String logo;
	public String start_time;
	public String type;
	public String organizer_name;
	public CopyrightModel _copyright;

	public RootModel(String location_name, int id, String background_image, String code_of_conduct, String organizer_description, Call_for_papersModel call_for_papers, VersionModel version, String topic, String privacy, String email, String timezone, String state, ArrayList<Social_linksModel> social_links, CreatorModel creator, String name, String schedule_published_on, String end_time, String description, String logo, String start_time, String type, String organizer_name, CopyrightModel copyright) {

		this.location_name = location_name;
		this.id = id;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.topic = topic;
		this.privacy = privacy;
		this.email = email;
		this.timezone = timezone;
		this.state = state;
		this.social_links = social_links;
		this._creator = creator;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.description = description;
		this.logo = logo;
		this.start_time = start_time;
		this.type = type;
		this.organizer_name = organizer_name;
		this._copyright = copyright;

	}

}