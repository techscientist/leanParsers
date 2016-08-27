import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String topic;
	public CopyrightModel _copyright;
	public String description;
	public String email;
	public VersionModel _version;
	public String type;
	public String state;
	public String end_time;
	public String start_time;
	public String timezone;
	public String logo;
	public String schedule_published_on;
	public String privacy;
	public String name;
	public String organizer_description;
	public CreatorModel _creator;
	public String organizer_name;
	public String background_image;

	public RootModel(String code_of_conduct, ArrayList<Social_linksModel> social_links, String location_name, Call_for_papersModel call_for_papers, int id, String topic, CopyrightModel copyright, String description, String email, VersionModel version, String type, String state, String end_time, String start_time, String timezone, String logo, String schedule_published_on, String privacy, String name, String organizer_description, CreatorModel creator, String organizer_name, String background_image) {

		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.topic = topic;
		this._copyright = copyright;
		this.description = description;
		this.email = email;
		this._version = version;
		this.type = type;
		this.state = state;
		this.end_time = end_time;
		this.start_time = start_time;
		this.timezone = timezone;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.name = name;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.background_image = background_image;

	}

}