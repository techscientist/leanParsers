import java.util.ArrayList;

class RootModel {

	public String logo;
	public String start_time;
	public String organizer_name;
	public String location_name;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String name;
	public String background_image;
	public String description;
	public int id;
	public String privacy;
	public String schedule_published_on;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String state;
	public CreatorModel _creator;
	public String timezone;
	public String organizer_description;
	public String code_of_conduct;
	public String topic;
	public CopyrightModel _copyright;

	public RootModel(String logo, String start_time, String organizer_name, String location_name, String email, Call_for_papersModel call_for_papers, String end_time, String name, String background_image, String description, int id, String privacy, String schedule_published_on, VersionModel version, ArrayList<Social_linksModel> social_links, String type, String state, CreatorModel creator, String timezone, String organizer_description, String code_of_conduct, String topic, CopyrightModel copyright) {

		this.logo = logo;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.name = name;
		this.background_image = background_image;
		this.description = description;
		this.id = id;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.social_links = social_links;
		this.type = type;
		this.state = state;
		this._creator = creator;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this._copyright = copyright;

	}

}