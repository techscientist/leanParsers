import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String schedule_published_on;
	public String end_time;
	public String email;
	public String logo;
	public String state;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String name;
	public String topic;
	public CreatorModel _creator;
	public String privacy;
	public CopyrightModel _copyright;
	public String description;
	public String location_name;
	public String code_of_conduct;
	public VersionModel _version;
	public String timezone;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String background_image;

	public RootModel(String start_time, String schedule_published_on, String end_time, String email, String logo, String state, String type, ArrayList<Social_linksModel> social_links, String organizer_name, String name, String topic, CreatorModel creator, String privacy, CopyrightModel copyright, String description, String location_name, String code_of_conduct, VersionModel version, String timezone, String organizer_description, Call_for_papersModel call_for_papers, int id, String background_image) {

		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.email = email;
		this.logo = logo;
		this.state = state;
		this.type = type;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.name = name;
		this.topic = topic;
		this._creator = creator;
		this.privacy = privacy;
		this._copyright = copyright;
		this.description = description;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.background_image = background_image;

	}

}