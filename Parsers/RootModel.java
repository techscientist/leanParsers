import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String timezone;
	public String code_of_conduct;
	public String location_name;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String description;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String email;
	public String privacy;
	public String name;
	public String state;
	public int id;
	public String type;
	public String logo;
	public String background_image;
	public String end_time;
	public String schedule_published_on;
	public String start_time;
	public CopyrightModel _copyright;

	public RootModel(String organizer_description, String timezone, String code_of_conduct, String location_name, CreatorModel creator, Call_for_papersModel call_for_papers, String organizer_name, String description, VersionModel version, ArrayList<Social_linksModel> social_links, String topic, String email, String privacy, String name, String state, int id, String type, String logo, String background_image, String end_time, String schedule_published_on, String start_time, CopyrightModel copyright) {

		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.description = description;
		this._version = version;
		this.social_links = social_links;
		this.topic = topic;
		this.email = email;
		this.privacy = privacy;
		this.name = name;
		this.state = state;
		this.id = id;
		this.type = type;
		this.logo = logo;
		this.background_image = background_image;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this._copyright = copyright;

	}

}