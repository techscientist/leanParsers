import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String logo;
	public String state;
	public String end_time;
	public String type;
	public String email;
	public String privacy;
	public String code_of_conduct;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String location_name;
	public String schedule_published_on;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String start_time;
	public VersionModel _version;
	public String description;
	public String topic;
	public String background_image;

	public RootModel(String organizer_name, String organizer_description, CopyrightModel copyright, String logo, String state, String end_time, String type, String email, String privacy, String code_of_conduct, String name, Call_for_papersModel call_for_papers, CreatorModel creator, String location_name, String schedule_published_on, int id, ArrayList<Social_linksModel> social_links, String timezone, String start_time, VersionModel version, String description, String topic, String background_image) {

		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.logo = logo;
		this.state = state;
		this.end_time = end_time;
		this.type = type;
		this.email = email;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.social_links = social_links;
		this.timezone = timezone;
		this.start_time = start_time;
		this._version = version;
		this.description = description;
		this.topic = topic;
		this.background_image = background_image;

	}

}