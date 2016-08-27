import java.util.ArrayList;

class RootModel {

	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String organizer_description;
	public String email;
	public VersionModel _version;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String type;
	public String topic;
	public String state;
	public int id;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String end_time;
	public String description;
	public String logo;
	public String location_name;
	public String name;
	public String code_of_conduct;
	public String start_time;
	public CopyrightModel _copyright;

	public RootModel(String timezone, Call_for_papersModel call_for_papers, String background_image, String organizer_description, String email, VersionModel version, String organizer_name, ArrayList<Social_linksModel> social_links, String privacy, String type, String topic, String state, int id, CreatorModel creator, String schedule_published_on, String end_time, String description, String logo, String location_name, String name, String code_of_conduct, String start_time, CopyrightModel copyright) {

		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.email = email;
		this._version = version;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.privacy = privacy;
		this.type = type;
		this.topic = topic;
		this.state = state;
		this.id = id;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.description = description;
		this.logo = logo;
		this.location_name = location_name;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this._copyright = copyright;

	}

}