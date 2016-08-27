import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String logo;
	public int id;
	public VersionModel _version;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String organizer_description;
	public String state;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String type;
	public String topic;
	public String email;
	public String organizer_name;
	public String name;
	public String code_of_conduct;
	public String location_name;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String background_image;

	public RootModel(String end_time, String logo, int id, VersionModel version, String description, ArrayList<Social_linksModel> social_links, String privacy, String organizer_description, String state, String start_time, Call_for_papersModel call_for_papers, String timezone, String type, String topic, String email, String organizer_name, String name, String code_of_conduct, String location_name, String schedule_published_on, CopyrightModel copyright, CreatorModel creator, String background_image) {

		this.end_time = end_time;
		this.logo = logo;
		this.id = id;
		this._version = version;
		this.description = description;
		this.social_links = social_links;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.state = state;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.type = type;
		this.topic = topic;
		this.email = email;
		this.organizer_name = organizer_name;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this._creator = creator;
		this.background_image = background_image;

	}

}