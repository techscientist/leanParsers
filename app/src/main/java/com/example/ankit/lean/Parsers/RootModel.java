import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String description;
	public String type;
	public String schedule_published_on;
	public int id;
	public String state;
	public String end_time;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String logo;
	public VersionModel _version;
	public String start_time;
	public String privacy;
	public String code_of_conduct;
	public String email;
	public String location_name;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String background_image;

	public RootModel(String organizer_name, String description, String type, String schedule_published_on, int id, String state, String end_time, CreatorModel creator, CopyrightModel copyright, String organizer_description, String logo, VersionModel version, String start_time, String privacy, String code_of_conduct, String email, String location_name, String timezone, ArrayList<Social_linksModel> social_links, String name, Call_for_papersModel call_for_papers, String topic, String background_image) {

		this.organizer_name = organizer_name;
		this.description = description;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.state = state;
		this.end_time = end_time;
		this._creator = creator;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this._version = version;
		this.start_time = start_time;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.location_name = location_name;
		this.timezone = timezone;
		this.social_links = social_links;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.background_image = background_image;

	}

}