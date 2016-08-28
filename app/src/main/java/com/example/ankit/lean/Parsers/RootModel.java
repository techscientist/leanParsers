import java.util.ArrayList;

class RootModel {

	public String state;
	public String topic;
	public String schedule_published_on;
	public String location_name;
	public String organizer_description;
	public CreatorModel _creator;
	public String background_image;
	public String privacy;
	public String code_of_conduct;
	public String start_time;
	public VersionModel _version;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String name;
	public String end_time;
	public int id;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String description;
	public String timezone;
	public CopyrightModel _copyright;

	public RootModel(String state, String topic, String schedule_published_on, String location_name, String organizer_description, CreatorModel creator, String background_image, String privacy, String code_of_conduct, String start_time, VersionModel version, String organizer_name, Call_for_papersModel call_for_papers, String logo, String name, String end_time, int id, String email, ArrayList<Social_linksModel> social_links, String type, String description, String timezone, CopyrightModel copyright) {

		this.state = state;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.background_image = background_image;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this._version = version;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.name = name;
		this.end_time = end_time;
		this.id = id;
		this.email = email;
		this.social_links = social_links;
		this.type = type;
		this.description = description;
		this.timezone = timezone;
		this._copyright = copyright;

	}

}