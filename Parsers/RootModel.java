import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String name;
	public String background_image;
	public String location_name;
	public String description;
	public VersionModel _version;
	public String organizer_name;
	public String state;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public int id;
	public String code_of_conduct;
	public String start_time;
	public String topic;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String type;
	public String timezone;
	public String schedule_published_on;
	public CreatorModel _creator;
	public CopyrightModel _copyright;

	public RootModel(String privacy, String name, String background_image, String location_name, String description, VersionModel version, String organizer_name, String state, String email, ArrayList<Social_linksModel> social_links, String logo, int id, String code_of_conduct, String start_time, String topic, String end_time, Call_for_papersModel call_for_papers, String organizer_description, String type, String timezone, String schedule_published_on, CreatorModel creator, CopyrightModel copyright) {

		this.privacy = privacy;
		this.name = name;
		this.background_image = background_image;
		this.location_name = location_name;
		this.description = description;
		this._version = version;
		this.organizer_name = organizer_name;
		this.state = state;
		this.email = email;
		this.social_links = social_links;
		this.logo = logo;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.topic = topic;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.type = type;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this._copyright = copyright;

	}

}