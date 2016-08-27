import java.util.ArrayList;

class RootModel {

	public String name;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String organizer_name;
	public String timezone;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String description;
	public String organizer_description;
	public String email;
	public String schedule_published_on;
	public String location_name;
	public String start_time;
	public String logo;
	public int id;
	public String privacy;
	public String type;
	public String code_of_conduct;
	public String state;
	public CreatorModel _creator;
	public CopyrightModel _copyright;

	public RootModel(String name, VersionModel version, ArrayList<Social_linksModel> social_links, String end_time, String organizer_name, String timezone, String topic, Call_for_papersModel call_for_papers, String background_image, String description, String organizer_description, String email, String schedule_published_on, String location_name, String start_time, String logo, int id, String privacy, String type, String code_of_conduct, String state, CreatorModel creator, CopyrightModel copyright) {

		this.name = name;
		this._version = version;
		this.social_links = social_links;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.description = description;
		this.organizer_description = organizer_description;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.start_time = start_time;
		this.logo = logo;
		this.id = id;
		this.privacy = privacy;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this._creator = creator;
		this._copyright = copyright;

	}

}