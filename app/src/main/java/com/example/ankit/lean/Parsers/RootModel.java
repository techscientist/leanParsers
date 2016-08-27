import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String code_of_conduct;
	public String email;
	public VersionModel _version;
	public String schedule_published_on;
	public String location_name;
	public CopyrightModel _copyright;
	public String end_time;
	public String organizer_name;
	public String state;
	public CreatorModel _creator;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String description;
	public String name;
	public String logo;
	public String topic;
	public String organizer_description;
	public String background_image;

	public RootModel(String start_time, String code_of_conduct, String email, VersionModel version, String schedule_published_on, String location_name, CopyrightModel copyright, String end_time, String organizer_name, String state, CreatorModel creator, String privacy, ArrayList<Social_linksModel> social_links, int id, String timezone, Call_for_papersModel call_for_papers, String type, String description, String name, String logo, String topic, String organizer_description, String background_image) {

		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this._copyright = copyright;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.state = state;
		this._creator = creator;
		this.privacy = privacy;
		this.social_links = social_links;
		this.id = id;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.description = description;
		this.name = name;
		this.logo = logo;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.background_image = background_image;

	}

}