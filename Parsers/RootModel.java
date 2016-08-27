import java.util.ArrayList;

class RootModel {

	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String type;
	public String background_image;
	public String start_time;
	public String state;
	public VersionModel _version;
	public String location_name;
	public String organizer_description;
	public String organizer_name;
	public int id;
	public String email;
	public String logo;
	public String end_time;
	public String code_of_conduct;
	public String description;
	public String name;
	public String schedule_published_on;
	public String timezone;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;

	public RootModel(String privacy, Call_for_papersModel call_for_papers, CreatorModel creator, String type, String background_image, String start_time, String state, VersionModel version, String location_name, String organizer_description, String organizer_name, int id, String email, String logo, String end_time, String code_of_conduct, String description, String name, String schedule_published_on, String timezone, String topic, ArrayList<Social_linksModel> social_links, CopyrightModel copyright) {

		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.type = type;
		this.background_image = background_image;
		this.start_time = start_time;
		this.state = state;
		this._version = version;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.id = id;
		this.email = email;
		this.logo = logo;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.topic = topic;
		this.social_links = social_links;
		this._copyright = copyright;

	}

}