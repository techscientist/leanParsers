import java.util.ArrayList;

class RootModel {

	public String state;
	public String schedule_published_on;
	public VersionModel _version;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String location_name;
	public String timezone;
	public String topic;
	public String organizer_description;
	public CreatorModel _creator;
	public String logo;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public int id;
	public String code_of_conduct;
	public String privacy;
	public String end_time;
	public String email;
	public String background_image;
	public String name;
	public CopyrightModel _copyright;

	public RootModel(String state, String schedule_published_on, VersionModel version, String description, Call_for_papersModel call_for_papers, String organizer_name, String location_name, String timezone, String topic, String organizer_description, CreatorModel creator, String logo, String start_time, ArrayList<Social_linksModel> social_links, String type, int id, String code_of_conduct, String privacy, String end_time, String email, String background_image, String name, CopyrightModel copyright) {

		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.timezone = timezone;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.logo = logo;
		this.start_time = start_time;
		this.social_links = social_links;
		this.type = type;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.end_time = end_time;
		this.email = email;
		this.background_image = background_image;
		this.name = name;
		this._copyright = copyright;

	}

}