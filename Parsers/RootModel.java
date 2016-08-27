import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String state;
	public String timezone;
	public String privacy;
	public int id;
	public VersionModel _version;
	public String organizer_description;
	public String end_time;
	public String logo;
	public String email;
	public String background_image;
	public String organizer_name;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String schedule_published_on;
	public String topic;
	public CreatorModel _creator;
	public String start_time;
	public CopyrightModel _copyright;

	public RootModel(String location_name, String state, String timezone, String privacy, int id, VersionModel version, String organizer_description, String end_time, String logo, String email, String background_image, String organizer_name, String code_of_conduct, Call_for_papersModel call_for_papers, String description, String name, ArrayList<Social_linksModel> social_links, String type, String schedule_published_on, String topic, CreatorModel creator, String start_time, CopyrightModel copyright) {

		this.location_name = location_name;
		this.state = state;
		this.timezone = timezone;
		this.privacy = privacy;
		this.id = id;
		this._version = version;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.logo = logo;
		this.email = email;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.name = name;
		this.social_links = social_links;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this._creator = creator;
		this.start_time = start_time;
		this._copyright = copyright;

	}

}