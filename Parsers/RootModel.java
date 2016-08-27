import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String organizer_description;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public int id;
	public String end_time;
	public CreatorModel _creator;
	public String topic;
	public String type;
	public String start_time;
	public String description;
	public String name;
	public VersionModel _version;
	public String privacy;
	public String organizer_name;
	public String logo;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String email;
	public String location_name;
	public String background_image;

	public RootModel(String timezone, String organizer_description, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String state, int id, String end_time, CreatorModel creator, String topic, String type, String start_time, String description, String name, VersionModel version, String privacy, String organizer_name, String logo, String schedule_published_on, Call_for_papersModel call_for_papers, String code_of_conduct, String email, String location_name, String background_image) {

		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.social_links = social_links;
		this.state = state;
		this.id = id;
		this.end_time = end_time;
		this._creator = creator;
		this.topic = topic;
		this.type = type;
		this.start_time = start_time;
		this.description = description;
		this.name = name;
		this._version = version;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.location_name = location_name;
		this.background_image = background_image;

	}

}