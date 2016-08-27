import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String type;
	public String code_of_conduct;
	public String organizer_description;
	public String state;
	public String logo;
	public String start_time;
	public VersionModel _version;
	public String timezone;
	public String schedule_published_on;
	public String end_time;
	public int id;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String email;
	public String topic;
	public String name;
	public String description;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public CopyrightModel _copyright;

	public RootModel(String organizer_name, String type, String code_of_conduct, String organizer_description, String state, String logo, String start_time, VersionModel version, String timezone, String schedule_published_on, String end_time, int id, CreatorModel creator, Call_for_papersModel call_for_papers, String location_name, String email, String topic, String name, String description, String privacy, ArrayList<Social_linksModel> social_links, String background_image, CopyrightModel copyright) {

		this.organizer_name = organizer_name;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.state = state;
		this.logo = logo;
		this.start_time = start_time;
		this._version = version;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.id = id;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.email = email;
		this.topic = topic;
		this.name = name;
		this.description = description;
		this.privacy = privacy;
		this.social_links = social_links;
		this.background_image = background_image;
		this._copyright = copyright;

	}

}