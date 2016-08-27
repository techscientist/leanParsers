import java.util.ArrayList;

class RootModel {

	public String start_time;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String code_of_conduct;
	public String state;
	public CreatorModel _creator;
	public String organizer_name;
	public String background_image;
	public String end_time;
	public String description;
	public String email;
	public String timezone;
	public String organizer_description;
	public String privacy;
	public String location_name;
	public String type;
	public String schedule_published_on;
	public VersionModel _version;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public CopyrightModel _copyright;

	public RootModel(String start_time, int id, ArrayList<Social_linksModel> social_links, String topic, String code_of_conduct, String state, CreatorModel creator, String organizer_name, String background_image, String end_time, String description, String email, String timezone, String organizer_description, String privacy, String location_name, String type, String schedule_published_on, VersionModel version, String name, Call_for_papersModel call_for_papers, String logo, CopyrightModel copyright) {

		this.start_time = start_time;
		this.id = id;
		this.social_links = social_links;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.end_time = end_time;
		this.description = description;
		this.email = email;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.location_name = location_name;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this._copyright = copyright;

	}

}