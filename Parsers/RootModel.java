import java.util.ArrayList;

class RootModel {

	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String topic;
	public int id;
	public String name;
	public String privacy;
	public String schedule_published_on;
	public String description;
	public String code_of_conduct;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public CopyrightModel _copyright;
	public String location_name;
	public String timezone;
	public String state;
	public String organizer_name;
	public String logo;
	public String end_time;
	public String organizer_description;
	public String type;
	public String background_image;

	public RootModel(String start_time, Call_for_papersModel call_for_papers, VersionModel version, String topic, int id, String name, String privacy, String schedule_published_on, String description, String code_of_conduct, CreatorModel creator, ArrayList<Social_linksModel> social_links, String email, CopyrightModel copyright, String location_name, String timezone, String state, String organizer_name, String logo, String end_time, String organizer_description, String type, String background_image) {

		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.topic = topic;
		this.id = id;
		this.name = name;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.social_links = social_links;
		this.email = email;
		this._copyright = copyright;
		this.location_name = location_name;
		this.timezone = timezone;
		this.state = state;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.type = type;
		this.background_image = background_image;

	}

}