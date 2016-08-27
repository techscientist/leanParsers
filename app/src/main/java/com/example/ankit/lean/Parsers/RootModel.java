import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String topic;
	public String state;
	public String name;
	public String description;
	public String background_image;
	public String start_time;
	public String location_name;
	public String type;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String code_of_conduct;
	public String organizer_name;
	public CreatorModel _creator;
	public String privacy;
	public String logo;
	public String email;
	public String organizer_description;
	public VersionModel _version;
	public String schedule_published_on;
	public CopyrightModel _copyright;

	public RootModel(String timezone, String topic, String state, String name, String description, String background_image, String start_time, String location_name, String type, String end_time, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, int id, String code_of_conduct, String organizer_name, CreatorModel creator, String privacy, String logo, String email, String organizer_description, VersionModel version, String schedule_published_on, CopyrightModel copyright) {

		this.timezone = timezone;
		this.topic = topic;
		this.state = state;
		this.name = name;
		this.description = description;
		this.background_image = background_image;
		this.start_time = start_time;
		this.location_name = location_name;
		this.type = type;
		this.end_time = end_time;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.privacy = privacy;
		this.logo = logo;
		this.email = email;
		this.organizer_description = organizer_description;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;

	}

}