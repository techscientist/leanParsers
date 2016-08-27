import java.util.ArrayList;

class RootModel {

	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String description;
	public String start_time;
	public String topic;
	public String name;
	public String location_name;
	public String organizer_description;
	public int id;
	public String organizer_name;
	public CreatorModel _creator;
	public String privacy;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String end_time;
	public VersionModel _version;
	public String logo;
	public String email;
	public String timezone;
	public String state;
	public CopyrightModel _copyright;

	public RootModel(String background_image, Call_for_papersModel call_for_papers, String type, String description, String start_time, String topic, String name, String location_name, String organizer_description, int id, String organizer_name, CreatorModel creator, String privacy, String code_of_conduct, ArrayList<Social_linksModel> social_links, String schedule_published_on, String end_time, VersionModel version, String logo, String email, String timezone, String state, CopyrightModel copyright) {

		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.description = description;
		this.start_time = start_time;
		this.topic = topic;
		this.name = name;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.id = id;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this._version = version;
		this.logo = logo;
		this.email = email;
		this.timezone = timezone;
		this.state = state;
		this._copyright = copyright;

	}

}