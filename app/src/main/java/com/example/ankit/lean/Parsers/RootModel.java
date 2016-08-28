import java.util.ArrayList;

class RootModel {

	public String background_image;
	public CreatorModel _creator;
	public String privacy;
	public String email;
	public String type;
	public VersionModel _version;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String organizer_description;
	public int id;
	public String end_time;
	public String code_of_conduct;
	public String state;
	public String schedule_published_on;
	public String description;
	public String start_time;
	public String topic;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String name;
	public CopyrightModel _copyright;

	public RootModel(String background_image, CreatorModel creator, String privacy, String email, String type, VersionModel version, String location_name, Call_for_papersModel call_for_papers, String timezone, String organizer_description, int id, String end_time, String code_of_conduct, String state, String schedule_published_on, String description, String start_time, String topic, String organizer_name, ArrayList<Social_linksModel> social_links, String logo, String name, CopyrightModel copyright) {

		this.background_image = background_image;
		this._creator = creator;
		this.privacy = privacy;
		this.email = email;
		this.type = type;
		this._version = version;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.id = id;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.start_time = start_time;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.logo = logo;
		this.name = name;
		this._copyright = copyright;

	}

}