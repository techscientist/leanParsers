import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String schedule_published_on;
	public String privacy;
	public String type;
	public CreatorModel _creator;
	public String timezone;
	public String location_name;
	public String end_time;
	public String logo;
	public String organizer_description;
	public String email;
	public String state;
	public int id;
	public String name;
	public String start_time;
	public String description;
	public String topic;
	public VersionModel _version;
	public CopyrightModel _copyright;

	public RootModel(String background_image, String organizer_name, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String code_of_conduct, String schedule_published_on, String privacy, String type, CreatorModel creator, String timezone, String location_name, String end_time, String logo, String organizer_description, String email, String state, int id, String name, String start_time, String description, String topic, VersionModel version, CopyrightModel copyright) {

		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.type = type;
		this._creator = creator;
		this.timezone = timezone;
		this.location_name = location_name;
		this.end_time = end_time;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.email = email;
		this.state = state;
		this.id = id;
		this.name = name;
		this.start_time = start_time;
		this.description = description;
		this.topic = topic;
		this._version = version;
		this._copyright = copyright;

	}

}