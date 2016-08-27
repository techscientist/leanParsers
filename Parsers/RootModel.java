import java.util.ArrayList;

class RootModel {

	public String type;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String end_time;
	public String privacy;
	public String schedule_published_on;
	public String state;
	public String code_of_conduct;
	public String start_time;
	public String organizer_name;
	public VersionModel _version;
	public int id;
	public String description;
	public String location_name;
	public String timezone;
	public String logo;
	public String background_image;
	public String organizer_description;
	public CreatorModel _creator;
	public CopyrightModel _copyright;

	public RootModel(String type, Call_for_papersModel call_for_papers, String email, String topic, ArrayList<Social_linksModel> social_links, String name, String end_time, String privacy, String schedule_published_on, String state, String code_of_conduct, String start_time, String organizer_name, VersionModel version, int id, String description, String location_name, String timezone, String logo, String background_image, String organizer_description, CreatorModel creator, CopyrightModel copyright) {

		this.type = type;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.topic = topic;
		this.social_links = social_links;
		this.name = name;
		this.end_time = end_time;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this._version = version;
		this.id = id;
		this.description = description;
		this.location_name = location_name;
		this.timezone = timezone;
		this.logo = logo;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this._copyright = copyright;

	}

}