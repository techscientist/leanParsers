import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public VersionModel _version;
	public String location_name;
	public String description;
	public int id;
	public String timezone;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String organizer_description;
	public String email;
	public String state;
	public String name;
	public String schedule_published_on;
	public String logo;
	public String start_time;
	public String type;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String end_time;
	public CopyrightModel _copyright;

	public RootModel(String organizer_name, VersionModel version, String location_name, String description, int id, String timezone, CreatorModel creator, String code_of_conduct, String organizer_description, String email, String state, String name, String schedule_published_on, String logo, String start_time, String type, String background_image, ArrayList<Social_linksModel> social_links, String topic, Call_for_papersModel call_for_papers, String privacy, String end_time, CopyrightModel copyright) {

		this.organizer_name = organizer_name;
		this._version = version;
		this.location_name = location_name;
		this.description = description;
		this.id = id;
		this.timezone = timezone;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.email = email;
		this.state = state;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.start_time = start_time;
		this.type = type;
		this.background_image = background_image;
		this.social_links = social_links;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.end_time = end_time;
		this._copyright = copyright;

	}

}