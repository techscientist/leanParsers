import java.util.ArrayList;

class RootModel {

	public String state;
	public String organizer_description;
	public String end_time;
	public String background_image;
	public String topic;
	public String description;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String code_of_conduct;
	public String logo;
	public String timezone;
	public String privacy;
	public String type;
	public String organizer_name;
	public VersionModel _version;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public CreatorModel _creator;
	public String start_time;
	public String name;
	public CopyrightModel _copyright;

	public RootModel(String state, String organizer_description, String end_time, String background_image, String topic, String description, String location_name, ArrayList<Social_linksModel> social_links, String email, String code_of_conduct, String logo, String timezone, String privacy, String type, String organizer_name, VersionModel version, String schedule_published_on, Call_for_papersModel call_for_papers, int id, CreatorModel creator, String start_time, String name, CopyrightModel copyright) {

		this.state = state;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.background_image = background_image;
		this.topic = topic;
		this.description = description;
		this.location_name = location_name;
		this.social_links = social_links;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.timezone = timezone;
		this.privacy = privacy;
		this.type = type;
		this.organizer_name = organizer_name;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this._creator = creator;
		this.start_time = start_time;
		this.name = name;
		this._copyright = copyright;

	}

}