import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String location_name;
	public String topic;
	public String background_image;
	public String state;
	public String organizer_description;
	public String timezone;
	public String logo;
	public String organizer_name;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String end_time;
	public String schedule_published_on;
	public String privacy;
	public VersionModel _version;
	public int id;
	public String type;
	public CopyrightModel _copyright;

	public RootModel(String start_time, String name, Call_for_papersModel call_for_papers, String code_of_conduct, CreatorModel creator, String location_name, String topic, String background_image, String state, String organizer_description, String timezone, String logo, String organizer_name, String description, ArrayList<Social_linksModel> social_links, String email, String end_time, String schedule_published_on, String privacy, VersionModel version, int id, String type, CopyrightModel copyright) {

		this.start_time = start_time;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.location_name = location_name;
		this.topic = topic;
		this.background_image = background_image;
		this.state = state;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.description = description;
		this.social_links = social_links;
		this.email = email;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this._version = version;
		this.id = id;
		this.type = type;
		this._copyright = copyright;

	}

}