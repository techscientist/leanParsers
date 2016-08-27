import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String email;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String organizer_description;
	public String schedule_published_on;
	public VersionModel _version;
	public String location_name;
	public String privacy;
	public String start_time;
	public String state;
	public String description;
	public CopyrightModel _copyright;
	public String logo;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String type;
	public String code_of_conduct;
	public String organizer_name;
	public String topic;
	public String background_image;

	public RootModel(String timezone, String email, String end_time, ArrayList<Social_linksModel> social_links, CreatorModel creator, String organizer_description, String schedule_published_on, VersionModel version, String location_name, String privacy, String start_time, String state, String description, CopyrightModel copyright, String logo, int id, Call_for_papersModel call_for_papers, String name, String type, String code_of_conduct, String organizer_name, String topic, String background_image) {

		this.timezone = timezone;
		this.email = email;
		this.end_time = end_time;
		this.social_links = social_links;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.location_name = location_name;
		this.privacy = privacy;
		this.start_time = start_time;
		this.state = state;
		this.description = description;
		this._copyright = copyright;
		this.logo = logo;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.background_image = background_image;

	}

}