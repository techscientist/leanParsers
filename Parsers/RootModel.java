import java.util.ArrayList;

class RootModel {

	public int id;
	public String topic;
	public String start_time;
	public String code_of_conduct;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String email;
	public CreatorModel _creator;
	public String organizer_name;
	public String schedule_published_on;
	public String location_name;
	public String background_image;
	public String end_time;
	public String logo;
	public VersionModel _version;
	public String privacy;
	public String name;
	public String type;
	public String timezone;
	public CopyrightModel _copyright;

	public RootModel(int id, String topic, String start_time, String code_of_conduct, String organizer_description, Call_for_papersModel call_for_papers, String description, ArrayList<Social_linksModel> social_links, String state, String email, CreatorModel creator, String organizer_name, String schedule_published_on, String location_name, String background_image, String end_time, String logo, VersionModel version, String privacy, String name, String type, String timezone, CopyrightModel copyright) {

		this.id = id;
		this.topic = topic;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.social_links = social_links;
		this.state = state;
		this.email = email;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.background_image = background_image;
		this.end_time = end_time;
		this.logo = logo;
		this._version = version;
		this.privacy = privacy;
		this.name = name;
		this.type = type;
		this.timezone = timezone;
		this._copyright = copyright;

	}

}