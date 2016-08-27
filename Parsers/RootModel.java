import java.util.ArrayList;

class RootModel {

	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String timezone;
	public String organizer_description;
	public int id;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String organizer_name;
	public String topic;
	public VersionModel _version;
	public String privacy;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String email;
	public String type;
	public String start_time;
	public String description;
	public String logo;
	public String background_image;

	public RootModel(String state, ArrayList<Social_linksModel> social_links, String name, String timezone, String organizer_description, int id, String location_name, Call_for_papersModel call_for_papers, String end_time, String organizer_name, String topic, VersionModel version, String privacy, String code_of_conduct, CopyrightModel copyright, String schedule_published_on, CreatorModel creator, String email, String type, String start_time, String description, String logo, String background_image) {

		this.state = state;
		this.social_links = social_links;
		this.name = name;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.id = id;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this._version = version;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.email = email;
		this.type = type;
		this.start_time = start_time;
		this.description = description;
		this.logo = logo;
		this.background_image = background_image;

	}

}