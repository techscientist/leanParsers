import java.util.ArrayList;

class RootModel {

	public String location_name;
	public CopyrightModel _copyright;
	public String start_time;
	public String timezone;
	public String privacy;
	public String organizer_name;
	public String state;
	public String name;
	public int id;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public CreatorModel _creator;
	public String type;
	public String description;
	public VersionModel _version;
	public String schedule_published_on;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String logo;
	public String email;
	public String background_image;

	public RootModel(String location_name, CopyrightModel copyright, String start_time, String timezone, String privacy, String organizer_name, String state, String name, int id, String code_of_conduct, ArrayList<Social_linksModel> social_links, String organizer_description, CreatorModel creator, String type, String description, VersionModel version, String schedule_published_on, String end_time, Call_for_papersModel call_for_papers, String topic, String logo, String email, String background_image) {

		this.location_name = location_name;
		this._copyright = copyright;
		this.start_time = start_time;
		this.timezone = timezone;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.state = state;
		this.name = name;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.type = type;
		this.description = description;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.logo = logo;
		this.email = email;
		this.background_image = background_image;

	}

}