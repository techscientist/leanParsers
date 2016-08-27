import java.util.ArrayList;

class RootModel {

	public String topic;
	public int id;
	public CopyrightModel _copyright;
	public String location_name;
	public String code_of_conduct;
	public String type;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String logo;
	public String name;
	public String description;
	public String organizer_name;
	public String organizer_description;
	public CreatorModel _creator;
	public String end_time;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String privacy;
	public VersionModel _version;
	public String state;
	public String background_image;

	public RootModel(String topic, int id, CopyrightModel copyright, String location_name, String code_of_conduct, String type, String email, ArrayList<Social_linksModel> social_links, String timezone, String logo, String name, String description, String organizer_name, String organizer_description, CreatorModel creator, String end_time, String schedule_published_on, Call_for_papersModel call_for_papers, String start_time, String privacy, VersionModel version, String state, String background_image) {

		this.topic = topic;
		this.id = id;
		this._copyright = copyright;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.email = email;
		this.social_links = social_links;
		this.timezone = timezone;
		this.logo = logo;
		this.name = name;
		this.description = description;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.privacy = privacy;
		this._version = version;
		this.state = state;
		this.background_image = background_image;

	}

}